/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RubricagalService.java;

import it.sirfin.rubricagal.model.ContattoReq;
import java.util.List;

public interface RubricaService {

    void inserisciContatto(ContattoReq c);

    void svuotaRubrica();

    List<ContattoReq> recuperaContatti();

    void eliminaContatto(ContattoReq c);

    void inizializzazione();
}
