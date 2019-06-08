package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Game g =new Game();

        g.addSObsever(new Reporter());
        g.addSObsever(new Spectator("A"));
        g.addSObsever(new Spectator("A"));
        g.addSObsever(new Spectator("B"));

        g.goal("B");
    }
}
