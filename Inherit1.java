class P{
    int money =2000;
    String car ="BMW";
    String newcar ="Benz";
    int site=5;
    void use(){
        System.out.println("Money"+money);
        System.out.println("Car"+car);
        System.out.println("Site"+site);
    }
}
class C extends P{
    int money=1000;
    void use (){
        System.out.println("Money"+money);
        System.out.println("Money of parent "+super.money);
        System.out.println("Car"+car);
        System.out.println("New Car"+newcar);
        System.out.println("Site"+site);
    }
}
public class Inherit1{
    public static void main(String args[]){
        C c = new C();
        c.use();
    }
}