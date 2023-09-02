import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame implements ActionListener {
    JTextArea textArea;
    JScrollPane scrollPane;
    boolean wordWrapOn = false;
    JMenuBar menuBar = new JMenuBar();
    //    this is used for main menu
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    //    this is used for sub-menu
    JMenuItem iNew, iOPen, iSave, iSaveAs, iExit;
    JMenuItem iWrap, iFontArial, iFontCSMS, iFontTNR, iFontSize8, iFontSize16, iFontSize20, iFontSize24, iFontSize28;
    JMenu menuFont, menuFontSize;
    Function_File file = new Function_File(this);
    Function_Format format = new Function_Format(this);
    JFrame f = new JFrame("Notepad");

    public frame() {
        textArea();
        createMenuBar();
        createFileMenu();
        createFormatMenu();
        format.selectedFont="Arial";
        format.createFont(16);
        createWindow();

    }

    public void createWindow() {
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void textArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//     disable the border
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        f.add(scrollPane);

    }

    public void createMenuBar() {
//        menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);
//        create a individual menu bar
        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);

        menuColor = new JMenu("Color");
        menuBar.add(menuColor);
    }

    public void createFileMenu() {
//        making sub-menu this item of menuFile so..
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);

        iOPen = new JMenuItem("Open");
        iOPen.addActionListener(this);
        iOPen.setActionCommand("Open");
        menuFile.add(iOPen);

        iSave = new JMenuItem("Save");
        iSave.addActionListener(this);
        iSave.setActionCommand("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("SaveAs");
        iSaveAs.addActionListener(this);
        iSaveAs.setActionCommand("SaveAs");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        iExit.addActionListener(this);
        iExit.setActionCommand("Exit");
        menuFile.add(iExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "New" -> file.newFile();
            case "Open" -> file.open();
            case "Save" -> file.save();
            case "SaveAs" -> file.saveAs();
            case "Exit" -> file.exit();
            case "Word Wrap" -> format.wordWrap();
            case "Arial" -> format.setFont(command);
            case "Comic Sans Ms" -> format.setFont(command);
            case "TimesNewRoman" -> format.setFont(command);

            case "8" -> format.createFont(8);
            case "16" -> format.createFont(16);
            case "20" -> format.createFont(20);
            case "24" -> format.createFont(24);
            case "28" -> format.createFont(28);
        }
    }

    public void createFormatMenu() {
        iWrap = new JMenuItem("Word wrap:off");
        iWrap.addActionListener(this);
        iWrap.setActionCommand("Word Wrap");
        menuFormat.add(iWrap);

        menuFont = new JMenu("Font");
        menuFormat.add(menuFont);

        iFontArial = new JMenuItem("Arial");
        iFontArial.addActionListener(this);
        iFontArial.setActionCommand("Arial");
        menuFont.add(iFontArial);

        iFontCSMS = new JMenuItem("Comic Sans Ms");
        iFontCSMS.addActionListener(this);
        iFontCSMS.setActionCommand("Comic Sans Ms");
        menuFont.add(iFontCSMS);

        iFontTNR = new JMenuItem("TimesNewRoman");
        iFontTNR.addActionListener(this);
        iFontTNR.setActionCommand("TimesNewRoman");
        menuFont.add(iFontTNR);


        menuFontSize = new JMenu("Font size");
        menuFormat.add(menuFontSize);


        iFontSize8 = new JMenuItem("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("8");
        menuFontSize.add(iFontSize8);

        iFontSize16 = new JMenuItem("16");
        iFontSize16.addActionListener(this);
        iFontSize16.setActionCommand("16");
        menuFontSize.add(iFontSize8);

        iFontSize20 = new JMenuItem("20");
        iFontSize20.addActionListener(this);
        iFontSize20.setActionCommand("20");
        menuFontSize.add(iFontSize8);

        iFontSize24 = new JMenuItem("24");
        iFontSize24.addActionListener(this);
        iFontSize24.setActionCommand("24");
        menuFontSize.add(iFontSize24);

        iFontSize28 = new JMenuItem("28");
        iFontSize28.addActionListener(this);
        iFontSize28.setActionCommand("28");
        menuFontSize.add(iFontSize28);

    }
}
