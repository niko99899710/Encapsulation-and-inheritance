public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String name, String surname, int faculty, int magic, int transgress, int nobility, int honor, int bravery ) {
        super(name, surname, faculty, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
