package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Main class of the program for working with educational institutions.
 */
public class App
{
    /**
     * Main method of the program, invoked at startup.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main( String[] args )
    {
        // Creating an array of Institution objects
        Institution[] institutions = {
                new Institution("University", "Kyiv Polytechnic Institute", "Kyiv", 1898, 35000),
                new Institution("College", "Lviv Technical College", "Lviv", 1965, 5000),
                new Institution("University", "Odessa State University", "Odessa", 1865, 25000),
                new Institution("College", "Zaporizhia Technical College", "Zaporizhia", 1980, 4000),
                new Institution("University", "Lviv Polytechnic National University", "Lviv", 1844, 20000),
                new Institution("Lyceum", "Ostrog Lyceum #1", "Ostrog", 1982, 745),
                new Institution("College", "Kherson Medical College", "Kherson", 1972, 3500),
                new Institution("University", "Ivano-Frankivsk National Technical University", "Ivano-Frankivsk", 1960, 15000),
        };

        // Sorting institutions by the number of students in ascending order
        Arrays.sort(institutions);
        System.out.println("\nСортування за кількістю студентів у зростаючому порядку:");
        for (Institution institution : institutions) {
            System.out.println(institution.getName() + ": " + institution.getStudents());
        }

        // Sorting institutions by the year of foundation in descending order
        Arrays.sort(institutions, Comparator.comparingInt(Institution::getYearOfFoundation).reversed());
        System.out.println("\nСортування за роком заснування у спадаючому порядку:");
        for (Institution institution : institutions) {
            System.out.println(institution.getName() + ": " + institution.getYearOfFoundation());
        }
    }
}
