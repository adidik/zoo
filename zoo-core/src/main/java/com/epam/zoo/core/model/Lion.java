package com.epam.zoo.core.model;

/**
 * Simple lion
 *
 * @author Aleksey Didik (aleksey_didik@epam.com)
 */
public class Lion extends Animal {

    private static final int AGE_HUMANIZATION_MULTIPLIER = 5;

    public Lion(String name, int age) {
        super(name, Breed.LION, age);
    }

    @Override
    public int getHumanizeAge() {
        return getAge() * AGE_HUMANIZATION_MULTIPLIER;
    }
}
