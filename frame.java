import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame implements ActionListener {
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar = new JMenuBar();
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem iNew, iOPen, iSave, iSaveAs, iExit;
    Function_File file = new Function_File(this);
    JFrame f = new JFrame("Notepad");

    public frame() {
        textArea();
        createMenuBar();
        createFileMenu();
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
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("SaveAs");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "New" -> file.newFile();
            case "Open" -> file.open();
        }
    }
}
