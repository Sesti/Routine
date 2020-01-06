package com.example.routine;

import android.net.Uri;

public class Step {

    private String name;
    private int image;
    private Type type;

    public Step(String _name, int _image, Type _type){
        name = _name;
        image = _image;
        type = _type;
    }

    public Step(String _name, int _image){
        this(_name, _image, Type.NORMAL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private enum Type{
        NORMAL,
        TIMER
    }
}


