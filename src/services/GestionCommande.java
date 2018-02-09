/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import DataSource.DataSource;
import entities.Commande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class GestionCommande {
    
    Connection con=DataSource.getInstance().getConnection();
    private Statement ste;
    private PreparedStatement pst;
    ResultSet rs;
    
    public GestionCommande() {
        try{
            ste=con.createStatement();
            
            
        }
        catch (SQLException ex) {
            System.out.println("Erreur de connexion");
   
        }
    }
    
    //Insertion d'une commande
        public void insertCommande(Commande c) throws SQLException{
        
        String requete = "insert into commande (id_cmd, date, addresse, meth_paiement, id_client) values (NULL , '"+c.getDate()+"', '"+c.getAddresse()+"', '"+c.getMeth_paiement()+"', '"+c.getId_client()+"')";
       
        ste.executeUpdate(requete);
    }
        
        //Affichage d'une commande
        public List<Commande> Afficher() throws SQLException{
        
        String requete = "select * from commande";
       
        rs = ste.executeQuery(requete);
        List<Commande> list = new ArrayList<>();
        
        while(rs.next()){
        Commande c = new Commande(rs.getInt("id_cmd"), rs.getString(2),rs.getString(2),rs.getInt("meth_paiement"),rs.getInt("id_client"));
        list.add(c);
    }
        
        return list;
       
    }
        
        //Supprission d'une commande
        public void delete (int id) throws SQLException{
            String requete = "delete from commande where id_cmd = " + id;
            
            ste.executeUpdate(requete);
    }
}
