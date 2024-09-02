import java.util.ArrayList;

public class Race {
    public ArrayList<Cars> rivals;
    public Cars leader;

    public Race() {
        rivals = new ArrayList<>();
    }
    public void addCar(Cars car) {
        rivals.add(car);
        if (leader == null) {
            leader = car;
        } else {
            for (Cars actualCar : rivals) {
                if (actualCar.getCalculateDistance() > leader.getCalculateDistance()) {
                    leader = actualCar;
                }
            }
        }
    }
    public Cars getLeader() {
        return leader;
    }
}
