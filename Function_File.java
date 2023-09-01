import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

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
        fileName = null;
        fileAddress = null;
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

    public void save() {

        if (fileName == null) {
            saveAs();
        } else {
            try {
                FileWriter fw = new FileWriter(fileAddress + fileName);
                fw.write(frame.textArea.getText());
                fw.close();
            } catch (Exception e) {
                System.out.println("k vayo vayo");
            }
        }
    }

    public void saveAs() {
        FileDialog fd = new FileDialog(frame.f, "save", FileDialog.SAVE);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            frame.f.setTitle(fileName);
        }
        try {
            FileWriter fw = new FileWriter(fileAddress + fileName);
            fw.write(frame.textArea.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("k vayo vayo");
        }
    }

    public void exit()
    {
        System.exit(0);
    }
}
