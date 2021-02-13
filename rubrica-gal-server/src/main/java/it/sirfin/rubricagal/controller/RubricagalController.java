/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.controller;

import RubricagalService.java.RubricaService;
import it.sirfin.rubricagal.model.ContattoReq;
import it.sirfin.rubricagal.dto.Risposta;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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
   
    //Metodo che consente di inserire un contatto nella rubrica e ritorna la rubrica per intero
    @RequestMapping("/inserisciContatto")
    @ResponseBody
    public List<ContattoReq> inserisciContatto(@RequestBody ContattoReq c) {
        rubricaService.inserisciContatto(c);
        List <ContattoReq> rubrica = new ArrayList<>();
        rubrica.add(c);
        return rubrica;
    }
    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore deli contatti a 0*/
    @RequestMapping("/svuotaRubrica")
    public void svuotaRubrica() {
        rubricaService.svuotaRubrica();
    }
    
    
    @RequestMapping("/recuperaContatti")
    @ResponseBody
    public List<ContattoReq> recuperaContatti() {
        List<ContattoReq> risp = rubricaService.recuperaContatti();
        return risp;
    }
    
    @RequestMapping("/eliminaContatti")
    @ResponseBody
    public List <ContattoReq> eliminaContatto(@RequestBody ContattoReq c) {
        List <ContattoReq> risp = new ArrayList<>();
        rubricaService.eliminaContatto(c);
        risp = rubricaService.recuperaContatti();
        return risp;
    }
}
