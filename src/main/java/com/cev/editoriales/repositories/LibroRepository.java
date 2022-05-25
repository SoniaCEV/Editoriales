package com.cev.editoriales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cev.editoriales.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, String>{

}
