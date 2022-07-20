package SkyPro;

public class Hufflepuff extends Hogwarts{
    private int hard_work;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int hard_work, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.hard_work = hard_work;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getHard_work() {
        return hard_work;
    }

    public void setHard_work(int hard_work) {
        this.hard_work = hard_work;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compareHufflepuff(Hufflepuff hufflepuff){
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s : %d VS %d%n", getName(), hufflepuff.getName(),
                    ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s : %d VS %d%n", hufflepuff.getName(), getName(),
                    ability1, ability2);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец %s : %d VS %d%n", hufflepuff.getName(), getName(),
                    ability1, ability2);
        }
    }
    private int ability() {
        return hard_work + loyalty + honesty;
    }
    public String toString(){
        return String.format("%s, ,трудолюбие: %d; верность: %d; честность: %d", super.toString(), hard_work, loyalty, honesty);
    }
}
