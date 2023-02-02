//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task0 {

    public static void main(String[] args) throws IOException{

        try (FileWriter writer = new FileWriter("result.txt", false)) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Write your's count : ");
            int count = iScanner.nextInt();
            writer.write(Integer.toBinaryString(count));
            writer.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            Logger logger = Logger.getLogger(Task0.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование 1");
            logger.info("Тестовое логирование 2");

        }
    }
}



