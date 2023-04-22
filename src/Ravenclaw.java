public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw (String name, String surname, int faculty, int magic, int transgress, int smart, int wise, int witty, int creativity ) {
        super(name, surname, faculty, magic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
