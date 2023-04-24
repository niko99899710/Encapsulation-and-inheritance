import java.net.HttpURLConnection;

public class HogwartsPrinter {

    public void studensYoursFaculty(Gryffindor first, Gryffindor second){
        var firstS = first.getBravery() + first.getHonor() + first.getNobility();
        var secondS = second.getBravery() + second.getHonor() + second.getNobility();

        if(firstS > secondS) {
            System.out.println(first.getName() + " лучше, чем " + second.getName());
        } else if (firstS < secondS){
            System.out.println(second.getName() + " лучше, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " одинакова посиле " + second.getName());
        }
    }

    public void studensYoursFacultyHufflepuff(Hufflepuff first, Hufflepuff second){
        var firstH = first.getHardworking() + first.getLoyal() + first.getHonest();
        var secondH = second.getHardworking() + second.getLoyal() + second.getHonest();

        if(firstH < secondH) {
            System.out.println(first.getName() + " хуже, чем " + second.getName());
        } else if (firstH > secondH){
            System.out.println(second.getName() + " хуже, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " одинакова посиле " + second.getName());
        }
    }

    public void studensYoursFacultyRavenclaw(Ravenclaw first, Ravenclaw second){
        var firstR = first.getSmart() + first.getWise() + first.getWitty() + first.getCreativity();
        var secondR = second.getSmart() + second.getWise() + second.getWitty() + second.getCreativity();

        if(firstR > secondR) {
            System.out.println(first.getName() + " лучше, чем " + second.getName());
        } else if (firstR < secondR){
            System.out.println(second.getName() + " лучше, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " одинакова посиле " + second.getName());
        }
    }

    public void studensYoursFacultySlytherin(Slytherin first, Slytherin second){
        var firstSl = first.getCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getPower();
        var secondSl = second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getPower();

        if(firstSl > secondSl) {
            System.out.println(first.getName() + " лучше, чем " + second.getName());
        } else if (firstSl < secondSl){
            System.out.println(second.getName() + " лучше, чем " + first.getName());
        } else {
            System.out.println(first.getName() + " одинакова посиле " + second.getName());
        }
    }

    public void studensFromFacultyHogwarts(Hogwarts first,Hogwarts second){
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

    public void print(Hogwarts student){
        System.out.println(student);
    }

}

