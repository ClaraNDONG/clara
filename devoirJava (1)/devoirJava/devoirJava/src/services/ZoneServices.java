package services;

import java.util.List;

import com.mysql.cj.xdevapi.Client;

import entities.Zone;
import repositories.ZoneRepository;

public class ZoneServices {
        private ZoneRepository zoneRepository=new ZoneRepository();
    
  public List<Zone> listerZone(){
      return zoneRepository.selectAll();
   }
   public void ajouterZone(Zone zone){
    zoneRepository.insert(zone);
   }
    public  Zone rechercherZoneparnom(String nomZone){
        return zoneRepository.selectZoneBynom(nomZone);
    }
}
