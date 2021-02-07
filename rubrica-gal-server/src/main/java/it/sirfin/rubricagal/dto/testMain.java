/*
 * Questa classe contiene tutte le proprietà
 * di una ribrica quali
 * and open the template in the editor.
 */
package it.sirfin.rubricagal.dto;

/**
 *
 * @author Federico
 */
public class testMain {

    public static void main(String[] args) {
        RubricaGalDto a,b,c,d;
        a = new RubricaGalDto("Pippo", "Solo", "321513");
        b = new RubricaGalDto("poailo", "cds", "5264154");
        c = new RubricaGalDto("poailo", "cds", "5264154");
        d = new RubricaGalDto("Pina", "Ciao", "5264154");
        
        System.out.println("----Stampa-*-----");
        System.out.println(a.getID());
        System.out.println(b.getID());
        System.out.println(c.getID());
        System.out.println(d.getID());
       
    }
}
