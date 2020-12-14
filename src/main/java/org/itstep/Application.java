package org.itstep;



import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Zoo app");
        Zoo zoo = new Zoo();
        int timeVork=0;
        Scanner scanner= new Scanner(System.in);
        while (timeVork==0) {
            System.out.println("1 Добавить животное \n 2 Удалить животное по имени \n 3 Отоброзить всех животных \n 4 Расход на питания всех животных в этот день \n 5 Расход на питания всех животных за все время");
            int s = scanner.nextInt();
            switch (s) {
                case 1: {
                    System.out.println("Name");
                    String name = scanner.next();
                    System.out.println("age");
                    int age = scanner.nextInt();
                    System.out.println("weight");
                    int weight = scanner.nextInt();
                    System.out.println("aviary Number");
                    int aviary = scanner.nextInt();
                    System.out.println("time Spent At The Zoo");
                    int time = scanner.nextInt();
                    System.out.println("food Consumption");
                    int food = scanner.nextInt();
                    Animal animal = new Animal(name, age, weight, aviary, time, food);
                    zoo.addAnimal(animal);
                    break;
                }
                case 2: {
                    System.out.println("Удаление жевотного по имени");
                    String name = scanner.next();
                    zoo.removeAnimal(name);
                    break;
                }
                case 3: {
                    zoo.showAnimals();
                    break;
                }
                case 4: {
                    System.out.println("Потребление пищи животными ежедневно: "+zoo.foodCostsPerDay());
                    break;
                }
                case 5: {
                    System.out.println("Потребление пищи животными ежедневно: "+ zoo.foodCostsAllTime());
                    break;
                }
            }
            System.out.println("Продолжить работу 1-No | 0-Yes?");
            timeVork=scanner.nextInt();
        }
    }
}
