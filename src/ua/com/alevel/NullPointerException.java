package ua.com.alevel;

public class NullPointerException  {
    public static void main(String[] args) {
        String myString = null;
        if (myString.equals("Hello!")) {
            System.out.println("Hello!");
        }
    }
}
