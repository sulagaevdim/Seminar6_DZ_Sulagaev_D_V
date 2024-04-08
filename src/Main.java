import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Map<String, List<Long>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addMembers();
        addNumbers();

        System.out.println(phoneBook);



    }

    public static void addMembers(){
        phoneBook.put("Dmitriy_Sulagaev", new ArrayList<>());
        phoneBook.put("Anuar_Kameshev", new ArrayList<>());
        phoneBook.put("Evgeniy_Pusser", new ArrayList<>());
        phoneBook.put("Danila_Nikitin", new ArrayList<>());
        phoneBook.put("Gleb_Soldatkov", new ArrayList<>());
        phoneBook.put("Sergei_Irha", new ArrayList<>());
        phoneBook.put("Alexandr_Samarin", new ArrayList<>());
    }

    public static void addNumbers() {
        addNumber("Dmitriy_Sulagaev", 89278182015L);
        addNumber("Anuar_Kameshev", 89227654865L);
        addNumber("Anuar_Kameshev", 89241223478L);
        addNumber("Anuar_Kameshev", 88002000600L);
        addNumber("Evgeniy_Pusser", 89041556676L);
        addNumber("Evgeniy_Pusser", 89175567878L);
        addNumber("Danila_Nikitin", 89378654684L);
        addNumber("Gleb_Soldatkov", 89285674567L);
        addNumber("Sergei_Irha", 89376573433L);
        addNumber("Sergei_Irha", 89221259428L);
        addNumber("Sergei_Irha", 88422242205L);
        addNumber("Alexandr_Samarin", 89376575567L);
        addNumber("Alexandr_Samarin", 88002000000L);
    }
    public static void addNumber(String name, long number) {
        phoneBook.get(name).add(number);
    }
}