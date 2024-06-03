package myProgram;

import java.util.*;

public class panggil {
    static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random(); // rng
        String name, skill;
        int option;

        // Random attribute
        int atk = random.nextInt(1000);
        int hp = random.nextInt(1000);
        int level = random.nextInt(100);
        int specialAttribute = random.nextInt(100);

        System.out.println("=========Selamat Datang========");
        System.out.print("Siapakah Nama anda?: ");
        name = capitalizeFirstLetter(ip.nextLine());
        System.out.println("===============================");
        System.out.println("1. Archer\n2. Assassin\n3. Berserker\n4. Lancer\n5. Mage\n6. Rider\n7. Saber");
        System.out.print("Pilih Class Servant anda: ");
        option = ip.nextInt();
        ip.nextLine();
        
        switch (option) {
            case 1 -> {
                System.out.println("<Anda memilih class archer>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Archer servant = new Archer(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } case 2 -> {
                System.out.println("<Anda memilih class assassin>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Assassin servant = new Assassin(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } case 3 -> {
                System.out.println("<Anda memilih class berserker>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Berserker servant = new Berserker(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } case 4 -> {
                System.out.println("<Anda memilih class lancer>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Lancer servant = new Lancer(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } case 5 -> {
                System.out.println("<Anda memilih class mage>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Mage servant = new Mage(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } case 6 -> {
                System.out.println("<Anda memilih class rider>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Rider servant = new Rider(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } case 7 -> {
                System.out.println("<Anda memilih class saber>");
                System.out.print("Skill pamungkas: ");
                skill = capitalizeFirstLetter(ip.nextLine());
                Saber servant = new Saber(name, level, atk, hp, skill, specialAttribute);
                System.out.println("<Player Status>");
                servant.display();
            } default -> System.out.println("Error");
        }
    }

    private static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}