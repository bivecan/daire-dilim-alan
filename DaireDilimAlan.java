import java.util.Scanner;

public class DaireDilimAlan {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner girdi = new Scanner(System.in);

        System.out.println("yarıcapı giriniz: ");
        double r = girdi.nextDouble();

        System.out.println("merkez acı olcusunu giriniz: ");
        double aci = girdi.nextDouble();

        double dilimAlan = (pi*r*r*aci)/360.0;

        System.out.println("Daire dilim alanı: " + dilimAlan);
    }
}
