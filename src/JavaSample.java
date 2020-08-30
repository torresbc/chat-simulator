import java.util.*;

public class JavaSample {

    public static String userName;

    //Realiza a entrada de dados
    static String input() {

       String input = "";
       Scanner input1 = new Scanner(System.in);
       input = input1.next();
       return input;
    }

    //Padroniza a mensagem de erro em todas as validações
    static void errorMessage() {
        System.out.print(Color.RED_BACKGROUND);
        System.out.print(Color.BLACK_BOLD);
        System.out.println("Opção inválida! Tente novamente  ¯\\_(ツ)_/¯");
        System.out.print(Color.RESET);
    }

    static List<Person> objectList = new ArrayList<>();

    //Adiciona os objetos instânciados à lista correspondente
    static List objectList(Person newPerson) {
        objectList.add(newPerson);
        System.out.println("Contato cadastrado com sucesso!");
        return objectList;
    }

    //Instância novos objetos
    static void newRegister() {
        System.out.println("Oba! Vamos cadastrar um novo contato!");
        System.out.println("Digite o nome do contato:");

        String name = input();
        String classification = "";

        while (!classification.equals("A") && !classification.equals("B") && !classification.equals("C")
                && !classification.equals("D")) {

            System.out.println("Escolha uma classificação para o seu novo contato:\nA - Desconhecido\nB - Colega\n" +
                    "C - Familiar\nD - Cônjuge");

            classification = input();

            if (classification.equals("A")) {
                Unknown newPerson = new Unknown(name);
                objectList(newPerson);
            }
            else if (classification.equals("B")) {
                Colleague newPerson = new Colleague(name);
                objectList(newPerson);
            }
            else if (classification.equals("C")) {
                System.out.println("Digite seu grau de parentesco com o novo contato:");
                String kinship = input();
                Family newPerson = new Family(name, kinship);
                objectList(newPerson);
            }
            else if (classification.equals("D")) {
                Partner newPerson = new Partner(name);
                objectList(newPerson);
            }
            else {
                errorMessage();
            }
        }
    }

    //Inicializa o chat com o BOT
    static void initializeChat() {

        System.out.println("Escolha a opção referente ao contato que deseja conversar:");
        Integer cont = 0;
        for (Person p :
                objectList) {
            System.out.println(cont + " - " + p.name);
            cont = cont + 1;
        }

        while (1 == 1) {
            String option = input();
            try {
                Integer.parseInt(option);
                if(Integer.parseInt(option) <= cont && Integer.parseInt(option) >= 0) {
                    Person objectIndex = objectList.get(Integer.parseInt(option));


                    if (objectIndex instanceof Unknown) {
                        chatUnknown(objectIndex);
                        break;
                    }
                    else if (objectIndex instanceof Colleague) {
                        chatColleague(objectIndex);
                        break;
                    }
                    else if (objectIndex instanceof Family) {
                        chatFamily(objectIndex);
                        break;
                    }
                    else if (objectIndex instanceof Partner) {
                        chatPartner(objectIndex);
                        break;
                    }
                }
                else {
                    errorMessage();
                }
            }
            catch(Exception error)
            {
                errorMessage();
            }
        }

    }

    //Chat correspondente à Desconhecidos
    static void chatUnknown(Person objectIndex) {
        String answerSimulator = "";

        ((Unknown) objectIndex).actionSalutation(userName);
        answerSimulator = input();
        ((Unknown) objectIndex).actionUnknown(userName);
        answerSimulator = input();
        ((Unknown) objectIndex).actionFeeling(userName);
        answerSimulator = input();
        ((Unknown) objectIndex).actionFarewell(userName);
        answerSimulator = input();
    }

    //Chat correspondente à Colegas
    static void chatColleague(Person objectIndex) {
        String answerSimulator = "";

        ((Colleague) objectIndex).actionSalutation(userName);
        answerSimulator = input();
        ((Colleague) objectIndex).actionColleague(userName);
        answerSimulator = input();
        ((Colleague) objectIndex).actionFeeling(userName);
        answerSimulator = input();
        ((Colleague) objectIndex).actionFarewell(userName);
        answerSimulator = input();
    }

    //Chat correspondente à Familiares
    static void chatFamily(Person objectIndex) {
        String answerSimulator = "";

        ((Family) objectIndex).actionSalutation(userName);
        answerSimulator = input();
        ((Family) objectIndex).actionFamily();
        answerSimulator = input();
        ((Family) objectIndex).actionFeeling(userName);
        answerSimulator = input();
        ((Family) objectIndex).actionFarewell(userName);
        answerSimulator = input();
    }

    //Chat correspondente à Conjuguês
    static void chatPartner(Person objectIndex) {
        String answerSimulator = "";

        ((Partner) objectIndex).actionSalutation(userName);
        answerSimulator = input();
        ((Partner) objectIndex).actionPartner();
        answerSimulator = input();
        ((Partner) objectIndex).actionFeeling(userName);
        answerSimulator = input();
        ((Partner) objectIndex).actionFarewell(userName);
        answerSimulator = input();
    }

    //Inicializa o menu de opções padrão
    static void menu() {

        String option = "";

        while (!option.equals("C")) {
            System.out.print(Color.CYAN_BACKGROUND);
            System.out.print(Color.BLACK_BOLD);
            System.out.println("\nSelecione uma opção:\nA - Adicionar novo contato\nB - Iniciar chat\n" +
                    "C - Finalizar programa\n");
            System.out.print(Color.RESET);

            option = input();

            if (option.equals("A")) {
                newRegister();
            }
            else if (option.equals("B") && !objectList.isEmpty()) {
                initializeChat();
            }
            else {
                errorMessage();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print(Color.MAGENTA_BACKGROUND);
        System.out.print(Color.BLACK_BOLD);
        System.out.println("\n           >(^▿^->)   Bem-Vindo(a) ao Chat Simulator!  <(^▿^-<) \n");

        System.out.println("   Qual o seu nome?");
        userName = input();
        System.out.println("   Legal! Vamos começar  \\ô/");
        System.out.print(Color.RESET);
        menu();
    }
}
