package com.company;

import java.util.ArrayList;

public class Game {

    private ArrayList<Spectator> spectators=new ArrayList<>();

    private ArrayList<Reporter> reporters=new ArrayList<>();


    public void goal(String teamGoal){
        System.out.println("reporter say :");

        for (int i=0;i<reporters.size();i++){

            reporters.get(i).reactGame(teamGoal);

        }

        System.out.println();


        System.out.println("spactator say :");

        for (int i=0;i<spectators.size();i++){

            spectators.get(i).reactGame(teamGoal);

        }

    }

    public void addSpactator(Spectator spectator){

        spectators.add(spectator);
    }

    public void addReporter(Reporter reporter){

        reporters.add(reporter);
    }






}
