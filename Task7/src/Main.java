public class Main {
    public static void main(String[] args) {
        int [][] array2 = {{10,20,30},{40,50,60}};
        int a=0,b=0;

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                if (i==0){
                    a += array2[i][j];
                }
                else {
                    b += array2[i][j];
                }
            }
        }

        System.out.print(a + " " + b);
    }
}