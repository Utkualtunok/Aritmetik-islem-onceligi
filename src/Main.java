import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int a, b, c, sonuc ;

    //Kullanıcı girişleri
    Scanner inp = new Scanner(System.in);
    System.out.print("Birinci sayıyı giriniz : ");
    a = inp.nextInt();
    System.out.print("İkinci sayıyı giriniz : ");
    b = inp.nextInt();
    System.out.print("Üçüncü sayıyı giriniz : ");
    c = inp.nextInt();

    sonuc = a+b*c-b;
    System.out.print("Sonuç : " + sonuc);
    }
}