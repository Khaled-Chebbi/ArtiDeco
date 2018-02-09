/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services; 
import entities.Client;
import DataSource.DataSource;
import entities.Artisan;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * @author Manel
 */
public class CrudClient {


/**
 *
 * @author Rami
 */


Connection cnx= DataSource.getInstance().getConnection() ;    
Statement ste ; 
PreparedStatement pst ; 
    ResultSet rs ; 
    
   
  
    public void Client (Client a) throws SQLException{
        String requete = "Update utilisateur set status=4" ;
        ste=cnx.createStatement() ;
        ste.executeUpdate(requete); 
                }
    public List<Client>displayAll() throws SQLException{
        String requete="SELECT * FROM utilisateur where type='client'" ;
        ste=cnx.createStatement() ;
        rs=ste.executeQuery(requete);
        List<Client> list = new ArrayList<>() ; 
        while(rs.next()){
           Client  a = new Client
        (rs.getInt("id_utilisateur"),rs.getString("nom"),rs.getString("prenom"),rs.getDate("datenaissance"),rs.getString("email"),rs.getInt("numtel"),rs.getString("type_user"),rs.getString("adresse"),rs.getString("mdp"),rs.getInt("status")) {} ;
        list.add(a) ;
        }
        return list ;
    }
    public void UpdatePersonne(Artisan a) throws SQLException{
        String requete="UPDATE utilisateur SET nom=?, prenom=? ,datenaissance=? ,email=? ,numtel=?, adresse=?,mdp=?,status=?, WHERE id=?" ;
        pst=cnx.prepareStatement(requete) ; 
        pst.setString(1, a.getNom());
        pst.setString(2, a.getPrenom());
        pst.setDate(3, a.getDatenaissance());
        pst.setInt(4, a.getNumtel());
        pst.setString(5, a.getAdresse());
        pst.setString(6, a.getMdp());
       
        pst.setInt(7, a.getStatus());
        
        pst.executeUpdate() ; 
       
    }
    public void InsertClient(Client r) throws SQLException{
        String requete="Insert into utilisateur ( nom, prenom, datenaissance, email, numtel, type_user, adresse, mdp ,status) values (?, ? ,? ,? ,?, 'artisan',?,?,?) " ;
        pst=cnx.prepareStatement(requete);
                
        pst.setString(1, r.getNom());
        pst.setString(2, r.getPrenom());
        pst.setDate(3, r.getDatenaissance());
        pst.setString(4, r.getEmail());
        pst.setInt(5, r.getNumtel());
        pst.setString(6, r.getAdresse());
        pst.setString(7, r.getMdp());
        
        pst.setInt(8, r.getStatus());
        
        pst.executeUpdate() ; 
       
    }
    public void delete (int id)throws SQLException{
        String requete ="delete from Client where id_utilisateur="+id;
        pst=cnx.prepareStatement(requete);
         pst.executeUpdate() ; }
    public static void main(String[] args) {
        CrudClient c = new CrudClient() ; 
        Client a = new Client(5, "manel", "ouaili", null, "manl.oo@gmail.com", 2555, "client", "klkl", "ariana ", 1) ;
    try {
        c.InsertClient(a);
        
    } catch (SQLException ex) {
        Logger.getLogger(CrudArtisan.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

 
    
}