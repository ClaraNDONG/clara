package repositories;
import java.util.List;
import java.util.ArrayList;
import entities.Client;

public class ClientRepository {
    List<Client> tClients=new ArrayList<>();
    public void insert(Client client){
        tClients.add(client);
    }
    public List<Client> selectAll(){
        return tClients;
    }
}
