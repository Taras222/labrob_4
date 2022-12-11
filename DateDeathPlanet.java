class DateDeathPlanet {
    static int time;
    static int age = 4;

    static {
        time = 21 - age;
    }

    static void timeToDeath() {
        System.out.println("Планета помре через - " + time + " млрд. років");
    }
}
