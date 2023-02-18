package com.nikhil.containers.frontendorchestrator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Card {

    @Id
    private String number;
    private String type;
    private String expiration;
    private String owner;

    public Card() {
    }

    public Card(String type, String number, String expiration, String owner) {
        this.type = type;
        this.number = number;
        this.expiration = expiration;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Objects.equals(getType(), card.getType()) &&
                Objects.equals(getNumber(), card.getNumber()) &&
                Objects.equals(getExpiration(), card.getExpiration()) &&
                Objects.equals(getOwner(), card.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getNumber(), getExpiration(), getOwner());
    }

    @Override
    public String toString() {
        return "Card{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", expiration='" + expiration + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
