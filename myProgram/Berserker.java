package myProgram;

public class Berserker extends Player {
    private String skill;
    private int rage;
    
    public Berserker(String name, int level, int atk, int hp, String skill, int rage) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.rage = rage;
    }
    
    // overloading
    public Berserker(String name, int level, String skill, int rage) {
        super(name, level);
        this.skill = skill;
        this.rage = rage;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("<Class Berserker>");
        System.out.println("Skill: " + skill + ", Rage: " + rage);
    }
}
