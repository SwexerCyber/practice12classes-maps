package com.company;

public class Groups {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Groups(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return group;
    }
}
