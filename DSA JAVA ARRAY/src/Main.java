public class Main {
    public static void main(String[] args) {
        int [] x={5,3,2,1,4};for (int i = 0; i < 5; i++){
            System.out.println(x[i]);
        }
        int temp;
        System.out.println("SORTED");
        for (int i = 0; i <5 ; i++){
            for (int j = 0; j < 5; j++) {
                if (x[i]<x[j]){
                 temp=x[j];
                 x[j]=x[i];
                 x[i]=temp;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.println(x[i]);
        }
    }
}
