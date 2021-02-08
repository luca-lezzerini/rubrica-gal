/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RubricagalServiceImp.java;
//import
import RubricagalService.java.RubricaService;
import it.sirfin.rubricagal.dto.Contatto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Federico
 */
public class RubricagalServiceImp implements RubricaService{

    List <Contatto> rubrica = new ArrayList ();
    int counter = 0;
    
    //Metodo che consente di inserire un contatto nella rubrica
    @Override
    public List<Contatto> inserisciContatto (Contatto c) {
        c.setID(counter);
        this.rubrica.add(c);
        counter++;
        return this.rubrica;
    }
    
    /*Metodo che consente di svuotare interamente la rubrica creando una nuova 
    e inizializzando il contatore deli contatti a 0*/
    
    @Override
    public List<Contatto> svuotaContatto(Contatto contatto) {
        this.rubrica = new ArrayList();
        this.counter = 0;
        return this.rubrica;
    }
    
    @Override
    public List<Contatto> recuperaContatti() {
    return this.rubrica;
    }
    
    
}
