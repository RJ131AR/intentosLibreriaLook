package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import vista.Login;

public class ControladorL implements ActionListener {

    private Login frmL;

    public ControladorL(Login frmL) {
        this.frmL = frmL;
        this.frmL.btnIngresar.addActionListener(this);
    }

    public void iniciarJtatto() {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error frameLogin: " + e.getMessage());
        }
        Login windows = new Login();
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);

    }

    public void iniciar() {
        frmL.setVisible(true);
        frmL.setLocationRelativeTo(null);
    }

    public void intentos1() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error frameLogin: " + e.getMessage());
        }
        frmL.setVisible(true);
        frmL.setLocationRelativeTo(null);
    }

    public void intentos2() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            
            frmL.setVisible(true);
            frmL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frmL.setLocationRelativeTo(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error frameLogin: " + e.getMessage());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmL.btnIngresar) {
            int valor = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (valor == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

}
