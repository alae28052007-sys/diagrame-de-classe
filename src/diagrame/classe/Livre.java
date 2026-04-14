/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrame.classe;

/**
 *
 * @author alae2
 */
public class Livre {
    String titre;
    int nbpage;
    Auteur auteur;
    public Livre( String titre, int nbpage, Auteur auteur){
        this.titre = titre;
        this.nbpage = nbpage;
        this.auteur = auteur;
       
    }
    public void afficherDescription(){
        System.out.println("----Livre---");
        System.out.println("Titre : "+ titre);
        System.out.println("Nombre de pages : "+ nbpage);
        auteur.afficherDescription();
    }
}
