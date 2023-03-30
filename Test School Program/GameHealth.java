public class GameHealth {
    private int health = 100;
    private int healthBarColor = 0;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0) {
        this.health = health;
        }

        else {
            System.out.println("Invalid number");
        }
    }

    public void scaleHealthBar(int scaler) {
        setHealth(scaler * this.health);
    }

    public int getHealthBarColor() {
        return healthBarColor;
    }

    public void setHealthBarColor(int healthBarColor) {
        this.healthBarColor = healthBarColor;
    }
}
