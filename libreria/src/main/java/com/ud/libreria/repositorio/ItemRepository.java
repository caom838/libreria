package com.ud.libreria.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.ud.libreria.modelo.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
