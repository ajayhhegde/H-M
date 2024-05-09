 class A {
    final int speed=10;
     void gear(){
        System.out.println("5");
    }
}
class B extends A{
    void gear(){
        System.out.println("5");
    }
}

class Final{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.speed);
    }
}
