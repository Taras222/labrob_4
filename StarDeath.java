public class StarDeath extends Star{
    double kf = 1.064;

    StarDeath(String name, int temperature, int weight) {
        super(name, temperature, weight);
    }

    void timeToDeath() {
        double time = kf * starBrightDemo();
        System.out.println("Зірка " + getName() + " стане чорною дірою через - " + time + " млрд років");
    }
}
