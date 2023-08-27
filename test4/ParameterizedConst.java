package test4;

//Parameterized constructor.....

public class ParameterizedConst {
    int x;
    public ParameterizedConst(int y){
        x=y;

    }
    public static void main(String[] args) {
        ParameterizedConst myObj=new ParameterizedConst(58);
        System.out.println(myObj.x);
    }
}
