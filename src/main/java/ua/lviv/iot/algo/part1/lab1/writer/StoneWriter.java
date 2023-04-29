package ua.lviv.iot.algo.part1.lab1.writer;

import lombok.Getter;
import lombok.Setter;
import ua.lviv.iot.algo.part1.lab1.modules.Stone;

import java.io.FileWriter;
import java.util.List;

@Getter
@Setter
public class StoneWriter {
    public void writeToFile(List<Stone> stones, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
                if (stones.isEmpty() || stones == null) {
                    return;
                }
            for (Stone stone : stones) {
                String headers = stone.getHeaders();
                writer.write(headers);
                String csv = stone.toCSV();
                writer.write(csv);
            }
            System.out.println("Дані успішно записані у файл " + fileName);
        } catch (Exception e) {
            System.out.println("Помилка при записі у файл " + fileName + ": " + e.getMessage());
        }
    }
}