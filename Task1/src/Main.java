import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array1 = new int [8];

        //Input Alinmasi
        for (int i=0;i<array1.length;i++){
            array1[i] = input.nextInt();
        }

        //Array Elementlerinin Secilmesi
        for (int j=0;j<array1.length;j++){
            if (array1[j]%2==0){
                System.out.println(array1[j] + " Cut Reqemdir");
            }
            else{
                System.out.println(array1[j] + " Tek Reqemdir");
            }
        }
    }
}