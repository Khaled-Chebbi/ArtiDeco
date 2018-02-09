/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import DataSource.DataSource;
import entities.Reclamation;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rami
 */

public class CrudReclamation {
Connection cnx= DataSource.getInstance().getConnection() ;    
Statement ste ; 
PreparedStatement pst ; 
    ResultSet rs ; 
    
   
  
    public void ChangerStatusToTraite(Reclamation r) throws SQLException{
        String requete = "Update reclamation set ETAT_R='traite'" ;
        ste=cnx.createStatement() ;
        ste.executeUpdate(requete); 
                }
   
     public List<Reclamation>displayAllNonTraiter() throws SQLException{
        String requete="SELECT * FROM reclamation where ETAT_R='nontraite'" ;
        ste=cnx.createStatement() ;
        rs=ste.executeQuery(requete);
        List<Reclamation> list = new ArrayList<>() ; 
        while(rs.next()){
        Reclamation r = new Reclamation(rs.getInt("id_reclamation"),rs.getInt("id_utilisateur"),rs.getString("type_rec"),rs.getString("commentaire_rec"),rs.getString("etat_rec"),rs.getDate("date_rec"));
        list.add(r) ;
        }
        return list ;
    }
     public List<Reclamation>displayAll() throws SQLException{
        String requete="SELECT * FROM reclamation" ;
        ste=cnx.createStatement() ;
        rs=ste.executeQuery(requete);
        List<Reclamation> list = new ArrayList<>() ; 
        while(rs.next()){
        Reclamation r = new Reclamation(rs.getInt("id_reclamation"),rs.getInt("id_utilisateur"),rs.getString("type_rec"),rs.getString("commentaire_rec"),rs.getString("etat_rec"),rs.getDate("date_rec"));
        list.add(r) ;
        }
        return list ;
    }
    public List<Reclamation> findById(int id) throws SQLException{
         String requete="SELECT * FROM reclamation where id_reclamation="+id ;
        ste=cnx.createStatement() ;
        rs=ste.executeQuery(requete);
        List<Reclamation> list = new ArrayList<>() ; 
        while(rs.next()){
        Reclamation r = new Reclamation(rs.getInt("id_reclamation"),rs.getInt("id_utilisateur"),rs.getString("type_rec"),rs.getString("commentaire_rec"),rs.getString("etat_rec"),rs.getDate("date_rec"));
        list.add(r) ;
        }
        return list ;
       
    }
     public void InsertReclamation(Reclamation r) throws SQLException{
        String requete="Insert into Reclamation ( type_rec, commentaire_rec, etat_rec, date_rec , id_utilisateur) values (? ,? ,? ,?,?) " ;
        pst=cnx.prepareStatement(requete);
                
     
        pst.setString(1, r.getType_rec());
        pst.setString(2, r.getCommentaire_rec());
        pst.setString(3, r. getEtat_rec());
        pst.setDate(4, r.getDate_rec());
                pst.setInt(5, r.getId_utilisateur());

        
      
        
        pst.executeUpdate() ; 
       
    }
    public void delete (int id)throws SQLException{
        String requete ="delete from Reclamation where id_utilisateur="+id;
        pst=cnx.prepareStatement(requete);
         pst.executeUpdate() ; }
    public static void main(String[] args) {
        
        CrudReclamation c = new CrudReclamation(); 
        
        
        Reclamation a = new Reclamation( 1, 1,"manel", "ouaili",  "bbb" , null) ;
    
    try {
        c.InsertReclamation(a);
    } catch (SQLException ex) {
        Logger.getLogger(CrudReclamation.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    
    }
}
