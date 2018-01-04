package temerbu.edu.hellolight;

public class Person{
    //fields:
    private String firstName; //ctrl + d
    private String lastName; //ctrl + d
    private final String id;
    private Integer serialNumber;

    //alt insert -> Generate
    //Constructors in java:
    //Java docs

    //default constructor.
    public Person() {
        id = "1234"; //TODO:go to the database (cloud) get the current id, increment it by 1... store the new id etc.
    }

    /**
     * @param firstName  the first name
     * @param lastName
     * @param id
     * @param serialNumber
     */

    //alt insert
    //this
    public Person(String firstName, String lastName, String id, Integer serialNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.serialNumber = serialNumber;
    }

    //alt insert

    /**
     *
     * @return the string representation:
     */
    @Override
    public String toString() {

        //0xd030d0d0d00d0 memory address ref in hex...
        String defaultToString = super.toString();

        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    //alt insert:
    //getters and setters:
}
