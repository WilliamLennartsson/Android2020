package com.devCakeAB;

public class Pokemon {
    private int hp;
    private String name;
    private int attackDamage;
    private boolean isFainted;

    public Pokemon(String name, int attackDamage, int hp) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.hp = hp;
        isFainted = false;
    }

    public void attack() {
        System.out.println("Attack!");
    }

    public void getHealed() {
        System.out.println(name + " is now fully restored.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public boolean isFainted() {
        return isFainted;
    }

    public void setFainted(boolean fainted) {
        isFainted = fainted;
    }
}
