
package poyecto.rino;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myGamePanel extends javax.swing.JPanel {
    public myLauncherBase parent;
    
    JLabel[] puntosFotos; 
    public int indiceFotoActual = 0;   
    private ImageIcon[] imagenesEmbarque;

    
    public myGamePanel() {
        initComponents();
        inicializarImagenesEmbarque(); 
        inicializarPuntosFotos();
    }    
    
    private void inicializarImagenesEmbarque() {
        imagenesEmbarque = new ImageIcon[]{
            new ImageIcon(getClass().getResource("/imagesGame/Embarque0.png")),
            new ImageIcon(getClass().getResource("/imagesGame/Embarque1.png")),
            new ImageIcon(getClass().getResource("/imagesGame/Embarque2.png")),
            new ImageIcon(getClass().getResource("/imagesGame/Embarque3.png")),
            new ImageIcon(getClass().getResource("/imagesGame/Embarque4.png"))
        };
    }
    
    private void inicializarPuntosFotos() {
        puntosFotos = new JLabel[]{boton1, boton2, boton3, boton4, boton5};
        for (int i = 0; i < puntosFotos.length; i++) {
            final int index = i;
            puntosFotos[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    botonMouseClicked(evt, index);
                }
            });
        }
    }
    
    public void IniciarGame(){       
        
        vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
        actualizarPuntos();
    }
    
    private void actualizarPuntos() {
        for (int i = 0; i < puntosFotos.length; i++) {
            if (i == indiceFotoActual) {
                CambiarPunto(puntosFotos[i], true);
            } else {
                CambiarPunto(puntosFotos[i], false);
            }
        }
    }
    
    void CambiarPunto(JLabel punto, boolean filled)
    {
        if(filled)
            punto.setIcon(new ImageIcon("src/pics/PuntoCarruselFilled.png"));
        else
            punto.setIcon(new ImageIcon("src/pics/PuntoCarruselEmpty.png"));
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamePanel = new javax.swing.JPanel();
        vistaFotos = new javax.swing.JLabel();
        vistaFoto1 = new javax.swing.JLabel();
        VistaFoto2 = new javax.swing.JLabel();
        circulos = new javax.swing.JPanel();
        boton1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JLabel();
        boton3 = new javax.swing.JLabel();
        boton4 = new javax.swing.JLabel();
        boton5 = new javax.swing.JLabel();
        descripcion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comenzar = new javax.swing.JLabel();
        flechaIzq = new javax.swing.JButton();
        flechaDer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        GamePanel.setBackground(new java.awt.Color(0, 39, 75));
        GamePanel.setMinimumSize(new java.awt.Dimension(1552, 880));
        GamePanel.setPreferredSize(new java.awt.Dimension(1552, 880));
        GamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vistaFotos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vistaFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Embarque0.png"))); // NOI18N
        vistaFotos.setPreferredSize(new java.awt.Dimension(891, 526));
        GamePanel.add(vistaFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        vistaFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vistaFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Cuadrado.png"))); // NOI18N
        vistaFoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GamePanel.add(vistaFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 840, 460));

        VistaFoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VistaFoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Cuadrado.png"))); // NOI18N
        VistaFoto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GamePanel.add(VistaFoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 810, 460));

        circulos.setOpaque(false);

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselFilled.png"))); // NOI18N
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });

        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
        });

        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4MouseClicked(evt);
            }
        });

        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout circulosLayout = new javax.swing.GroupLayout(circulos);
        circulos.setLayout(circulosLayout);
        circulosLayout.setHorizontalGroup(
            circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circulosLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(boton1)
                .addGap(18, 18, 18)
                .addComponent(boton2)
                .addGap(18, 18, 18)
                .addComponent(boton3)
                .addGap(18, 18, 18)
                .addComponent(boton4)
                .addGap(18, 18, 18)
                .addComponent(boton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        circulosLayout.setVerticalGroup(
            circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        GamePanel.add(circulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 330, 30));

        descripcion.setOpaque(false);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Barrita aislada descripci¢n.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Embarque y desembarque en helicóptero");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam vehicula nisl id leo convallis, id congue tortor malesuada.");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duis ac aliquet nunc. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("\nExcepteur sint occaecat cunidatat non broident. sunt in culpa aut otticia deserunt mollit anim id est laborum.");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");

        javax.swing.GroupLayout descripcionLayout = new javax.swing.GroupLayout(descripcion);
        descripcion.setLayout(descripcionLayout);
        descripcionLayout.setHorizontalGroup(
            descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descripcionLayout.createSequentialGroup()
                .addGroup(descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(descripcionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(descripcionLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel13))))
                .addContainerGap())
        );
        descripcionLayout.setVerticalGroup(
            descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descripcionLayout.createSequentialGroup()
                .addGroup(descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(81, 81, 81)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        GamePanel.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, 330));

        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Comenzar.png"))); // NOI18N
        GamePanel.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 700, 260, 50));

        flechaIzq.setBackground(new java.awt.Color(0, 39, 75));
        flechaIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Flecha izquierda.png"))); // NOI18N
        flechaIzq.setBorderPainted(false);
        flechaIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaIzqMouseClicked(evt);
            }
        });
        GamePanel.add(flechaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 44, -1));

        flechaDer.setBackground(new java.awt.Color(0, 39, 75));
        flechaDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Flecha derecha.png"))); // NOI18N
        flechaDer.setBorderPainted(false);
        flechaDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaDerMouseClicked(evt);
            }
        });
        GamePanel.add(flechaDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 250, 45, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1552, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        indiceFotoActual = 0;
        vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
        actualizarPuntos();
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        indiceFotoActual = 1;
        vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
        actualizarPuntos();
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        indiceFotoActual = 2;
        vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
        actualizarPuntos();
    }//GEN-LAST:event_boton3MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        indiceFotoActual = 3;
        vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
        actualizarPuntos();
    }//GEN-LAST:event_boton4MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        indiceFotoActual = 4;
        vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
        actualizarPuntos();
    }//GEN-LAST:event_boton5MouseClicked

    private void flechaIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaIzqMouseClicked
        indiceFotoActual--;
    if (indiceFotoActual < 0) {
        indiceFotoActual = imagenesEmbarque.length - 1;
    }
    vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
    actualizarIndicadores();
    }//GEN-LAST:event_flechaIzqMouseClicked

    private void flechaDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaDerMouseClicked
        indiceFotoActual++;
    if (indiceFotoActual >= imagenesEmbarque.length) {
        indiceFotoActual = 0;
    }
    vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
    actualizarIndicadores();
    }//GEN-LAST:event_flechaDerMouseClicked

    private void actualizarIndicadores() {
        for (int i = 0; i < puntosFotos.length; i++) {
        CambiarPunto(puntosFotos[i], i == indiceFotoActual);
        }
    }
    
    private void botonMouseClicked(java.awt.event.MouseEvent evt, int index) {                                    
    indiceFotoActual = index;
    vistaFotos.setIcon(imagenesEmbarque[indiceFotoActual]);
    actualizarIndicadores();
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GamePanel;
    private javax.swing.JLabel VistaFoto2;
    private javax.swing.JLabel boton1;
    private javax.swing.JLabel boton2;
    private javax.swing.JLabel boton3;
    private javax.swing.JLabel boton4;
    private javax.swing.JLabel boton5;
    private javax.swing.JPanel circulos;
    private javax.swing.JLabel comenzar;
    private javax.swing.JPanel descripcion;
    private javax.swing.JButton flechaDer;
    private javax.swing.JButton flechaIzq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel vistaFoto1;
    private javax.swing.JLabel vistaFotos;
    // End of variables declaration//GEN-END:variables

}