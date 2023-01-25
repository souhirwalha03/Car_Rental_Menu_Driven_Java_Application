import java.util.*;


public class Client extends User {
    private int id_client;

 //associations
    public  ArrayList <Car> vehicules;

 //constructeur
    public Client (int id_client,String nom, String prenom){
        super(nom, prenom);
        this.id_client=id_client;
        this.vehicules = new ArrayList<>();
    }

    public Client () {
        this.vehicules = new ArrayList<>();
    }

 //getter
    public int getIdClient (){
        return this.id_client;
    }
    public ArrayList <Car> getvehicule() {
        return this.vehicules;
    }

 //setter
    public void setIdClient (int id_client){
        this.id_client = id_client;
    }
    public void setVehicule (ArrayList <Car> vehicules){
        this.vehicules = vehicules;
    }

 //toString

    public String toString(){
            
        return "Id:"+ this.id_client + " | Nom:"+ this.getNom()+" | Prenom:"+ this.getPrenom()  ;
    }

    public boolean searchClient (int id) {
        if (getIdClient() ==  id){
            showUserDetails(getIdClient());
            return true;
        }
        else {
            return false;
        }
    }

    public  void  addClient(){
        addUser(getIdClient());
    }

    public void showClientDetails (){                
        showUserDetails(getIdClient());
            
    }
}