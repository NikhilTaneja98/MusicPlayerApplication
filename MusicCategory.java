
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MusicCategory extends javax.swing.JFrame {
   
    String selectedcat;
    String user=GlobalData.nameofuser;
    MusicCategory() {
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = d.width;
        int h = d.height;
        jLabel4.setText(user);
        jLabel8.setSize(w,h);
        setSize(d);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        English = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage (5).jpg")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 220, 250, 425);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("English");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(980, 660, 130, 30);

        English.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage (7).jpg")); // NOI18N
        English.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EnglishMouseReleased(evt);
            }
        });
        getContentPane().add(English);
        English.setBounds(920, 230, 250, 425);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Punjabi ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 660, 130, 30);

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage.png")); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(660, 20, 70, 70);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 90, 280, 50);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage (4).jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1920, 150);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hindi");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 660, 130, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage (6).jpg")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 220, 250, 425);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage (8).jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1500, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        selectedcat="Punjabi";
        System.out.println(selectedcat);
        musicplayer pp=new musicplayer(selectedcat);
        pp.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void EnglishMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnglishMouseReleased
        selectedcat="English";
        musicplayer pp=new musicplayer(selectedcat);
        pp.setVisible(true);
    }//GEN-LAST:event_EnglishMouseReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        selectedcat=jLabel3.getText();
        System.out.println(selectedcat);
        musicplayer pp=new musicplayer(selectedcat);
        pp.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        selectedcat=jLabel2.getText();
        System.out.println(selectedcat);
        musicplayer pp=new musicplayer(selectedcat);
        pp.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        selectedcat="Hindi";
        new musicplayer(selectedcat).setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
       selectedcat=jLabel6.getText();
       new musicplayer(selectedcat).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                   new MusicCategory().setVisible(true);
               }
           });
       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
           Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel English;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
