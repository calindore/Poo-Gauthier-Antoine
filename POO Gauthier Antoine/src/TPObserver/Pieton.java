package TPObserver;

public class Pieton implements IObserver {
    public void update(String newState) {
        switch (newState) {
            case "rouge":
                System.out.println("Le pieton avance");
                break;
            case "vert":
                System.out.println("Le pieton s'arrete");
                break;
        }
    }
}
