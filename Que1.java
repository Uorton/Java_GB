

// * 3.* Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
// (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

package Java_Homeworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Que1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("Philipp", "344");
        phoneBook.add("Philipp", "122");

        List<String> strings = phoneBook.get("Philipp");
        System.out.println(strings);
    }

}
