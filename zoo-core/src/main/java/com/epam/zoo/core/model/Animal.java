package com.epam.zoo.core.model;

/**
 * Main animal representation
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public abstract class Animal {

    private String name;
    private Breed breed;
    private int age;

    public Animal(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public abstract int getHumanizeAge();
}
