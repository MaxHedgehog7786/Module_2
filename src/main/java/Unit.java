public class Unit {
    protected String name;

    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }



    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;

    public int getHealth(){ //getter
        return health;
    }

    public void setHealth(int health){ //setter
        this.health = health;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }
    public void attack(Unit unit){
        unit.getDamage(power);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    public void getDamage(int damage){
        this.health -= damage;
    }
}
