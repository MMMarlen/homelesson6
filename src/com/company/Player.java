package com.company;

public class Player {
//    сделать поле
   private int health;
   private int damage;

   //создать конструктор
    public Player(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
// создать геттер сеттер
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
