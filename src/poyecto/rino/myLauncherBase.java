
package poyecto.rino;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class myLauncherBase extends javax.swing.JFrame {
    private myHomePanel HomePanel;

    public myLauncherBase() {
        initComponents();
        
         Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImage = toolkit.getImage(getClass().getResource("/Componentes/IconoPunteroUniversae.png"));
        
        cursorImage = cursorImage.getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "customCursor");
        //this.setCursor(customCursor);
        mainPanel.setCursor(customCursor);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        
        HomePanel = new myHomePanel();
        // Mostrar el panel homePanel por defecto
        showHomePanel();
    }
    
     private void showHomePanel() {
        // Remover todos los componentes del panel content
        content.removeAll();
        // Añadir el panel homePanel al panel content
        content.add(HomePanel);
        // Validar y repintar el panel content
        content.revalidate();
        content.repaint();
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
        content = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1530, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        mainPanel.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 1530, 860));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/FondoBase.png"))); // NOI18N
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
    private javax.swing.JPanel content;
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
    private javax.swing.JPanel toolBar;
    // End of variables declaration//GEN-END:variables
}
