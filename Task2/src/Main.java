import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array1 = new int[7];

        //Inputun Alinmasi
        for (int i=0;i< array1.length;i++){
            array1[i] = input.nextInt();
        }

        //Array'in max elementinin tapilmasi
        int MaxOfArray = array1[0];
        for (int j =1 ;j<array1.length;j++){
            if (MaxOfArray<array1[j]){
                MaxOfArray=array1[j];
            }
        }

        //Netice
        System.out.println("Array'in En Boyuk Elementi: " + MaxOfArray);

    }
}