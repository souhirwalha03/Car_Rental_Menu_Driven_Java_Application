public class Agent extends User {

    private int id_agent;

 //associations
     // private ArrayList <Invoice> factures;
    //private ArrayList <Vehicule> vehicules=Vehicule.vehicules;

 //constructeur
    public Agent (int id_agent,String nom, String prenom){
        super(nom, prenom);
        this.id_agent=id_agent;
       // this.vehicules = new ArrayList<>();
    }
    public Agent () {}

 //getters
    public int getidAgent (){
        return this.id_agent;
    }

 //setters
    public void setidAgent (int id_agent){
        this.id_agent = id_agent;
    }

 //toString
    public String toString(){    
        return "Id:"+ this.id_agent + " | Nom:"+ this.getNom()+" | Prenom:"+ this.getPrenom()  ;
    }

    public boolean searchAgent (int id) {
        if (getidAgent() ==  id){
            showUserDetails(getidAgent());
            return true;
        }
        return false;
        
    }

    public  void  addAgent(){
        addUser(getidAgent());
    }
        
    public void showAgentDetails (){                
        showUserDetails(getidAgent());
            
    }
}