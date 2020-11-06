package sample;


public class Main{
    public static void main(String[] args) {
        double[] array = new double[100];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double med = 0;
        for (double v : array) {
            if (max < v) {
                max = v;
            }
            if (min > v) {
                min = v;
            }
            med = v / array.length;
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + med);
        System.out.println("Минимальное значение: " + min);
    }
}
