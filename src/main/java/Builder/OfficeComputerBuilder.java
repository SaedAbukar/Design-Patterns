package Builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private String buildProcessor;
    private int buildRam;
    private int buildDisk;
    private String buildGpu;
    private String buildOs;

    public ComputerBuilder setBuildProcessor(String buildProcessor) {
        this.buildProcessor = buildProcessor;
        return this;
    }
    public ComputerBuilder setBuildRam(int buildRam) {
        this.buildRam = buildRam;
        return this;
    }

    public ComputerBuilder setBuildDisk(int buildDisk) {
        this.buildDisk = buildDisk;
        return this;
    }

    public ComputerBuilder setBuildGpu(String buildGpu) {
        this.buildGpu = buildGpu;
        return this;
    }

    public ComputerBuilder setBuildOs(String buildOs) {
        this.buildOs = buildOs;
        return this;
    }

    public Computer build() {
        return new Computer(buildProcessor, buildRam, buildDisk, buildGpu, buildOs);
    }
}

