import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int [] array1 = {10,20,54,2,500,0,9};
       int a;

       //Array'i Kicikden Boyuye Siralamaq
       for (int i = 0;i<array1.length;i++){
           for (int j=i+1;j<array1.length;j++){
               if (array1[j]<array1[i]){
                   a=array1[i];
                   array1[i]=array1[j];
                   array1[j]=a;
               }
           }
       }

       //Array'in Ikinci En Boyuk Elementinin Tapilmasi
       System.out.println("Array'in Ikinci En Boyuk Elementi: "+array1[array1.length-2]);

    }
}