package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Producto;

public interface ProductoService {

	Producto create(Producto prod);
	Producto update(Producto prod);
	void delete(int idp);
	Producto read(int idp);
	List<Producto> readAll();
}
