package entities;

public class Compte {
    private int id;
    private String numero; 
    private double solde;
    private ETypeCompte type;

    //Propriete Navigationnelle
    //ManyToOne : Plusieurs compte crees dans une Agence
     Agence agence;

    //ManyToOne
     Client client;
    
    public Agence getAgence() {
        return agence;
    }
    public void setAgence(Agence agence) {
        this.agence = agence;
    }
    public ETypeCompte getType() {
        return type;
    }
    public void setType(ETypeCompte type) {
        this.type = type;
    }
    public Compte() {
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
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
}