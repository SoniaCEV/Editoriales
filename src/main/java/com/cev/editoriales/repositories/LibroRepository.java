package com.cev.editoriales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cev.editoriales.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String>{

}
