package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Compte;

public class CompteRepository {
     List<Compte> tComptes=new ArrayList<>();
    public void insert(Compte compte){
        tComptes.add(compte);
    }
    public List<Compte> selectAll(){
        return tComptes;
    }
}
