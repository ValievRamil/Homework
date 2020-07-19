package ru.valiev.lesson20;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;

public class Program {
    public static void main(String[] args) throws Exception {

        URL jsonUrl = new URL("http://dummy.restapiexample.com/api/v1/employees");
        ObjectMapper mapper = new ObjectMapper();
        Response response = mapper.readValue(jsonUrl, Response.class);
        System.out.printf("Total %d employees %n" , response.getData().length);
        for (Employee employee : response.getData()) {
            System.out.printf("№ %d %s %d  years old. %n " , employee.getId(), employee.getName(), employee.getAge());
        }
    }
}
