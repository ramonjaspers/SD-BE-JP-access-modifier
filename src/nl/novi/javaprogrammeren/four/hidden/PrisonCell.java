package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {
    public int cellNumber;
    public int floor;
    public Inhabitant person;

    public PrisonCell(int cellNumber, int floor, String person) {
        this.cellNumber = cellNumber;
        this.floor = floor;
        this.person = new Inhabitant(person);
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setPerson(String name) {
        this.person.setName(name);
    }

    public String getPerson() {
        return this.person.getName();
    }
}
