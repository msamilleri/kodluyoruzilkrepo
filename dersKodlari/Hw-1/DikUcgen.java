import java.util.Scanner;

public class DikUcgen {

    public  static void main(String[]Strings) {
        Scanner input=new Scanner(System.in);
        double c;int a,b;


        System.out.print("1 kenarı giriniz:");
        a=input.nextInt();

        System.out.print("2 kenarı giriniz:");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
       double u=(a+b+c)/2;

       double cevre=2*u;
       double alan=u*(u-a)*(u-b)*(u-c);

        System.out.println("Hipotenüs  :"+c);

        System.out.println("cevre:"+cevre);

        System.out.println("Alan  :"+alan);

        

        
    
    }
    
}
