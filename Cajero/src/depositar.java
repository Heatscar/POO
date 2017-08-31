import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class depositar extends JDialog {
    private JPanel Panel;
    private JButton NumeroCuentaButton;
    private JButton contraseñaButton;
    private JTextField cuentatext;
    private JPasswordField contratext;
    private JButton montoADepositarButton;
    private JTextField depositotext;
    private JButton Ok;
    private JButton cancelar;

    public depositar() throws HeadlessException {
        setContentPane(Panel);
        pack();
        setVisible(true);
        setTitle("Depositar ");
        setSize(650,650);
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

                float a=Integer.parseInt(depositotext.getText());
                int nCuen = Integer.parseInt(cuentatext.getText());
                int nContra =Integer.parseInt(contratext.getText());

                /*try {
                    if (a < 0) {
                        JOptionPane.showMessageDialog(null, "Ingresaste un numero negativo");

                    }
                }catch(Exception a1){
                    Banco ase=new Banco();
                }*/


                float Operacion =0;
                try{
                    FileInputStream File=new FileInputStream("XDXD.txt");
                    ObjectInputStream Object=new ObjectInputStream(File);

                    Main.nueva=(ArrayList<Cuentas>)Object.readObject();
                    for (Cuentas b : Main.nueva) {
                        if (b instanceof Cuentas) {
                            if (nCuen == b.getnCuenta() && nContra== b.getContraseñaNIP()){
                                Operacion= b.getDinero();
                                Operacion=Operacion+ Math.abs(Float.parseFloat(depositotext.getText()));
                                b.setDinero(Operacion);
                            }
                        }
                    }
                    Object.close();
                    File.close();
                    //JOptionPane.showMessageDialog(null, "Deposito realizado ");
                }
                catch(Exception A)
                {
                    JOptionPane.showMessageDialog(null, "A Ocurrido un Error ");
                }
                try
                {
                    FileOutputStream FileOut= new FileOutputStream("XDXD.txt");
                    ObjectOutputStream ObjectOut=new ObjectOutputStream(FileOut);
                    ObjectOut.writeObject(Main.nueva);
                    //JOptionPane.showMessageDialog(null, "Se Han Guardado los Cambios ");
                    ObjectOut.close();
                    FileOut.close();
                }
                catch(IOException A)
                {
                    JOptionPane.showMessageDialog(null, "A Ocurrido un Error ");
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
