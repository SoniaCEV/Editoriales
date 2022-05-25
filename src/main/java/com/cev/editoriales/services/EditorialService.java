package com.cev.editoriales.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cev.editoriales.entities.Editorial;
import com.cev.editoriales.repositories.EditorialRepository;

@Service
public class EditorialService {
	@Autowired
	private EditorialRepository editorialRepository;

	public List<Editorial> getEditoriales(){
		return editorialRepository.findAll();
	}
	
	public void postEditorial(Editorial editorial) {
		editorialRepository.save(editorial);
	}
	
	public Optional<Editorial> getEditorial(String cif) {
		return editorialRepository.findById(cif);
	}
	

}
