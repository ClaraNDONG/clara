package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Bien;
import entities.Zone;


public class BienRepository {
    public void insert(Bien bien){
        
    }
     public List<Bien> selectAll(){
         List<Bien> biens=new ArrayList<>();
          try {
    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoir_iagea" 
                   , "root", "");
             Statement statement = conn.createStatement();
             String sql="SELECT * FROM `bien` b, zone zn  WHERE b.zone_id=zn.id_zone;";
             ResultSet rs=statement.executeQuery(sql);
            while (rs.next()) {
               //Une ligne ==> rs de la requete
                Zone client=new Zone();
                client.setId(rs.getInt("id_zone"));
                client.setNomZone(rs.getString("nom_zone"));

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
       return  biens;
      }
}
