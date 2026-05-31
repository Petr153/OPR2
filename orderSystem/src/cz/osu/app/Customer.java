package cz.osu.app;

import cz.osu.Exceptions.EmptyValueException;
import cz.osu.Exceptions.InvalidEmailException;

public class Customer {

    private String name;
    private String email;

    public Customer(String name, String email)
            throws EmptyValueException, InvalidEmailException {

        if (name == null || name.isBlank()) {
            throw new EmptyValueException("Jméno nesmí být prázdné");
        }

        if (email == null || email.isBlank()) {
            throw new EmptyValueException("Email nesmí být prázdný");
        }

        if (!email.contains("@") || !(email.endsWith(".cz") || email.endsWith(".com"))) {
            throw new InvalidEmailException("Neplatný email");
        }

        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}