import java.util.Scanner;

public class VucutKitle {
    public  static void main(String[]Strings) {
        Scanner input=new Scanner(System.in);
        double boy,kilo;

        System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz :");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=input.nextDouble();

       double index=kilo/(boy*boy);
       


        System.out.println("Vücüt Kitle İndeksiniz :"+index);

        

        

        
    
    }
    
}
