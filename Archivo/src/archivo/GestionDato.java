
package archivo;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
import java.util.List;

public class GestionDato {
    private List<Persona> personaList;
    private List<Auto> autoList;
    
    File datosPersona = new File("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");
    File datosAuto = new File("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");

    public GestionDato(List<Persona> personaList, List<Auto> autoList) {
        this.personaList = personaList;
        this.autoList = autoList;
    }
    
   /* public boolean persistirPersonaList(List<Persona> personaList){
        boolean retorno = false;
        try{
            FileWriter ae = new FileWriter("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");
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
    
    public boolean persistirAutoList(List<Auto> autoList){
        boolean retorno = false;
        try{
            FileWriter ae = new FileWriter("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS", true);
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
    
    public Persona dividido(String linea){
        String[] lineaArray = linea.split(" | ");
        Persona p = new Persona(Integer.parseInt(lineaArray[0]),lineaArray[1],Integer.parseInt(lineaArray[2]));
        return p;
    }
    
    public List<Persona> leerPersonaList(){
        try{
            List<Persona> p = new ArrayList<Persona>();
            FileReader fr = new FileReader("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");
            BufferedReader lectura = new BufferedReader(fr);
            String linea;
            while((linea= lectura.readLine())!= null){
               p.add(this.dividido(linea));
            }
            lectura.close();
            return p;
        }catch(IOException e1){
            return null;
        }
    }
    
    /*public Persona buscar(List<Persona> personaList, List<Auto> autoList){
        Auto = a;
        for (Persona p: personaList){
            if(p.getCodigo()==a)
        }
        return null;
    }
    
    public Auto dividido1(String linea){
        
        String[] lineaArray = linea.split(" | ");
        //Auto a = new Auto(lineaArray[0],lineaArray[1],lineaArray[2]);
        return null; //a 
    }
    
    public List<Auto> leerAutoList(){
         try{
            List<Auto> a = new ArrayList<Auto>();
            FileReader fr = new FileReader("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS");
            BufferedReader lectura = new BufferedReader(fr);
            String linea;
            while((linea= lectura.readLine())!= null){
               a.add(this.dividido1(linea));
            }
            lectura.close();
            return a;
        }catch(IOException e1){
            return null;
        }
    }
    */
    
    public boolean persistirPersonaList(List<Persona> personaList) throws FileNotFoundException, IOException {
        boolean retorno = false;
        FileOutputStream ae = new FileOutputStream("C:/Users/Estudiante/Documents/GUARDE AQUI SUS ARCHIVOS", true);
        DataOutputStream escritura = new DataOutputStream(ae);
        for (Persona p: personaList){
            escritura.writeInt(p.getCodigo());
            escritura.writeUTF(p.getNombre());
            escritura.writeInt(p.getEdad());
        }
        return true;
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
