package myProgram;

public class Rider extends Player{
    private String skill;
    private int agility;
    
    public Rider(String name, int level, int atk, int hp, String skill, int agility) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.agility = agility;
    }
    
    // overloading
    public Rider(String name, int level, String skill, int agility) {
        super(name, level);
        this.skill = skill;
        this.agility = agility;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("<Class Rider>");
        System.out.println("Skill: " + skill + ", Agility: " + agility);
    }
}
