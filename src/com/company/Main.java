package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {

        File dirGames = new File("Games");
        newDir(dirGames);

        File dirSrt = new File("Games//srt");
        newDir(dirSrt);

        File dirStrMain = new File("Games//srt//main");
        newDir(dirStrMain);

        File fileMain = new File("Games//srt//main//Main.java");
        newFile(fileMain);

        File fileUtils = new File("Games//srt//main//Utils.java");
        newFile(fileUtils);

        File dirSrtTest = new File("Games//srt//test");
        newDir(dirSrtTest);

        File dirRes = new File("Games//res");
        newDir(dirRes);

        File dirResDrawables = new File("Games//res//drawables");
       newDir(dirResDrawables);

        File dirResVectors = new File("Games//res//vectors");
        newDir(dirResVectors);

        File dirResIcons = new File("Games//res//icons");
        newDir(dirResIcons);

        File dirSavegames = new File("Games//savegames");
        newDir(dirSavegames);

        File dirTemp = new File("Games//temp");
        newDir(dirTemp);

        File fileTemp = new File("Games//temp//temp.txt");
        newFile(fileTemp);

        try (FileWriter writer = new FileWriter("Games//temp//temp.txt", false)) {
            writer.write(stringBuilder.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void newFile(File file){
        try {
            if (file.createNewFile()){
                stringBuilder.append("Файл " + file.getName() + " создан" + "\n");
            }else stringBuilder.append("невозможно создать файл " + file.getName() + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void newDir(File file){
        if (file.mkdir()){
            stringBuilder.append("Каталог " + file.getName() + " создан" + "\n");
        }else stringBuilder.append("невозможно создать каталог " + file.getName() +  "\n");



    }
}
