import java.util.*;


public class User {
    
    private String nom;
    private String prenom;
    Scanner sc =new Scanner(System.in);
    
//CONSTRUCTOR
    public User(String nom,String prenom)
        {
            this.nom=nom;
            this.prenom=prenom;
        }
    public User (){}

//setter&getter nom
    public String getNom(){
        return this.nom;
    }
    public void setNom (String nom){
        this.nom=nom;
    }


//setter&getter prenom
     public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom (String prenom){
        this.prenom=prenom;
    }

    public  void  addUser( int id ){
        System.out.println("id:");
        id =sc.nextInt(); 
        System.out.println("Nom:");
        setNom(sc.next());
        System.out.println("Prénom:");
        setPrenom(sc.next());
            
    }
    
    //methode afficher liste des agents
    public void showUserDetails (int id){                
        System.out.println( "id:"+id+" | Nom: " + getNom()+ " | Prénom: "+ getPrenom());
            
    }
}
