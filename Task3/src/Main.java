import javax.sound.sampled.Mixer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array1 = new int[5];

        //Input Alinmasi
        for (int i=0; i<array1.length;i++){
            array1[i]=input.nextInt();
        }

        //Array'in En Kicik Elementinin Tapilmasi
        int MinOfArray = array1[0];
        for (int j=1;j<array1.length;j++){
            if (MinOfArray>array1[j]){
                MinOfArray=array1[j];
            }
        }

        //Netice
        System.out.println("Array'in En Kicik Elementi: "+MinOfArray);

    }
}