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

    public void actionSalutation (String otherPerson) {
        System.out.println(this.name + ": Olá, " + otherPerson + "!");
    }

    public void actionFeeling (String otherPerson) {
        System.out.println(this.name + ": Foi ótimo falar com você! Deveríamos nós falar mais vezes!");
    }

    public void actionFarewell (String otherPerson) {
        System.out.println(this.name + ": Até mais " + otherPerson + " :D !");
    }
}
