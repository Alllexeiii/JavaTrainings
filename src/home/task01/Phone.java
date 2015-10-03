package home.task01;

/**
 * Created by User on 19.09.2015.
 */
public class Phone {

    public static void main(String[] args) {

    }

}

class Note {

    private int id;
    private String name;
    private String surname;
    private String tags;

    public Note() {
        id = 0;
        name = "";
        surname = "";
        tags = "";
    }

    public Note(int id, String name, String surname, String tags) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTags() {
        return tags;
    }
}

class PhoneNumber {

    private String typeNumber;
    private String number;

    public PhoneNumber() {
        typeNumber = "";
        number = "";
    }

    public PhoneNumber(String typeNumber, String number) {
        this.typeNumber = typeNumber;
        this.number = number;
    }

    public String GetTypeNumber() {
        return typeNumber;
    }

    public String GetNumber() {
        return number;
    }

}