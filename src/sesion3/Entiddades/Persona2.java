/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.Entiddades;

/**
 *
 * @author Estudiante
 */

public class Persona2 {

    /**
     * @return the datab
     */
       
    private personadatosbasicos datab;
    private Personacontact datac;
    private personadatosregistro datar;
    
        public Persona2(personadatosbasicos datab, Personacontact datac, personadatosregistro datar) {
        this.datab = datab;
        this.datac = datac;
        this.datar = datar;
    }
    public personadatosbasicos getDatab() {
        return datab;
    }

    /**
     * @param datab the datab to set
     */
    public void setDatab(personadatosbasicos datab) {
        this.datab = datab;
    }

    /**
     * @return the datac
     */
    public Personacontact getDatac() {
        return datac;
    }

    /**
     * @param datac the datac to set
     */
    public void setDatac(Personacontact datac) {
        this.datac = datac;
    }

    /**
     * @return the datar
     */
    public personadatosregistro getDatar() {
        return datar;
    }

    /**
     * @param datar the datar to set
     */
    public void setDatar(personadatosregistro datar) {
        this.datar = datar;
    }
}
