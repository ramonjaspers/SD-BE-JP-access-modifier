package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {
        PrisonCell cell123 = new PrisonCell(123, 1, "Peter Pan");
        System.out.println(cell123.getPerson());
        cell123.setPerson("Harry Potter");
        System.out.println(cell123.getPerson());
    }
}
