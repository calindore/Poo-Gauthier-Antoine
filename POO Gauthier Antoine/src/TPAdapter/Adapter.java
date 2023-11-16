package TPAdapter;

public class Adapter extends EnglishActor {
    private FrenchActor frenchActor;

    public Adapter(FrenchActor frenchActor) {
        this.frenchActor = frenchActor;
    }
}
