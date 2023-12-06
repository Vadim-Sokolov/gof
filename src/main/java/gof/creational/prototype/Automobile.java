package gof.creational.prototype;

public class Automobile implements Cloneable {

    private final String type;
    private String color;
    private String plateNumber;

    public Automobile(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getType() {
        return type;
    }

    @Override
    public Automobile clone() {
        try {
            return (Automobile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
