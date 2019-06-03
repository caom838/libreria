const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {personas: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/personas'}).done(response => {
			this.setState({personas: response.entity._embedded.personas});
		});
	}

	render() {
		return (
			<PersonasList employees={this.state.personas}/>
		)
	}
}

class PersonasList extends React.Component{
	render() {
		const personas = this.props.personas.map(persona =>
			<Persona key={personas._links.self.href} persona={persona}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Description</th>
					</tr>
					{personas}
				</tbody>
			</table>
		)
	}
}