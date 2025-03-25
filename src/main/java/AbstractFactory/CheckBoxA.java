package AbstractFactory;

public class CheckBoxA extends Checkbox{
    public CheckBoxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.printf("[Checkbox-%s]", text);
    }
}
