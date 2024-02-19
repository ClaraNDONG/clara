import java.util.Date;
import java.util.List;
import java.util.Scanner;
import entities.Zone;
import entities.Bien;
import services.ZoneServices;
import services.BienServices;

public class App {
       public static void main(String[] args) throws Exception {
       int choix;
        Scanner sc=new Scanner(System.in);
        //Dependances
        ZoneServices zoneService=new ZoneServices();
        BienServices bienService=new BienServices();
        
       
        do {
            System.out.println("1-Créer une Zone");
            System.out.println("2-Lister les Zones"); 
            System.out.println("3-Ajouter un bien et lui associe une zone"); 
            System.out.println("4-Lister les biens en affichant le nom de la zone ");
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrer un nom de la zone");
                String nomZone=sc.nextLine(); 
                Zone zone=new Zone();
                 zone.setNomZone(nomZone);
                 zoneService.ajouterZone(zone);
                break;
                case 2:
                List<Zone> zones=  zoneService.listerZone();
                 for (Zone z: zones) {
                      System.out.println("Numero "+ z.getNomZone());
                      System.out.println("=================================");
                 }
                break;
                case 3:
                System.out.println("Entrer une reference");
                String reference=sc.nextLine(); 
                System.out.println("Entrer la description du bien");
                String description=sc.nextLine();
                System.out.println("Entrer le prix du bien"); 
                double prix=sc.nextDouble();
                int type=sc.nextInt();
                sc.nextLine();
                 System.out.println("Entrer la zone du bien");
                 nomZone=sc.nextLine(); 
                   zone = zoneService.rechercherZoneparnom(nomZone);
                    if (zone==null) {
                         System.out.println("Entrer un Nom");
                          nomZone=sc.nextLine(); 
                         zone=new Zone();
                         zone.setNomZone(nomZone);
                    }
               break;
               case 7:
               List<Bien> biens= bienService.listerBien();
                for (Bien bn: biens) {
                     System.out.println("Refereence :"+ bn.getReference());
                     System.out.println("Description :"+ bn.getDescription());
                     System.out.println("Prix :"+ bn.getPrix());
                     System.out.println("Zone :"+ bn.getZone().getNomZone());
                     System.out.println("====================================================================");
                }
               break;
                default:
                    break;
            }

        } while (choix!=5);
        
    }
}
