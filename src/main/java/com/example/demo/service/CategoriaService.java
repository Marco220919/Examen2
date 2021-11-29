package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Categoria;

public interface CategoriaService {
	Categoria create(Categoria cat);
	Categoria update(Categoria cat);
	void delete(int idp);
	Categoria read(int idp);
	List<Categoria> readAll();
}