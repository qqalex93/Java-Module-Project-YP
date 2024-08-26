public class Cars {
    public String name;
    public int speed;

    public Cars(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCalculateDistance() {
        return speed * 24;
    }
}
