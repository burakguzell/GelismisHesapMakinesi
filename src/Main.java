import java.util.Scanner;

public class Main {

    static int addition(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int extraction(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int devision(int a, int b) {
        if (b == 0) {
            System.out.println("Bölen 0 olamaz !");
            return 0;
        } else {
            int result = a / b;
            System.out.println("Bölüm : " + result);
            return result;
        }
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("power : " + result);
        return result;
    }

    static int factoriel(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + "! = " + result);
        return result;
    }

    static int mod(int a, int b) {

        return a % b;
    }

    static int rectangleArea(int a, int b) {
        int area;
        area = (a * b);
        return area;
    }

    static int rectanglePerimeter(int a, int b) {
        int perimeter;
        perimeter = 2 * (a + b);
        return perimeter;
    }

    public static void main(String[] args) {

        int a, b;
        int select;

        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n";

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            } else if (select != 6) {
                System.out.print("İlk Sayıyı Giriniz : ");
                a = input.nextInt();
                System.out.print("İkinci Sayıyı Giriniz : ");
                b = input.nextInt();

                switch (select) {
                    case 1:
                        addition(a, b);
                        break;
                    case 2:
                        extraction(a, b);
                        break;
                    case 3:
                        multiplication(a, b);
                        break;
                    case 4:
                        devision(a, b);
                        break;
                    case 5:
                        power(a, b);
                        break;
                    case 7:
                        System.out.println("Mod işlemi : " + mod(a, b));
                        break;
                    case 8:
                        System.out.println("Alanı : " + rectangleArea(a, b));
                        System.out.println("Çevresi : " + rectanglePerimeter(a, b));
                        break;
                }
            } else {
                System.out.print("Sayıyı giriniz : ");
                a = input.nextInt();
                factoriel(a);
            }
        }
        System.out.println("Programdan başarılı şekilde çıkış yaptınız.");
    }
}
