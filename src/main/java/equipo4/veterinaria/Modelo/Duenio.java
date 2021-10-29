package equipo4.veterinaria.Modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Duenio")
public class Duenio {

    @Id
    @Column(name = "idDuenio")
    private int idDuenio ;


    @Column(name = "Nombre")
    private String Nombre ;

    @Column(name = "Direccion")
    private String Direccion ;

    @Column(name = "Telefono")
    private int Telefono ;



    public Duenio(){

    }


    public Duenio(int idDuenio, String nombre, String direccion, int telefono){
        this.idDuenio = idDuenio;
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.Telefono = telefono;

    }

    public String getNombre() {
        return Nombre;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
}
