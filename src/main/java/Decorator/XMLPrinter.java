package Decorator;

public class XMLPrinter extends PrinterDecorator {

    private Printer printer;
    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(String.format("<message>%s</message>", message));
    }
}
