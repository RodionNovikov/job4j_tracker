package ru.job4j.oop;

public class Cat {

        private String food;
        private String name;

        public void show() {
            System.out.println(this.name + "-" + this.food);
        }

        public void giveNick(String nick) {
            this.name = nick;
        }

        public void eat(String meat) {
            this.food = meat;
        }

        public static void main(String[] args) {
            System.out.println("There are gav's food.");
            ru.job4j.oop.Cat gav = new ru.job4j.oop.Cat();
            gav.giveNick("Gav");
            gav.eat("kotleta");
            gav.show();
            System.out.println("There are black's food.");
            ru.job4j.oop.Cat black = new ru.job4j.oop.Cat();
            black.giveNick("Black");
            black.eat("fish");
            black.show();
        }
    }

