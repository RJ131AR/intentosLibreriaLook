
package principal;

import vista.Login;
import controlador.ControladorL;


public class Principal {
    
    public static void main(String[] args) {
    Login frmL = new Login();
    
    ControladorL ctrl = new ControladorL(frmL);
    //ctrl.iniciar();  // metodo con tema por defecto
    //ctrl.iniciarJtatto();
    //ctrl.intentos1();
    ctrl.intentos2();
    
    }
    
}
