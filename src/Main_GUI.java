import com.company.ReplaceFileExtension;

import javax.swing.*;

public class Main_GUI {

    public static void main(String[] args){
        JFrame frame = new JFrame("File-Finder");
        frame.setContentPane(new new_GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
