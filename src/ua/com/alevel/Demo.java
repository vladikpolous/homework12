package ua.com.alevel;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;
public class Demo {
    public static String read(String path) throws IOException {
//открываем файл по пути
        //3. Отрефакторить код с использование try-with-recourses.
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader( new FileReader(path));){

        String currentString;
        //построчно считываем файл
        while ((currentString = reader.readLine()) != null ){
            stringBuilder.append(currentString);
            stringBuilder.append( " \n " );
        }
        } catch (IIOException e){
            System.out.println(e.getMessage());
        }
        //возвращаем вычитанный текст в строке
        return stringBuilder.toString();

        /*Удалить throws IOException и заменить его на try/catch/finally.

        BufferedReader reader = new BufferedReader( new FileReader(path));
        StringBuilder stringBuilder = new StringBuilder();
        try {

            String currentString;
            //построчно считываем файл
            while ((currentString = reader.readLine()) != null ){
                stringBuilder.append(currentString);
                stringBuilder.append( " \n " );
            }
        } catch (IIOException e){
            System.out.println(e.getMessage());
        }
//закрываем файл
        reader.close();
//возвращаем вычитанный текст в строке
        return stringBuilder.toString();*/
    }
    public static void main(String[] args) throws IOException {
        System. out .println( read ( "C:\\test.txt" ));

        System.out.println(read ("C:\\ test.txt")); //1. Спровоцировать возникновение FileNotFoundEcxeption(присутсвует пробел)
    }
}
