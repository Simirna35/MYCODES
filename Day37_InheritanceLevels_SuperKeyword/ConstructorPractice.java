package Day37_InheritanceLevels_SuperKeyword;

class A{

    public A(int a){
        System.out.println("A");
    }
}
class B extends A {
    public B() {
        super(9);


        {
            System.out.println("B");
        }
    }


    public class ConstructorPractice {

        public static void main(String[] args) {
            B obj = new B();
            System.out.println(obj);
        }
    }
}
