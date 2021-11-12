import java.util.Scanner;

public class manav {

    public  static void main(String[]Strings) {
        Scanner input=new Scanner(System.in);
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;
        
        int armutKilo,elmaKilo,domaKilo,muzKilo,patKilo;

        System.out.print("Armut Kaç Kilo ? :");
        armutKilo=input.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo=input.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domaKilo=input.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muzKilo=input.nextInt();
        System.out.print("Patlican Kaç Kilo ? :");
        patKilo=input.nextInt();

       
        
       
        double Fiyat=(armutKilo*armut)+(elmaKilo*elma)+(domaKilo*domates)+(muzKilo*muz)+(patKilo*patlican);

        System.out.println("Toplam Tutariniz   :"+Fiyat);
      

        
    
    }
    
}
