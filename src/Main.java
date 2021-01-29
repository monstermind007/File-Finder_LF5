import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame("File-Finder");
        frame.setContentPane(new new_GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        // Ben
        String test = new_GUI.getSelectedFile();
        Search.lookInAll(test, "pdf");
    }
}
