public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff (String name, String surname, int faculty, int magic, int transgress, int hardworking, int loyal, int honest ) {
        super(name, surname, faculty, magic, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getHonest() {
        return honest;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
