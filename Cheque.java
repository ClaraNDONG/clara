package entities;

public class Cheque extends Compte {
    private double frais;

    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }
}