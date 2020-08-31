public class Colleague extends Person {

    public Colleague (String name) {
        super(name);
    }

    public String actionColleague (String otherPerson) {
        String text = this.name + ": Há quanto tempo não te vejo, " + otherPerson + ". Já estava com saudades!\n";
        return text;
    }
}
