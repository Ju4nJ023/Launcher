
package poyecto.rino;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JPanel;

public class myHomePanel extends javax.swing.JPanel {
    public myLauncherBase parent;
    
    int myGrado;
    Dimension dimensionMiniaturasMax = new Dimension(476, 363);
    Dimension dimensionOriginal = new Dimension(381, 291);
    
    public myHomePanel() {
        initComponents();     
    
    }
    
     public myHomePanel(int homeIndex) {
        initComponents();
        myGrado = homeIndex;
        actualizarDebugText();
        //parent.currentGrado=myGrado;
        
    dimensionMiniaturasMax = new Dimension(476, 363);
    dimensionOriginal = new Dimension(381, 291);  
    
    }
     
    public void actualizarDebugText(){
        String myGradoIndex= String.valueOf(myGrado);
        debugText.setText(myGradoIndex);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        debugText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JLabel();
        boton3 = new javax.swing.JLabel();
        boton4 = new javax.swing.JLabel();
        boton5 = new javax.swing.JLabel();
        boton6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1552, 880));

        HomePanel.setBackground(new java.awt.Color(0, 39, 75));
        HomePanel.setPreferredSize(new java.awt.Dimension(1552, 880));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        debugText.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        debugText.setForeground(new java.awt.Color(255, 255, 255));
        debugText.setText("GRADO EN AAA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(debugText, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(debugText)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        HomePanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 60));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        boton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton0.png"))); // NOI18N
        boton1.setDoubleBuffered(true);
        boton1.setMaximumSize(new java.awt.Dimension(517, 440));
        boton1.setPreferredSize(new java.awt.Dimension(517, 440));
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton1MouseExited(evt);
            }
        });
        jPanel1.add(boton1);

        boton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton1.png"))); // NOI18N
        boton2.setDoubleBuffered(true);
        boton2.setPreferredSize(new java.awt.Dimension(517, 440));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton2MouseExited(evt);
            }
        });
        jPanel1.add(boton2);

        boton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton3.png"))); // NOI18N
        boton3.setDoubleBuffered(true);
        boton3.setMaximumSize(new java.awt.Dimension(517, 440));
        boton3.setPreferredSize(new java.awt.Dimension(517, 440));
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton3MouseExited(evt);
            }
        });
        jPanel1.add(boton3);

        boton4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton2.png"))); // NOI18N
        boton4.setDoubleBuffered(true);
        boton4.setPreferredSize(new java.awt.Dimension(517, 440));
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton4MouseExited(evt);
            }
        });
        jPanel1.add(boton4);

        boton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton4.png"))); // NOI18N
        boton5.setDoubleBuffered(true);
        boton5.setMaximumSize(new java.awt.Dimension(517, 440));
        boton5.setPreferredSize(new java.awt.Dimension(517, 440));
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton5MouseExited(evt);
            }
        });
        jPanel1.add(boton5);

        boton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/HomeButton5.png"))); // NOI18N
        boton6.setDoubleBuffered(true);
        boton6.setMaximumSize(new java.awt.Dimension(517, 440));
        boton6.setPreferredSize(new java.awt.Dimension(517, 440));
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton6MouseExited(evt);
            }
        });
        jPanel1.add(boton6);

        HomePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 880));

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

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        myGamePanel game=parent.createGamePanel(0);
        game.cargarImagenesCategoria("Embarque");
        parent.showGamePanel(game);
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        myGamePanel game=parent.createGamePanel(1);
        game.cargarImagenesCategoria("Hemorragia");
        parent.showGamePanel(game);
    }//GEN-LAST:event_boton2MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        myGamePanel game=parent.createGamePanel(2);
        game.cargarImagenesCategoria("Extincion");
        parent.showGamePanel(game);
        
    }//GEN-LAST:event_boton4MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        myGamePanel game=parent.createGamePanel(3);
        game.cargarImagenesCategoria("EPIS");
        parent.showGamePanel(game);
    }//GEN-LAST:event_boton3MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        myGamePanel game=parent.createGamePanel(4);
        game.cargarImagenesCategoria("Helicoptero");
        parent.showGamePanel(game);
    }//GEN-LAST:event_boton5MouseClicked

    private void boton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseClicked
        myGamePanel game=parent.createGamePanel(5);
        game.cargarImagenesCategoria("Ascensor");
        parent.showGamePanel(game);
    }//GEN-LAST:event_boton6MouseClicked

    private void boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseEntered
        myUtilities.SetImageLabel(boton1, "src/imagesHome/HomeButton0.png", dimensionMiniaturasMax);
    }//GEN-LAST:event_boton1MouseEntered

    private void boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseExited
        myUtilities.SetImageLabel(boton1, "src/imagesHome/HomeButton0.png", dimensionOriginal);
    }//GEN-LAST:event_boton1MouseExited

    private void boton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseEntered
        myUtilities.SetImageLabel(boton2, "src/imagesHome/HomeButton1.png", dimensionMiniaturasMax);
    }//GEN-LAST:event_boton2MouseEntered

    private void boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseExited
        myUtilities.SetImageLabel(boton2, "src/imagesHome/HomeButton1.png", dimensionOriginal);
    }//GEN-LAST:event_boton2MouseExited

    private void boton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseEntered
        myUtilities.SetImageLabel(boton3, "src/imagesHome/HomeButton2.png", dimensionMiniaturasMax);
    }//GEN-LAST:event_boton3MouseEntered

    private void boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseExited
        myUtilities.SetImageLabel(boton3, "src/imagesHome/HomeButton2.png", dimensionOriginal);
    }//GEN-LAST:event_boton3MouseExited

    private void boton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseEntered
        myUtilities.SetImageLabel(boton4, "src/imagesHome/HomeButton3.png", dimensionMiniaturasMax);
    }//GEN-LAST:event_boton4MouseEntered

    private void boton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseExited
        myUtilities.SetImageLabel(boton4, "src/imagesHome/HomeButton3.png", dimensionOriginal);
    }//GEN-LAST:event_boton4MouseExited

    private void boton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseEntered
        myUtilities.SetImageLabel(boton5, "src/imagesHome/HomeButton4.png", dimensionMiniaturasMax);
    }//GEN-LAST:event_boton5MouseEntered

    private void boton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseExited
        myUtilities.SetImageLabel(boton5, "src/imagesHome/HomeButton4.png", dimensionOriginal);
    }//GEN-LAST:event_boton5MouseExited

    private void boton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseEntered
        myUtilities.SetImageLabel(boton6, "src/imagesHome/HomeButton5.png", dimensionMiniaturasMax);
    }//GEN-LAST:event_boton6MouseEntered

    private void boton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseExited
        myUtilities.SetImageLabel(boton6, "src/imagesHome/HomeButton5.png", dimensionOriginal);
    }//GEN-LAST:event_boton6MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel boton1;
    private javax.swing.JLabel boton2;
    private javax.swing.JLabel boton3;
    private javax.swing.JLabel boton4;
    private javax.swing.JLabel boton5;
    private javax.swing.JLabel boton6;
    private javax.swing.JLabel debugText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
