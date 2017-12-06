
package archivo;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class GestionDato1 {
    
    private List<Persona> personaList;
    private List<Auto> autoList;

    public GestionDato1(List<Persona> personaList, List<Auto> autoList) {
        this.personaList = personaList;
        this.autoList = autoList;
    }
    public boolean persistirPersonaList(List<Persona> personaList) throws IOException {
        try{
            boolean retorno = false;
            FileOutputStream ae = new FileOutputStream("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS", true);
            DataOutputStream escritura = new DataOutputStream(ae);
            for (Persona p: personaList){
                escritura.writeInt(p.getCodigo());
                escritura.writeUTF(p.getNombre());
                escritura.writeInt(p.getEdad());
            }
            escritura.close();
            return true;
        }catch(EOFException e1){
            
        }
        return false;
    }
    
    public boolean persistirAutoList(List<Auto> autoList) throws IOException {
        try{
            boolean retorno = false;
            FileOutputStream ae = new FileOutputStream("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS", true);
            DataOutputStream escritura = new DataOutputStream(ae);
            for (Auto a: autoList){
                escritura.writeUTF(a.getMarca());
                escritura.writeUTF(a.getPlaca());
                escritura.writeInt(a.getDuenio().getCodigo());
            }
            escritura.close();
            return true;
        }catch(EOFException e1){
            
        }
        return false;
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
