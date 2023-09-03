import java.awt.*;

public class Function_Format {
    frame frame;
    String selectedFont;
    Font arial, comicSansMs, timesNewRoman;

    public Function_Format(frame frame) {
        this.frame = frame;
    }

    public void wordWrap() {
        if (frame.wordWrapOn == false) {
            frame.wordWrapOn = true;
//            these two are for wordWrap
            frame.textArea.setLineWrap(true);
            frame.textArea.setWrapStyleWord(true);
            frame.iWrap.setText("word Wrap:On");
        } else if (frame.wordWrapOn == true) {
            frame.wordWrapOn = true;
//            these two are for wordWrap
            frame.textArea.setLineWrap(false);
            frame.textArea.setWrapStyleWord(false);
            frame.iWrap.setText("word Wrap:Off");
        }
    }

    public void createFont(int fontSize) {
        arial = new Font("Arial", Font.PLAIN, fontSize);
        comicSansMs = new Font("Comic Sans MS", Font.PLAIN, fontSize);
        timesNewRoman = new Font("Times New Roman", Font.PLAIN, fontSize);

        setFont(selectedFont);
    }

    public void setFont(String font) {
        selectedFont = font;
        switch (selectedFont) {
            case "Arial" -> frame.textArea.setFont(arial);
            case "Comic Sans Ms" -> frame.textArea.setFont(comicSansMs);
            case "Times New Roman" -> frame.textArea.setFont(timesNewRoman);
        }
    }

    public void changeColor(String color) {
        switch (color) {
            case "white" -> {
                frame.f.getContentPane().setBackground(Color.white);
                frame.textArea.setBackground(Color.white);
                frame.textArea.setForeground(Color.black);
            }
            case "Black" -> {
                frame.f.getContentPane().setBackground(Color.black);
                frame.textArea.setBackground(Color.BLACK);
                frame.textArea.setForeground(Color.white);
            }
        }
    }


}
