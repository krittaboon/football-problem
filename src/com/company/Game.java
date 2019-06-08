package com.company;

import java.util.ArrayList;

public class Game {

    private ArrayList<Obsever> obsevers=new ArrayList<>();




    public void goal(String teamGoal){
        System.out.println("" +
                "obsever say :");

        for (int i=0;i<obsevers.size();i++){

            obsevers.get(i).reactGame(teamGoal);

        }


    }

    public void addSObsever(Obsever obsever){

        obsevers.add(obsever);
    }







}
