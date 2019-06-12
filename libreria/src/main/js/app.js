const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {personas: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/persona/all'}).done(response => {
			this.setState({personas: response.entity._embedded.personas});
		});
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

class Persona extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.persona.nombres}</td>
				<td>{this.props.persona.apellidos}</td>
				<td>{this.props.persona.identificador}</td>
			</tr>
		)
	}
}

ReactDOM.render(
		<App />,
		document.getElementById('react')
	)