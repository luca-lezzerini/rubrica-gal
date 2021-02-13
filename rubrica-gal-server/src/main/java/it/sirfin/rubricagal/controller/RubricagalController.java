/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.controller;

import RubricagalService.java.RubricaService;
import it.sirfin.rubricagal.model.ContattoReq;
import it.sirfin.rubricagal.dto.Risposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricagalController {

   @Autowired
   RubricaService rubricaService;

   /*
   @RequestMapping("/inizializza")
    public void inizializza() {
        rubricaService.inizializzazione();
    }
   */
   
    //Metodo che consente di inserire un contatto nella rubrica
    @RequestMapping("/inserisciContatto")
    @ResponseBody
    public Risposta inserisciContatto(@RequestBody ContattoReq c) {
        rubricaService.inserisciContatto(c);
        Risposta risp = new Risposta();
        return risp;
    }
    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore deli contatti a 0*/
    @RequestMapping("/svuotaRubrica")
    @ResponseBody
    public Risposta svuotaContatto(@RequestBody ContattoReq c) {
        rubricaService.svuotaContatto(c);
        Risposta risp = new Risposta("Contatto aggiunto");
        return risp;
    }
    
    @RequestMapping("/recuperaContatti")
    @ResponseBody
    public Risposta recuperaContatti() {
        rubricaService.recuperaContatti();
        Risposta risp = new Risposta();
        return risp;
    }
    
    @RequestMapping("/eliminaContatti")
    @ResponseBody
    public Risposta eliminaContatto(@RequestBody ContattoReq c) {
        rubricaService.eliminaContatto(c);
        Risposta risp = new Risposta();
        return risp;
    }
}
