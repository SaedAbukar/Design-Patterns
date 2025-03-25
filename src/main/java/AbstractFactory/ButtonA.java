package AbstractFactory;

public class ButtonA extends Button {
    public ButtonA(String text) { super(text); }

    @Override
    public void display() {
        System.out.printf("[Button-%s] ", text);
    }
}
