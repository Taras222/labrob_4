public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Kepler", 2, 4, true);
        Satellite satellite = new Satellite("Carme", 175, 65);
        Star star = new Star("Alpha Centavra", 530, 670);
        StarDeath stardeath = new StarDeath("Mira A", 1243, 1894);

        Star star2 = new Star(star);
        Star star3 = new Star();
        star3.setTemperature(887);
        star3.setWeight(1657);
        star3.setName("Sirius");

        planet.suitableForLifeDemo();
        System.out.println("Планета " + planet.getName() + " буде жити ще " + planet.cycleLifeDemo() + " млрд. років");
        System.out.println("Планета " + planet.getName() + " буде жити ще " + planet.cycleLife(2.043,4.142) + " млрд. років");
        satellite.showTidesDemo();
        star.classificationDemo();
        System.out.println("Зірка " + star.getName() + " буде світити ще " + star.starBrightDemo() + " млрд. років");
        System.out.println("Зірка " + star2.getName() + " буде світити ще " + star2.starBrightDemo() + " млрд. років");
        star3.classificationDemo();
        System.out.println("Зірка " + star3.getName() + " буде світити ще " + star3.starBrightDemo() + " млрд. років");

        DateDeathPlanet.timeToDeath();

        stardeath.timeToDeath();

    }
}