import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Square {
    public void draw(){
        String htmlBody = "<rect x=100 y=50 width=300 height=200 fill=red />";
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
