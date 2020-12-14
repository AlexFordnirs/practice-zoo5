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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAviaryNumber() {
        return aviaryNumber;
    }

    public void setAviaryNumber(int aviaryNumber) {
        this.aviaryNumber = aviaryNumber;
    }

    public int getTimeSpentAtTheZoo() {
        return timeSpentAtTheZoo;
    }

    public void setTimeSpentAtTheZoo(int timeSpentattheZoo) {
        this.timeSpentAtTheZoo = timeSpentAtTheZoo;
    }

    public int getFoodConsumption() {
        return foodConsumption;
    }

    public void setFoodConsumption(int foodConsumption) {
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
