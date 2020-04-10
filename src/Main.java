public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(70);
        boss.setDefence("Armor");

        System.out.println("Boss characteristics are " + boss.getHealth() + " heath " + boss.getDamage() + " damage " + boss.getDefence()+ " defence");

        createHeroes();


    }

    public static void createHeroes(){
        Hero ironMan = new Hero(200, 80, "IronSuit");
        Hero spiderMan = new Hero(180, 70);
        Hero hulk = new Hero(250, 100, "Bigger");



    }
}
