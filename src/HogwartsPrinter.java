public class HogwartsPrinter {

    public void studensYoursFaculty(Gryffindor first, Gryffindor second){
        var firstS = first.getBravery() + first.getHonor() + first.getNobility();
        var secondS = second.getBravery() + second.getHonor() + second.getNobility();

        if (firstS > secondS){
            System.out.println(first.getName() + " лучше, чем " + second.getName());
        } else if (firstS < secondS){
            System.out.println(second.getName() + " лучше, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " одинакова посиле " + second.getName());
        }
    }
    public void print(Hogwarts student){
    System.out.println(student);
    }
    public void anyStudent(Hogwarts first, Hogwarts second){
        System.out.println(first.getName() + " одинакова посиле " + second.getName());
    }

    public void studensFromFaculty(Hogwarts first,Hogwarts second){
        var firstSt = first.getMagic() + first.getTransgress();
        var secondSt = second.getMagic() + second.getTransgress();

        if (firstSt > secondSt){
            System.out.println(first.getName() + " лучше, чем " + second.getName());
        } else if (firstSt < secondSt){
            System.out.println(second.getName() + " лучше, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " одинакова посиле " + second.getName());
        }
    }

}

