import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz :");
        a= input.nextInt();
        int nTemp =a;
        for(int i=nTemp;0<=i;i--){
            for (int k=(nTemp-i)-1; 0<=k;k--){
                System.out.print(" ");
            }
            for (int j=(2*i-2); 0<=j;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}