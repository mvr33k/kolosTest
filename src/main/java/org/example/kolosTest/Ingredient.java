package org.example.kolosTest;

public class Ingredient {
    public Ingredient(String string, int integer) {
        this.string = string;
        this.integer = integer;
    }

    private int integer;

    private String string;

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
