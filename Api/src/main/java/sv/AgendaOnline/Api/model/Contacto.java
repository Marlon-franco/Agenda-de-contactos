package sv.AgendaOnline.Api.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // se agrega la notacion "@colum" para que coincida con la base de datos
    @Column(name = "idcontacto")
    private Integer id;
    private String nombre;

    // se agrega la notacion "@DateTimeFormat" para especificar el tipo de fecha
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fechanac")
    private LocalDate fechaNacimiento;
    private String celular;
    private String email;
    @Column(name = "fechareg")
    private LocalDateTime fechaRegistro;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


}
