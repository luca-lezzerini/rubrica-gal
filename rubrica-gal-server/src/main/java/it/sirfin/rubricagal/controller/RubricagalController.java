/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.controller;

import it.sirfin.rubricagal.dto.RubricaGalDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricagalController {

    int cont = 0;
    List<RubricaGalDto> rubrica = new ArrayList<>();

    //Metodo che consente di inserire un contatto nella rubrica
    @RequestMapping("/inserisciContatto")
    public List<RubricaGalDto> inserisciContatto(@RequestBody RubricaGalDto contatto) {
        contatto.setID(cont);
        this.rubrica.add(contatto);
        cont++;
        return this.rubrica;
    }
    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore deli contatti a 0*/
    @RequestMapping("/svuoataRubrica")
    public List<RubricaGalDto> svuotaContatto(@RequestBody RubricaGalDto contatto) {
        this.rubrica = new ArrayList();
        this.cont = 0;
        return this.rubrica;
    }
    
    @RequestMapping("/recuperaContatti")
    public List<RubricaGalDto> recuperaContatti() {
    return this.rubrica;
    }
    
    
}
