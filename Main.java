import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int yil, kalan;
        String burc = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz :");
        yil = input.nextInt();

        kalan = yil % 12;

        /*if (kalan == 0) {
            burc = "Maymun";
        } else if (kalan == 1) {
            burc = "Horoz";
        } else if (kalan == 2) {
            burc = "Kopek";
        } else if (kalan == 3) {
            burc = "Domuz";
        } else if (kalan == 4) {
            burc = "Fare";
        } else if (kalan == 5) {
            burc = "Okuz";
        } else if (kalan == 6) {
            burc = "Kaplan";
        } else if (kalan == 7) {
            burc = "Tavsan";
        } else if (kalan == 8) {
            burc = "Ejderha";
        } else if (kalan == 9) {
            burc = "Yılan";
        } else if (kalan == 10) {
            burc = "At";
        } else {
            burc = "Koyun";
        }
        System.out.println("Cin Zodyagi Burcunuz :" + burc);*/
        switch (kalan) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Kopek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Okuz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavsan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            default:
                burc = "Koyun";
                break;
        }
        System.out.println("Cin Zodyagi Burcunuz :" + burc);
    }
}