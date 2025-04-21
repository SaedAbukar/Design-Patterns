package Builder;

public class ComputerDirector {
    public ComputerBuilder buildGamingComputer(ComputerBuilder computerBuilder) {
        return computerBuilder
                .setBuildProcessor("Intel Core i9-13900K")
                .setBuildRam(32)
                .setBuildDisk(2000)
                .setBuildGpu("NVIDIA GeForce RTX 4090")
                .setBuildOs("Windows 11 Pro");
    }
    public ComputerBuilder buildOfficeComputer(ComputerBuilder computerBuilder) {
        return computerBuilder
                .setBuildProcessor("Intel Core i5-13400")
                .setBuildRam(16)
                .setBuildDisk(512)
                .setBuildGpu("Integrated Intel UHD Graphics 730")
                .setBuildOs("Windows 11 Home");
    }

    public void buildCustomComputer(GamingComputerBuilder computerBuilder, String processor, int ram, int disk, String gpu, String os) {
        computerBuilder
                .setBuildProcessor(processor)
                .setBuildRam(ram)
                .setBuildDisk(disk)
                .setBuildGpu(gpu)
                .setBuildOs(os);
    }
}


