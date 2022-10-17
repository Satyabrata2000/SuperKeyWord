package SuperKeyword;

//Using Super keyword to refer immediate parent class instance variable

public class SuperExample2 extends SuperExample1{

    int a = 6;
    void use(){
        System.out.println(a);
        System.out.println(super.a);
    }

}
