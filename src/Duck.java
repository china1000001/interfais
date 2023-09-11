public class Duck implements Swimable{
    private String name;
    private String color;
    private String maxSpeed;

    public Duck(String name, String color, String maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return
                "name=" + name + "\n" +
                "color=" + color + "\n" +
                "maxSpeed=" + maxSpeed + "\n";
    }

    @Override
    public void Swimable() {

    }
}
