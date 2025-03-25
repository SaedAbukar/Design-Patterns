package AbstractFactory;

public class CheckBoxB extends Checkbox{
    public CheckBoxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.printf("(Checkbox-%s)", text);
    }
}
