import java.util.Scanner;

public class DaireHesap {
    public  static void main(String[]Strings) {
        Scanner input=new Scanner(System.in);
        double pi=3.14;
        double alfa;
        int r;


        System.out.print("Dairenin yarı capı giriniz:");

        r=input.nextInt();
        System.out.print("Dairenin merkez açısının olcusu:");
        alfa=input.nextDouble();

       double cevre=pi*r*r;
       double alan=2*pi*r;
       double daireDilim=(pi*(r*r)*alfa)/360;


        System.out.println("cevre:"+cevre);

        System.out.println("Alan  :"+alan);

        
        System.out.println("Daire dilimi  :"+daireDilim);

        

        
    
    }
}
