import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoAdivinar {
    private JPanel main;
    private JTextField textField1;
    private JButton adivinarButton;
    private JButton salirButton;

    int numeroadivinar,numerousuario,contador =0, limiteintentos=10;

    public JuegoAdivinar()
    {
        adivinarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Adivinar();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public void Adivinar()
    {
        numeroadivinar =(int)(Math.random()*100)+1;

        numerousuario =Integer.parseInt(textField1.getText());
        contador++;

        if (numerousuario > numeroadivinar){
            JOptionPane.showMessageDialog(null,"¡Demasiado alto, inténtalo de nuevo!");
        } else if (numerousuario < numeroadivinar){
            JOptionPane.showMessageDialog(null,"¡Demasiado bajo, inténtalo de nuevo!");
        } else  {
            JOptionPane.showMessageDialog(null,"¡Felicidades! Adivinaste el número! En: " +contador+  "intentos" );
        }

        if (contador >=limiteintentos){
            JOptionPane.showMessageDialog(null,"¡Alcanzaste el limite de intentos!. El nùmero era: " +numeroadivinar);
        }
        return;

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("JuegoAdivinar");
        frame.setContentPane(new JuegoAdivinar().main);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setVisible(true);




    }
}

