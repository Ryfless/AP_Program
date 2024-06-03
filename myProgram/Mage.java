package myProgram;

public class Mage extends Player {
    private String skill;
    private int mana;
    
    public Mage(String name, int level, int atk, int hp, String skill, int mana) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.mana = mana;
    }
    
    // overloading
    public Mage(String name, int level, String skill, int mana) {
        super(name, level);
        this.skill = skill;
        this.mana = mana;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("<Class Mager>");
        System.out.println("Skill: " + skill + ", Mana: " + mana);
    }
}
