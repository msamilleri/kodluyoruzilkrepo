import java.util.Scanner;


public class NotOrtalama{
    public  static void main(String[]Strings) {

        //Dersler (Matematik,Fizik,Kimya,Turkce,Tarih,Muzik)

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat=input.nextInt();

        System.out.print("fizik Notunuz :");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya=input.nextInt();

        System.out.print("Turkce Notunuz :");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih=input.nextInt();

        System.out.print("Muzik Notunuz :");
        muzik=input.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;

        double ortalama=toplam/6;

        System.out.println("Ortalama :"+ortalama);

        String sonuc=(ortalama>60)?"Sınıfı Geçtiniz":"Sınıfta Kaldınız";

        System.out.println(sonuc);


        
    }
}