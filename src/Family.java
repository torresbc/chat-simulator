public class Family extends Person {

    public Family(String name, String classification) {
        super(name);
        this.classification = classification;
    }

    private String classification;

    public String getClassification() {
        return classification;
    }

    public void setClassification (String classification) {

    }

    @Override
    public void actionSalutation (String otherPerson) {
        System.out.println(this.name + ": Olá, " + classification + ", " + otherPerson + "!");
    }

    @Override
    public void actionFarewell (String otherPerson) {
        System.out.println(this.name + ": Até mais, " + classification + " :D !");
    }

    public void actionFamily () {
        System.out.println(this.name + ": Diga à família toda que eu mandei um abraço!");
    }
}
