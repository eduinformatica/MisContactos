
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * @author dgomez
 */
public class ModeloComponente {

    DefaultTableModel modeloTablaContacto;

    public TableModel columnasTablaContacto() {
        Object[] columnas = new Object[]{"DNI", "NOMBRE", "APELLIDOS", "CELULAR", "CORREO"};
        modeloTablaContacto = new DefaultTableModel(columnas, 0);

        return modeloTablaContacto;
    }
}
