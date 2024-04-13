/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.Entiddades;

/**
 *
 * @author Estudiante
 */
public class personadatosregistro {

    /**
     * @return the usuario
     */
    private String usuario;
    private String contraseña;
    private String emal;
    
    public personadatosregistro(String usuario, String contraseña, String emal) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.emal = emal;
    }

    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the emal
     */
    public String getEmal() {
        return emal;
    }

    /**
     * @param emal the emal to set
     */
    public void setEmal(String emal) {
        this.emal = emal;
    }
}
