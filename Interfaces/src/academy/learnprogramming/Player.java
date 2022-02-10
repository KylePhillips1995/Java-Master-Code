package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
      String newString = ("Name= " + this.name + " hitPoints= " + this.hitPoints + " Strength= " + this.strength + " Weapon= " + this.weapon);
      return newString;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> newList = new ArrayList<String>();
          newList.add(0, this.name);
          newList.add(1, "" + this.hitPoints);
          newList.add(2, "" + this.strength);
          newList.add(3, this.weapon);
//        Player newPlayer = new Player(this.name, this.hitPoints, this.strength);
//        newList.add(newPlayer.toString());
        return newList;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if(savedValues.size() > 0 && savedValues != null){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt((savedValues.get(1)));
            this.strength = Integer.parseInt((savedValues.get(2)));
            this.weapon = savedValues.get(3);
        }
    }
}
