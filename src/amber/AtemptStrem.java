package amber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wojtek on 05.07.2019.
 */
public class AtemptStrem {


    public static void main(String[] args) {


        List<Person> persone = getPerson();

        persone.stream().forEach(person -> System.out.println(person));
            List<Person> listpers =   persone.stream().sorted((p1, p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        printPerson(listpers);
        persone.stream().filter(person -> person.getAge()==12);
    }

    public static List<Person> getPerson () {

        ArrayList  <Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("maciek ", 12));
        arrayList.add(new Person("racek ", 122));
        arrayList.add(new Person("makusz ", 212));
        return  arrayList;
    }


    public  static void printPerson ( List<Person> list){
        list.stream().forEach(person -> System.out.println(person.getName()+" " + person.getAge()));



    }


}
