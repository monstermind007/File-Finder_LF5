import com.company.ReplaceFileExtension;
import com.company.Search;

import java.awt.*;
import java.awt.event.*;
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

                /*

                MICHEL

                 */

                // List-Panel-Right
                DefaultListModel Test = new DefaultListModel<>();
                Test.addElement(new_GUI.getSelectedDirectory()); // <-- Hier müssen alle funktionierende Files rein aber wie?
                list2.setModel(Test);

                // List-Panel-Left
                /*
                DefaultListModel Test = new DefaultListModel<>();
                Test.addElement(Search.hi);
                list2.setModel(Test); */

            }
            String test = new_GUI.getSelectedDirectory();
            Search.lookInAll(test, "pdf");
            ReplaceFileExtension.renameDamaged("C:\\Users\\kaiha_wo2fl1k\\IdeaProjects\\File-Finder_LF5\\Beschädigt.json", "testObjektCustom");

    }

    private void button2ActionPerformed(ActionEvent e) {
        DefaultListModel model = (DefaultListModel) list2.getModel();
        int selectedIndex = list2.getSelectedIndex();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        }
    }

    private void checkBox1ActionPerformed(ActionEvent e) {

    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kai Jakob Hartwich
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        list2 = new JList();
        list3 = new JList();
        button1 = new JButton();
        button2 = new JButton();
        checkBox1 = new JCheckBox();
        label2 = new JLabel();
        label6 = new JLabel();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(46, 49, 50));
            panel1.setMaximumSize(new Dimension(1006, 523));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r"
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

            //---- list2 ----
            list2.setBorder(new MatteBorder(1, 1, 1, 1, new Color(76, 80, 82)));
            list2.setForeground(Color.white);
            list2.setBackground(new Color(46, 49, 50));
            list2.setFont(new Font("Arial", Font.PLAIN, 11));

            //---- list3 ----
            list3.setBorder(new MatteBorder(1, 1, 1, 1, new Color(76, 80, 82)));
            list3.setBackground(new Color(46, 49, 50));
            list3.setForeground(Color.white);
            list3.setFont(new Font("Arial", Font.PLAIN, 11));

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

            //---- checkBox1 ----
            checkBox1.setText("Select All");
            checkBox1.setFont(new Font("Arial", Font.PLAIN, 20));
            checkBox1.setBackground(new Color(46, 49, 50));
            checkBox1.setForeground(Color.white);
            checkBox1.setFocusPainted(false);
            checkBox1.addActionListener(e -> checkBox1ActionPerformed(e));

            //---- label2 ----
            label2.setText("*Broken files");
            label2.setForeground(Color.white);

            //---- label6 ----
            label6.setText("Working files*");
            label6.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                                .addGap(260, 260, 260)))
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(list3, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(list2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label6)
                                .addContainerGap())))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(label5)
                            .addComponent(label1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2)
                            .addComponent(checkBox1))
                        .addGap(1, 1, 1)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(list3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addComponent(list2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kai Jakob Hartwich
    public JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JList list2;
    private JList list3;
    private JButton button1;
    private JButton button2;
    private JCheckBox checkBox1;
    private JLabel label2;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
