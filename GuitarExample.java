import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class GuitarExample {
    public static void main(String[] args) {
        final List<Guitar> guitarList = new ArrayList<>();
        guitarList.add(new Guitar("Eric Clapton", "Fender Stratocaster", "Elcetric"));
        guitarList.add(new Guitar("Jaco Pastorius", "Fender Jazz bass ", "Elcetric bass"));
        guitarList.add(new Guitar("Victor Wooten", "Fedora Monarch", "Elcetric bass"));

        for (Guitar guitar : guitarList) {
            System.out.println();
        }


    }
}
