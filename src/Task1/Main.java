package Task1;

public class Main {
    public static void main(String[] args){
        int[] a = {0,1,0,1,0};
        reverse(a);
        for(int i=0; i< a.length; i++){
            System.out.print(a[i]);
        }

    }

    public static void reverse(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i]==0){
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
    }
}
