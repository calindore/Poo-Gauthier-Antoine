import TPObserver.*;

public class main {
    public static void main(String[] args) {
/*
        Mario mario = MarioFactory.create();

        System.out.println(mario.speak());
        System.out.println(mario.jump());
        System.out.println(mario.hit());
*/
//        FrenchActor jeffTuche = new FrenchActor("Jeff", "Tuche");
//        FrenchActor cathyTuche = new FrenchActor("Cathy", "Tuche");
//        Adapter adaptedJeffTuche = new Adapter(jeffTuche);
//        Adapter adaptedCathyTuche = new Adapter(cathyTuche);
//
//        EnglishActor johnDoe = new EnglishActor("John", "Doe");
//
//        System.out.println(johnDoe.say("Howdy! Welcome to our joint. What can I get for y'all tonight?", adaptedJeffTuche));

        Feu feu = new Feu();

        Voiture voiture = new Voiture();
        Velo  velo = new Velo();
        Ambulance ambulance= new Ambulance();
        Pieton pieton = new Pieton();

        feu.addObserver(voiture);
        feu.addObserver(velo);
        feu.addObserver(ambulance);
        feu.addObserver(pieton);

        feu.setState("rouge");
        feu.setState("vert");
    }
}