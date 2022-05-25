package com.cev.editoriales.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cev.editoriales.entities.Editorial;
import com.cev.editoriales.exceptions.NotFoundException;
import com.cev.editoriales.services.EditorialService;


@RestController
public class EditorialController {
	@Autowired
	private EditorialService editorialService;
	
	//Listado con todas las editoriales:
	@GetMapping(path = "/editoriales")
	public List<Editorial> getEditoriales(){
		return editorialService.getEditoriales();
	}
	
	//Alta de una nueva editorial:
	@PostMapping(path = "/editoriales")
	public void postEditorial(@RequestBody Editorial editorial) {
		editorialService.postEditorial(editorial);
	}
	
	//Editorial con un CIF concreto:
	@GetMapping(path = "/editoriales/{cif}")
	public Editorial getEditorial(@PathVariable(name="cif") String cif){
		Optional<Editorial> result = editorialService.getEditorial(cif);
		if(result.isPresent()) {
			return result.get();
		} else {
			throw new NotFoundException();
		}
	}
}
