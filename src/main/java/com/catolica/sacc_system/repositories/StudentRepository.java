package com.catolica.sacc_system.repositories;

import com.catolica.sacc_system.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
