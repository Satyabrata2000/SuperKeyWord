package SuperKeyword;

public class SuperExample5 extends SuperExample4{

    void use(){
        System.out.println("String 2");
    }
    void use2(){
        System.out.println("String 3");
    }
    void use3(){
        super.use();
        use2();
    }

}
