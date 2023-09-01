import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Function_File {
    frame frame;
    String fileName;
    String fileAddress;

    public Function_File(frame frame) {
        this.frame = frame;
    }

    public void newFile() {
        frame.textArea.setText("");
        frame.f.setTitle("New");
    }

    public void open() {
        FileDialog fd = new FileDialog(frame.f, "Open", FileDialog.LOAD);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            frame.f.setTitle(fileName);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            frame.textArea.setText("");
            String line = null;
            while ((line = br.readLine()) != null) {
                frame.textArea.append(line + '\n');
            }
            br.close();
        } catch (Exception e) {
            System.out.println("FILE NOT OPENED");
        }
    }
}
