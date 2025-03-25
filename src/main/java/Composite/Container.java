package Composite;

public abstract class Container implements Component {
    public abstract void add(Component member);
    public abstract void remove(Component member);

}
