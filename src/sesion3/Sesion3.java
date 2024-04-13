/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import java.util.HashSet;
import sesion3.Entiddades.Persona;
import sesion3.Entiddades.Persona2;
import sesion3.Entiddades.Personacontact;
import sesion3.Entiddades.personadatosbasicos;
import sesion3.Entiddades.personadatosregistro;

/**
 *
 * @author Estudiante
 */
public class Sesion3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per = new Persona("Marcos");
        per.setNombre("Juan");
        per.setApellido("Diaz");
        per.setDni("0005555");
        per.setDireccion("Av Manzanita 456");
        per.setTelefono("991847595");
        per.setCorreo("juan.diaz@upn.pe");
        per.setUsuario("juanchis16");
        per.setContraseña("123456");
        per.setEmail("juan.diaz@gmail.com");
        
        
        
        personadatosbasicos datab = new personadatosbasicos("Juan", "Diaz", "0005555");
        Personacontact datac = new Personacontact("Av Manzanita 456", "991847595", "juan.diaz@upn.pe");
        personadatosregistro datar = new personadatosregistro("juanchis16", "123456", "juan.diaz@gmail.com");
        
        Persona2 per2 = new Persona2(datab, datac, datar);
        
        Persona carlitos = Persona.Carlos();
        Persona marco = Persona.Marcos();
        Persona juana = Persona.Juana();
    }
    
}
