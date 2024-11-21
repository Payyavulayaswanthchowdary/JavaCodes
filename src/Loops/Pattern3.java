package Loops;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 6;
        int k =1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k/=10;
            }
            System.out.println("");
        }
    }
}
