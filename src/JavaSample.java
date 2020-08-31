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

    //Efeito: Máquina de escrever para o chat
    static void outputChat(String text) {
        System.out.print(Color.PURPLE_BOLD_BRIGHT);
        for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException error)
            {
                error.printStackTrace();
            }
        }
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
        System.out.print(Color.BLUE_BACKGROUND);
        System.out.print(Color.BLACK_BOLD);
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

        System.out.print(Color.RESET);
    }

    //Inicializa o chat com o BOT
    static void initializeChat() {
        System.out.print(Color.BLUE_BACKGROUND);
        System.out.print(Color.BLACK_BOLD);

        System.out.println("Escolha a opção referente ao contato que deseja conversar:");
        System.out.print(Color.RESET);

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

        outputChat(((Unknown) objectIndex).actionSalutation(userName));
        answerSimulator = input();
        outputChat(((Unknown) objectIndex).actionUnknown(userName));
        answerSimulator = input();
        outputChat(((Unknown) objectIndex).actionFeeling(userName));
        answerSimulator = input();
        outputChat(((Unknown) objectIndex).actionFarewell(userName));
        answerSimulator = input();
    }

    //Chat correspondente à Colegas
    static void chatColleague(Person objectIndex) {
        String answerSimulator = "";

        outputChat(((Colleague) objectIndex).actionSalutation(userName));
        answerSimulator = input();
        outputChat(((Colleague) objectIndex).actionColleague(userName));
        answerSimulator = input();
        outputChat(((Colleague) objectIndex).actionFeeling(userName));
        answerSimulator = input();
        outputChat(((Colleague) objectIndex).actionFarewell(userName));
        answerSimulator = input();
    }

    //Chat correspondente à Familiares
    static void chatFamily(Person objectIndex) {
        String answerSimulator = "";

        outputChat(((Family) objectIndex).actionSalutation(userName));
        answerSimulator = input();
        outputChat(((Family) objectIndex).actionFamily());
        answerSimulator = input();
        outputChat(((Family) objectIndex).actionFeeling(userName));
        answerSimulator = input();
        outputChat(((Family) objectIndex).actionFarewell(userName));
        answerSimulator = input();
    }

    //Chat correspondente à Conjuguês
    static void chatPartner(Person objectIndex) {
        String answerSimulator = "";

        outputChat(((Partner) objectIndex).actionSalutation(userName));
        answerSimulator = input();
        outputChat(((Partner) objectIndex).actionPartner());
        answerSimulator = input();
        outputChat(((Partner) objectIndex).actionFeeling(userName));
        answerSimulator = input();
        outputChat(((Partner) objectIndex).actionFarewell(userName));
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
            else if (objectList.isEmpty() || !option.equals("A") && !option.equals("B") && !option.equals("C")) {
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
