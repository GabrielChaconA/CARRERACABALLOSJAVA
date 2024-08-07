package Ghaphics;

public class VictoryScreen extends javax.swing.JFrame {

    public VictoryScreen(String texto) {
        initComponents();

        initComponents();
        //This screen show the race winner
        TEXT.setText("WINNER:horse " + texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TEXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Downloads\\1000_F_579753941_lRNgw6HD8ouKHmam2HYTMW1b0zTCaMng.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        TEXT.setBackground(new java.awt.Color(0, 0, 0));
        TEXT.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        TEXT.setForeground(new java.awt.Color(0, 0, 0));
        TEXT.setText("WINNER:");
        getContentPane().add(TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 360, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TEXT;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
