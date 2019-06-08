package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Game g =new Game();

        g.addReporter(new Reporter());
        g.addSpactator(new Spectator("A"));
        g.addSpactator(new Spectator("A"));
        g.addSpactator(new Spectator("B"));

        g.goal("B");
    }
}
