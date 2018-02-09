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
public class Client extends Utilisateur {

    public Client(int id_utilisateur, String nom, String prenom, Date datenaissance, String email, int numtel, String type_user, String adresse, String mdp, int status) {
        super(id_utilisateur, nom, prenom, datenaissance, email, numtel, type_user, adresse, mdp, status);
    }

   
   

    @Override
    public String toString() {
        return super.toString()+"Membre{" + '}';
    }

  

    
    
    
            
    
    

    
}
