package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Zone;

public class ZoneRepository {
   
      public  List<Zone> selectAll(){
         List<Zone> zones=new ArrayList<>();
       try {
          //1-Chargement du Driver
          Class.forName("com.mysql.cj.jdbc.Driver");
          //2-Se Connecter a une BD
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoir_iagea" 
                    , "root", "");
          //3-Execution et Recuperation
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("select * from zone");
             while (rs.next()) {
               //Une ligne du ResultSet ==> Une Zone
                 Zone zone=new Zone();
                 zone.setId(rs.getInt("id_ag"));
                 zone.setNomZone(rs.getString("nom_zone"));
                 zones.add(zone);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  zones;
    }

    public  void insert(Zone zone){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique" 
                       , "root", "");
               //3-Execution et Recuperation
                Statement statement = conn.createStatement();
               
                int nbreLigne=statement.executeUpdate("INSERT INTO zone (id_zn, nom_zn) VALUES ('"+zone.getNomZone()+"')");
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
        }
          public Zone selectZoneBynom(String nomZone){
        Zone zone=null;
        try {
    
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique" 
                   , "root", "");
           Statement statement = conn.createStatement();
           String sql=String.format("Select * from client where tel_client like '%s' ",nomZone);
           ResultSet rs=statement.executeQuery(sql);
            if (rs.next()) {
               //Une ligne ==> rs de la requete
                zone=new Zone();
                zone.setId(rs.getInt("id_zn"));
                zone.setNomZone(rs.getString("nom_zn"));
            }
            statement.close();
            rs.close();
            conn.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Erreur de chargement de Driver");
       }
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
           return zone;
        }
}
