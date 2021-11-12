import java.util.Scanner;

public class KdvTutari {
    
    public  static void main(String[]Strings) {
        Scanner input=new Scanner(System.in);
        double kdvOrani,Tutar;

        System.out.print("Ücret tutarını giriniz :");
        Tutar=input.nextDouble();

        if(0<Tutar && Tutar<1000){
            kdvOrani=0.18;
        }else{
            kdvOrani=0.08;
        }
        
        double kdvTutari=Tutar*kdvOrani; 
        double kdvFiyat=Tutar+kdvTutari;

        System.out.println("KDV'siz Tutar  :"+Tutar);
        System.out.println("KDV' oranı:"+kdvOrani);
        System.out.println("KDV oranı  :"+kdvTutari);
        System.out.println("KDV'li tutar:"+kdvFiyat);

        
    
    }

}
