import java.util.*;

class Employee{
    String name;
    int id;
    String des;
    float salary;
    Employee(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name:");
         name = sc.next();
        System.out.println("Enter the id:");
         id = sc.nextInt();
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Designation:"+des);
        System.out.println("id:"+id);
        System.out.println("salary:"+salary);
     }
    

}

class Dev extends Employee{
    
    Dev(){
         des="Developer";
      salary=2000;
    }
    
}

class Clerk extends Employee{
    
    Clerk(){
         des="Clerk";
    
     salary=1000;
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