interface A{
    int a=10;
    void add();
    void sub();
}
interface B{
    int b=20;
    void mul();
    void div();
}
interface K extends A ,B{

}
class Clerk{

}
class Cal extends Clerk implements K{
    public void sub(){
        System.out.println("A-B");
    }
    public void add(){
       
        System.out.println("A+B");
    }
    public void mul(){
        System.out.println("A*b");
    }
    public void div(){
        System.out.println("A/B");
    }
}
/**
 * Interface
 */
public interface Interface {
public static void main(String[] args) {
    Cal  c = new Cal();
    A a = c;
    a.add();
    a.sub();

    B b =c;
    c.mul();
    c.div();
}
    
}