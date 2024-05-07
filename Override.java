class Bank{
    public int rate_of_intrest(){
        return 10;
    }
}
class SBI extends Bank{
    public int rate_of_intrest(){
        return 12;
    }
}
class Axis extends Bank{
    public int rate_of_intrest(){
        return 13;
    }
}

public class Override {

     public static void main(String[] args) {
        Bank b = new SBI();
        int ans = b.rate_of_intrest();
        System.out.println("The SBI "+ans);
        Bank s = new Axis();
        int val  = s.rate_of_intrest();
        System.out.println("The Axis "+val);
     }
}