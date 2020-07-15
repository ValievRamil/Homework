package ru.valiev.lesson18;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.*;

public class Converter {
    static String str;

    public static void main(String[] args) {

        try {
            File file1 = new File("test.txt");
            file1.createNewFile();
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("пвапвапвапждвапЖДЛОДЛаввд");
            fileWriter.flush();
            fileWriter.close();

            File file2 = new File("test2.txt");
            file2.createNewFile();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file1), "UTF8"));

            Writer out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file2), "Windows-1251"));

            while ((str = in.readLine()) != null) {
                out.write(str);
                out.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}










