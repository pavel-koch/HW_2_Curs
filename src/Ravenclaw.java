public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom,
                     int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    protected int getPower() {
        return this.mind + this.wisdom + this.wit + this.creativity;
    }

    public void printPowerDifference(Ravenclaw student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Когтевранец, чем %s", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Когтевранец, чем %s", student.getName(), this.getName());
        } else {
            System.out.printf("%s такой же Когтевранец, как и %s", this.getName(), student.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nФакультет: Когтевран" +
                "\nУм: " + this.mind +
                "\nМудрость: " + this.wisdom +
                "\nОстроумность: " + this.wit +
                "\nТворчесво: " + this.creativity;
    }
}
