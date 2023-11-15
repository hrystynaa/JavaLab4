package org.example;

/**
 * Class representing an educational institution.
 */
public class Institution implements Comparable<Institution> {
    // Fields
    public String type;
    public String name;
    public String localization;
    public int yearOfFoundation;
    public int students;

    /**
     * Constructor to initialize an Institution object.
     *
     * @param type              Type of the institution.
     * @param name              Name of the institution.
     * @param localization      Location of the institution.
     * @param yearOfFoundation  Year of foundation of the institution.
     * @param students          Number of students in the institution.
     */
    public Institution(String type, String name, String localization, int yearOfFoundation, int students) {
        this.type = type;
        this.name = name;
        this.localization = localization;
        this.yearOfFoundation = yearOfFoundation;
        this.students = students;
    }

    /**
     * Implementation of the compareTo method for comparing institutions based on the number of students.
     *
     * @param i Another Institution object to compare to.
     * @return Negative, zero, or positive integer depending on whether this object is less than, equal to,
     *         or greater than the specified object.
     */
    @Override
    public int compareTo(Institution i) {
        return Integer.compare(this.students, i.students);
    }

    /**
     * Getter method to retrieve the name of the institution.
     *
     * @return The name of the institution.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to retrieve the year of foundation of the institution.
     *
     * @return The year of foundation of the institution.
     */
    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    /**
     * Getter method to retrieve the number of students in the institution.
     *
     * @return The number of students in the institution.
     */
    public int getStudents() {
        return students;
    }
}
