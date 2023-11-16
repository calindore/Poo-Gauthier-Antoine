package TPAdapter;

public class EnglishActor {
    private String firstname;
    private String lastname;
    public EnglishActor(String firstname, String lastname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public EnglishActor() {
    }

    public String say(String sentence, EnglishActor interlocutor) {
        return this.firstname + " " + this.lastname + " dit à "+interlocutor.firstname + " " + interlocutor.lastname + " " +sentence;
    }
}
