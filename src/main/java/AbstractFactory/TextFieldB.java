package AbstractFactory;

public class TextFieldB extends TextField {
    public TextFieldB(String text) { super(text); }

    @Override
    public void display() {
        System.out.printf("(Textfield-%s) ", text);
    }
}
