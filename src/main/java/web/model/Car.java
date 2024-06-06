package web.model;

public class Car {
    private int num;
    private String model;
    private String color;

    public Car(int num, String model, String color) {
        this.num = num;
        this.model = model;
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
                "num=" + num +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
