package org.launchcode.java.demos.lsn3classes1;

public class Cat {
    private String name;
    private double weight;
    private int age;
    private boolean hasClaws;

    public Cat(String name, int age, double weight, boolean hasClaws) {
        this.name = name; // this.[field name] = [parameter/argument name]
        this.age = age;
        this.weight = weight;
        this.hasClaws = hasClaws;
    }

    public Cat(String name, double weight) {
        this(name, 1, weight, true);
    }

    public void showWeight() {
        System.out.println("Your cat " + this.name + " weighs " + this.weight + " pounds.");
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public String getName() {
        return this.name;
    }

    public void setName (String aName) {
        this.name = aName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }
}
