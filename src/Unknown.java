public class Unknown extends Person {

    public Unknown (String name) {
        super(name);
    }

    @Override
    public String actionFeeling (String otherPerson) {
        String text = this.name + ": Foi um prazer te conhecer, " + otherPerson + ".\n";
        return text;
    }

    public String actionUnknown (String otherPerson) {
        String text = this.name + ": Meu nome é " + this.name + ", aposto que seremos ótimos amigos, " +
                otherPerson + ".\n";
        return text;
    }

}
