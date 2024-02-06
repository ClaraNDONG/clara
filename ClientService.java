package services;

import java.util.List;

import entities.Client;
import repositories.ClientRepository;

public class ClientService {
    ClientRepository clientRepository=new ClientRepository();

    public List<Client> listerClient(){
        return clientRepository.selectAll();
    }

    public void ajouterClient(Client client){
        clientRepository.insert(client);
    }
}
