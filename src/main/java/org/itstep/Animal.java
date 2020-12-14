package org.itstep;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private int aviaryNumber;
    private int timeSpentAtTheZoo;
    private int foodConsumption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAviaryNumber() {
        return aviaryNumber;
    }

    public void setAviaryNumber(Integer aviaryNumber) {
        this.aviaryNumber = aviaryNumber;
    }

    public Integer getTimeSpentAtTheZoo() {
        return timeSpentAtTheZoo;
    }

    public void setTimeSpentAtTheZoo(Integer timeSpentattheZoo) {
        this.timeSpentAtTheZoo = timeSpentAtTheZoo;
    }

    public Integer getFoodConsumption() {
        return foodConsumption;
    }

    public void setFoodConsumption(Integer foodConsumption) {
        this.foodConsumption = foodConsumption;
    }

    public Animal(String name, int age, int weight, int aviaryNumber, int timeSpentAtTheZoo, int foodConsumption) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.aviaryNumber = aviaryNumber;
        this.timeSpentAtTheZoo = timeSpentAtTheZoo;
        this.foodConsumption = foodConsumption;
    }

    public Animal(){}
}
