package com.company;

public  class Spectator implements Obsever {

    private String teamPrefer;

    public Spectator(String teamPrefer) {
        this.teamPrefer = teamPrefer;
    }

    public void reactGame(String team) {

       if(team.equals(teamPrefer)){
           System.out.println("YaYYYYYYYYYYY");
       }else{
           System.out.println("Boooooooooooooo");       }

    }


}
