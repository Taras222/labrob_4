class Planet {
    private String name;
    private int age;
    private int weight;
    private boolean habitableZone;

    Planet(String name, int age, int weight, boolean habitableZone) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitableZone = habitableZone;
    }


    private int cycleLife() {
        int result = 0;
        if (age < 3 && weight < 5) {
            result = (int) (7 + Math.random() * 15);
        } else if ((age > 3 && age < 7) && (weight > 5 && weight < 9)) {
            result = (int) (4 + Math.random() * 7);
        }
        return result;
    }

    int cycleLifeDemo() {
        return cycleLife();
    }

    double cycleLife(double age, double weight) {
        double result = 0;
        if (age < 3 && weight < 5) {
            result = (7 + Math.random() * 15);
        } else if ((age > 3 && age < 7) && (weight > 5 && weight < 9)) {
            result = (4 + Math.random() * 7);
        }
        return result;
    }

    private void suitableForLife() {
        if (habitableZone) {
            System.out.println("Планета - " + name + " придатна для життя");
        } else {
            System.out.println("Планета - " + name + " не придатна для життя");
        }
    }

    void suitableForLifeDemo() {
        suitableForLife();
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getHabitableZone() {
        return habitableZone;
    }

    public void setHabitableZone(boolean habitableZone) {
        this.habitableZone = habitableZone;
    }
}