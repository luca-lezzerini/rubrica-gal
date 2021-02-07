/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.controller;

import it.sirfin.rubricagal.dto.RubricaGalDto;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricagalController {

    @RequestMapping("/rubrica")
    public static void creaClasse() {
       ArrayList<RubricaGalDto> rubrica = new ArrayList<>();
        rubrica.add(new RubricaGalDto())
    
    }
    
    
}
