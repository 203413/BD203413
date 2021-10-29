package equipo4.veterinaria.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mascota")
public class Mascota {

    @Id
    @Column(name = "idMascota")
    private int idMascota;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "caracterizticas")
    private String caracterizticas;

    @Column(name = "idDuenio")
    private int idDuenio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "primerServicio")
    private String primerServicio;


    public Mascota(){

    }

    public Mascota(int idMascota, String tipo, String caracterizticas, int idDuenio, String nombre, String primerServicio){
        this.idMascota = idMascota;
        this.tipo = tipo;
        this.caracterizticas = caracterizticas;
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.primerServicio = primerServicio;
    }


    public int getIdMascota() {
        return idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrimerServicio() {
        return primerServicio;
    }

    public String getCaracterizticas() {
        return caracterizticas;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setCaracterizticas(String caracterizticas) {
        this.caracterizticas = caracterizticas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public void setPrimerServicio(String primerServicio) {
        this.primerServicio = primerServicio;
    }
}
