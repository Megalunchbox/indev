package com.megalunchbox.InDev.Graphics.Texture;

import com.badlogic.gdx.graphics.Texture;

import java.io.File;

public class Grass {

//TODO: add different grass textures or shading

    File file = new File("Textures/Grass");
    File[] directories = file.listFiles();

    String texturePaths[];

   private void createList() {
       for (int i = 0; i > directories.length; i++ ) {
           texturePaths[i] = directories[i].getName();
       }

   }

   public void genRandomTexture() {


   }

}
