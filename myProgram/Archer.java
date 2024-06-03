package myProgram;

public class Archer extends Player {
    private String skill;
    private int ammo;
    
    public Archer(String name, int level, int atk, int hp, String skill, int ammo) {
        super(name, level, atk, hp);
        this.skill = skill;
        this.ammo = ammo;
    }

    // overloading
    public Archer(String name, int level, String skill, int ammo) {
        super(name, level);
        this.skill = skill;
        this.ammo = ammo;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("<Class Archer>");
        System.out.println("Skill: " + skill + ", Ammo: " + ammo);
    }
}
