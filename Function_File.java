import java.awt.*;

public class Function_File {
    frame frame;

    public Function_File(frame frame) {
        this.frame = frame;
    }

    public void newFile() {
        frame.textArea.setText("");
        frame.f.setTitle("New");
    }
    public void open()
    {
        FileDialog fd= new FileDialog(frame.f,"Open",FileDialog.LOAD);
        fd.setVisible(true);
    }
}
