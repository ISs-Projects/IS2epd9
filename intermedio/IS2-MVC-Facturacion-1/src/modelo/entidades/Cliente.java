/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;

/**
 *
 * @author rober
 */
public interface Cliente extends Serializable {
    
    String getDNI();
    String getNombre();
    String getDireccion();
    
    void setDNI(String dni);
    void setNombre(String nombre);
    void setDireccion(String direccion);
}
