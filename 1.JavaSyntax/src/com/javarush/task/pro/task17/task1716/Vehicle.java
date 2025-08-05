package com.javarush.task.pro.task17.task1716;

/* 
Дорожное движение
*/

public interface Vehicle {
    default void start() {
        System.out.println("Начинаю движение.");
    }

    void move();

    default void stop() {
        System.out.println("Останавливаюсь.");
    }
     class Car implements Vehicle {
        public void move(){
            System.out.println("Еду со средней скоростью 70 км/ч.");
        }
    }
    public static void main(String[] args){
        Car car = new Car();
        car.start();
        car.move();
        car.stop();
    }
}
