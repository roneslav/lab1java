package ua.lviv.iot.algo.part1.lab1;

//import com.opencsv.CSVWriter;
import lombok.Getter;
import lombok.Setter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Getter
@Setter
public class StoneWriter {
    public void writeToFile (List<Stone> stones, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Stone stone : stones) {
                String headers = stone.getHeaders();
                writer.write(headers);
                String csvRow = stone.toCSV();
                writer.write(csvRow);
            }
            System.out.println("Дані успішно записані у файл " + fileName);
        } catch (Exception e) {
            System.out.println("Помилка при записі у файл " + fileName + ": " + e.getMessage());
        }
    }}