package Ghaphics;

import java.util.Random;

public class HorseScreen extends javax.swing.JFrame implements Runnable {

    private Random ran = new Random();
    private Thread hilo;

    private int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, contador = 0;

    public HorseScreen() {
        initComponents();
        hilo = new Thread(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 70, 70));

        c2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 60, 60));

        c3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 60, 70));

        c4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 60, -1));

        c5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 60, 70));

        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\Diseño sin título (1).png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hilo.start();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // This assing speed horses
            x1 += ran.nextInt(11);
            x2 += ran.nextInt(11);
            x3 += ran.nextInt(11);
            x4 += ran.nextInt(11);
            x5 += ran.nextInt(11);

            // update de location
            c1.setLocation(x1, c1.getLocation().y);
            c2.setLocation(x2, c2.getLocation().y);
            c3.setLocation(x3, c3.getLocation().y);
            c4.setLocation(x4, c4.getLocation().y);
            c5.setLocation(x5, c5.getLocation().y);

            // here i create the animation
            switch (contador) {
                case 1 -> {
                    c1.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png"));
                    c2.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png"));
                    c3.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png"));
                    c5.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_1__1_-removebg-preview.png"));
                }
                case 2 -> {
                    c1.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_2__1_-removebg-preview.png"));
                    c2.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_2__1_-removebg-preview.png"));
                    c3.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_2__1_-removebg-preview.png"));
                    c4.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_2__1_-removebg-preview.png"));
                    c5.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_2__1_-removebg-preview.png"));
                }
                case 3 -> {
                    c1.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_3__1_-removebg-preview.png"));
                    c2.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_3__1_-removebg-preview.png"));
                    c3.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_3__1_-removebg-preview.png"));
                    c4.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_3__1_-removebg-preview.png"));
                    c5.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_3__1_-removebg-preview.png"));
                }
                case 4 -> {
                    c1.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_4__1_-removebg-preview.png"));
                    c2.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_4__1_-removebg-preview.png"));
                    c3.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_4__1_-removebg-preview.png"));
                    c4.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_4__1_-removebg-preview.png"));
                    c5.setIcon(new javax.swing.ImageIcon(
                            "C:\\Users\\Gabriel\\Downloads\\caballo_secuencia_4__1_-removebg-preview.png"));
                }
                case 5 ->
                    contador = 1;

            }
            // if some of the horses finish the rase, the code end
            if (x1 >= 950 || x2 >= 950 || x3 >= 950 || x4 >= 950 || x5 >= 950) {
                int max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
                String texto = max == x1 ? "1" : max == x2 ? "2" : max == x3 ? "3" : max == x4 ? "4" : "5";
                //here i open the screen and finish the code 
                VictoryScreen vscreen = new VictoryScreen(texto);
                vscreen.setVisible(true);
                vscreen.setLocationRelativeTo(null);
                break;

            }
            //this gonna add a 1 to the counter
            contador++;

        }
    }
}
