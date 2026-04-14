/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrame.classe;

/**
 *
 * @author alae2
 */
public class Auteur {
    String nom;
    String prenom;
    int annee;
    public Auteur(String nom, String prenom, int annee){
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
    }
    public void afficherDescription(){
        System.out.println("Auteur :" + prenom + " "+ nom);
        System.out.println("annee de naissance : "+ annee);
    }
}
