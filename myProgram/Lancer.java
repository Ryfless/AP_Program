package myProgram;

public class Lancer extends Player {
    private String skill;
    private int strength;
    
    public Lancer(String name, int level, int atk, int hp, String skill, int strength) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.strength = strength;
    }
    
    // overloading
    public Lancer(String name, int level, String skill, int strength) {
        super(name, level);
        this.skill = skill;
        this.strength = strength;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("<Class Lancer>");
        System.out.println("Skill: " + skill + ", Strenght: " + strength);
    }
}
