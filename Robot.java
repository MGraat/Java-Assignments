package Opdracht8_robot;

import java.util.*;

public class Robot {

    int xPosition;
    int yPosition;
    String facing;
    int speed = 1;
    ArrayList<String> robotCommands = new ArrayList<>();

    Robot () {
        xPosition = 0;
        yPosition = 0;
        facing = "North";
    }
    Robot(int x, int y, String direction) {
        xPosition = x;
        yPosition = y;
        facing = direction;
    }

    Robot(int x, int y, String direction, int s) {
        xPosition = x;
        yPosition = y;
        facing = direction;
        speed = s;
    }

    public static void main(String[] args) {
        Robot my_first_Robot = new Robot(0, 1, "East", 2);
        my_first_Robot.goLeft();
        my_first_Robot.goForwards();
        my_first_Robot.goBackwards();
        my_first_Robot.goLeft();
        my_first_Robot.execute();
        my_first_Robot.printState();
    }

    void turnLeft() {
        switch (facing) {
            case "East": facing = "North";
                break;
            case "North": facing = "West";
                break;
            case "West": facing = "South";
                break;
            case "South": facing = "East";
                break;
                    }
        System.out.println("The robot is turning to the left!");
    }

    void turnRight() {
        switch (facing) {
            case "West": facing = "North";
                break;
            case "North": facing = "East";
                break;
            case "East": facing = "South";
                break;
            case "South": facing = "West";
                break;
                    }
        System.out.println("The robot is turning to the right!");
       }

    void forwards() {
        if (speed == 1) {
            switch (facing) {
                case "North": yPosition = yPosition + 1;
                    break;
                case "South": yPosition = yPosition - 1;
                    break;
                case "East": yPosition = yPosition + 1;
                    break;
                case "West": yPosition = yPosition - 1;
                    break;
                            }
            System.out.println("The robot is moving forward with 1 square at a time!");
        }
        if (speed == 2) {
            switch (facing) {
                case "North": yPosition = yPosition + 2;
                    break;
                case "South": yPosition = yPosition - 2;
                    break;
                case "East": yPosition = yPosition + 2;
                    break;
                case "West": yPosition = yPosition - 2;
                    break;
                            }
            System.out.println("The robot is moving forward 2 squares at a time!");
        }
        if (speed == 3) {
            switch (facing) {
                case "North": yPosition = yPosition + 3;
                    break;
                case "South": yPosition = yPosition - 3;
                    break;
                case "East": yPosition = yPosition + 3;
                    break;
                case "West": yPosition = yPosition - 3;
                    break;
                            }
            System.out.println("The robot is moving forward three squares at a time!");
        }
    }

    void backwards() {
        switch (facing) {
            case "North": yPosition = yPosition - 1;
                break;
            case "South": yPosition = yPosition + 1;
                break;
            case "East": yPosition = yPosition - 1;
                break;
            case "West": yPosition = yPosition + 1;
                break;
                    }
        System.out.println("The robot is moving backward!");
    }

    void goLeft() {
        robotCommands.add("turnLeft();");
    }

    void goRight() {
        robotCommands.add("turnRight();");
    }

    void goBackwards() {
        robotCommands.add("backwards();");
    }

    void goForwards() {
        robotCommands.add("forwards();");
    }

    void execute() {
        System.out.println("The starting position of your robot is: " + "x = " + xPosition + ", y = " + yPosition + ", and it is facing towards the " + facing + ".");
        System.out.println("Execute commands. Go robot Go!!");
        int commandItems;
        for (commandItems = 0; commandItems < robotCommands.size(); commandItems++) {
                switch (robotCommands.get(commandItems)) {
                    case "turnLeft();": turnLeft();
                        break;
                    case "turnRight();": turnRight();
                        break;
                    case "forwards();": forwards();
                        break;
                    case "backwards();": backwards();
                        break;
                }

            }
        }

    void printState() {
        System.out.println("The end position of your robot is: " + "x = " + xPosition + ", y = " + yPosition + ", and it is facing towards the " + facing + ".");
    }
}









