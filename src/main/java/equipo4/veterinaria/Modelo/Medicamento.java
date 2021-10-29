package equipo4.veterinaria.Modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicamento")
public class Medicamento {


    @Id
    @Column(name = "Codigo")
    private int Codigo;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Sustancia")
    private String Sustancia;

    @Column(name = "Caducidad")
    private String Caducidad;


    public Medicamento(){

    }

    public Medicamento(int codigo, String nombre, String sustancia, String caducidad){
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Sustancia = sustancia;
        this.Caducidad = caducidad;

    }

    public String getNombre() {
        return Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public String getSustancia() {
        return Sustancia;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCaducidad(String caducidad) {
        Caducidad = caducidad;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public void setSustancia(String sustancia) {
        Sustancia = sustancia;
    }
}
