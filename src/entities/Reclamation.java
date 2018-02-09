/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author Manel
 */
public class Reclamation {
    int id_reclamation;
    	int id_utilisateur;
        String type_rec ;
        String commentaire_rec;
        String etat_rec;
        Date	date_rec ;

    public Reclamation(int id_reclamation, int id_utilisateur, String type_rec, String commentaire_rec, String etat_rec, Date date_rec) {
        this.id_reclamation = id_reclamation;
        this.id_utilisateur = id_utilisateur;
        this.type_rec = type_rec;
        this.commentaire_rec = commentaire_rec;
        this.etat_rec = etat_rec;
        this.date_rec = date_rec;
    }

    public int getId_reclamation() {
        return id_reclamation;
    }

    public void setId_reclamation(int id_reclamation) {
        this.id_reclamation = id_reclamation;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getType_rec() {
        return type_rec;
    }

    public void setType_rec(String type_rec) {
        this.type_rec = type_rec;
    }

    public String getCommentaire_rec() {
        return commentaire_rec;
    }

    public void setCommentaire_rec(String commentaire_rec) {
        this.commentaire_rec = commentaire_rec;
    }

    public String getEtat_rec() {
        return etat_rec;
    }

    public void setEtat_rec(String etat_rec) {
        this.etat_rec = etat_rec;
    }

    public Date getDate_rec() {
        return date_rec;
    }

    public void setDate_rec(Date date_rec) {
        this.date_rec = date_rec;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id_reclamation=" + id_reclamation + ", id_utilisateur=" + id_utilisateur + ", type_rec=" + type_rec + ", commentaire_rec=" + commentaire_rec + ", etat_rec=" + etat_rec + ", date_rec=" + date_rec + '}';
    }

    
}
