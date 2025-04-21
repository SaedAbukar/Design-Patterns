package Builder;

public interface ComputerBuilder {

     ComputerBuilder setBuildProcessor(String buildProcessor);
     ComputerBuilder setBuildRam(int buildRam);

     ComputerBuilder setBuildDisk(int buildDisk);

     ComputerBuilder setBuildGpu(String buildGpu);

     ComputerBuilder setBuildOs(String buildOs);
}
