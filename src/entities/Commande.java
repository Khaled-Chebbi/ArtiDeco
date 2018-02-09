/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author mac
 */
public class Commande {
    int id_cmd;
    String date;
    String addresse;
    int meth_paiement;
    int id_client;

    public Commande(int id_cmd, String date, String addresse, int meth_paiement, int id_client) {
        this.id_cmd = id_cmd;
        this.date = date;
        this.addresse = addresse;
        this.meth_paiement = meth_paiement;
        this.id_client = id_client;
    }
    
    public Commande() {}

    public int getId_cmd() {
        return id_cmd;
    }

    public void setId_cmd(int id_cmd) {
        this.id_cmd = id_cmd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getMeth_paiement() {
        return meth_paiement;
    }

    public void setMeth_paiement(int meth_paiement) {
        this.meth_paiement = meth_paiement;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Override
    public String toString() {
        return "Commande{" + "id_cmd=" + id_cmd + ", date=" + date + ", addresse=" + addresse + ", meth_paiement=" + meth_paiement + ", id_client=" + id_client + '}';
    }
    
    
}
