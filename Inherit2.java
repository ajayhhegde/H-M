import java.util.*;

class Employee{
    String name;
    int id;
    Employee(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name:");
         name = sc.next();
        System.out.println("Enter the id:");
         id = sc.nextInt();
    }
    

}

class Dev extends Employee{
    
    String des="Developer";
    
    float salary=2000;
    
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Designation:"+des);
        System.out.println("id:"+id);
        System.out.println("salary:"+salary);
     }
}

class Clerk extends Employee{
    
    String des="Clerk";
    
    float salary=1000;
     
     public void display(){
        System.out.println("Name:"+name);
        System.out.println("Designation:"+des);
        System.out.println("id:"+id);
        System.out.println("salary:"+salary);
     }
}
class Inherit2{
    public static void main(String args[]){
        int choice=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter choice 1.DEV  2. CLERK  3.Exit ");
                 choice = sc.nextInt();
            if (choice==1){
                Dev d = new Dev();
                d.display();
            }
            if (choice==2){
                Clerk c = new Clerk();
                c.display();
            }
            if (choice==3){
                System.exit(0);
            }

        }
        while(choice !=3);
    }
}