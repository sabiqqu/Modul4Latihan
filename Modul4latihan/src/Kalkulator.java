import java.util.Scanner;
import java.lang.Math;
public class Kalkulator{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("===Calculator===");
        System.out.println("1.Akar kuadrat");
        System.out.println("2.Pangkat");
        System.out.println("3.Logaritma");
        System.out.println("4.Faktorial");
        System.out.println("5.Keluar");
        System.out.println("pilih operasi 1/2/3/4/5:");
        int input =scanner.nextInt();
        System.out.println("masukkan angka");
        double number= scanner.nextDouble();
        switch (input){
            case 1:
                System.out.println("hasil akar dari "+number+"adalah"+Math.sqrt(number));
                break;
            case 2:
                System.out.println("masukkan pangkat");
                double pangkat= scanner.nextDouble();
                System.out.println("hasil"+number+"pangkat"+pangkat+"adalah="+Math.pow(number,pangkat));
                break;
            case 3:
                System.out.println("masukkab nilai logaritma natural");
                System.out.println("logaritma natural dari"+number+"adalah"+Math.log(number));
                break;
            case 4:
                double hasil=1;
                for (int i=1; i<=number; i++){
                    hasil*=i;
                }
                System.out.println("hasil faktorial dari"+number+"adalah"+hasil);
                break;
            case 5:
                System.out.println("terima kasih telah menggunakan kalkulator ini");
                System.exit(0);
            default:
                System.out.println("operasi tidak valid");
        }
    }

}