package com.cev.editoriales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cev.editoriales.entities.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, String> {

}
