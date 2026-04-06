package assignments.assignment14.builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        this.computer.setProcessor("Intel Core i9-9900K");
    }

    @Override
    public void buildRAM() {
        this.computer.setRAM("Corsair Vengeance LPX 16GB");
    }

    @Override
    public void buildHardDrive() {
        this.computer.setHardDrive("Samsung 970 EVO Plus 1TB");
    }

    @Override
    public void buildGraphicsCard() {
        this.computer.setGraphicsCard("Nvidia GeForce RTX 2080 Ti");
    }

    @Override
    public void buildOperatingSystem() {
        this.computer.setOperatingSystem("Windows 10 Pro");
    }

    public Computer getComputer() {
        return computer;
    }
}
