package Composite;

import java.util.ArrayList;

public abstract class Container implements Component {
    protected String name;
    protected ArrayList<Component> members;

    public Container(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }
    public abstract void add(Component member);
    public abstract void remove(Component member);

}
