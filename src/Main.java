import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double u,Alan;

        Scanner veri = new Scanner(System.in);
        System.out.print("1. Kenari giriniz: ");
        a = veri.nextInt();
        System.out.print("2. Kenari giriniz: ");
        b = veri.nextInt();
        System.out.print("3. Kenari giriniz: ");
        c = veri.nextInt();

        //Kenarların üçgen oluşturup oluşturmadığını test etme ve Alan hesabı
        u = (a+b+c)/2;
        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        boolean karar = Alan>0;
        String str = karar? "Alan: "+Alan:"Girilen degerlerle ucgen olusturulamadi,tekrar giriniz... ";

        System.out.println(str);

    }

}
