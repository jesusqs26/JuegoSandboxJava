package worldeditor;

import client.Game;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.System.gc;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Editor de mapas
 * @author Jesus
 */
public class WorldEditor extends javax.swing.JFrame {

    public WorldEditor() {
        initComponents();
        setTitle("World Editor");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        menuOpGuardar = new javax.swing.JMenu();
        menuGuardar = new javax.swing.JMenuItem();
        mIimprimir = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuProbar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuCopiar = new javax.swing.JMenuItem();
        menuPegar = new javax.swing.JMenuItem();
        menuCortar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuTamaño = new javax.swing.JMenu();
        menuTamaño1 = new javax.swing.JMenuItem();
        menuTamaño2 = new javax.swing.JMenuItem();
        menuTamaño3 = new javax.swing.JMenuItem();
        menuTamaño4 = new javax.swing.JMenuItem();
        menuTamaño5 = new javax.swing.JMenuItem();
        menuTamaño6 = new javax.swing.JMenuItem();
        menuTamaño7 = new javax.swing.JMenuItem();
        menuTamaño8 = new javax.swing.JMenuItem();
        menuTamaño9 = new javax.swing.JMenuItem();
        menuFormato = new javax.swing.JMenu();
        menuFormato1 = new javax.swing.JMenuItem();
        menuFormato2 = new javax.swing.JMenuItem();
        menuFormato3 = new javax.swing.JMenuItem();
        menuFormato4 = new javax.swing.JMenuItem();
        menuLetra = new javax.swing.JMenu();
        menuLetra1 = new javax.swing.JMenuItem();
        menuLetra2 = new javax.swing.JMenuItem();
        menuLetra3 = new javax.swing.JMenuItem();
        menuLetra4 = new javax.swing.JMenuItem();
        menuLetra5 = new javax.swing.JMenuItem();
        menuLetra6 = new javax.swing.JMenuItem();
        menuLetra7 = new javax.swing.JMenuItem();
        menuLetra8 = new javax.swing.JMenuItem();
        menuLetra9 = new javax.swing.JMenuItem();
        menuLetra10 = new javax.swing.JMenuItem();
        menuLetra11 = new javax.swing.JMenuItem();
        menuLetra12 = new javax.swing.JMenuItem();
        menuLetra13 = new javax.swing.JMenuItem();
        menuLetra14 = new javax.swing.JMenuItem();
        menuLetra15 = new javax.swing.JMenuItem();
        menuLetra16 = new javax.swing.JMenuItem();
        menuLetra17 = new javax.swing.JMenuItem();
        menuLetra18 = new javax.swing.JMenuItem();
        menuLetra19 = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        acercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 682, 369));

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        areaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                areaTextoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(areaTexto);

        menuArchivo.setText("Archivo");

        menuNuevo.setText("Nuevo Mundo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        menuNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                menuNuevoKeyTyped(evt);
            }
        });
        menuArchivo.add(menuNuevo);

        menuAbrir.setText("Abrir Mundo");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuAbrir);

        menuOpGuardar.setText("Guardar..");

        menuGuardar.setText("Guardar Mundo");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        menuOpGuardar.add(menuGuardar);

        menuArchivo.add(menuOpGuardar);

        mIimprimir.setText("Imprimir");
        mIimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIimprimirActionPerformed(evt);
            }
        });
        menuArchivo.add(mIimprimir);
        menuArchivo.add(jSeparator5);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        jMenuBar1.add(menuArchivo);

        menuProbar.setText("Juego");

        jMenuItem1.setText("Probar Mapa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuProbar.add(jMenuItem1);

        jMenuBar1.add(menuProbar);

        menuEdicion.setText("Edición");
        menuEdicion.add(jSeparator3);

        menuCopiar.setText("Copiar");
        menuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopiarActionPerformed(evt);
            }
        });
        menuEdicion.add(menuCopiar);

        menuPegar.setText("Pegar");
        menuPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPegarActionPerformed(evt);
            }
        });
        menuEdicion.add(menuPegar);

        menuCortar.setText("Cortar");
        menuCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCortarActionPerformed(evt);
            }
        });
        menuEdicion.add(menuCortar);
        menuEdicion.add(jSeparator2);

        menuTamaño.setText("Tamaño");

        menuTamaño1.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño1.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño1.setText("12");
        menuTamaño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño1ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño1);

        menuTamaño2.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño2.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño2.setText("16");
        menuTamaño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño2ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño2);

        menuTamaño3.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño3.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño3.setText("18");
        menuTamaño3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño3ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño3);

        menuTamaño4.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño4.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño4.setText("20");
        menuTamaño4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño4ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño4);

        menuTamaño5.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño5.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño5.setText("22");
        menuTamaño5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño5ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño5);

        menuTamaño6.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño6.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño6.setText("24");
        menuTamaño6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño6ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño6);

        menuTamaño7.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño7.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño7.setText("26");
        menuTamaño7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño7ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño7);

        menuTamaño8.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño8.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño8.setText("28");
        menuTamaño8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño8ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño8);

        menuTamaño9.setBackground(new java.awt.Color(78, 72, 87));
        menuTamaño9.setForeground(new java.awt.Color(78, 72, 87));
        menuTamaño9.setText("30");
        menuTamaño9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamaño9ActionPerformed(evt);
            }
        });
        menuTamaño.add(menuTamaño9);

        menuEdicion.add(menuTamaño);

        menuFormato.setText("Formato");
        menuFormato.setActionCommand("Negro");

        menuFormato1.setBackground(new java.awt.Color(78, 72, 87));
        menuFormato1.setForeground(new java.awt.Color(78, 72, 87));
        menuFormato1.setText("Normal");
        menuFormato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormato1ActionPerformed(evt);
            }
        });
        menuFormato.add(menuFormato1);

        menuFormato2.setBackground(new java.awt.Color(78, 72, 87));
        menuFormato2.setForeground(new java.awt.Color(78, 72, 87));
        menuFormato2.setText("Negra");
        menuFormato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormato2ActionPerformed(evt);
            }
        });
        menuFormato.add(menuFormato2);

        menuFormato3.setBackground(new java.awt.Color(78, 72, 87));
        menuFormato3.setForeground(new java.awt.Color(78, 72, 87));
        menuFormato3.setText("Cursiva");
        menuFormato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormato3ActionPerformed(evt);
            }
        });
        menuFormato.add(menuFormato3);

        menuFormato4.setBackground(new java.awt.Color(78, 72, 87));
        menuFormato4.setForeground(new java.awt.Color(78, 72, 87));
        menuFormato4.setText("Negrita con Cursiva");
        menuFormato4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormato4ActionPerformed(evt);
            }
        });
        menuFormato.add(menuFormato4);

        menuEdicion.add(menuFormato);

        menuLetra.setText("Letra");

        menuLetra1.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra1.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra1.setText("Arial");
        menuLetra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra1ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra1);

        menuLetra2.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra2.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra2.setText("Papyrus");
        menuLetra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra2ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra2);

        menuLetra3.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra3.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra3.setText("Comic Sans MS");
        menuLetra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra3ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra3);

        menuLetra4.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra4.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra4.setText("Times New Roman");
        menuLetra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra4ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra4);

        menuLetra5.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra5.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra5.setText("Impact");
        menuLetra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra5ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra5);

        menuLetra6.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra6.setText("Tahoma");
        menuLetra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra6ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra6);

        menuLetra7.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra7.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra7.setText("Arial Rounded MT Bold");
        menuLetra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra7ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra7);

        menuLetra8.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra8.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra8.setText("Arial Narrow");
        menuLetra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra8ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra8);

        menuLetra9.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra9.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra9.setText("Verdana");
        menuLetra9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra9ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra9);

        menuLetra10.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra10.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra10.setText("Sitka Small");
        menuLetra10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra10ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra10);

        menuLetra11.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra11.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra11.setText("Trebuchet MS");
        menuLetra11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra11ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra11);

        menuLetra12.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra12.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra12.setText("Perpetua Titling MT");
        menuLetra12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra12ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra12);

        menuLetra13.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra13.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra13.setText("Baskerville Old Face");
        menuLetra13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra13ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra13);

        menuLetra14.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra14.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra14.setText("Segoe UI");
        menuLetra14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra14ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra14);

        menuLetra15.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra15.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra15.setText("Monospaced");
        menuLetra15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra15ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra15);

        menuLetra16.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra16.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra16.setText("Showcard Gothic");
        menuLetra16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra16ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra16);

        menuLetra17.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra17.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra17.setText("Wide Latin");
        menuLetra17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra17ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra17);

        menuLetra18.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra18.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra18.setText("Ravie");
        menuLetra18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra18ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra18);

        menuLetra19.setBackground(new java.awt.Color(78, 72, 87));
        menuLetra19.setForeground(new java.awt.Color(78, 72, 87));
        menuLetra19.setText("MV Boli");
        menuLetra19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLetra19ActionPerformed(evt);
            }
        });
        menuLetra.add(menuLetra19);

        menuEdicion.add(menuLetra);

        jMenuBar1.add(menuEdicion);

        menuOpciones.setText("Opciones");

        acercaDe.setText("Acerca de...");
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        menuOpciones.add(acercaDe);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Metodo oyente MenuLetra1 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra1ActionPerformed

        tipo_letra = "Arial";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra1ActionPerformed
    /**
     * Metodo oyente MenuLetra2 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra2ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Papyrus";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra2ActionPerformed
    /**
     * Metodo oyente MenuLetra3 que que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra3ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Comic Sans MS";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra3ActionPerformed
    /**
     * Metodo oyente MenuFormato1 que cambia el tipo de formato de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuFormato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormato1ActionPerformed
        // TODO add your handling code here:
        formato_letra = Font.PLAIN;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuFormato1ActionPerformed
    /**
     * Metodo oyente MenuFormato2 que cambia el tipo de formato de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuFormato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormato2ActionPerformed
        // TODO add your handling code here:
        formato_letra = Font.BOLD;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuFormato2ActionPerformed
    /**
     * Metodo oyente MenuFormato3 que cambia el tipo de formato de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuFormato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormato3ActionPerformed
        // TODO add your handling code here:
        formato_letra = Font.ITALIC;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuFormato3ActionPerformed
    /**
     * Metodo oyente MenuTamaño1 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño1ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 12;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño1ActionPerformed
    /**
     * Metodo oyente MenuTamaño2 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño2ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 16;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño2ActionPerformed
    /**
     * Metodo oyente MenuTamaño3 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño3ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 18;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño3ActionPerformed
    /**
     * Metodo oyente MenuTamaño4 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño4ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 20;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño4ActionPerformed

    /**
     * Metodo oyente MenuLetra4 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra4ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Times New Roman";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra4ActionPerformed
    /**
     * Metodo oyente MenuLetra5 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra5ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Impact";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra5ActionPerformed
    /**
     * Metodo oyente MenuLetra6 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra6ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Tahoma";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra6ActionPerformed
    /**
     * Metodo oyente MenuLetra7 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra7ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Arial Rounded MT Bold";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra7ActionPerformed
    /**
     * Metodo oyente MenuLetra8 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra8ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Arial Narrow";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra8ActionPerformed

    /**
     * Metodo oyente que sale de la ventana del programa.
     *
     * @param evt evento al que escucha.
     */
    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuSalirActionPerformed
    /**
     * Metodo oyente MenuLetra10 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra10ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Sitka Small";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra10ActionPerformed
    /**
     * Metodo oyente MenuLetra11 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra11ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Trebuchet MS";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra11ActionPerformed
    /**
     * Metodo oyente MenuLetra12 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra12ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Perpetua Titling MT";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra12ActionPerformed
    /**
     * Metodo oyente MenuLetra9 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra9ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Verdana";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra9ActionPerformed
    /**
     * Metodo oyente MenuLetra13 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra13ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Baskerville Old Face";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra13ActionPerformed
    /**
     * Metodo oyente MenuLetra14 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra14ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Segoe UI";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra14ActionPerformed
    /**
     * Metodo oyente MenuLetra15 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra15ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Monospaced";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra15ActionPerformed
    /**
     * Metodo oyente MenuLetra16 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra16ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Showcard Gothic";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra16ActionPerformed
    /**
     * Metodo oyente MenuLetra17 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra17ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Wide Latin";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra17ActionPerformed
    /**
     * Metodo oyente MenuLetra18 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra18ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "Ravie";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra18ActionPerformed
    /**
     * Metodo oyente MenuLetra19 que cambia la fuente de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuLetra19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLetra19ActionPerformed
        // TODO add your handling code here:
        tipo_letra = "MV Boli";
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuLetra19ActionPerformed
    /**
     * Metodo oyente MenuTamaño5 que cambia el tipo de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño5ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 22;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño5ActionPerformed
    /**
     * Metodo oyente MenuTamaño6 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño6ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 24;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño6ActionPerformed
    /**
     * Metodo oyente MenuTamaño7 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño7ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 26;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño7ActionPerformed
    /**
     * Metodo oyente MenuTamaño8 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño8ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 28;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño8ActionPerformed
    /**
     * Metodo oyente MenuTamaño9 que cambia el tamaño de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuTamaño9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamaño9ActionPerformed
        // TODO add your handling code here:
        tamaño_letra = 30;
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuTamaño9ActionPerformed
    /**
     * Metodo de tecla presionada, que valida las diferentes letras que se van a
     * poder introducir en el area de texto.
     *
     * @param evt evento al que escucha.
     */
    private void areaTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoKeyTyped
//Declaramos una variable y la asignamos al evento
        char caracter = evt.getKeyChar();
        //Condición que nos permite ingresar datos de tipo texto 
        if ((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z') && (caracter != '.') && (caracter != ',') && (caracter != ':') && (caracter != ';')
                && (caracter != (char) KeyEvent.VK_BACK_SPACE) && (caracter != (char) KeyEvent.VK_SPACE) && (caracter != (char) KeyEvent.VK_ENTER)&&(caracter!=(char)KeyEvent.VK_CONTROL)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admite texto", "Validar texto", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_areaTextoKeyTyped
    /**
     * Método de tecla presionada, el cual abre una ventana de seleccionador de
     * archivos, a fin de que el usuario seleccione un archivo para trabajar,
     * debe ser .txt
     *
     * @param evt evento escuchado
     */
    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed

        try {        // TODO add your handling code here:
            JFileChooser buscador = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            buscador.setFileFilter(filter);
            buscador.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            File workingDirectory = new File(System.getProperty("user.dir"));
            buscador.setCurrentDirectory(workingDirectory);
            int resultado = buscador.showOpenDialog(this);
            File archivo = buscador.getSelectedFile();
            nombreArchivo = archivo.getName();
            FileReader fr = null;
            BufferedReader br = null;
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea != null) {
                areaTexto.append(linea + "\r\n");
                linea = br.readLine();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR NO SE SELECCIONÓ ARCHIVO ALGUNO, SELECCIONE UN ARCHIVO PARA TRABAJAR");
        }

    }//GEN-LAST:event_menuAbrirActionPerformed

   /**
     * Evento de tecla presionada el cual copia la selección de texto del campo.
     *
     * @param evt evento escuchado
     */
    private void menuCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopiarActionPerformed
        areaTexto.copy();
    }//GEN-LAST:event_menuCopiarActionPerformed
    /**
     * Evento de tecla presionada el cual permite pegar lo que se haya copiado
     * con anterioridad.
     *
     * @param evt evento escuchado
     */
    private void menuPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPegarActionPerformed
        areaTexto.paste();
    }//GEN-LAST:event_menuPegarActionPerformed
    /**
     * Evento de tecla presionada el cual permite cortar texto que se haya
     * seleccionado dentro del campo de texto.
     *
     * @param evt evento escuchado.
     */
    private void menuCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCortarActionPerformed
        areaTexto.cut();
    }//GEN-LAST:event_menuCortarActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        areaTexto.setText("");
        nombreArchivo = "";
    }//GEN-LAST:event_menuNuevoActionPerformed

    /**
     * Evento para imprimir lo que esta dentro dentro del area de texto area
     * texto
     *
     * @param evt Parametro del evento de seleccionar el item mIimprimir del
     * menu
     */
    private void mIimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIimprimirActionPerformed
        // TODO add your handling code here:
        try {
            Boolean imprimir = areaTexto.print();
            if (imprimir) {
                JOptionPane.showMessageDialog(null, "Impreso");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }


    }//GEN-LAST:event_mIimprimirActionPerformed
    /**
     * Metodo oyente que muestra la informacion de los cradores del programa.
     *
     * @param evt evento al que escucha.
     */
    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "En la carpeta res del juego se encuentra el mapa por defecto. Cada tile se pintara con una textura dependiendo el numero en la posicion de cada respectivo bloque.", "Acerca de:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_acercaDeActionPerformed
/**
     * Metodo oyente MenuFormato4 que cambia el tipo de formato de la letra dentro del
     * cuadro de texto.
     *
     * @param evt evento al que escucha.
     */
    private void menuFormato4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormato4ActionPerformed
        // TODO add your handling code here:
        formato_letra = (Font.ITALIC+Font.BOLD);
        areaTexto.setFont(new Font(tipo_letra, formato_letra, tamaño_letra));
    }//GEN-LAST:event_menuFormato4ActionPerformed

    private void menuNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuNuevoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNuevoKeyTyped

    /**
     * Evento de tecla presionada el cual guarda el texto que se encuentra en el
     * campo de texto, a fin de guardar lo procesado por el usuario.
     *
     * @param evt ebento escuchado
     */
    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed

        paneltexto = this.areaTexto.getText();
        GuardarComo gc = new GuardarComo();
        guardado = 1;
        gc.setVisible(true);

    }//GEN-LAST:event_menuGuardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {
            JFileChooser buscador = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        buscador.setFileFilter(filter);
        File workingDirectory = new File(System.getProperty("user.dir"));
        buscador.setCurrentDirectory(workingDirectory);
        int result = buscador.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = buscador.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                JOptionPane.showMessageDialog(this, "No has seleccionado un archivo exixtente");
            } else {
                Game game = new Game("Prueba Mapa", 640, 360, fileName.getAbsolutePath());
                
                game.start();
            }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar el mapa por razones desconocidas.");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(WorldEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorldEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorldEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorldEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WorldEditor().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDe;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem mIimprimir;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuCopiar;
    private javax.swing.JMenuItem menuCortar;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuFormato;
    private javax.swing.JMenuItem menuFormato1;
    private javax.swing.JMenuItem menuFormato2;
    private javax.swing.JMenuItem menuFormato3;
    private javax.swing.JMenuItem menuFormato4;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenu menuLetra;
    private javax.swing.JMenuItem menuLetra1;
    private javax.swing.JMenuItem menuLetra10;
    private javax.swing.JMenuItem menuLetra11;
    private javax.swing.JMenuItem menuLetra12;
    private javax.swing.JMenuItem menuLetra13;
    private javax.swing.JMenuItem menuLetra14;
    private javax.swing.JMenuItem menuLetra15;
    private javax.swing.JMenuItem menuLetra16;
    private javax.swing.JMenuItem menuLetra17;
    private javax.swing.JMenuItem menuLetra18;
    private javax.swing.JMenuItem menuLetra19;
    private javax.swing.JMenuItem menuLetra2;
    private javax.swing.JMenuItem menuLetra3;
    private javax.swing.JMenuItem menuLetra4;
    private javax.swing.JMenuItem menuLetra5;
    private javax.swing.JMenuItem menuLetra6;
    private javax.swing.JMenuItem menuLetra7;
    private javax.swing.JMenuItem menuLetra8;
    private javax.swing.JMenuItem menuLetra9;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenu menuOpGuardar;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenuItem menuPegar;
    private javax.swing.JMenu menuProbar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuTamaño;
    private javax.swing.JMenuItem menuTamaño1;
    private javax.swing.JMenuItem menuTamaño2;
    private javax.swing.JMenuItem menuTamaño3;
    private javax.swing.JMenuItem menuTamaño4;
    private javax.swing.JMenuItem menuTamaño5;
    private javax.swing.JMenuItem menuTamaño6;
    private javax.swing.JMenuItem menuTamaño7;
    private javax.swing.JMenuItem menuTamaño8;
    private javax.swing.JMenuItem menuTamaño9;
    // End of variables declaration//GEN-END:variables
public String tipo_letra = "Arial";
    public int formato_letra = Font.PLAIN;
    public int tamaño_letra = 12;
    public static int guardado;
    public static String paneltexto;
    public static String nombreArchivo;
    public String mundo;
}
