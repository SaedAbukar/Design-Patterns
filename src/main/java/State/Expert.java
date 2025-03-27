package State;

public class Expert extends State {

    public Expert(Player player) {
        super(player, "Expert");
    }
    @Override
    public void train() {
        player.upExp(10);
        checkForLevelUp();
    }

    @Override
    public void meditate() {
        if (player.getExp() >= 60) {
            player.changeState(this);
        }
        player.upHp(10);
    }

    @Override
    public void fight() {
        if (player.getHp() <= 0) {
            System.out.printf("Player health too low: %d. Meditate to increase health.%n", player.getHp());
            return;
        }
        player.upExp(10);
        player.downHp(10);
        checkForLevelUp();
    }

    private void checkForLevelUp() {
        if (player.getExp() >= 60) { // Threshold for transitioning to Expert
            System.out.println("Player is now an Master!");
            player.changeState(new Master(player)); // Change to Expert state
        }
    }
}
