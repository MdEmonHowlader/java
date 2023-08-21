public class Method1 {
    public static void main(String[] args) {
        Method1 obj=new Method1();
        int a=12;
        int b=15;
        int c=obj.max(a,b);
        System.out.println("Maximum value :"+ c);
    }
    public int max(int n1, int n2){
        int max_value;
        if(n1>n2)
            max_value=n1;
        else
            max_value=n2;
        
            
        return max_value;
    }

}
