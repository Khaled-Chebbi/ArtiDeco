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
public class Utilisateur {
    int id_utilisateur ; 
    String 	nom  ; 
    String prenom ; 
    
    
    Date datenaissance ;
    String email;
    int numtel ;
    String type_user  ;
    String adresse ; 
    
    String mdp ;

    int status ;

    public Utilisateur(int id_utilisateur, String nom, String prenom, Date datenaissance, String email, int numtel, String type_user, String adresse, String mdp, int status) {
        this.id_utilisateur = id_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.email = email;
        this.numtel = numtel;
        this.type_user = type_user;
        this.adresse = adresse;
        this.mdp = mdp;
        this.status = status;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id_utilisateur=" + id_utilisateur + ", nom=" + nom + ", prenom=" + prenom + ", datenaissance=" + datenaissance + ", email=" + email + ", numtel=" + numtel + ", type_user=" + type_user + ", adresse=" + adresse + ", mdp=" + mdp + ", status=" + status + '}';
    }


    
   
    
}
