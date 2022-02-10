package com.example.game;

import java.util.ArrayList;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;

    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        String newString = ("Name= " + this.name + " hitPoints= " + this.hitPoints + " Strength= " + this.strength);
        return newString;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> newList = new ArrayList<String>();
        newList.add(0, this.name);
        newList.add(1, "" + this.hitPoints);
        newList.add(2, "" + this.strength);
        return newList;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if(savedValues.size() > 0 && savedValues != null){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt((savedValues.get(1)));
            this.strength = Integer.parseInt((savedValues.get(2)));
        }
    }
}
