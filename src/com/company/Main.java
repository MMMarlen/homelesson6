package com.company;

public class Main {

    public static void main(String[] args) {
        
        Player player = new Player(100, 50);

        player.setHealth(200);
        System.out.println(player.getHealth());
    }
}
