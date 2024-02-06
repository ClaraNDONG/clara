package services;

import java.util.List;

import entities.Compte;
import repositories.CompteRepository;

public class CompteService {
    CompteRepository compteRepository =new CompteRepository();
    public void ajouterCompte(Compte compte){
        compteRepository.insert(compte);

    }

    public List<Compte> ListerCompte(){
        return compteRepository.selectAll();
    }
}
