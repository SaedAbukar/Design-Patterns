package State;

public class Master extends State {
    public Master(Player player) {
        super(player, "Master");
    }

    @Override
    public void train() {
        System.out.println("Master lvl!");
    }

    @Override
    public void meditate() {
        System.out.println("Master lvl!");
    }

    @Override
    public void fight() {
        System.out.println("Master lvl!");
    }
}
