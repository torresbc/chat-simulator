public class Colleague extends Person {

    public Colleague (String name) {
        super(name);
    }

    public void actionColleague (String otherPerson) {
        System.out.println(this.name + ": Há quanto tempo não te vejo, " + otherPerson + ". Já estava com saudades!");
    }
}
