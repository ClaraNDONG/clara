package entities;

import java.util.ArrayList;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;

    //  Attributs de navigation
    //OneToMany
    ArrayList<Compte> compteList=new ArrayList<>();

    public Client() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
}
