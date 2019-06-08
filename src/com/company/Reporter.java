package com.company;

public  class Reporter implements Obsever {

    public void reactGame(String team) {
            System.out.println("team "+team+" is goal!!!!!");
    }
}
