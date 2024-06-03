package myProgram;

// superclass
public class Player {
    private String name;
    private int level;
    private int atk;
    private int hp;

    // constanta
    private static final int baseAtk = 100;
    private static final int baseHp = 100;

    // constructor
    public Player(String name, int level, int atk, int hp) {
        this.name = name;
        this.level = level;
        this.atk = atk;
        this.hp = hp;
    }

    // overloading
    public Player(String name, int level) {
        this(name, level, baseAtk, baseHp);
    }

    // encapsulation
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getAtk() {
        return atk;
    }
    public int getHp() {
        return hp;
    }

    public void display(){
        System.out.println("Name: " + name + ", Level: " + level + ", Atk: " + atk + ", Hp: " + hp);
    }
}
