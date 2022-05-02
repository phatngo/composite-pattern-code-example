package com.example.pattern.client;

import com.example.pattern.model.FileComponent;
import com.example.pattern.model.FileLeaf;
import com.example.pattern.model.FolderComposite;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("file 1", 10);
        FileComponent file2 = new FileLeaf("file 2", 5);
        FileComponent file3 = new FileLeaf("file 3", 12);

        List<FileComponent> files = Arrays.asList(file1, file2, file3);
        FileComponent folder = new FolderComposite(files);

        List<FileComponent> files_2 = Arrays.asList(folder);
        FileComponent folder_2 = new FolderComposite(files_2);

        //folder.showProperty();
        folder_2.showProperty();
        //System.out.println("Total Size: " + folder.totalSize());
        System.out.println("Total Size: " + folder_2.totalSize());
    }
}
