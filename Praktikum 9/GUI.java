/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myapplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;

/**
 *
 * @author naufa
 */
public class GUI extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String> uniqueItems = new HashSet<>();
    Map<String, Integer> map = new HashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu", "batu"};
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        
        for (String data : datas){
            dlm.addElement(data);
            
            map.put(data, 0);
        }

        updateJumDataTersimpan();
        updateJumDataTersimpanSet();
        updateJumDataTersimpanMap();
        }
   
    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }
    
    private void updateJumDataTersimpan(){
        jLabelDataTersimpan.setText(
                            "Data tersimpan = " + items.size());
    }
    
    private void updateJumDataTersimpanSet(){
        jLabelDataTersimpan1.setText(
                            "Data tersimpan = " + uniqueItems.size());
    }
    
    private void updateJumDataTersimpanMap(){
        jLabelDataTersimpan2.setText(
                            "Data tersimpan = " + map.size());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jLabelNamaItem = new javax.swing.JLabel();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonInsertDataList = new javax.swing.JButton();
        jButtonSaveList = new javax.swing.JButton();
        jLabelDataTersimpan = new javax.swing.JLabel();
        jLabelDataTersimpan1 = new javax.swing.JLabel();
        jLabelDataTersimpan2 = new javax.swing.JLabel();
        jButtonSaveSet = new javax.swing.JButton();
        jButtonSaveMap = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jLabelNamaItem.setText("Nama Item :");

        jTextFieldNamaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaItemActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear all");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonInsertDataList.setText("<- Insert data List");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        jButtonSaveList.setText("Save to List ->");
        jButtonSaveList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveListActionPerformed(evt);
            }
        });

        jLabelDataTersimpan.setText("Data tersimpan = 0");

        jLabelDataTersimpan1.setText("Data tersimpan = 0");

        jLabelDataTersimpan2.setText("Data tersimpan = 0");

        jButtonSaveSet.setText("Save to Set->");
        jButtonSaveSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSetActionPerformed(evt);
            }
        });

        jButtonSaveMap.setText("Save to Map ->");
        jButtonSaveMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveMapActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setText("<- Insert data Set");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setText("<- Insert data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInsertDataList)
                    .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNamaItem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSaveList, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonInsertDataSet))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDataTersimpan))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSaveSet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDataTersimpan1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonInsertDataMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButtonSaveMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDataTersimpan2)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSaveList)
                            .addComponent(jLabelDataTersimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataList)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSaveSet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInsertDataSet))
                            .addComponent(jLabelDataTersimpan1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSaveMap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInsertDataMap)
                                .addGap(25, 25, 25)
                                .addComponent(jLabelNamaItem))
                            .addComponent(jLabelDataTersimpan2))
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldNamaItem.getText()); 
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaItemActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        jTextFieldNamaItem.setText(""); 
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataListActionPerformed
//        String[] items = {"buku", "meja", "kursi", "tas", "pintu"};
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataListActionPerformed

    private void jButtonSaveListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveListActionPerformed
        if(!items.isEmpty()){
            items.clear();
        }
        
        for(int i = 0; i < dlm.getSize(); i++){
            items.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveListActionPerformed

    private void jButtonSaveSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSetActionPerformed
        for(int i = 0; i < dlm.getSize(); i++){
            uniqueItems.add(dlm.getElementAt(i));
        }
   
        items.clear();
        items.addAll(uniqueItems);
        
        updateJumDataTersimpanSet();
    }//GEN-LAST:event_jButtonSaveSetActionPerformed

    private void jButtonSaveMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveMapActionPerformed
        items.clear();
        map.clear();
        
        for(int i = 0; i < dlm.getSize(); i++){
            String item = dlm.getElementAt(i);
            items.add(item);
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
        }
    }    
    updateJumDataTersimpanMap(); 
    }//GEN-LAST:event_jButtonSaveMapActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataMapActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSaveList;
    private javax.swing.JButton jButtonSaveMap;
    private javax.swing.JButton jButtonSaveSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDataTersimpan;
    private javax.swing.JLabel jLabelDataTersimpan1;
    private javax.swing.JLabel jLabelDataTersimpan2;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
