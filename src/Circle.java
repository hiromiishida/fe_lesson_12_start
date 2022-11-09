import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Circle {
    public void draw() {
        String htmlBody = "<ellipse cx=400 cy=300 rx=200 ry=100 fill=blue />";
        execute(htmlBody);
    }

    private void execute(String htmlBody) {
        try {
            File file = new File("shape.html");
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(htmlBody);
            filewriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
