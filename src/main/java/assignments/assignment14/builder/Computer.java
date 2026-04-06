package assignments.assignment14.builder;

public class Computer {
    private String processor;
    private String ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public String getRAM() {
        return ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String toString() {
        return "Processor: " + processor +
                "\nRAM: " + ram +
                "\nHard Drive: " + hardDrive +
                "\nGraphics Card: " + graphicsCard +
                "\nOperating System: " + operatingSystem;
    }
}
