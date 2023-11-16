package model;

import interfaces.ICharacter;

public class Mario implements ICharacter {
    private String status;
    private String name;

    public Mario(String status){
        this.status = status;
        this.name = "model.Mario";
    }

    @Override
    public String hit() {
        return "Hit";
    }

    @Override
    public String jump() {
        return "Jump";
    }

    @Override
    public String speak() {
        return "My name is "+ this.name;
    }
}
