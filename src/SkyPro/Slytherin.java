package SkyPro;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination,
                     int ambition, int resourcefulness, int power) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void compareSlytherin(Slytherin slytherin){
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Ученик слизерина %s лучше, чем ученик слизерина %s : %d VS %d%n", getName(), slytherin.getName(),
                    ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Ученик слизерина %s лучше, чем ученик слизерина %s : %d VS %d%n", slytherin.getName(), getName(),
                    ability1, ability2);
        } else {
            System.out.printf("Ученик слизерина %s такой же, как ученик слизерина %s : %d VS %d%n", slytherin.getName(), getName(),
                    ability1, ability2);
        }
    }
    private int ability(){
        return cunning + determination + ambition + resourcefulness + power;
    }
    public String toString(){
        return String.format("%s, ,хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; " +
                "жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulness, power);
    }
}
