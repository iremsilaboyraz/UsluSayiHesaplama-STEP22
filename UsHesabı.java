import java.util.Scanner;

public class UsHesabı {
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Üssü alınacak olan sayıyı giriniz:");
        a = input.nextInt();
        System.out.printf("Üs olacak sayıyı giriniz:");
        b = input.nextInt();

        int total = 1;

        for (int i = 1; i <= b; i++){
            total = total*a;


        }
        System.out.println(total);
    }
}
