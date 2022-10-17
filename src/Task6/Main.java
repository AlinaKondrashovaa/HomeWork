package Task6;

public class Main {
    public static void main(String[] args){
        int a[] = {1,1,1,2,1};
        boolean b = false;
        b = checkBalance(a);
        System.out.println(b);
    }

    public static boolean checkBalance(int[] a){
        int suml = 0, sumr = 0;
        for(int i = 0 ; i < a.length; i++){
            suml+=a[i];
            for(int j = i+1; j < a.length; j++){
                sumr+=a[j];
            }
            if(suml == sumr) return true;
            sumr = 0;
        }
        return false;
    }
}
