public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String actionSalutation (String otherPerson) {
        String text = this.name + ": Olá, " + otherPerson + "!\n";
        return text;
    }

    public String actionFeeling (String otherPerson) {
        String text = this.name + ": Foi ótimo falar com você! Deveríamos nós falar mais vezes!\n";
        return text;
    }

    public String actionFarewell (String otherPerson) {
        String text = this.name + ": Até mais " + otherPerson + " :D !\n";
        return text;
    }
}
