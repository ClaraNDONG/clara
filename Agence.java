package entities;

import java.util.ArrayList;
import java.util.List;

public class Agence {
    private int id;
    private String numero; 
    private String adresse; 
    private String telephone;
    //OneToMany => Dans une agence on peut creer plusieurs comptes
    List<Compte>  comptes =new ArrayList<>();
    
    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Agence() {
    }
     


}