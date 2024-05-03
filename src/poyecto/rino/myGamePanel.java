
package poyecto.rino;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class myGamePanel extends javax.swing.JPanel {
    public myLauncherBase parent;
    
    Dimension dimensionImage = new Dimension(891 ,525);
    JLabel[] puntosFotos; 
    int indiceFotoActual = 0;  
    public ArrayList<String> fotosPath = new ArrayList<>();  
    public String juegoRuta = "src/ejecutables/PC_EPIs/CampoPracticas_EPIS.exe";
    
    public myGamePanel() {
        initComponents();
        InitPuntosFotos();  
    }    
    
    //Conociendo estos dos valores actualizamos la informacion en el panel.
    public void UpdateInfo(int indiceGrado, int indiceGame) throws FileNotFoundException
    {
            String nameGame;
            String nameGrado;
            String nameImagenJuego;
            String descripcionJuego;
            String rutaJuego;
            
             try 
                {            
                    nameGame = myUtilities.NombreJuego(indiceGrado, indiceGame);
                    nameGrado = myUtilities.NombreGrado(indiceGrado);
                    nameImagenJuego = myUtilities.ImagenJuego(indiceGrado, indiceGame);
                    descripcionJuego = myUtilities.DescripcionJuego(indiceGrado, indiceGame);
                    rutaJuego = myUtilities.RutaJuego(indiceGrado, indiceGame);
                    juegoRuta=rutaJuego;
                    
                    text_title.setText(nameGame);
                    text_description.setText(descripcionJuego);
                    
                    indiceFotoActual = 0;
                    fotosPath = myUtilities.CrearListaStrings("src/imagesGame/", nameImagenJuego, ".png", 5);
                    myUtilities.SetImageLabel(vistaFotos, fotosPath.get(0), dimensionImage);  

                    ActualizarPuntosFotos();
                }
            catch (FileNotFoundException ex)
                {
                    Logger.getLogger(myLauncherBase.class.getName()).log(Level.SEVERE, null, ex);
                }        
             
            
        
        //Aqui hay que añadir todo...
        //Obtenemos toda la info en base al indice de grado y al game... y la actualizamos.
        
        
        //Obtienen los valores desde el JSON a partir del indice de grado y game

        
        //Actualizan los valores
        
    }
    
    private void InitPuntosFotos()
    {
        puntosFotos = new JLabel[]{boton1, boton2, boton3, boton4, boton5};
    }
     
    private void ActualizarPuntosFotos() {
       for (int i = 0; i < puntosFotos.length; i++) {
        if (i == indiceFotoActual) {
            puntosFotos[i].setIcon(new ImageIcon("src/imagesGame/PuntoCarruselFilled.png"));
        } else {
            puntosFotos[i].setIcon(new ImageIcon("src/imagesGame/PuntoCarruselEmpty.png"));
        }
      }
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
        text_title = new javax.swing.JLabel();
        text_description = new javax.swing.JLabel();
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
        GamePanel.add(vistaFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        vistaFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vistaFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Cuadrado.png"))); // NOI18N
        GamePanel.add(vistaFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 840, 460));

        VistaFoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VistaFoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Cuadrado.png"))); // NOI18N
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
                .addGap(25, 25, 25)
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

        GamePanel.add(circulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 200, 30));

        descripcion.setOpaque(false);

        text_title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        text_title.setForeground(new java.awt.Color(255, 255, 255));
        text_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Barrita aislada descripci¢n.png"))); // NOI18N
        text_title.setText("DESCRIPCIÓN");

        text_description.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        text_description.setForeground(new java.awt.Color(255, 255, 255));
        text_description.setText("<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua<br>\n            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.<br><br>\n            Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.<br>\n            Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.<br><br>");

        javax.swing.GroupLayout descripcionLayout = new javax.swing.GroupLayout(descripcion);
        descripcion.setLayout(descripcionLayout);
        descripcionLayout.setHorizontalGroup(
            descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descripcionLayout.createSequentialGroup()
                .addComponent(text_description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(text_title, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        descripcionLayout.setVerticalGroup(
            descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descripcionLayout.createSequentialGroup()
                .addComponent(text_title)
                .addGap(18, 18, 18)
                .addComponent(text_description, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );

        GamePanel.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, -1, 190));

        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Comenzar.png"))); // NOI18N
        comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comenzarMouseClicked(evt);
            }
        });
        GamePanel.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 780, 260, 50));

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
        myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
        ActualizarPuntosFotos();
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        indiceFotoActual = 1;
        myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
        ActualizarPuntosFotos();
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        indiceFotoActual = 2;
        myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
        ActualizarPuntosFotos();
    }//GEN-LAST:event_boton3MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        indiceFotoActual = 3;
         myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
        ActualizarPuntosFotos();
    }//GEN-LAST:event_boton4MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        indiceFotoActual = 4;
         myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
        ActualizarPuntosFotos();
    }//GEN-LAST:event_boton5MouseClicked

    private void flechaIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaIzqMouseClicked
        indiceFotoActual--;
    if (indiceFotoActual < 0) {
        indiceFotoActual = fotosPath.size()-1;
    }
     myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
    ActualizarPuntosFotos();
    }//GEN-LAST:event_flechaIzqMouseClicked

    private void flechaDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaDerMouseClicked
        indiceFotoActual++;
    if (indiceFotoActual >= fotosPath.size()) {
        indiceFotoActual = 0;
    }
    myUtilities.SetImageLabel(vistaFotos, fotosPath.get(indiceFotoActual),dimensionImage);
    ActualizarPuntosFotos();
    }//GEN-LAST:event_flechaDerMouseClicked

    private void comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMouseClicked
        try {
            Runtime.getRuntime().exec(juegoRuta);
        } catch (IOException ex) {
            Logger.getLogger(myGamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comenzarMouseClicked

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
    private javax.swing.JLabel text_description;
    private javax.swing.JLabel text_title;
    private javax.swing.JLabel vistaFoto1;
    private javax.swing.JLabel vistaFotos;
    // End of variables declaration//GEN-END:variables

}