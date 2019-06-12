package com.ud.libreria.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.libreria.modelo.Item;
import com.ud.libreria.repositorio.ItemRepository;

@Service
public class ItemServicioImpl implements ItemServicio {


	@Autowired
	ItemRepository itemRepository;
	
	
	@Override
	public List<Item> consultarItems() {

		return (List<Item>)itemRepository.findAll();
	}

}
