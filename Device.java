package com.company.device;

public class Device {
    private int price;
    private int number;
    private String naming;
    private int releaseDate;
    private int power;
    private boolean isWireless; // Беспроводная
    private boolean isTurnedOn;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    @Override
    public String toString() {
        return "price: " + price + "$" + " | " + "number: " +
                number + " | " + "naming: " + "NDV8" + naming + " | " + "releaseDate: " +
                releaseDate + " | " + "power: " + power + "W" + " | " + "wireless: " +
                isWireless + " | " + "active: " + isTurnedOn + " |";
    }
}
