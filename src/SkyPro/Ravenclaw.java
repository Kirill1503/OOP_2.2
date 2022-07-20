package SkyPro;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
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
    public void compareRavenclaw(Ravenclaw ravenclaw){
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s : %d VS %d%n", getName(), ravenclaw.getName(),
                    ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s : %d VS %d%n", ravenclaw.getName(), getName(),
                    ability1, ability2);
        } else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s : %d VS %d%n", ravenclaw.getName(), getName(),
                    ability1, ability2);
        }
    }
    private int ability(){
        return intelligence + wisdom + wit + creativity;
    }
    public String toString(){
        return String.format("%s, ,ум: %d; мудрость: %d; остроумие: %d; творчество: %d", super.toString(), intelligence, wisdom,
                wit, creativity);
    }
}
