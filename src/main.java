import java.util.*;


public class main {
   public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   
   //Adding Clients
   System.out.println("How many Clients do you want to input?");
   int n = sc.nextInt();             
   ArrayList<Client> c = new ArrayList<Client>();
   for (int i = 0; i < n ; i++) {  
      c.add(i, new Client());
      c.get(i).addClient();
   } 

   //Adding Agents
   System.out.println("How many Agents do you want to input?");
   n = sc.nextInt();             
   ArrayList<Agent> a = new ArrayList<Agent>();
   for (int i = 0; i < n ; i++) {  
      a.add(i, new Agent());
      a.get(i).addAgent();
   } 

   //Adding Cars
   System.out.println("How many Cars do you want to input?");
   n = sc.nextInt();             
   ArrayList<Car> v = new ArrayList<Car>();
   for (int i = 0; i < n ; i++) {  
      v.add(i, new Car());
      v.get(i).addCar();
   } 

   System.out.println("***Welcome***");
   System.out.println("1-I'm a Client 2-I'm an Agent");
   int x = sc.nextInt();  
   switch (x){
        case 1:
            int p=1;
            do {
                System.out.println("enter your Id");
                int id = sc.nextInt();  
                boolean found = false;  
                for (int i = 0; i < c.size(); i++) {  
                    found = c.get(i).searchClient(id);  
                    if (!found) {  
                        p=0;
                        do{
                            System.out.println("1-Display all cars.                    2- Search by Car Id.\n"+
                            "3-check if a Car is available or not.  4-Display all Cars Filtered by the Client who rent it");
                            System.out.println( "5-Rent a Car.                         6-Display Rent agreement.");
                            System.out.println( "7-Diplay a Rent invoice details. 8-Sign out");
                
                            x = sc.nextInt();
                            System.out.println();
                
                            switch (x) {
                                case 1: 
                                    for ( i = 0; i < v.size(); i++) {  
                                        v.get(i).showCarDetails(); 
                                    }  
                                break;
                                case 2:
                                    System.out.print("Enter car Id you want to search: ");  
                                    id = sc.nextInt();  
                                    found = false;  
                                    for ( i = 0; i < v.size(); i++) {  
                                        found = v.get(i).searchCar(id);  
                                        if (found) {  
                                            break;  
                                        }  
                                    }  
                                    if (!found) {  
                                        System.out.println("Search failed! Car doesn't exist..!!");  
                                    }  
                                break;
                                case 8:

                                break;
                            } 
            
                        }while (x !=8);

                    }
                }    
                if (found) {  
                    System.out.println("Search failed! Client doesn't exist..!!");  
                    System.out.println("1-Sign up. 2-Exit");
                    x = sc.nextInt();  
                    switch (x){
                        case 1:
                            c.add(new Client());
                            c.get(c.size()-1).addClient();
                        break;
                        case 2:
                            p = 0;
                        break;
                    }
                        
                }  
                
            }while(p == 1);
        break;

        case 2:
            int t=1;
            do {
                System.out.println("enter your Id");
                int id = sc.nextInt();  
                boolean found = false;  
                for (int i = 0; i < a.size(); i++) {  
                    found = a.get(i).searchAgent(id);  
                    if (found) {  
                        t=0;
                        do{

                            System.out.println( 
                            "1-Add new Client.                 2-Display all clients.    3-Remove Client\n"+
                            "4- Search by Client Id.            5- Display all client Filtered by the car They rent\n");
                            System.out.println( 
                            "6-Display all Agents.");
                            System.out.println( 
                            "7-Add cars.                       8-Display all cars.       9- Search by Car Id.\n    10-check if a Car is available or not.     11-Display all Cars Filtered by the Client who rent it");
                            System.out.println( 
                            "12-Rent a Car.                    13-Display Rent agreement.");
                            System.out.println( 
                            "14-Add a Rent invoice.            15-Diplay a Rent invoice details.  16-Exit.");
                
                            x = sc.nextInt();
                            System.out.println();
                
                            switch (x) {
                                case 1: 
                                    c.add(new Client());
                                    c.get(c.size()-1).addClient();
                                break;
                                case 2: 
                                    for (i = 0; i < c.size(); i++) {  
                                        c.get(i).showClientDetails();
                                    }  
                                break;
                                case 3:
                                
                                break;
                                case 4:
                                    System.out.print("Enter Client Id you want to search: ");  
                                    id = sc.nextInt();  
                                    found = false;  
                                    for (i = 0; i < c.size(); i++) {  
                                        found = c.get(i).searchClient(id);  
                                        if (found) {  
                                            break;  
                                        }  
                                    }  
                                    if (!found) {  
                                        System.out.println("Search failed! Client doesn't exist..!!");  
                                    }  
                                break;
                                case 5:
                
                
                                break;
                                case 6: 
                                    for (i = 0; i < a.size(); i++) {  
                                        a.get(i).showAgentDetails();
                                    }  
                                break;
                                case 7: 
                                    v.add(new Car());
                                    v.get(v.size()-1).addCar();
                                break;
                                case 8: 
                                    for (i = 0; i < v.size(); i++) {  
                                        v.get(i).showCarDetails(); 
                                    }  
                                break;
                                case 9:
                                    System.out.print("Enter car Id you want to search: ");  
                                    id = sc.nextInt();  
                                    found = false;  
                                    for ( i = 0; i < v.size(); i++) {  
                                        found = v.get(i).searchCar(id);  
                                        if (found) {  
                                            break;  
                                        }  
                                    }  
                                    if (!found) {  
                                        System.out.println("Search failed! Car doesn't exist..!!");  
                                    }  
                                break;
                                case 16:
                                break;
                            } 
                        }while (x !=16);           
                    }  
                }  
                if (!found) {  
                    System.out.println("Search failed! Agent doesn't exist..!!");  
                    System.out.println("1-Sign up. 2-Exit");
                    x = sc.nextInt();  
                    switch (x){
                        case 1:
                            a.add(new Agent());
                            a.get(a.size()-1).addAgent();
                        break;
                        case 2:
                        break;
                        
                    }  
                }    
            }while(t == 1);
        break;    
    }
}