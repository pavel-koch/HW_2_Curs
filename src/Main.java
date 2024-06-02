import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gryffindor garry = new Gryffindor("Гарри Поттер", 95, 40, 86, 18, 56);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 80, 45, 90, 30, 35);
        Gryffindor ron = new Gryffindor("Рон Уизли", 60, 30, 18, 9, 43);
        Hufflepuff zahari = new Hufflepuff("Захария Смит", 35, 60, 86, 35, 16);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 73, 50, 19, 25, 48);
        Hufflepuff djastin = new Hufflepuff("Джастин Финч-Флетчли", 39, 25, 34, 75, 87);
        Ravenclaw chjo = new Ravenclaw("Чжоу Чанг", 39, 25, 34, 75, 87, 32);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 60, 30, 18, 9, 43, 32);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 80, 45, 90, 30, 35, 32);
        Slytherin drako = new Slytherin("Драко Малфой", 95, 40, 86, 18, 56, 35, 69);
        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 35, 60, 86, 35, 16, 19, 65);
        Slytherin gregoil = new Slytherin("Грегори Гойл", 39, 25, 34, 75, 87, 42, 17);

        garry.printPowerDifference(drako);
    }
}