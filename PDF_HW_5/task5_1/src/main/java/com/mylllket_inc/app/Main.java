package com.mylllket_inc.app;


import com.mylllket_inc.app.API.DirectoryExplorer;
import com.mylllket_inc.app.API.Reader;
import com.mylllket_inc.app.API.Writer;
import com.mylllket_inc.app.Exceptions.NoSuchDirectoryException;
import com.mylllket_inc.app.Exceptions.NoSuchFileException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static void instructionsList() {
        System.out.println("cd - Change directory");
        System.out.println("dir - List files and directories");
        System.out.println("read <filename> - Read file");
        System.out.println("write <filename> <true/false> <text> - Write to file if false. Append if true");
        System.out.println("create <filename> - Create a new file");
    }

    public static void main(String[] args) {
        instructionsList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            if (command.equals("dir")) {
                System.out.println(DirectoryExplorer.getCurrentDirectoryList());
            } else {
                switch (parts[0].toLowerCase()) {

                    case "cd":
                        try {
                            DirectoryExplorer.setCurrentDirectory(parts[1]);
                        } catch (NoSuchDirectoryException e) {
                            e.message();
                        }
                        break;

                    case "read":
                        try {
                            System.out.println(Reader.read(parts[1]));
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (NoSuchFileException e) {
                            e.message();
                        }
                        break;

                    case "write":
                        if (parts.length < 3)
                            break;
                        else {
                            switch (parts[2].toLowerCase()) {
                                case "true":
                                    try {
                                        Writer.write(parts[1], parts[3], true);
                                    } catch (NoSuchFileException e) {
                                        e.printStackTrace();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case "false":
                                    try {
                                        Writer.write(parts[1], parts[3], false);
                                    } catch (NoSuchFileException e) {
                                        e.printStackTrace();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        }
                        break;

                    case "create":
                        try {
                            DirectoryExplorer.createFile(parts[1]);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case "quite":
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
