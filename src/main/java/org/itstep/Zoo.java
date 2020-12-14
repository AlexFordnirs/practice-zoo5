package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal;

    public List<Animal> getAnimalList() {
        return listAnimal;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.listAnimal = animalList;
    }

    public Zoo(List<Animal> animalList) {
        this.listAnimal = animalList;
    }

    public Zoo(){
        this.listAnimal = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        this.listAnimal.add(animal);
    }

    public void showAnimals(){
        for (Animal animal : this.listAnimal){
            System.out.println(animal.getClass().getSimpleName());
            System.out.println("Имя: " + animal.getName());
            System.out.println("Возраст: " + animal.getAge());
            System.out.println("Вес: " + animal.getWeight());
            System.out.println("Время прибывания в зоопарке: " + animal.getTimeSpentAtTheZoo());
            System.out.println("Номер вольера: " + animal.getAviaryNumber());
            System.out.println("Потребление пищи животными ежедневно: " + animal.getFoodConsumption());
            System.out.println();
        }
    }

    public void removeAnimal(String name){
        this.listAnimal.removeIf(animal -> animal.getName().equals(name));
    }

    public Integer foodCostsPerDay(){
        Integer costs = 0;
        for (Animal animal : this.listAnimal)
            costs+= animal.getFoodConsumption();
        return costs;
    }

    public Integer foodCostsAllTime(){
        Integer costs = 0;
        for (Animal animal : this.listAnimal)
            costs+= animal.getFoodConsumption() * animal.getTimeSpentAtTheZoo();
        return costs;
    }
}

