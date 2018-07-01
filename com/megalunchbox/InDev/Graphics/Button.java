package com.megalunchbox.InDev.Graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.LinkedList;

public class Button {

    public static LinkedList<Button> buttons = new LinkedList<Button>();


    String name;
    int id;
    float height;
    float width;
    float x;
    float y;
    Texture texture;

    //TODO: Maybe some input listeners for the buttons?

    public Button(float height, float width, float x, float y, Texture texture, String name) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.texture = texture;
        this.id = buttons.size();
        this.name = name;
        buttons.add(this);
    }

    public boolean areCoordsWithinButton(float x, float y) {
        if (x >= getX() && x <= getX() + getWidth()) {
            if (y >= getY() && y <= getY()) {
                return true;
            }
        }
        return false;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public Texture getTexture() {
        return texture;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
        buttons.set(id, this);
    }

    public void setHeight(float height) {
        this.height = height;
        buttons.set(id, this);
    }

    public void setWidth(float width) {
        this.width = width;
        buttons.set(id, this);
    }

    public void setX(float x) {
        this.x = x;
        buttons.set(id, this);
    }

    public void setY(float y) {
        this.y = y;
        buttons.set(id, this);
    }

    public void draw(SpriteBatch batch) {
        batch.draw(getTexture(), getX(), getY(), getWidth(), getHeight());
    }


}
