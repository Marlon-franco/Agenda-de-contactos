package sv.AgendaOnline.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.AgendaOnline.Api.model.Contacto;
// Se especifica para que entidad es la interfaz (Contacto) y el tipo de dat de la llave primaria(Integer)
public interface ContactoRepository extends JpaRepository <Contacto, Integer>{
}
