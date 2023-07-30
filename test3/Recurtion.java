package test3;

public class Recurtion {
    public static void main(String[] args) {
        int r=s(5);
        System.out.println(r);
    }
    public static int s(int k){
        if(k>0){
            return k+ s(k-1);
        }else{
            return 0;
        }
    }
    
}
