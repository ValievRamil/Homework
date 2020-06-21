package ru.valiev.lesson08.task3;

public class toConvert {

    public static Act  convert (Contract contract) {
        return new Act (contract.getNumber(),contract.getDate(),contract.getProducts());

         }
}
