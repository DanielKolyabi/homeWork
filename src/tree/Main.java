package tree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        FamilyTree tree = new FamilyTree();
        // вот здесь вопрос с New Date
        Human dad = new Human("Петр", "Осетров", Gender.Male, LocalDate.of(1986, 7, 21));
        Human mom = new Human("Лариса", "Осетрова", Gender.Female, LocalDate.of(1988, 2, 1));
        Human son = new Human("Дмитрий", "Осетров", Gender.Male, LocalDate.of(2000, 5, 4));
        Human dah = new Human("Олеся", "Осетрова", Gender.Female, LocalDate.of(2005, 11, 27));

        dad.addChild(son);
        dad.addChild(dah);
        mom.addChild(son);
        mom.addChild(dah);

        tree.addHuman(dad);
        tree.addHuman(mom);
        tree.addHuman(son);
        tree.addHuman(dah);

        List<Human> children = tree.getChildren(mom);


        List<Human> childList = tree.getChildren(dad);



        List<Human> descendants = tree.getDescendants(dad);



        List<Human> relatives = tree.getRelatives(son);



        List<Human> searchResult = tree.searchByName("Петр");



        Output output = new Output();
        output.printOut(tree);

        input input = new input();
        input.printIn();

    }
}
