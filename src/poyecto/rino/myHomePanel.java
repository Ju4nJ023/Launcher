
package poyecto.rino;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JPanel;

public class myHomePanel extends javax.swing.JPanel {
    public myLauncherBase parent;
    
    Dimension dimensionMiniaturasMax;
    Dimension dimensionOriginal;

    public myHomePanel() {
        initComponents();
        
    dimensionMiniaturasMax = new Dimension(476, 363);
    dimensionOriginal = new Dimension(381, 291);
        
        embarque.setSize(dimensionOriginal);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        embarque = new javax.swing.JLabel();
        protocolo = new javax.swing.JLabel();
        maniobras = new javax.swing.JLabel();
        tipologia = new javax.swing.JLabel();
        señalizacion = new javax.swing.JLabel();
        rescate = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1552, 880));

        HomePanel.setBackground(new java.awt.Color(0, 39, 75));
        HomePanel.setPreferredSize(new java.awt.Dimension(1552, 880));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        embarque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        embarque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton0.png"))); // NOI18N
        embarque.setMaximumSize(new java.awt.Dimension(517, 440));
        embarque.setPreferredSize(new java.awt.Dimension(517, 440));
        embarque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                embarqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                embarqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                embarqueMouseExited(evt);
            }
        });
        HomePanel.add(embarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        protocolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        protocolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton1.png"))); // NOI18N
        protocolo.setPreferredSize(new java.awt.Dimension(517, 440));
        HomePanel.add(protocolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        maniobras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maniobras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton2.png"))); // NOI18N
        maniobras.setPreferredSize(new java.awt.Dimension(517, 440));
        HomePanel.add(maniobras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        tipologia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton3.png"))); // NOI18N
        tipologia.setMaximumSize(new java.awt.Dimension(517, 440));
        tipologia.setPreferredSize(new java.awt.Dimension(517, 440));
        HomePanel.add(tipologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        señalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        señalizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton4.png"))); // NOI18N
        señalizacion.setMaximumSize(new java.awt.Dimension(517, 440));
        señalizacion.setPreferredSize(new java.awt.Dimension(517, 440));
        HomePanel.add(señalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        rescate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rescate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton5.png"))); // NOI18N
        rescate.setMaximumSize(new java.awt.Dimension(517, 440));
        rescate.setPreferredSize(new java.awt.Dimension(517, 440));
        HomePanel.add(rescate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void embarqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarqueMouseClicked

        parent.createGamePanel();
    }//GEN-LAST:event_embarqueMouseClicked

    private void embarqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarqueMouseEntered
        embarque.setSize(dimensionMiniaturasMax);
    }//GEN-LAST:event_embarqueMouseEntered

    private void embarqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarqueMouseExited
        embarque.setSize(dimensionOriginal);
    }//GEN-LAST:event_embarqueMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel embarque;
    private javax.swing.JLabel maniobras;
    private javax.swing.JLabel protocolo;
    private javax.swing.JLabel rescate;
    private javax.swing.JLabel señalizacion;
    private javax.swing.JLabel tipologia;
    // End of variables declaration//GEN-END:variables
}
