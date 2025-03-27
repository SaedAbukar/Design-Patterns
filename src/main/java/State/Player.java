package State;

public class Player {
    private String name;
    private int lvl;
    private int exp;
    private int hp;
    private State state;
    public Player(String name, int lvl, int exp, int hp) {
        this.name = name;
        this.lvl = lvl;
        this.exp = exp;
        this.hp = hp;
        this.state = new Novice(this);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLvl() {
        return lvl;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public int getExp() {
        return exp;
    }
    public void upExp(int exp) {
        this.exp += exp;
    }
    public int getHp() {
        return hp;
    }
    public void upHp(int hp) {
        this.hp += hp;
    }

    public void downHp(int hp) {
        this.hp -= hp;
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void train(){
        state.train();
    }

    public void meditate(){
        state.meditate();
    }

    public void fight(){
        state.fight();
    }

}
