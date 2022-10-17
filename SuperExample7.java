package SuperKeyword;

class ForExample {

    int i;
    public ForExample(int i){
        this.i = i--;
    }
}

class ThisExample extends ForExample{

    public ThisExample(int i){
        super(++i);
        System.out.println(i);
    }
}

public class SuperExample7 {

    public static void main(String[] args) {

        ThisExample obj = new ThisExample(26);
    }
}




