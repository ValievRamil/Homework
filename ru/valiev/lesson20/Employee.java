package ru.valiev.lesson20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Employee {
    private int id;

    @JsonProperty("employee_name")
    private String name;

    @JsonProperty("employee_age")
    private int age;

        public Employee() {
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
