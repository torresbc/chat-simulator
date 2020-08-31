public class Partner extends Person {

    public Partner (String name) {
        super(name);
    }

    @Override
    public String actionSalutation (String otherPerson) {
        String text = this.name + ": Olá, meu amor!\n";
        return text;
    }

    @Override
    public String actionFeeling (String otherPerson) {
        String text = this.name + ": Já falei que eu te amo hoje? <3\n";
        return text;
    }

    @Override
    public String actionFarewell (String otherPerson) {
        String text = this.name + ": Preciso ir agora! Mas, irei voltar mais cedo para jantarmos juntos. Beijos!\n";
        return text;
    }

    public String actionPartner () {
        String text = "Nossa música deveria ser: 'Wonderful Tonight', o que acha?\n";
        return text;
    }
}
