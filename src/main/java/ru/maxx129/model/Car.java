package ru.maxx129.model;

public class Car {

    private Integer id;
    private String model;
    private User owner;

    public Car(Integer id, String model, User owner) {
        this.id = id;
        this.model = model;
        this.owner = owner;
    }

    public Car() {

    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public User getOwner() {
        return owner;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
