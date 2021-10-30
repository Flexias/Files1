package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        File dirSrt = new File("E://Games//srt");
        if (dirSrt.mkdir())
            stringBuilder.append("Каталог " + dirSrt.getName() + " создан" + "\n");

            File dirStrMain = new File("E://Games//srt//main");
            if (dirStrMain.mkdir())
                stringBuilder.append("Каталог " + dirStrMain.getName() + " создан" + "\n");

                File fileMain = new File("E://Games//srt//main//Main.java");
                try {
                 if (fileMain.createNewFile())
                     stringBuilder.append("Файл " + fileMain.getName() + " создан" + "\n");
                }catch (IOException ex){
                 System.out.println(ex.getMessage());
                }

                File fileUtils = new File("E://Games//srt//main//Utils.java");
                 try {
                      if (fileUtils.createNewFile())
                          stringBuilder.append("Файл " + fileUtils.getName() + " создан" + "\n");
                 }catch (IOException ex){
                 System.out.println(ex.getMessage());
                 }

        File dirSrtTest = new File("E://Games//srt//test");
        if (dirSrt.mkdir())
            stringBuilder.append("Каталог " + dirSrtTest.getName() + " создан" + "\n");


        File dirRes = new File("E://Games//res");
        if (dirRes.mkdir())
            stringBuilder.append("Каталог " + dirRes.getName() + " создан" + "\n");

            File dirResDrawables = new File("E://Games//res//drawables");
            if (dirResDrawables.mkdir())
                stringBuilder.append("Каталог " + dirResDrawables.getName() + " создан" + "\n");

            File dirResVectors = new File("E://Games//res//vectors");
            if (dirResVectors.mkdir())
                stringBuilder.append("Каталог " + dirResVectors.getName() + " создан" + "\n");

            File dirResIcons = new File("E://Games//res//icons");
            if (dirResIcons.mkdir())
                stringBuilder.append("Каталог " + dirResIcons.getName() + " создан" + "\n");


        File dirSavegames = new File("E://Games//savegames");
        if (dirSavegames.mkdir())
            stringBuilder.append("Каталог " + dirSavegames.getName() + " создан" + "\n");

        File dirTemp = new File("E://Games//temp");
        if (dirTemp.mkdir())
            stringBuilder.append("Каталог " + dirTemp.getName() + " создан" + "\n");

            File fileTemp = new File("E://Games//temp//temp.txt");
            try {
                if (fileTemp.createNewFile())
                    stringBuilder.append("Файл " + fileTemp.getName() + " создан" + "\n");
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }

        try(FileWriter writer = new FileWriter("E://Games//temp//temp.txt", false)) {
            writer.write(stringBuilder.toString());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
