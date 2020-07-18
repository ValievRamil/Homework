package ru.valiev.lesson19;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Processing {
    static List<Product> list = new ArrayList<>();

    static String checkDouble(Double value) {
        if (value % 1 == 0)
            return String.format("%.0f", value);
        else
            return String.format("%.3f", value);
    }

    static void readFile(Path path) {

        FileReader fr = null;
        try {
            fr = new FileReader(String.valueOf(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fr);
        Product product = new Product();
        int i = 1;
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            if (i == 4) i = 1;
            if (i == 1) {
                product.setName(line);
            }
            if (i ==2) {
                product.setWeight(Double.parseDouble(line));
            }
            if (i == 3) {
                product.setPrice(Double.parseDouble(line));
                list.add(product);
                product = new Product();
            }
            i++;
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        formatOutput();
    }

    static void formatOutput() {
        double sum = 0;
        System.out.printf("%-24s%-8s%-8s%12s%n", "Наименование", "Цена", "Кол-во", "Стоимость");
        System.out.println("====================================================");
        for (Product b : list) {
            sum += b.getCost();
            System.out.printf("%-22s%6.2f x %7s%4s%10.2f%n", b.getName(), b.getPrice(), checkDouble(b.getWeight()), "=", b.getCost());
        }
        System.out.println("====================================================");
        System.out.printf("%-45s%6.2f", "Итого:", sum);
    }


}