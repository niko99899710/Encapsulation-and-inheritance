public class Hogwarts {
    private String name;
    private String surname;
    private int faculty;

    private int magic;
    private int transgress;

    public Hogwarts (String name, String surname, int faculty, int magic, int transgress){
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getFaculty() {
        return faculty;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                ", magic=" + magic +
                ", transgress=" + transgress +
                '}';
    }
}
