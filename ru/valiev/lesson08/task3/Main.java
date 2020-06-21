package ru.valiev.lesson08.task3;


import java.util.Arrays;

/* Конвертация Контракта в Акт*/
public class Main {
    public static void main(String[] args) {


    Contract contract = new Contract(12345,"12.12.19",new String[]{"Яблоки","Арбузы","Конфеты"});


        System.out.println("Создан новый договор. № " + contract.getNumber() + "от " + contract.getDate());

        System.out.println("Наименование продуктов: " + Arrays.toString(Contract.getProducts()));

        toConvert.convert(contract);
        System.out.println("Конвертация договора в Акт произведена!");
        System.out.println("Акт № " + Act.getNumber() + " от " + Act.getDate());
        System.out.println("Наименование продуктов: " + Arrays.toString(Act.getProducts()));







    }





}
