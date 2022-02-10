package academy.learnprogramming;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        if(health > 0 && health <= 100)
            this.hitPoints = health;

        this.name = name;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if(this.hitPoints <= 0){
            System.out.println("Player Died");
            //reduce number of lives remaining
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}

