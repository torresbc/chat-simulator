public class Partner extends Person {

    public Partner (String name) {
        super(name);
    }

    @Override
    public void actionSalutation (String otherPerson) {
        System.out.println(this.name + ": Olá, meu amor!");
    }

    @Override
    public void actionFeeling (String otherPerson) {
        System.out.println(this.name + ": Já falei que eu te amo hoje? <3 ");
    }

    @Override
    public void actionFarewell (String otherPerson) {
        System.out.println(this.name + ": Preciso ir agora! Mas, irei voltar mais cedo para jantarmos juntos. Beijos!");
    }

    public void actionPartner () {
        System.out.println("Nossa música deveria ser: 'Wonderful Tonight', o que acha?");
    }
}
