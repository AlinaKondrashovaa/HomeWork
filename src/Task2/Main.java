package Task2;

public class Main {
    public static void main(String[] args){
        int[] a;
        a = new int[8];
        stack(a);
        for(int i=0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void stack(int[] a){
        int h = 0;
        for(int i = 0; i < a.length; i++){
           a[i] = h;
           h+=3;
        }
    }
}
