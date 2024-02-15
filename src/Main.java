
import java.util.Scanner;


public class Main {
    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Cikarma : " + result);
        return result;
    }
    
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }
    
    static int divided(int a, int b){
        if(b == 0){
            System.out.println("Ikinci sayi sifirdan farkli olmali");
            return 0;
        }
        int result = a / b;
        System.out.println("Bolum : " + result);
        return result;
    }
    
    static int power(int a, int b){
        int result = 0;
        for(int i = 0; i <= b; i++){
            result *= a;
        }
        return result;
    }
    
    static int mod(int a, int b){
        return a % b;
    }
    
    static void calc(int a, int b){
        System.out.println("Cevresi : " + (2 * (a + b)));
        System.out.println("Alani : " + (a * b));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1- Toplama islemi\n"
                + "2- cikarma islemi\n"
                + "3- carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve cevre Hesabi\n"
                + "0- cikis Yap";
        
        while(true){
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select = scanner.nextInt();
            if(select == 0){
                break;
            }
            System.out.print("Ilk sayiyi giriniz : ");
            int a = scanner.nextInt();
            System.out.print("Ikinci sayiyi giriniz : ");
            int b = scanner.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Us hesabi : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod islemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz!");
            }
        }
        System.out.println("Gule Gule!");
    }
}
