package assignments.assignment14.builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        this.computer.setProcessor("Intel Core i5-10400");
    }

    @Override
    public void buildRAM() {
        this.computer.setRAM("Kingston HyperX Fury 8GB");
    }

    @Override
    public void buildHardDrive() {
        this.computer.setHardDrive("Western Digital Blue 1TB");
    }

    @Override
    public void buildGraphicsCard() {
        this.computer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public void buildOperatingSystem() {
        this.computer.setOperatingSystem("Windows 10 Home");
    }

    public Computer getComputer() {
        return computer;
    }
}
