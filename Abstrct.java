abstract class Bank{
    abstract void OT();
    abstract void KYC();

}
class SBI extends Bank{
    public void OT(){
        System.out.println("50000");
    }
    public void KYC(){
        System.out.println("KYC done SBI");
    }
}
class Axis extends Bank{
    public void OT(){
        System.out.println("24000");
    }
    public void KYC(){
        System.out.println("KYC done axis");
    }
}
/**
 * Abstrct
 */
public class Abstrct {

     public static void main(String[] args) {
        Bank b = new SBI();
        b.KYC();
        b.OT();
        Bank a = new Axis();
        a.KYC();
        a.OT();

     }
}