package Task3;

public class Main {
    public static void main(String[] args){
        int a[] = {1,5,3,2,11,4,5,2,4,8,9,1};
        multiplier(a);
        for(int i=0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void multiplier(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] < 6) a[i]*= 2;
        }
    }
}
