package Task4;

public class Main {
    public static void main(String[] args){
        int[][] a;
        a = new int[8][8];
        placer(a);
        for(int i=0; i< a.length; i++){
            for (int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void placer(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i == j) a[i][j] = 1;
            }
        }
    }
}