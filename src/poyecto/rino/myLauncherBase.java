
package poyecto.rino;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JPanel;

public class myLauncherBase extends javax.swing.JFrame {

    public myLauncherBase() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        //Propiedades del cursor
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImage = toolkit.getImage(getClass().getResource("/ImagesBase/CursorMano.png"));
        cursorImage = cursorImage.getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "customCursor");
        this.setCursor(customCursor);
        mainPanel.setCursor(customCursor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
     
           
           createHomePanel();
    
    }
    
     private void showHomePanel(myHomePanel home) {
        showView.removeAll();
        showView.add(home, BorderLayout.CENTER);
        showView.revalidate();
        showView.repaint();
    }
     
     private void showGamePanel (myGamePanel game) {
        showView.removeAll();
        showView.add(game, BorderLayout.CENTER);
        showView.revalidate();
        showView.repaint();
     }
     
     public void createHomePanel () {         
         myHomePanel home = new myHomePanel();
            home.setSize(1530,860);
            home.setLocation(0,0);  
            home.parent=this;
            showHomePanel(home);
     } 
     
     public void createGamePanel () {
         myGamePanel game = new myGamePanel();
            game.setSize(1530,860);
            game.setLocation(0,0);  
            game.parent=this;
            showGamePanel(game);
         
     }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        toolBar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        showView = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toolBar.setOpaque(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton0.png"))); // NOI18N
        toolBar.add(jLabel16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton1.png"))); // NOI18N
        toolBar.add(jLabel17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton2.png"))); // NOI18N
        toolBar.add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton3.png"))); // NOI18N
        toolBar.add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton4.png"))); // NOI18N
        toolBar.add(jLabel20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton5.png"))); // NOI18N
        toolBar.add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton6.png"))); // NOI18N
        toolBar.add(jLabel22);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton7.png"))); // NOI18N
        toolBar.add(jLabel23);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton13.png"))); // NOI18N
        toolBar.add(jLabel24);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton9.png"))); // NOI18N
        toolBar.add(jLabel25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton10.png"))); // NOI18N
        toolBar.add(jLabel26);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton11.png"))); // NOI18N
        toolBar.add(jLabel27);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton12.png"))); // NOI18N
        toolBar.add(jLabel28);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton8.png"))); // NOI18N
        toolBar.add(jLabel29);

        mainPanel.add(toolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 1510, -1));

        showView.setMaximumSize(new java.awt.Dimension(1552, 880));
        showView.setOpaque(false);
        showView.setPreferredSize(new java.awt.Dimension(1552, 880));

        javax.swing.GroupLayout showViewLayout = new javax.swing.GroupLayout(showView);
        showView.setLayout(showViewLayout);
        showViewLayout.setHorizontalGroup(
            showViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1552, Short.MAX_VALUE)
        );
        showViewLayout.setVerticalGroup(
            showViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        mainPanel.add(showView, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 1552, 880));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/FondoBase.png"))); // NOI18N
        bg.setOpaque(true);
        mainPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(myLauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myLauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myLauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myLauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myLauncherBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel showView;
    private javax.swing.JPanel toolBar;
    // End of variables declaration//GEN-END:variables
}