package State;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Saed", 0, 0, 0);
        while (true) {
            if (player.getState().getName().equals("Master")) {
                System.out.println("Player is a master! Game over!");
                break;
            }
            System.out.printf("Player Status: %s%n", player.getState().getName());
            System.out.printf("Player exp: %d%n", player.getExp());
            System.out.printf("Player lvl: %d%n", player.getLvl());
            System.out.printf("Player hp: %d%n", player.getHp());
            player.train();
            player.meditate();
            player.fight();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
