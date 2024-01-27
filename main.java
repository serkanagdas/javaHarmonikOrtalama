import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi eleman sayısını giriniz: ");
        int number = input.nextInt();

        // Diziyi tanımla
        double[] array = new double[number];


        for(int i=0; i<array.length; i++)
        {
            System.out.print("Dizinin "+(i+1)+ ". Elamanını giriniz: ");
            array[i]=input.nextDouble();
        }

        double harmonikOrtalama =  hesaplaHarmonikOrtalama(array);

        System.out.println("Dizinin harmonik hesaplaması: "+harmonikOrtalama);
    }

    public static double hesaplaHarmonikOrtalama(double[] array)
    {
        double toplam = 0;

        //harmonik seriyi hesaplama işlemi
        for(int i=0; i<array.length;i++)
        {
            toplam+=1.0/array[i];
        }

        return array.length/toplam;
    }

}