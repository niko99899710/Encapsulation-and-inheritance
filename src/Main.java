public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Gryffindor("Harry", "Potter", 1, 85, 74, 79, 80, 90),
                new Gryffindor("Hermione", "Granger", 1, 79, 80, 80, 90, 89),
                new Gryffindor("Ron", "Weasley", 1, 68, 70, 75, 80, 81),
                new Hufflepuff("Zachariah", "Smith", 2, 60, 86, 70, 67, 90),
                new Hufflepuff("Cedric", "Diggory", 2, 64, 56, 61, 83, 75),
                new Hufflepuff("Justin", "Finch-Fletchley", 2, 70, 82, 71, 64, 59),
                new Ravenclaw("Zhou", "Chang", 3, 59, 82, 90, 79, 96, 87),
                new Ravenclaw("Padma", "Patil", 3, 67, 66, 82, 79, 69, 89),
                new Ravenclaw("Marcus", "Belby", 3, 53, 80, 90, 86, 74, 60),
                new Slytherin("Draco", "Malfoy", 4, 78, 81, 90, 89, 87, 76, 65),
                new Slytherin("Graham", "Montague", 4, 67, 78, 87, 84, 54, 43, 78),
                new Slytherin("Gregory", "Goyle", 4, 80, 65, 63, 69, 90, 76, 86)

        };
       HogwartsPrinter printer = new HogwartsPrinter();
       for (Hogwarts student : students) {
            printer.print(student);
      }
        HogwartsPrinter hogwarts = new HogwartsPrinter();
       hogwarts.studensFromFaculty((Gryffindor) students[0], (Gryffindor) students[1]);
    }
    }