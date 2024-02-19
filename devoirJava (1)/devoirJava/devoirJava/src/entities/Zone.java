package entities;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private int id;
    private String nomZone;

    //OneToMany => Dans une zone on peut creer plusieurs biens
    List<Bien>  biens =new ArrayList<>();
    public List<Bien> getBiens() {
        return biens;
    }
    public void setBiens(List<Bien> biens) {
        this.biens = biens;
    }
    public Zone() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomZone() {
        return nomZone;
    }
    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }
}
