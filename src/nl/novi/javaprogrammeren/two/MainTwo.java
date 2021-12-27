package nl.novi.javaprogrammeren.two;

import nl.novi.javaprogrammeren.two.sub.Phone;

public class MainTwo {
    public static void main(String[] args) {
        Phone phone = new Phone("Nokia");
        System.out.println(phone.getBrand());
    }
    /**
     * De mogelijkheden:
     * (Geef de methode een access modifier)
     * maak method public
     * maak method protected
     */
}
