package State;

public class Intermediate extends State {

    public Intermediate(Player player) {
        super(player, "Intermediate");
    }

    @Override
    public void train() {
        player.upExp(10);
        checkForLevelUp();
    }

    @Override
    public void meditate() {
        if (player.getExp() >= 30) {
            player.changeState(this);
        }
        player.upHp(10);
    }

    @Override
    public void fight() {
        System.out.println("Player experience not high enough. Minimum exp: 60. Expert lvl" );
    }

    private void checkForLevelUp() {
        if (player.getExp() >= 40) { // Threshold for transitioning to Expert
            System.out.println("Player is now an Expert!");
            player.changeState(new Expert(player)); // Change to Expert state
        }
    }
}
