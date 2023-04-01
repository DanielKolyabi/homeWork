package tree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class input {
    public void printIn() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src\\tree\\Input.out"));
        FamilyTree dadRestored = (FamilyTree) objectInputStream.readObject();


        System.out.println(dadRestored.getPeopleList());
        objectInputStream.close();
    }
}