package equipo4.veterinaria.Modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cita")
public class Cita {
     @Id
     @Column(name = "idCita")
    private int idCita ;

    @Column(name = "idMascota")
    private int idMascota ;

    @Column(name = "Fecha")
    private String Fecha;

    @Column(name = "Hora")
    private String Hora ;

    @Column(name = "Servicio")
    private String Servicio;

    public Cita(){

    }

    public Cita(int idCita, int idMascota, String Fecha, String Hora, String Servicio){
        this.idCita = idCita;
        this.idMascota = idMascota;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Servicio = Servicio;
    }


    public int getIdCita() {
        return idCita;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

}


