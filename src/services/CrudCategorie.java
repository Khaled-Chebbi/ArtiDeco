/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entities.Categorie;
import DataSource.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khale
 */
public class CrudCategorie {
    
    Connection con=DataSource.getInstance().getConnection();
    private Statement ste;
    private PreparedStatement pst;
    ResultSet rs;

        public CrudCategorie() {
        try{
            ste=con.createStatement();
            
            
        }
        catch (SQLException ex) {
            System.out.println("Erreur de connexion");
   
        }
    }
        
        
        //Insertion d'un catégorie
        public void insertCategorie(Categorie c) throws SQLException{
        
        String requete = "insert into categorie (id_cat, nom_cat) values (NULL , '"+c.getNom_cat()+"')";
       
        ste.executeUpdate(requete);
    }
        
        //Affichage d'un categorie
        public List<Categorie> Afficher() throws SQLException{
        
        String requete = "select * from categorie";
       
        rs = ste.executeQuery(requete);
        List<Categorie> list = new ArrayList<>();
        
        while(rs.next()){
        Categorie c = new Categorie(rs.getInt("id_cat"), rs.getString(2));
        list.add(c);
    }
        
        return list;
       
    }
        
        
        //Update d'un categorie
        public void update(Categorie c) throws SQLException{
        String requete = "update categorie set nom_cat=? where id_cat=?";
        
        pst = con.prepareStatement(requete);
        pst.setString(1, c.getNom_cat());
        pst.setInt(2, c.getId());
        
        pst.executeUpdate();
        
    }
        
        
        //Supprission d'un categorie
        public void delete (int id) throws SQLException{
            String requete = "delete from categorie where id_cat = " + id;
            
            ste.executeUpdate(requete);
    }
    
}
