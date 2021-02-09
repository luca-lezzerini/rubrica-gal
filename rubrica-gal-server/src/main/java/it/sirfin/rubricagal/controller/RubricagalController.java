/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.controller;

import RubricagalService.java.RubricaService;
import it.sirfin.rubricagal.dto.Contatto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricagalController {

   @Autowired
   RubricaService rubricagalService;

    //Metodo che consente di inserire un contatto nella rubrica
    @RequestMapping("/inserisciContatto")
    public void inserisciContatto(@RequestBody Contatto c) {
        rubricagalService.inserisciContatto(c);
    }
    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore deli contatti a 0*/
    @RequestMapping("/svuoataRubrica")
    public void svuotaContatto(@RequestBody Contatto contatto) {
        rubricagalService.svuotaContatto(contatto);
    }
    
    @RequestMapping("/recuperaContatti")
    public void recuperaContatti() {
        rubricagalService.recuperaContatti();
    }
    
    
}
