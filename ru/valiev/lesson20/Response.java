package ru.valiev.lesson20;
public class Response {
    private String status;
    private Employee[] data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee[] getData() {
        return data;
    }
}
