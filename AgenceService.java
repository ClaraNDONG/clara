package services;

import java.util.List;

import entities.Agence;
import repositories.AgenceRepository;

public class AgenceService {
    private AgenceRepository agenceRepository= new AgenceRepository();
    public List<Agence> listerAgence(){
        return agenceRepository.selectAll();
    }
    public Agence listerAgence(String numero){
        return agenceRepository.selectByNumero(numero);
    }
    public void ajouterAgence(Agence agence){
        agenceRepository.insert(agence);
    }
}
