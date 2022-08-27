package arch_tasks.tz2;



/*
*
* 1."Читатели библиотеки". Определить класс Reader, хранящий такую информацию
* о пользователе библиотеки: ФИО, номер читательского билета,
факультет, дата рождения, телефон. Методы takeBook(), returnBook().
*
*
*
* */

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Reader {

    public static void main(String[] args) {
        new Reader().takeBook("1","2");
    }
    private String firstname;
    private String lastname;
    private int readerTicket;
    private LocalDate date;
    private String phoneNumber;

    public void takeBook(int count){
        System.out.print(firstname + " " + lastname + "takes + " + count + " books");

    }

    public void takeBook(String... arg){
        System.out.println(firstname + " " + lastname + " takes: ");
        Arrays.stream(arg).forEach(el -> System.out.print(el + " "));

    }

    public void takeBook(Book... arg){
        System.out.println(firstname + " " + lastname + " takes: ");
        Arrays.stream(arg).forEach(el -> System.out.print(el.getName() + " "));
    }

    public void returnBook(){

    }
}
