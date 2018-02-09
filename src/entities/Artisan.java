/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.sql.Date;

/**
 *
 * @author Rami
 */
public class Artisan extends Utilisateur {
    String nom_boutique;

    public Artisan(int id_utilisateur, String nom, String prenom, Date datenaissance, String email, int numtel, String type_user, String adresse, String mdp, int status,String nom_boutique) {
        super(id_utilisateur, nom, prenom, datenaissance, email, numtel, type_user, adresse, mdp, status);
    this.nom_boutique=nom_boutique;}

   
    

    

    
    @Override
    public String toString() {
        return super.toString()+"Membre{" + '}';
    }

    public String getNom_boutique() {
        return nom_boutique;
    }

    public void setNom_boutique(String nom_boutique) {
        this.nom_boutique = nom_boutique;
    }

   

  

    
    
    
            
    
    

    
}
