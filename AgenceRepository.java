package repositories;

import java.util.List;

import entities.Agence;

import java.util.ArrayList;

public class AgenceRepository {
    //Tables de données
    List<Agence> tAgences= new ArrayList<>();
     
     //select
     public List<Agence> selectAll(){
        return tAgences;
     }
     public Agence selectByNumero(String numero){
        for (Agence ag : tAgences){
            if (ag.getNumero().compareTo(numero)==0){
                return ag;
            }
        }
         return null;
     }
     //update
     //delete
     //insert
     public void insert(Agence agence){
        tAgences.add(agence);
     }
}
