package com.me;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        try{
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);
//                Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir2/Dir3/Dir4/Dir5/Dir6");
//                Files.createDirectories(dirToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(dirToCreate);
            Path filePath = FileSystems.getDefault().getPath("Examples","Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last Modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath,BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last Modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("is regular file = " + attrs.isRegularFile());

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Files.move(fileToMove,destination);

//            Path sourceFile = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
//        //Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
////        Path path = Paths.get(".","files", "subdirectory.txt");
////        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files","subdirectory.txt");
////        printFile(filePath);
//
//            Path path3 = FileSystems.getDefault().getPath("thisfiledoesnotexist.txt");
//            System.out.println(path3.toAbsolutePath());
//
//            Path path4 = Paths.get("/files/test","whatever.txt");
//            System.out.println(path4.toAbsolutePath());
//
//            Path filePath = FileSystems.getDefault().getPath("files");
//            System.out.println("exist = " + Files.exists(filePath));
//
//            System.out.println("exist = " + Files.exists(path4));
//
//    }
//
//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while ((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }

}
