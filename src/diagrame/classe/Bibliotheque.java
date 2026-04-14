/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrame.classe;

/**
 *
 * @author alae2
 */
import java.util.ArrayList;

public class Bibliotheque {
    
    ArrayList<Livre> livres;
    
   
   public Bibliotheque(){
       livres = new ArrayList<Livre>();
       
   }
   public void ajouterlivre(Livre livre){
       livres.add(livre);
   }
    public void afficherLivres(){
        System.out.println("====bibliotheque====");
        for (Livre l : livres){
            l.afficherDescription();
            System.out.println();
            
    }
        
    }         
     
             
}
