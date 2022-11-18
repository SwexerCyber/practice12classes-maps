package com.company;

public class Students {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public int hashCode() {
        int res = 19;
        res = 31 * res + name.hashCode();
        res = 31 * res + surname.hashCode();
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        Students st = (Students) obj;
        return name.equals(st.name) && surname.equals(st.surname);
    }
}
