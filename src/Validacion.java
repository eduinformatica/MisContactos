
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author DGOMEZ
 */
public class Validacion {

    private final ImageIcon iconError;
    private final ImageIcon iconWarning;
    private Pattern pat;
    private Matcher mat;
    private String patronExpresion;

    public Validacion() {
        iconError = new ImageIcon("src/images/cancelar.png");
        iconWarning = new ImageIcon("src/images/advertencia.png");
    }

    public void validarTextoVacio(String nombre, String telefono, String celular, String correo) {
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [NOMBRE], no puede estar vacio", "Mis Contactos - NetBeansIDE",
                    JOptionPane.OK_OPTION, iconError);
        }
        
        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [TELÉFONO FIJO], no puede estar vacio", "Mis Contactos - NetBeansIDE", 
                    JOptionPane.OK_OPTION, iconError);
        }
        
        if (celular.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [CELULAR], no puede estar vacio", "Mis Contactos - NetBeansIDE", 
                    JOptionPane.OK_OPTION, iconError);
        }
        
        if(correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo [CORREO], no puede estar vacio", "Mis Contactos - NetBeansIDE", 
                    JOptionPane.OK_OPTION, iconError);
        }
    }
    
    public void validarTeclaNumero(java.awt.event.KeyEvent tecla) {
        if (tecla.getKeyChar() < '0' || tecla.getKeyChar() > '9') {
            tecla.consume();
        }
    }
    
    public void validarTeclaCaracteres(String... cadenas) {
        patronExpresion = "[A-Za-z]+";
        
        for(String cadena: cadenas) {
            pat = Pattern.compile(patronExpresion); // Compilar expresion regular
            mat = pat.matcher(cadena); //Comparar expresion regular con cadena
        
            if (mat.matches()) {
                System.out.println("Texto validado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "E: Formato del texto no corresponde a un texto", "Mis Contactos - NetBeansIDE",
                        JOptionPane.OK_OPTION, iconWarning);
            }
        }
    }
    
    public void validarCorreo(String email) {
        patronExpresion = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        pat = Pattern.compile(patronExpresion);
        mat = pat.matcher(email);
        
        if(mat.find()) {
//            System.out.println("Correo valido correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "E: El correo ingresado es invalido", "Mis Contactos - NetBeansIDE",
                        JOptionPane.OK_OPTION, iconWarning);
        }
    }
}
