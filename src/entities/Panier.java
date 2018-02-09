/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author mac
 */
public class Panier {
    int id_prod;
    int id_cmd;
    int quantite; 

    public Panier(int id_prod, int id_cmd, int quantite) {
        this.id_prod = id_prod;
        this.id_cmd = id_cmd;
        this.quantite = quantite;
    }
    
    public Panier(){}

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getId_cmd() {
        return id_cmd;
    }

    public void setId_cmd(int id_cmd) {
        this.id_cmd = id_cmd;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Panier{" + "id_prod=" + id_prod + ", id_cmd=" + id_cmd + ", quantite=" + quantite + '}';
    }
    
    
}
