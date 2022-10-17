package Task7;

public class Main {
    public static void main(String[] args){
        int a[] = {0,5,3,2,11,4,5,2,4,8,9,1}, n = 2;
        offset(a, n);
        for(int i=0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void offset(int[] a, int n){
        if(n > 0){
            for(int i = 0; i < n; i++){
               int tmp = a[a.length-1], back;
                for(int j = a.length-1; j > 0; j--){
                    a[j] = a[j-1];
                }
                a[0] = tmp;
            }
        } else{
            for(int i = 0; i > n; i--){
                int tmp = a[0];
                for(int j = 0; j < a.length-1 ; j++){
                    a[j] = a[j+1];
                }
                a[a.length-1] = tmp;
            }
        }
    }
}
