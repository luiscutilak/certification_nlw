package com.luiscutilak.certification_nlw.modules.students.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luiscutilak.certification_nlw.modules.students.entities.CertificationStudentEntity;


// é um componente gerenciado pelo spring
@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID>{

    // c é um alias, ou seja,um apelido de "certifications", assim como std é um alias, um apelido de studentEntity

    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);
    
}