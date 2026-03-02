package assignments.assignment7.state;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameCharacter {
    private static Scanner scanner = new Scanner(System.in);
    private State state;

    private String name;
    private String level;
    private int experiencePoints;
    private int healthPoints;
    private boolean running = true;

    public GameCharacter(String name) {
        state = new NoviceState(this);
        this.name = name;
        this.level = "novice";
        this.experiencePoints = 0;
        this.healthPoints = 100;
    }

    public void startGame() {
        while (running) {
            if (state == null) {
                System.out.println("Game out of order");
            }
            state.action();
        }
    }

    public void train() {
        experiencePoints += 25;
        checkExperience();
        System.out.println("Current experience points: " + experiencePoints);
    }

    public void meditate() {
        if (healthPoints == 100) {
            System.out.println("Health points already at maximun.");
        } else if (healthPoints >= 75) {
            healthPoints = 100;
            System.out.println("Current health points: " + healthPoints);
        } else if (healthPoints < 75) {
            healthPoints += 25;
            System.out.println("Current health points: " + healthPoints);
        }
    }

    public void fight() {
        if (healthPoints < 30) {
            System.out.println("Not enough health points to fight.");
            return;
        }
        experiencePoints += 30;
        healthPoints -= 30;
        System.out.println("Current experience points: " + experiencePoints + ". Current health points: " + healthPoints);
        checkExperience();
    }

    public void checkExperience() {
        if (experiencePoints >= 100) {
            levelUp();
        }
    }

    public void levelUp() {
        switch (level) {
            case "novice":
                System.out.println("Leveled up to intermediate!");
                level = "intermediate";
                experiencePoints -= 100;
                setState(new IntermediateState(this));
                break;
            case "intermediate":
                System.out.println("Leveled up to expert!");
                level = "expert";
                experiencePoints -= 100;
                setState(new ExpertState(this));
                break;
            case "expert":
                System.out.println("Leveled up to master");
                level = "master";
                experiencePoints -= 100;
                setState(new MasterState(this));
                break;
        }
    }

    public int readUserInput(String[] options) {
        status();
        try {
            System.out.println("\nChoose an action: ");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            return readUserInput(options);
        }
    }

    public void status() {
        System.out.println("status:\n" +
                "Name: " + name + "\n" +
                "Level: " + level + "\n" +
                "Experience points: " + experiencePoints + "\n" +
                "Health points: " + healthPoints);
    }

    public void endGame() {
        status();
        System.out.println("Game over. Thanks for playing!");
        running = false;
        scanner.close();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
