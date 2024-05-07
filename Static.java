class A {
    static int a =10;
    static void display(){
        System.out.println("Hi display");
    }
}
class Static{
    public static void main(String[] args) {
        System.out.println("The value of x is :"+A.a);
        A.display();
    }
}