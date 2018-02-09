/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;


import DataSource.DataSource;
import entities.Produit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mouaf
 */
public class CrudProduit {
    Connection con=DataSource.getInstance().getConnection();
private Statement ste;
private ResultSet rst;
    public CrudProduit() {
        try{
            ste=con.createStatement();
            
        }
      catch (SQLException ex) {
            System.out.println("Erreur de connexion");
   
        }
    }
    
    
        public void ajouterproduit(Produit p) throws SQLException
        {
          String req1="INSERT INTO `produit`(`id_prod`, `titre`, `id_cat`, `prix`, `quantite`, `couleur`, `image`, `description`) "
               + "  VALUES (NULL,'"+p.getTitre()+"','"+p.getIdcat()+"','"+p.getPrix()+"','"+p.getQuantite()+"', '"+p.getCouleur()+"','"+p.getImage()+"','"+p.getDescription()+"')"; 
          ste.executeUpdate(req1);
        }
         public void supprimerproduit(int id) throws SQLException
        {
          String req="DELETE FROM `produit` WHERE id_prod="+id; 
          ste.executeUpdate(req);
        }
         public void modifierproduit(int id, String titre, int idcat, int prix, int quantite, String couleur, String image, String description) throws SQLException
         {
        
            String req= "UPDATE `produit` SET `titre`='"+titre+"', `id_cat`="+idcat+", `prix`="+prix+", `quantite`="+quantite+", `couleur`="+couleur+", `image`='"+image+"', `description`="+description+" WHERE id_prod="+id;
            ste.executeUpdate(req);
             System.out.println("produit modifié"
                     + "");
         }

        public void afficherproduit() throws SQLException
        {  
            String req="SELECT * FROM produit ";
            rst=ste.executeQuery(req);
            while(rst.next())
            {
                System.out.print(rst.getInt("id_prod"));
                System.out.println(rst.getString("titre"));
                System.out.println(rst.getInt("id_cat"));
                System.out.println(rst.getInt("prix"));
                System.out.println(rst.getInt("quantite"));   
                System.out.println(rst.getString("couleur"));
                System.out.println(rst.getString("description"));  
            }
        }
             public void RechercherParCat(int idcat) throws SQLException
        {  
            String req="SELECT * FROM produit where id_cat='"+idcat+"'";
            rst=ste.executeQuery(req);
            rst.last();
            int nbrow=rst.getRow();
            if(nbrow!=1)
                System.out.println("Produit trouve");
                else
                System.out.println("Produit non trouvé");
         
}
}
        
    


    
    

