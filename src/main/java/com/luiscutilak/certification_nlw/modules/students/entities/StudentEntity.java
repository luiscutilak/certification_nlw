package com.luiscutilak.certification_nlw.modules.students.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String email;


    // *** Cardinalidade ***
    //One to One  
    //One to Many 
    //Many to One
    //Many To Many
    //**********************//

    @OneToMany(mappedBy = "studentEntity")
    private List<CertificationStudentEntity> certificationStudentEntity;

     @CreationTimestamp
     private LocalDateTime createdAt;
}

