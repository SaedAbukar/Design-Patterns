package Builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OfficeComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector();
        computerDirector.buildGamingComputer(gamingComputerBuilder);
        computerDirector.buildOfficeComputer(officeComputerBuilder);
        Computer officeComputer = officeComputerBuilder.build();
        Computer gamingComputer = gamingComputerBuilder.build();
        boolean userWantsCustom = true;
        Scanner scanner = new Scanner(System.in);

        while (userWantsCustom) {
            System.out.println(
                    "Select your option:\n\n" +
                    "1. PreBuilt OfficeComputer: " + officeComputer.toString() + "\n\n" +
                    "2. PreBuilt GamingComputer: " + gamingComputer.toString() + "\n\n" +
                    "3. Custom Computer");

            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        userWantsCustom = false;
                        System.out.println("Here's your office computer.");
                        System.out.println(officeComputer);
                        break;
                    case 2:
                        userWantsCustom = false;
                        System.out.println("Here's your gaming computer.");
                        System.out.println(gamingComputer);
                        break;
                    case 3:
                        userWantsCustom = false;
                        GamingComputerBuilder customComputerBuilder = new GamingComputerBuilder();
                        System.out.println("Select the specs of your computer.");
                        System.out.println("Select the processor");
                        String processor = scanner.next();
                        System.out.println("Select the RAM (Integers only)");
                        int ram = scanner.nextInt();
                        System.out.println("Select the disk (Integers only)");
                        int disk = scanner.nextInt();
                        System.out.println("Select the GPU");
                        String gpu = scanner.next();
                        System.out.println("Select the OS");
                        String os = scanner.next();
                        computerDirector.buildCustomComputer(customComputerBuilder, processor, ram, disk, gpu, os);
                        Computer computer = customComputerBuilder.build();
                        System.out.println("Here's your custom computer.");
                        System.out.println(computer);
                        break;
                        default:
                            System.out.println("Invalid option. Please choose a valid option.");
                }
            } catch (Exception e) {
                System.out.println("You entered invalid values. Please try again.");
                scanner.nextLine();
            }
            scanner.close();
        }
    }
}
