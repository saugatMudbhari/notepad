public class Function_File {
    frame frame;

    public Function_File(frame frame) {
        this.frame = frame;
    }

    public void newFile() {
        frame.textArea.setText("");
        frame.f.setTitle("New");
    }
}
