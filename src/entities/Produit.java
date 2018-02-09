/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.JDBCType;

/**
 *
 * @author khale
 */
public class Produit {
    
     private int id;
    private String  titre;
    private int idcat;
    private int prix;
    private int quantite;
    private String couleur;
   private String image;
   private String description;

    public Produit(int id, String titre, int idcat, int prix, int quantite, String couleur, String image, String description) {
        this.id = id;
        this.titre=titre;
        this.idcat = idcat;
        this.prix = prix;
        this.quantite = quantite;
        this.couleur = couleur;
        this.image = image;
        this.description = description;
    }

    public Produit(JDBCType jdbcType, String chachia1, JDBCType jdbcType0, int i, String red, String aaa, String bbb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public int getIdcat() {
        return idcat;
    }

    public int getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
    
}
