package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i < 101; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {

            System.out.println();
        }
    }
    public Horse getWinner(){
        Horse result = horses.get(0);
        for (Horse horse : horses){
            if (horse.getDistance() > result.getDistance()){
                result = horse;
            }
        }
        return result;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Plotva", 3, 0));
        horses.add(new Horse("Sivka", 3, 0));
        horses.add(new Horse("Loshad", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}

