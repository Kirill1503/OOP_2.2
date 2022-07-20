package SkyPro;

public class Main {
    public static void main(String[] args) {
        Gryffindor ron = new Gryffindor("Рон Уизли", 87,87,87,87,87);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 88, 88, 88, 88, 88);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 89, 89, 89, 89, 89);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 66, 66, 66, 66, 66, 66);
        Slytherin drako = new Slytherin("Драко Малфой", 85, 85, 85, 85,
                85, 85, 85);
        ron.print();
        germiona.print();
        sedrik.print();
        padma.print();
        drako.print();

        sedrik.compare(drako);
        ron.compareGryffindor(germiona);
    }
}