public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    protected int getPower() {
        return this.powerOfMagic + this.transgressionDistance;
    }

    public void printPowerDifference(Hogwarts student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s", this.name, student.name);
        }else if (this.getPower() < student.getPower()) {
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s", student.name, this.name);
        } else {
            System.out.printf("%s обладает такой же мощностью магии, как и %s", this.name, student.name);
        }
    }

    @Override
    public  String toString() {
        return "Имя ученика: "+ this.name + "\nСила магии: " + this.powerOfMagic+
                "\nРасстояние трансгрессии " + this.transgressionDistance;
    }
}
