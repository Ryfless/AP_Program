package myProgram;

public class Saber extends Player{
    private String skill;
    private int energy;
    
    public Saber(String name, int level, int atk, int hp, String skill, int energy) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.energy = energy;
    }
    
    // overloading
    public Saber(String name, int level, String skill, int energy) {
        super(name, level);
        this.skill = skill;
        this.energy = energy;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("<Class Saber>");
        System.out.println("Skill: " + skill + ", Energy: " + energy);
    }
}
