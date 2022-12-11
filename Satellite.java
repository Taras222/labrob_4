class Satellite {
    private String name;
    private int distanceFromPlanet;
    private int brightness;

    Satellite(String name, int distanceFromPlanet, int brightness) {
        this.name = name;
        this.distanceFromPlanet = distanceFromPlanet;
        this.brightness = brightness;
    }

    private boolean tides() {
        boolean res;
        if (brightness < 70 && distanceFromPlanet < 200) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    boolean tidesDemo() {
        return tides();
    }

    private void showTides() {
        if (tides() == true) {
            System.out.println("Потужність припливів висока");
        } else {
            System.out.println("Потужність припливів низька");
        }
    }

    void showTidesDemo() {
        showTides();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getDistanceFromPlanet() {
        return distanceFromPlanet;
    }

    public void setDistanceFromPlanet(int distanceFromPlanet) {
        this.distanceFromPlanet = distanceFromPlanet;
    }
}
