/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrame.classe;

/**
 *
 * @author alae2
 */
public class DiagrameClasse {

    
    public static void main(String[] args) {
       Auteur a = new Auteur("victor","hugo",1800);
       Livre l = new Livre ("les miserables",870,a);
       
       Bibliotheque b = new Bibliotheque();
       b.ajouterlivre(l);
       b.afficherbibliotheque();
    }
    
}
