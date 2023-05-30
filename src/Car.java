public class Car {

    private String name;
    private String modelType;
    private String tankType;
    private int seatingCapacity;
    private String color;

    public Car(String name, String modelType, String tankType, int seatingCapacity, String color) {
        this.name = name;
        this.modelType = modelType;
        this.tankType = tankType;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", modelType='" + modelType + '\'' +
                ", tankType='" + tankType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public void makeNoise(String noise){
        System.out.println(getName() + " is making noise "+ noise);
    }

    public void repaint(String color){
        setColor(color);
    }
}
