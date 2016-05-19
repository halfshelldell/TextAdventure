package com.theironyard;

import java.util.ArrayList;

import static com.theironyard.Main.scanner;

/**
 * Created by illladell on 5/18/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    public void chooseName() {
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = scanner.nextLine();


        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("Sword is a fine choice");
        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice");
        } else {
            throw new Exception("Invalid weapon!");
        }
    }

        public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forrest/tunnel]");

        location = scanner.nextLine();

        if (location.equalsIgnoreCase("forrest")) {
            System.out.println("Entering forrest...");
        }
        else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else {
            throw new Exception("Invalid location!");
        }
    }

    public void findItem(String item) {
        System.out.println("You found " + item + "! Pick it up! [y/n]");
        String answer = Main.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add("armor");
            System.out.println("You have now " + items.size() + " items!");

        }
    }

}
