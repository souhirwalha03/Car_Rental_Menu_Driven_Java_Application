import java.util.*;

public class Car {
    Scanner sc =new Scanner(System.in);

    private int CarId;
    private int Kilometreage ;
    private String Brand;
    private int dispo; 
    
    public int prix;
 //associations
    public  ArrayList <Client> clients;
    private Agent agent;
    
 //constructeur
    public Car(int CarId, int Kilometreage , String Brand , int dispo,Agent agent,int prix)
    {
        this.CarId=CarId;
        this.Kilometreage=Kilometreage;
        this.Brand=Brand;
        this.dispo=dispo;    
        this.agent=agent;
        this.clients = new ArrayList<>();
        this.prix=prix;
    }

    public Car(){}

 // getters   
    public ArrayList <Client> getclient() {
        return clients ;
    }

    public Agent getagent(){
        return this.agent;
    }

    public int getCarId(){
        return this.CarId;
    }

    public int getKilometreage(){
        return this.Kilometreage;
    }

    public String getBrand() {
        return this.Brand;
    }

    public int getDispo(){
        return this.dispo;
    }

 //setters
    public void setClient (ArrayList <Client> clients){
        this.clients = clients;
    }

    public void setagent( Agent agent ){
         this.agent=agent ;
    }

    public void setCarId ( int CarId ){
        this.CarId=CarId ;
    }

    public void setKilometreage ( int Kilometreage){
      this.Kilometreage=Kilometreage;
    }

    public void setBrand( String Brand ) {
        this.Brand=Brand ;
    }

    public void setDispo(int dispo){
        this.dispo=dispo;
    }

 ///toString
    public String toString(){
        return "Id:"+ this.CarId + " | Kilometreage:"+ this.Kilometreage
         +" | Brand:"+ this.Brand  +" | Disponibilité:" + this.dispo +" | gérée par l'agent d'id:"+this.agent.getidAgent();
    }

 //methodes
    public  void  addCar( ){
        System.out.println("Id:");
        setCarId(sc.nextInt()); 
        System.out.println("Disponibility:");
        setDispo(sc.nextInt()); 
        System.out.println("Kilometreage:");
        setKilometreage(sc.nextInt());
        System.out.println("Brand:");
        setBrand(sc.next()); 

    }

 //methode afficher liste des agents
    public void showCarDetails ( ){                
        System.out.println( "Id:"+getCarId() +" | Brand: " + getBrand()+" | Kilometreage: " + getKilometreage()+" | Disponibility : " + getDispo());
            
    }

    public boolean searchCar (int id) {
        if (getCarId() ==  id){
            showCarDetails();
            return true;
        }
        return false;
        
    }
}