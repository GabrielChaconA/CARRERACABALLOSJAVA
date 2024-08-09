# Horse race | Gabriel Chacon Arellano | 
## PREVIEW
![Descripción del GIF](https://raw.githubusercontent.com/GabrielChaconA/imagenes/main/2024-08-06%2019-47-25.gif?token=GHSAT0AAAAAACUUA6KJVP5RRHSXP3L47TQSZVS3IMQ)



## Introduction 
I developed a random game about a horse race, using the NetBeans graphical interface. I completed the project by adding two JFrame classes to create the visual aspect of the code, one for the horse race and the mechanical and visual aspect of it. To achieve this, I implemented the Runnable class and the run() method:

## 1. First, I initialized the variables
```java
  private Random ran = new Random();
  private Thread hilo;
  private int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, contador = 0;
```
## 2. Then, I added different JPanels in the NetBeans interface naming them c1..c5 according to the number of horses added
```java
private javax.swing.JLabel background;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JButton jButton1;
```
## 3.In the run() method, I implemented the logic for the movement and animation of the horses, using 4 images of the same horse, inside a while loop that breaks when the JPanels reach a certain distance traveled
```java
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
```
## 4. Finally, I implemented another JFrame to display a victory screen, showing the winner

```java
public VictoryScreen(String texto) {
        initComponents();
        initComponents();
        //This screen show the race winner
        TEXT.setText("WINNER:horse " + texto);
    }
```
![Descripción de la imagen](https://raw.githubusercontent.com/GabrielChaconA/imagenes/main/Captura%20de%20pantalla%202024-08-06%20200555.png?token=GHSAT0AAAAAACUUA6KJVSVU6WNFRMJTKWB2ZVS3JWA)
## 5. Result:



![Descripción del GIF](https://raw.githubusercontent.com/GabrielChaconA/imagenes/main/2024-08-06%2019-47-25.gif?token=GHSAT0AAAAAACUUA6KJVP5RRHSXP3L47TQSZVS3IMQ)
