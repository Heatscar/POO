import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.io.*;
import java.util.ArrayList;

public class retirar extends JDialog {
    private JPanel contentPane;
    private JButton NumeroCuentaButton;
    private JTextField CuentaText;
    private JButton Contraseña;
    private JTextField ContraseñaText;
    private JButton Retirar;
    private JTextField RetirarText;
    private JPanel Panel;
    private JButton Ok;
    private JButton cancelar;

    public retirar() throws HeadlessException {
        setVisible(true);
        setTitle("Retirar ");
        setContentPane(Panel);
        pack();
        setModal(true);
        setSize(650, 650);



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
                int nCuen=Integer.parseInt(CuentaText.getText());
                int nContra=Integer.parseInt(ContraseñaText.getText());
                float Operacion=0;
                try{
                    FileInputStream File=new FileInputStream("XDXD.txt");
                    ObjectInputStream Object=new ObjectInputStream(File);
                    Main.nueva=(ArrayList<Cuentas>)Object.readObject();
                    for (Cuentas a : Main.nueva) {
                        if (a instanceof Cuentas) {
                            if (nCuen == a.getnCuenta() && nContra== a.getContraseñaNIP()){
                                Operacion= a.getDinero();
                                Operacion=Operacion-Math.abs(Float.parseFloat(RetirarText.getText()));
                                a.setDinero(Operacion);
                            }
                        }
                    }
                    Object.close();
                    File.close();
                    //JOptionPane.showMessageDialog(null, "Retiro Realizado ");
                }
                catch(Exception A)
                {
                    JOptionPane.showMessageDialog(null, "Lo Sentimos. Ha Ocurrido un Error ");
                }
                try
                {
                    FileOutputStream FileOut= new FileOutputStream("XDXD.txt");
                    ObjectOutputStream ObjectOut=new ObjectOutputStream(FileOut);
                    ObjectOut.writeObject(Main.nueva);
                    //JOptionPane.showMessageDialog(null, "Se Han Guadado los Cambios ");
                    ObjectOut.close();
                    FileOut.close();
                }
                catch(IOException A)
                {
                    System.out.println("Lo Sentimos. Ha Ocurrido un Error ");
                }
                dispose();
            }
        });
        cancelar.addActionListener(new Action() {
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
