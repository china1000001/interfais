public class Turtle implements Swimable{
    private String name;
    private int age;
    private String maxSpeed;

    public Turtle(String name, int age, String maxSpeed) {
        this.name = name;
        this.age = age;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                "name=" + name + "\n"+
                "age=" + age +"\n"+
                "maxSpeed=" + maxSpeed + "\n";
    }

    @Override
    public void Swimable() {

    }
}
