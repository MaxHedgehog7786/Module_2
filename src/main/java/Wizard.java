public class Wizard extends Unit {
    protected int mana = 100;
    public Wizard(String name) {
        super(name);
        power = 25;
        health = 80;
    }

    @Override
    public void attack(Unit unit) {
        if (mana>=10) {
            super.attack(unit);
            mana -= 10;
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str+" "+this);
    }
}
