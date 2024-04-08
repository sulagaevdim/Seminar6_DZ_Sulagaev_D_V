import java.util.*;

public class Main {
    static HashMap<String, List<Long>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addMembers();
        addNumbers();
        sortPhoneBook(phoneBook);
    }

    // создаю метод, добавляющий в телефонную книгу имена и список номеров
    public static void addMembers(){
        phoneBook.put("Dmitriy_Sulagaev", new ArrayList<>());
        phoneBook.put("Anuar_Kameshev", new ArrayList<>());
        phoneBook.put("Evgeniy_Pusser", new ArrayList<>());
        phoneBook.put("Danila_Nikitin", new ArrayList<>());
        phoneBook.put("Gleb_Soldatkov", new ArrayList<>());
        phoneBook.put("Alexandr_Leonidov", new ArrayList<>());
        phoneBook.put("Alexandr_Samarin", new ArrayList<>());
    }

    // создаю метод, добавляющий номера в списки номеров телефонной книги
    public static void addNumber(String name, long number) {
        phoneBook.get(name).add(number);
    }

    // добавляю номера
    public static void addNumbers() {
        addNumber("Dmitriy_Sulagaev", 89278182015L);
        addNumber("Anuar_Kameshev", 89227654865L);
        addNumber("Anuar_Kameshev", 89241223478L);
        addNumber("Anuar_Kameshev", 88002000600L);
        addNumber("Evgeniy_Pusser", 89041556676L);
        addNumber("Evgeniy_Pusser", 89175567878L);
        addNumber("Danila_Nikitin", 89378654684L);
        addNumber("Gleb_Soldatkov", 89285674567L);
        addNumber("Alexandr_Leonidov", 89376573433L);
        addNumber("Alexandr_Leonidov", 89221259428L);
        addNumber("Alexandr_Leonidov", 88422242205L);
        addNumber("Alexandr_Samarin", 89376575567L);
        addNumber("Alexandr_Samarin", 88002000000L);
    }


    // создаю метод для сортировки
    public static void sortPhoneBook(HashMap<String, List<Long>> phonBook) {
        // создаю 2 линкедлиста, в которые положу отдельно имена и кол-во номеров
        LinkedList<Integer> countNumbers = new LinkedList<>();
        LinkedList<String> countMembers = new LinkedList<>();
        int count = 0;
        //  перебираю MAP, сортирую отдельно по линкедлистам имена и кол-во номеров
        for (Map.Entry<String, List<Long>> entry : phonBook.entrySet()) {
            countNumbers.add(count, (entry.getValue()).size());
            countMembers.add(count, entry.getKey());
            count++;
        }
        int tempNum = 0;
        String tempStr = "";
        // сортировкой пузырьком сортирую по убыванию кол-во номеров, параллельно с этим сортируя имена во втором LL
        for (int i = 0; i < phonBook.size(); i++) {
            for (int j = 1; j < phonBook.size(); j++) {
                if (countNumbers.get(j-1) < countNumbers.get(j)) {
                    tempNum = countNumbers.get(j-1);
                    countNumbers.set(j-1, countNumbers.get(j));
                    countNumbers.set(j, tempNum);
                    tempStr = countMembers.get(j-1);
                    countMembers.set(j-1, countMembers.get(j));
                    countMembers.set(j, tempStr);
                }
            }
        }

        // вывожу список, отсортированный по убыванию числа телефонов
        for (int i = 0; i < phonBook.size(); i++) {
            System.out.println("Имя: " + countMembers.get(i)
                    + ";\t Номера телефонов: " + phonBook.get(countMembers.get(i)));
        }
    }
}