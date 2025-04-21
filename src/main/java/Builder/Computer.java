package Builder;

public class Computer {
    private String processor;
    private int ram;
    private int disk;
    private String gpu;
    private String os;

    public Computer(String processor, int ram, int disk, String gpu, String os) {
        this.processor = processor;
        this.ram = ram;
        this.disk = disk;
        this.gpu = gpu;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
                "Processor: " + processor + "\n" +
                "RAM: " + ram + " GB\n" +
                "Hard Drive: " + disk + " GB\n" +
                "Graphics Card: " + gpu + "\n" +
                "Operating System: " + os;
    }

}
