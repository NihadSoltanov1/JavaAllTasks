import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array1 = new int[4];

        //Input Alinmasi
        for (int i = 0; i<array1.length;i++){
            array1[i]=input.nextInt();
        }

        //Ilk ve son Elementin yerini Deyismek
        int a = array1[0];
        array1[0] = array1[array1.length-1];
        array1[array1.length-1] = a;

        //Netice
        for (int j=0;j<array1.length;j++){
            System.out.println(array1[j]);
        }

    }
}