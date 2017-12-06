
package archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionDato {
    private List<Persona> personaList;
    private List<Auto> autoList;
    
    public GestionDato(List<Persona> personaList, List<Auto> autoList) {
        this.personaList = personaList;
        this.autoList = autoList;
    }
    
    public boolean persistirPersonaList(List<Persona> personaList){
        boolean retorno = false;
        try{
            FileWriter ae = new FileWriter("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS/archivoTexto.txt", true);
            BufferedWriter escritura = new BufferedWriter(ae);
            for (Persona p: personaList){
                escritura.append(p.toString());
                escritura.newLine();
            }
            escritura.close();
            return true;
            
        }catch(IOException e1){
        }
        return false;
    }
    
    public List<Persona> leerPersonaList(){
        try{
            List<Persona> p = new ArrayList<Persona>();
            
            FileReader fr = new FileReader("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS/archivoTexto.txt");
            BufferedReader lectura = new BufferedReader(fr);
            
            String leer = lectura.readLine();
            
            while(leer != null){
                return personaList;
            }
            
            return p;
        }catch(IOException e1){
            return null;
        }
    }
    
    public boolean persistirAutoList(List<Auto> autoList){
        boolean retorno = false;
        try{
            FileWriter ae = new FileWriter("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS/archivoTextoAuto.txt", true);
            BufferedWriter escritura = new BufferedWriter(ae);
            
            for (Auto a: autoList){
                escritura.append(a.toString());
                escritura.newLine();
            }
            
            escritura.close();
            
            return true;
            
        }catch(IOException e1){
        }
        return false;
    }
    
    public List<Auto> leerAutoList(){
         try{
            List<Auto> a = new ArrayList<Auto>();
            
            FileReader fr = new FileReader("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS/archivoTextoAuto.txt");
            BufferedReader lectura = new BufferedReader(fr);
            
            String leer = lectura.readLine();
            
            while(leer != null){
                return autoList;
            }
            
            return a;
            
        }catch(IOException e1){
            
            return null;
        }
    }
    
    boolean addPersona(Persona p){
        return this.addPersona(p);
    }
    
    boolean addAuto(Auto a){
        return this.addAuto(a);
    }
    
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public List<Auto> getAutoList() {
        return autoList;
    }

    public void setAutoList(List<Auto> autoList) {
        this.autoList = autoList;
    }
    
    
}
