//CAMADA REGRA DE NEGÒCIO

package com.luiscutilak.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.luiscutilak.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;



@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
       if(dto.getEmail().equals("luiscutilak@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
       } 
       return false;
    }
    
}