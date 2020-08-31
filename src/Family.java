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
    public String actionSalutation (String otherPerson) {
        String text = this.name + ": Olá, " + classification + "!\n";
        return text;
    }

    @Override
    public String actionFarewell (String otherPerson) {
        String text = this.name + ": Até mais, " + classification + " :D !\n";
        return text;
    }

    public String actionFamily () {
        String text = this.name + ": Diga à família toda que eu mandei um abraço!\n";
        return text;
    }
}
