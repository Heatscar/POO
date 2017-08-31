import javax.swing.*;
import javax.xml.transform.OutputKeys;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CrearCuenta extends JDialog {
    private JPanel contentPane;
    private JButton Nombre;
    private JButton apellidoPa;
    private JButton apellidoMa;
    private JTextField textNombre;
    private JTextField textApePa;
    private JTextField textApeMa;
    private JButton Contraseña;
    private JPasswordField textContraseña;
    private JButton dineroInicial;
    private JTextField textDinero;
    private JButton Cuenta;
    private JTextField textnCuenta;
    private JButton Ok;
    private JButton Cancelar;

    public CrearCuenta ()throws HeadlessException {
        setVisible(true);
        setTitle("Crear Cuenta ");
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
        setSize(650, 650);
        setModal(true);

        Ok.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Cuentas cuentitas= new Cuentas();
                cuentitas.setnCuenta(Integer.parseInt(textnCuenta.getText()));
                cuentitas.setNombre1(textNombre.getText());
                cuentitas.setApePaterno(textApePa.getText());
                cuentitas.setApeMaterno(textApeMa.getText());
                cuentitas.setDinero(Integer.parseInt(textDinero.getText()));
                cuentitas.setContraseñaNIP(Integer.parseInt(textContraseña.getText()));
                Main.nueva.add(cuentitas);

                try {
                    FileOutputStream FileOut = new FileOutputStream("XDXD.txt");
                    ObjectOutputStream ObjectOut = new ObjectOutputStream(FileOut);
                    ObjectOut.writeObject(Main.nueva);
                    ObjectOut.flush();

                    System.out.println("Sus Datos se Guardaron Correctamente ");
                }catch (Exception A){
                    JOptionPane.showMessageDialog(null,"Datos Invalidos ");
                }
                dispose();
            }
        });
        Cancelar.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}


