package me.dio.bootcampsantanderdevweek.domain.model;

public class Card {
    private String number;
    private double limit;

    // Construtor
    public Card(String number, double limit) {
        this.number = number;
        this.limit = limit;
    }

    // Getters e Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", limit=" + limit +
                '}';
    }
}
