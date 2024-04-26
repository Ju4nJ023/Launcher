
package poyecto.rino;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class myLauncherBase extends javax.swing.JFrame {
    
    int currentGrado;
    int currentGame;

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
     
           
           myHomePanel home=createHomePanel(0);
           
           showHomePanel(home);

    }
  
     public void showHomePanel(myHomePanel home) { 
        showView.removeAll();
        showView.add(home, BorderLayout.CENTER);
        showView.revalidate();
        showView.repaint();
    }
     
     public void showGamePanel (myGamePanel game) {
        showView.removeAll();
        showView.add(game, BorderLayout.CENTER);
        showView.revalidate();
        showView.repaint();
     }
     
     public myHomePanel createHomePanel (int indiceGrado) {         
         myHomePanel home = new myHomePanel();
            home.setSize(1530,860);
            home.setLocation(0,0);  
            home.parent=this;
            home.myGrado=indiceGrado;
            return home;
     } 
     
     public myGamePanel createGamePanel(int indiceGame, String tituloJuego) {
         myGamePanel game = new myGamePanel(indiceGame, tituloJuego);
         game.setSize(1530, 860);
         game.setLocation(0, 0);
         game.parent = this;
        
         return game;
}  
     
     public String NombreGrado(int indiceGrado) {
    switch (indiceGrado) {
        case 1:
            return "Grado 1";
        case 2:
            return "Grado 2";
        case 3:
            return "Grado 3";
        case 4:
            return "Grado 4";
        case 5:
            return "Grado 5";
        case 6:
            return "Grado 6"; 
        case 7:
            return "Grado 7"; 
        case 8:
            return "Grado 8"; 
        case 9:
            return "Grado 9"; 
        case 10:
            return "Grado 10"; 
        case 11:
            return "Grado 11";     
        case 12:
            return "Grado 12";
        case 13:
            return "Grado 13";
        case 14:
            return "Grado 14";
        default:
            return "Otro Grado";    
            
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        toolBar = new javax.swing.JPanel();
        toolBar1 = new javax.swing.JLabel();
        toolBar2 = new javax.swing.JLabel();
        toolBar3 = new javax.swing.JLabel();
        toolBar4 = new javax.swing.JLabel();
        toolBar5 = new javax.swing.JLabel();
        toolBar6 = new javax.swing.JLabel();
        toolBar7 = new javax.swing.JLabel();
        toolBar8 = new javax.swing.JLabel();
        toolBar9 = new javax.swing.JLabel();
        toolBar10 = new javax.swing.JLabel();
        toolBar11 = new javax.swing.JLabel();
        toolBar12 = new javax.swing.JLabel();
        toolBar13 = new javax.swing.JLabel();
        toolBar14 = new javax.swing.JLabel();
        showView = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setDoubleBuffered(true);
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });
        mainPanel.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 140));

        toolBar.setOpaque(false);

        toolBar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton8.png"))); // NOI18N
        toolBar1.setDoubleBuffered(true);
        toolBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar1MouseClicked(evt);
            }
        });
        toolBar.add(toolBar1);

        toolBar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton0.png"))); // NOI18N
        toolBar2.setDoubleBuffered(true);
        toolBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar2MouseClicked(evt);
            }
        });
        toolBar.add(toolBar2);

        toolBar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton1.png"))); // NOI18N
        toolBar3.setDoubleBuffered(true);
        toolBar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar3MouseClicked(evt);
            }
        });
        toolBar.add(toolBar3);

        toolBar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton2.png"))); // NOI18N
        toolBar4.setDoubleBuffered(true);
        toolBar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar4MouseClicked(evt);
            }
        });
        toolBar.add(toolBar4);

        toolBar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton3.png"))); // NOI18N
        toolBar5.setDoubleBuffered(true);
        toolBar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar5MouseClicked(evt);
            }
        });
        toolBar.add(toolBar5);

        toolBar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton4.png"))); // NOI18N
        toolBar6.setDoubleBuffered(true);
        toolBar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar6MouseClicked(evt);
            }
        });
        toolBar.add(toolBar6);

        toolBar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton5.png"))); // NOI18N
        toolBar7.setDoubleBuffered(true);
        toolBar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar7MouseClicked(evt);
            }
        });
        toolBar.add(toolBar7);

        toolBar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton6.png"))); // NOI18N
        toolBar8.setDoubleBuffered(true);
        toolBar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar8MouseClicked(evt);
            }
        });
        toolBar.add(toolBar8);

        toolBar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton7.png"))); // NOI18N
        toolBar9.setDoubleBuffered(true);
        toolBar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar9MouseClicked(evt);
            }
        });
        toolBar.add(toolBar9);

        toolBar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton13.png"))); // NOI18N
        toolBar10.setDoubleBuffered(true);
        toolBar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar10MouseClicked(evt);
            }
        });
        toolBar.add(toolBar10);

        toolBar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton9.png"))); // NOI18N
        toolBar11.setDoubleBuffered(true);
        toolBar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar11MouseClicked(evt);
            }
        });
        toolBar.add(toolBar11);

        toolBar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton10.png"))); // NOI18N
        toolBar12.setDoubleBuffered(true);
        toolBar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar12MouseClicked(evt);
            }
        });
        toolBar.add(toolBar12);

        toolBar13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton11.png"))); // NOI18N
        toolBar13.setDoubleBuffered(true);
        toolBar13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar13MouseClicked(evt);
            }
        });
        toolBar.add(toolBar13);

        toolBar14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesBase/LauncherButton12.png"))); // NOI18N
        toolBar14.setDoubleBuffered(true);
        toolBar14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolBar14MouseClicked(evt);
            }
        });
        toolBar.add(toolBar14);

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

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        myHomePanel home = createHomePanel(0);
        showHomePanel(home);
    }//GEN-LAST:event_inicioMouseClicked

    private void createNewHomePanel(int indiceGrado) {                                      
    myHomePanel home = createHomePanel(indiceGrado);
    home.actualizarDebugText();
    
    showHomePanel(home);

    /**JLabel clickedLabel = (JLabel) evt.getSource();
    String labelText = clickedLabel.getText();

    home.actualizarDebugText(labelText);*/
}
    private void toolBar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar2MouseClicked
        createNewHomePanel(2);
    }//GEN-LAST:event_toolBar2MouseClicked

    private void toolBar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar3MouseClicked
        createNewHomePanel(3);
    }//GEN-LAST:event_toolBar3MouseClicked

    private void toolBar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar4MouseClicked
        createNewHomePanel(4);
    }//GEN-LAST:event_toolBar4MouseClicked

    private void toolBar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar5MouseClicked
        createNewHomePanel(5);
    }//GEN-LAST:event_toolBar5MouseClicked

    private void toolBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar1MouseClicked
        createNewHomePanel(1);
    }//GEN-LAST:event_toolBar1MouseClicked

    private void toolBar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar6MouseClicked
        createNewHomePanel(6);
    }//GEN-LAST:event_toolBar6MouseClicked

    private void toolBar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar7MouseClicked
        createNewHomePanel(7);
    }//GEN-LAST:event_toolBar7MouseClicked

    private void toolBar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar8MouseClicked
        createNewHomePanel(8);
    }//GEN-LAST:event_toolBar8MouseClicked

    private void toolBar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar9MouseClicked
        createNewHomePanel(9);
    }//GEN-LAST:event_toolBar9MouseClicked

    private void toolBar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar10MouseClicked
        createNewHomePanel(10);
    }//GEN-LAST:event_toolBar10MouseClicked

    private void toolBar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar11MouseClicked
        createNewHomePanel(11);
    }//GEN-LAST:event_toolBar11MouseClicked

    private void toolBar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar12MouseClicked
        createNewHomePanel(12);
    }//GEN-LAST:event_toolBar12MouseClicked

    private void toolBar13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar13MouseClicked
        createNewHomePanel(13);
    }//GEN-LAST:event_toolBar13MouseClicked

    private void toolBar14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolBar14MouseClicked
        createNewHomePanel(14);
    }//GEN-LAST:event_toolBar14MouseClicked
  
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
    private javax.swing.JLabel inicio;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel showView;
    private javax.swing.JPanel toolBar;
    private javax.swing.JLabel toolBar1;
    private javax.swing.JLabel toolBar10;
    private javax.swing.JLabel toolBar11;
    private javax.swing.JLabel toolBar12;
    private javax.swing.JLabel toolBar13;
    private javax.swing.JLabel toolBar14;
    private javax.swing.JLabel toolBar2;
    private javax.swing.JLabel toolBar3;
    private javax.swing.JLabel toolBar4;
    private javax.swing.JLabel toolBar5;
    private javax.swing.JLabel toolBar6;
    private javax.swing.JLabel toolBar7;
    private javax.swing.JLabel toolBar8;
    private javax.swing.JLabel toolBar9;
    // End of variables declaration//GEN-END:variables
}
