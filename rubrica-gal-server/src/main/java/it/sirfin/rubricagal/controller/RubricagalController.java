/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.controller;

import it.sirfin.rubricagal.dto.Contatto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricagalController {

    int counter = 0;
    List<Contatto> rubrica = new ArrayList<>();

    //Metodo che consente di inserire un contatto nella rubrica
    @RequestMapping("/inserisciContatto")
    public List<Contatto> inserisciContatto(@RequestBody Contatto c) {
        c.setID(counter);
        this.rubrica.add(c);
        counter++;
        return this.rubrica;
    }
    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore deli contatti a 0*/
    @RequestMapping("/svuoataRubrica")
    public List<Contatto> svuotaContatto(@RequestBody Contatto contatto) {
        this.rubrica = new ArrayList();
        this.counter = 0;
        return this.rubrica;
    }
    
    @RequestMapping("/recuperaContatti")
    public List<Contatto> recuperaContatti() {
    return this.rubrica;
    }
    
    
}
