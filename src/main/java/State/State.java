package State;

public abstract class State {
    protected Player player;
    protected String name;
    public State(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void train();

    public abstract void meditate();

    public abstract void fight();
}
