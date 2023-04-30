// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("a");
        linkedlist.add("b");
        linkedlist.add("c");
        System.out.print("Элементы до реверса: " + linkedlist);
        linkedlist = reverseLinkedList(linkedlist);
        System.out.print("\nЭлементы после реверса: " + linkedlist);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> revLinkedList = new LinkedList<>();
        // String s, которой каждый раз присваиваем string.get (i)
        for (String s : list) {
           revLinkedList.addFirst(s);
        }
        return revLinkedList;
    }
}