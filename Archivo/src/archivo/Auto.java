
package archivo;

public class Auto {
    private String placa;
    private String marca;
    private Persona duenio;

    public Auto(String placa, String marca, Persona duenio) {
        this.placa = placa;
        this.marca = marca;
        this.duenio = duenio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return placa + " | " + marca + " | " + duenio.getCodigo();
    }
    
}
