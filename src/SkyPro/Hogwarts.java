package SkyPro;

public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression){
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    private int ability(){
        return magic + transgression;
    }
    public void compare(Hogwarts hogwarts){
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", getName(), hogwarts.getName(),
                    ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучше, чем студент %s : %d VS %d%n", hogwarts.getName(), getName(),
                    ability1, ability2);
        } else {
            System.out.printf("Студент %s такой же, как студент %s : %d VS %d%n", hogwarts.getName(), getName(),
                    ability1, ability2);
        }
    }
    public void print(){
        System.out.println(this);
    }
    public String toString(){
        return String.format("Студент: %s, сила магии: %d; сила трансгрессии: %d;", name, magic, transgression);
    }
}
