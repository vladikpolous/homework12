package ua.com.alevel;

public class ClassCastException {
    public static void main(String[] args) {


        Object i = Integer.valueOf(42);
        String s = (String) i;
    }
}
