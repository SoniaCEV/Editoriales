package com.cev.editoriales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cev.editoriales.entities.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, String> {

}
