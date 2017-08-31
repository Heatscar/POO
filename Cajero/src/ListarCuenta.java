import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ListarCuenta extends JDialog {
    private JPanel contentPane;
    private JButton usuario;
    private JButton contraseña;
    private JTextField textUsuario;
    private JPasswordField textContraseña;
    private JButton Ok;
    private JButton cancelar;
    private JTextArea textArea;
    private JButton limpiar;

    public ListarCuenta() throws HeadlessException{
        setVisible(true);
        setTitle("Listar Cuenta ");
        setContentPane(contentPane);
        pack();
        setSize(650,650);
        setModal(true);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
                try{
                    FileInputStream File=new FileInputStream("XDXD.txt");
                    ObjectInputStream Object=new ObjectInputStream(File);

                    Main.nueva=(ArrayList<Cuentas>)Object.readObject();
                    int nCuen = Integer.parseInt(textUsuario.getText());
                    int nContra =Integer.parseInt(textContraseña.getText());


                    for(Cuentas a: Main.nueva)
                        if (a instanceof Cuentas) {
                            if (nCuen == a.getnCuenta() && nContra == a.getContraseñaNIP()) {
                                textArea.setText("Acaba de abrir la cuenta: " + "\n" + a.getnCuenta() + "\n"
                                        + "Con los siguientes datos:" +
                                        "\n" + "Nombre: " + "\n"
                                        + a.getNombre1() + "\n"
                                        + "Primer Apellido: " + "\n" + a.getApePaterno() + "\n" + "Segundo Apellido: "
                                        + "\n"
                                        + a.getApeMaterno() + "\n" + "Contraseña: " + "\n" + a.getContraseñaNIP() + "\n"
                                        + "Usted cuenta con la cantidad de: " + "\n" + a.getDinero());
                            }
                        }

                    Object.close();
                    File.close();
                    JOptionPane.showMessageDialog(null,"Finalizado ");
                    //JFrame.dispose();
                }
                catch(Exception A)
                {
                    JOptionPane.showMessageDialog(null, "Lo Sentimos. Ha Ocurrido un Error ");
                }
            }
        });
        limpiar.addActionListener(new Action() {
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
                Limpiador();
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
              System.exit(0);
            }
        });
    }

    public void Limpiador(){
        textArea.setText("");
    }
}

