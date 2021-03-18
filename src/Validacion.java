
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * @author DGOMEZ
 */
public class Validacion {

    private static ImageIcon iconError;

    public Validacion() {
        iconError = new ImageIcon("src/images/cancelar.png");
    }

    public void validarTexto(String nombre, String telefono, String celular, String correo) {
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [Nombre], no puede estar vacio", "Mis Contactos - NetBeansIDE",
                    JOptionPane.OK_OPTION, iconError);
        }
        
        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [Teléfono Fijo], no puede estar vacio", "Mis Contactos - NetBeansIDE", 
                    JOptionPane.OK_OPTION, iconError);
        }
        
        if (celular.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [Celular], no puede estar vacio", "Mis Contactos - NetBeansIDE", 
                    JOptionPane.OK_OPTION, iconError);
        }
        
        if(correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [Correo], no puede estar vacio", "Mis Contactos - NetBeansIDE", 
                    JOptionPane.OK_OPTION, iconError);
        }
    }
    
    public void validarTeclaNumero(java.awt.event.KeyEvent tecla) {
        if (tecla.getKeyChar() < '0' || tecla.getKeyChar() > '9') {
            tecla.consume();
        }
    }
}
