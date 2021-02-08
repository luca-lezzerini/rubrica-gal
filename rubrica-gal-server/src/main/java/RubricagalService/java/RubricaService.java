/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RubricagalService.java;

import it.sirfin.rubricagal.dto.Contatto;
import java.util.List;

/**
 *
 * @author Federico
 */
public interface RubricaService {
    
     public List<Contatto> inserisciContatto (Contatto c);
     public List<Contatto> svuotaContatto(Contatto c);
     public List<Contatto> recuperaContatti();
}
