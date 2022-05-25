package com.cev.editoriales.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cev.editoriales.entities.Libro;
import com.cev.editoriales.repositories.LibroRepository;


@Service
public class LibroService {
	@Autowired
	private LibroRepository libroRepository;

	public List<Libro> getLibros(){
		return libroRepository.findAll();
	}
	
	public void postLibro(Libro libro) {
		libroRepository.save(libro);
	}
	
	//PASS:
	
	//Devuelve el libro cuyo ISBN recibe como parámetro:
	/*
	public Optional<Libro> getLibro(String isbn) {
		//<IMPLEMENTAR>
	}
	*/
	
	//Devuelve los libros que tengan más de n páginas que recibe como parámetro:
	
	/*
	public List<Libro> getLibrosPaginasMayor (int n){
		//<IMPLEMENTAR>
	}
	*/
	
	//DISTINCTION:
	
	//Devuelve los libros de una editorial cuyo CIF recibe como parámetro:
	/*
	public List<Libro> getLibrosEditorial(String cif){
		//<IMPLEMENTAR>
	}
	*/
	
	
	

}
