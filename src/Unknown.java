public class Unknown extends Person {

    public Unknown (String name) {
        super(name);
    }

    @Override
    public void actionFeeling (String otherPerson) {
        System.out.println(this.name + ": Foi um prazer te conhecer, " + otherPerson + ".");
    }

    public void actionUnknown (String otherPerson) {
        System.out.println(this.name + ": Meu nome é " + this.name + ", aposto que seremos ótimos amigos, " +
                otherPerson + "." );
    }

}
