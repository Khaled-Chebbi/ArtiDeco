/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author khale
 */
public class Categorie {
    
    int id;
    String  nom_cat ; 

    public Categorie(int id, String nom_cat) {
        this.id = id;
        this.nom_cat = nom_cat;
    }
    
     public Categorie( String nom_cat) {
        
        this.nom_cat = nom_cat;
    }
    
    public Categorie()
    {
        
        
    }

    public int getId() {
        return id;
    }

    public String getNom_cat() {
        return nom_cat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_cat(String nom_cat) {
        this.nom_cat = nom_cat;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", nom_cat=" + nom_cat + '}';
    }

    

  
    
}
