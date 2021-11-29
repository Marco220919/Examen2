package com.example.demo.serviceImpml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;
import com.example.demo.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Override
	public Categoria create(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(cat);
	}

	@Override
	public Categoria update(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(cat);
	}

	@Override
	public void delete(int idp) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(idp);
	}

	@Override
	public Categoria read(int idp) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(idp).get();
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}