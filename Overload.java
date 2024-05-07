class Draw{
    Draw(){
        System.out.println("This is default one");
    }
    Draw(int a){
        System.out.println("This is one param"+a);
    }
    Draw(int a, int b){
        System.out.println("This is a"+a+ "and"+ b);
    }
    Draw(String a , int b){
        System.out.println("String"+" "+a+" "+"Integer"+b);
    }
}
class Overload{
    public static void main(String args[]){
        Draw d = new Draw();
        Draw d1 = new Draw(10);
        Draw d2 = new Draw(10,20);
        Draw d3= new Draw("ajay",10);
    }
}