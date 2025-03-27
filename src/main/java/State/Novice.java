package State;

public class Novice extends State {


    public Novice(Player player) {
        super(player, "Novice");
    }

    @Override
    public void train() {
        player.upExp(10);
        checkForLevelUp();
    }

    @Override
    public void meditate() {
        System.out.println("Player experience not high enough. Minimum exp: 30. Intermediate lvl" );
    }

    @Override
    public void fight() {
        System.out.println("Player experience not high enough. Minimum exp: 60. Expert lvl" );
    }

    private void checkForLevelUp() {
        if (player.getExp() >= 20) { // Threshold for transitioning to Expert
            System.out.println("Player is now an Intermediate!");
            player.changeState(new Intermediate(player)); // Change to Expert state
        }
    }
}
