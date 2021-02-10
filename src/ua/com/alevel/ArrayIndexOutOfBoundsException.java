package ua.com.alevel;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
            int example[]  = {1,2,3,4,5};
            for (int i = 0; i < example.length; i++) {
                System.out.println(example[i+1]);
            }
    }
}
