/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RubricagalServiceImp.java;

import RubricagalService.java.RubricaService;
import it.sirfin.rubricagal.model.ContattoReq;
import it.sirfin.rubricagal.repository.ContattoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubricagalServiceImp implements RubricaService {

    @Autowired
    ContattoRepository contattoRepository;

    List<ContattoReq> rubrica = new ArrayList<>();
    int counter = 0;

    /*Metodo che consente di inserire un contatto nella base dati
                  -------DATABASE INSERT-------                 */
    @Override
    public void inserisciContatto(ContattoReq c) {
       contattoRepository.save(c);
    }

    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore dei contatti a 0*/
    @Override
    public void svuotaRubrica() {
        contattoRepository.deleteAll();
    }

    /*Servizio che corrisponde alla stampa dei contatti presenti nel DB*/
    @Override
    public List<ContattoReq> recuperaContatti() {
       List <ContattoReq> elle = contattoRepository.findAll();
       return elle;
    }

    @Override
    public void eliminaContatto(ContattoReq c) {
        contattoRepository.delete(c);
    }
    
    @Override
    public void inizializzazione() {
        List<ContattoReq> docenti = new ArrayList<>();
        docenti.add(new ContattoReq("Rosario", "Muniz","335643778"));
        docenti.add(new ContattoReq("Peppe", "Franco","33587508"));
        docenti.add(new ContattoReq("Cristian", "De Sica","337643758"));
        docenti.add(new ContattoReq("Ponzio", "Pelato","338546778"));
        docenti.add(new ContattoReq("Armando", "Diaz","33723478"));
             
        /*
        docenti.forEach(t -> inserisciDocente(t));


        List<ContattoReq> lista = trovaTuttiIDocenti();
        lista.forEach(t -> System.out.println(t));

        lista.stream()
                .filter(s -> s.getId() % 2 == 1)
                .forEach(s -> cancellaDocente(s));

        List<Docente> lista2 = trovaTuttiIDocenti();
        lista2.forEach(t -> System.out.println(t));

//        for (Docente docente : lista) {
//            if (docente.getId() % 2 == 1){
//                scuolaService.cancellaDocente(docente);
//            }
//        }
         */
    }

}
