import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner sadf;
        System.out.println("Vilket nummer?");
        Scanner sc2 = new Scanner(System.in);
        int input = sc2.nextInt();
        while (i <= 10) {
            int svar = input * i;
            i++;
            System.out.println(svar);
        }
        i = 0;
        do {
            int svar = input * i;
            i++;
            System.out.println(svar);
        } while (i <= 10);
        for (i = 0; i<=10; i++){
            int svar = input * i;
            System.out.println(svar);
        }
    }
}