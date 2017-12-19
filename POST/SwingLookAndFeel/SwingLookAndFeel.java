package com.pellegrinoprincipe;

import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SwingLookAndFeel extends javax.swing.JFrame
{
    private javax.swing.JColorChooser ColorChooser;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel PANEL;
    private javax.swing.JSpinner Spinner;
    private javax.swing.JButton button;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JList<String> jList1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel label;
    private javax.swing.JMenu myMenu;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JRadioButton radiobutton;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JScrollPane scrollPane3;
    private javax.swing.JScrollPane scrollPane4;
    private javax.swing.JSlider slider;
    private javax.swing.JTable table;
    private javax.swing.JTextField textfield;
	
    public SwingLookAndFeel()
    {
        initComponents();
    }

    private void initComponents()
    {
        PANEL = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        checkbox = new javax.swing.JCheckBox();
        radiobutton = new javax.swing.JRadioButton();
        textfield = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        scrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        progressbar = new javax.swing.JProgressBar();
        FileChooser = new javax.swing.JFileChooser();
        ColorChooser = new javax.swing.JColorChooser();
        Spinner = new javax.swing.JSpinner();
        scrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        scrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        slider = new javax.swing.JSlider();
        MenuBar = new javax.swing.JMenuBar();
        myMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Look And Feel Demo");

        PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Swing Widget"));

        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Sono una label!!!");

        button.setText("Sono un pulsante!!!");

        checkbox.setText(" check box...");

        radiobutton.setText("radio button...");

        textfield.setText("Sono un text field!!!");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Sono\nuna\ntext area\n!!!");
        scrollPane1.setViewportView(jTextArea1);

        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Sono", "una", "lista", "!!!" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPane2.setViewportView(jList1);

        progressbar.setMaximum(0);
        progressbar.setIndeterminate(true);

        FileChooser.setCurrentDirectory(null);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Items");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("colors");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("sports");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        scrollPane3.setViewportView(jTree1);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Pellegrino", "Principe", "45", "Napoli"},
                {"Mario", "Rossi", "44", "Roma"},
                {"Paolo", "Verdi", "20", "Milano"},
                {"Alfredo", "Gialli", "33", "Ancona"}
            },
            new String []
            {
                "Nome", "Cognome", "Et\u00E0", "Citt\u00E0" // \u00E0 -> à
            }
        ));
        scrollPane4.setViewportView(table);

        slider.setMajorTickSpacing(5);
        slider.setMaximum(20);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setValue(0);

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(811, Short.MAX_VALUE))
            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANELLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollPane4)
                        .addGroup(PANELLayout.createSequentialGroup()
                            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollPane3)
                                .addComponent(scrollPane2)
                                .addComponent(scrollPane1)
                                .addComponent(radiobutton)
                                .addComponent(checkbox)
                                .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textfield)
                                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))))
                    .addContainerGap(216, Short.MAX_VALUE)))
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLayout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PANELLayout.createSequentialGroup()
                            .addComponent(label)
                            .addGap(18, 18, 18)
                            .addComponent(button)
                            .addGap(11, 11, 11)
                            .addComponent(checkbox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radiobutton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 257, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PANELLayout.createSequentialGroup()
                            .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(FileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        myMenu.setText("Look And Feel");
        MenuBar.add(myMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }

    private void initLookAndFeelMenu()
    {
        final UIManager.LookAndFeelInfo plaf[] = UIManager.getInstalledLookAndFeels();

        for (int i = 0, n = plaf.length; i < n; i++)
        {
            JMenuItem menuItem = new JMenuItem();
            menuItem.setText(plaf[i].getName());

            menuItem.addActionListener((ActionEvent evt) -> // lambda expr.
            {
                JMenuItem itemSeleced = (JMenuItem) evt.getSource();
                int ix = itemSeleced.getParent().getComponentZOrder(itemSeleced);

                try
                {
                    UIManager.setLookAndFeel(plaf[ix].getClassName());
                    SwingUtilities.updateComponentTreeUI(SwingLookAndFeel.this);
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(this, ex);
                }
            });

            myMenu.add(menuItem);
        }
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> // lambda expr.
        {
            SwingLookAndFeel slf = new SwingLookAndFeel();
            slf.setVisible(true);
            slf.initLookAndFeelMenu();
        });
    }
}
