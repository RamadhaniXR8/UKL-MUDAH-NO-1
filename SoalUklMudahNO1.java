public class SoalUklMudahNO1 {
    public static void main(String[] args)  {
        int jarak,biaya,volume,panjang,lebar,tinggi,total;
        Double BiayaOverload=50000.0;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Masukkan panjang (cm) : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar (cm) : ");
        lebar = input.nextInt();
        System.out.print("Masukkan tinggi (cm) : ");
        tinggi = input.nextInt();
        volume=panjang*lebar*tinggi;
        System.out.println("Volume paket : "+volume+" cm3");
        if (volume>100){
            System.out.println("Biaya overload : Rp. "+BiayaOverload);
        }
        System.out.print("Masukkan jarak (km) : ");
        jarak = input.nextInt();
        if (jarak<=10){
        biaya=volume*4250;
        System.out.println("Biaya pengiriman : Rp. "+biaya);}
        else if (jarak>10){
        biaya=volume*6000;

        if (volume>100){
            total=(int) (BiayaOverload+biaya);
            System.out.println("Total Biaya : Rp. ");
        }
        else if (volume<=100){
            System.out.println("Total Biaya : Rp. "+biaya);
        }
}
    }}