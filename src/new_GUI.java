import com.company.Search;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/*
 * Created by JFormDesigner on Wed Jan 27 16:51:05 CET 2021
 */



/**
 * @author unknown
 */
public class new_GUI {

    private static String FILE_PATH;

    public static String getFilePath() {
        return FILE_PATH;
    }

    public static String selectedDirectory;

    public static String getSelectedDirectory() {
        return selectedDirectory;
    }

    public new_GUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setDialogTitle("Select a Directory");
            fc.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF files", "pdf");
            fc.addChoosableFileFilter(filter);

            int returnValue = fc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedDirectory = fc.getSelectedFile() +"\\";

                // List-Panel-Right
                DefaultListModel panelR = new DefaultListModel<>();
                scrollPane1.setViewportView(list2);
                panel1.add(scrollPane1);
                String test = new_GUI.getSelectedDirectory();
                Search.lookInAll(test, "pdf");
                for (int k = 0; k < Search.PathArray.size(); k++){
                    panelR.addElement(Search.PathArray.get(k));
                    System.out.println("Working:  "+Search.PathArray.get(k));
                }
                Search.PathArray.clear();
                list2.setModel(panelR);


                // List-Panel-Left
                DefaultListModel panelL = new DefaultListModel<>();
                for (int l = 0; l < Search.PathArrayDamaged.size(); l++){
                    panelL.addElement(Search.PathArrayDamaged.get(l));
                    System.out.println("Damaged:  "+Search.PathArrayDamaged.get(l));
                }
                Search.PathArrayDamaged.clear();
                list3.setModel(panelL);
            }

    }

    private void button2ActionPerformed(ActionEvent e) {
        // CODE KOMMT HIER REIN FÜR JASMINS TEIL
    }


    /*
    private void button2ActionPerformed(ActionEvent e) {
        DefaultListModel model = (DefaultListModel) list3.getModel();
        FILE_PATH = list3.getSelectedValue().toString();
            if (new_GUI.deleteFiles(FILE_PATH)) {
                System.out.println("File is deleted!");
            } else {
                System.err.println("Failed to delete file.");
            }
            model.removeElement(FILE_PATH);
        }

    public static boolean deleteFiles(String filePath){
        File file = new File(new_GUI.getFilePath());
        return file.delete();
    }
    */



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kai Jakob Hartwich
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        list2 = new JList();
        scrollPane2 = new JScrollPane();
        list3 = new JList();
        label8 = new JLabel();
        label9 = new JLabel();
        button3 = new JButton();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(46, 49, 50));
            panel1.setMaximumSize(new Dimension(1006, 523));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- label1 ----
            label1.setText("File-Finder");
            label1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 48));
            label1.setForeground(Color.white);
            label1.setBackground(new Color(46, 49, 50));

            //---- label3 ----
            label3.setText("text");
            label3.setIcon(new ImageIcon(getClass().getResource("/images/file (1).png")));
            label3.setForeground(Color.white);
            label3.setBackground(new Color(46, 49, 50));

            //---- label4 ----
            label4.setText("text");
            label4.setIcon(new ImageIcon(getClass().getResource("/images/file (2).png")));
            label4.setBackground(new Color(46, 49, 50));

            //---- label5 ----
            label5.setText("text");
            label5.setIcon(new ImageIcon(getClass().getResource("/images/36636378 (2) (1).png")));
            label5.setBackground(new Color(46, 49, 50));

            //---- button1 ----
            button1.setText("Choose File");
            button1.setFont(new Font("Arial", Font.BOLD, 22));
            button1.setForeground(Color.white);
            button1.setBackground(new Color(76, 80, 82));
            button1.setFocusPainted(false);
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button2 ----
            button2.setText("Delete");
            button2.setFont(new Font("Arial", Font.PLAIN, 20));
            button2.setBackground(new Color(76, 80, 82));
            button2.setForeground(Color.white);
            button2.setFocusPainted(false);
            button2.addActionListener(e -> button2ActionPerformed(e));

            //---- label2 ----
            label2.setText("*Broken files");
            label2.setForeground(Color.white);

            //---- label6 ----
            label6.setText("Working files*");
            label6.setForeground(Color.white);

            //======== scrollPane1 ========
            {
                scrollPane1.setBackground(new Color(46, 49, 50));

                //---- list2 ----
                list2.setBorder(new MatteBorder(1, 1, 1, 1, new Color(76, 80, 82)));
                list2.setForeground(Color.white);
                list2.setBackground(new Color(46, 49, 50));
                list2.setFont(new Font("Arial", Font.PLAIN, 10));
                scrollPane1.setViewportView(list2);
            }

            //======== scrollPane2 ========
            {
                scrollPane2.setBackground(new Color(46, 49, 50));

                //---- list3 ----
                list3.setBorder(new MatteBorder(1, 1, 1, 1, new Color(76, 80, 82)));
                list3.setForeground(Color.white);
                list3.setBackground(new Color(46, 49, 50));
                list3.setFont(new Font("Arial", Font.PLAIN, 10));
                scrollPane2.setViewportView(list3);
            }

            //---- label8 ----
            label8.setText("text");
            label8.setIcon(new ImageIcon(getClass().getResource("/images/39220 (1).png")));

            //---- label9 ----
            label9.setText("text");
            label9.setIcon(new ImageIcon(getClass().getResource("/images/39220 (1).png")));

            //---- button3 ----
            button3.setText("Rename to .damaged");
            button3.setFont(new Font("Arial", Font.PLAIN, 20));
            button3.setBackground(new Color(76, 80, 82));
            button3.setForeground(Color.white);
            button3.setFocusPainted(false);
            button3.addActionListener(e -> button2ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label2)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label6)))
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(label5)
                            .addComponent(label1))
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label6)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label9)
                                .addComponent(button2)
                                .addComponent(button3))
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kai Jakob Hartwich
    private JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JList list2;
    private JScrollPane scrollPane2;
    private JList list3;
    private JLabel label8;
    private JLabel label9;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
