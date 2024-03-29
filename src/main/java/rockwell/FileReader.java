package rockwell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {
    public static String readFileFromResources(String fileName) throws IOException {

        InputStream inputStream = FileReader.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IOException("File not found in resources: " + fileName);
        }

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line);
            //    content.append("\n");
            }
        }

        return content.toString();
    }
}