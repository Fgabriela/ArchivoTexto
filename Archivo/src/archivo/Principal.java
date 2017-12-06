
package archivo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        File archivoTexto = new File("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");
        File archivoTextoAuto = new File("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");
        
        List<Persona> personaList = new ArrayList<Persona>();
        Persona p1 = new Persona (10,"Juan Perez",28);
        Persona p2 = new Persona (20,"Javier Yunga",25);
        Persona p3 = new Persona (30,"Esteban Calderon",35);
        
        personaList.add(p1);
        personaList.add(p2);
        personaList.add(p3);
        
        List<Auto> autoList = new ArrayList<Auto>();
        Auto a1 = new Auto("","",p1);
        Auto a2 = new Auto("","",p2);
        Auto a3 = new Auto("","",p3);
        
        autoList.add(a1);
        autoList.add(a2);
        autoList.add(a3);
        
        GestionDato gD = new GestionDato(personaList, autoList);
        gD.persistirPersonaList(personaList);
        gD.persistirAutoList(autoList);
    }
    
}
