package org.example;

public class Main {
    public static void main(String[] args) {


        DBConnection.getConnection();
        System.out.println("Connected to database successfully!\n");


        DBConnection.createTable("person");


        System.out.println("--- Inserting Persons ---");
        Person p1 = new Person("A", "JS", 28);
        Person p2 = new Person("B", "ZM", 35);
        Person p3 = new Person("C", "JK", 22);
        DBConnection.insertPerson(p1);
        DBConnection.insertPerson(p2);
        DBConnection.insertPerson(p3);

        System.out.println("\n--- All Persons ---");
        for (Person p : DBConnection.getAllPerson()) {
            System.out.println(p);
        }


        System.out.println("\n--- Get Person by ID (1) ---");
        Person found = DBConnection.getPersonById(1);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("No person found with id 1");
        }


        System.out.println("\n--- Update Person with ID (2) ---");
        Person updated = new Person("R", "SM", 36);
        DBConnection.updatePerson(2, updated);


        System.out.println("\n--- All Persons After Update ---");
        for (Person p : DBConnection.getAllPerson()) {
            System.out.println(p);
        }

        System.out.println("\n--- Delete Person with ID (3) ---");
        DBConnection.deletePersonById(3);

        System.out.println("\n--- All Persons After Deletion ---");
        for (Person p : DBConnection.getAllPerson()) {
            System.out.println(p);
        }

        System.out.println();
        DBConnection.closeConnection();
    }
}