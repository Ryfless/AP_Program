package myProgram;

public class Assassin extends Player {
    private String skill;
    private int stealth;
    
    public Assassin(String name, int level, int atk, int hp, String skill, int stealth) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.stealth = stealth;
    }
    
    // overloading
    public Assassin(String name, int level, String skill, int stealth) {
        super(name, level);
        this.skill = skill;
        this.stealth = stealth;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("<Class Assassin>");
        System.out.println("Skill: " + skill + ", Stealth " + stealth);
    }
}
