package sample;

public class Main{

    public static void main(String[] args) {
        double[] array = new double[50];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random;
        }
        for(int i = 0; i < array.length; i++){
            for(int j = array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
