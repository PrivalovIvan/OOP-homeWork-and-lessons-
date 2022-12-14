package src.personal.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FileOperationJson implements FileOperation {
    private String fileName;

    public FileOperationJson(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<User> readAllLines() throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(fileName));
        List<User> list = Arrays.asList(gson.fromJson(reader, User[].class));
        reader.close();
        return list;
    }

    @Override
    public void saveAllLines(List<User> list) throws IOException {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            gson.toJson(list, writer);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}