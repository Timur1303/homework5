public class Boss {
    private int health;
    private int damage;
    private String defence;


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if ( damage < 0) {
            System.out.println("Wrong value is set");
        }else {
            this.damage = damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if ( health < 0) {
            System.out.println("Wrong value is set");
        }else {
            this.health = health;
        }
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
}
