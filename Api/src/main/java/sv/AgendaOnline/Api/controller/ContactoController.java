package sv.AgendaOnline.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sv.AgendaOnline.Api.model.Contacto;
import sv.AgendaOnline.Api.repository.ContactoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;
    @GetMapping
    String index(Model model){
        List<Contacto> contactos = contactoRepository.findAll();
        //se le pasa los datos a la plantilla de HTML que son (contactos) los datos traidos de la la tabla de la BASE DE DATOS(mysql)
        model.addAttribute("contactos", contactos);

        return "index";
    }

    @GetMapping("/nuevo")
    String nuevo(Model model){
        // Se le agega un atributo al model llamdo contacto su valor es "new Contacto" la cual es una instancia
        model.addAttribute("contacto", new Contacto());
    return "nuevo";
    }
     @PostMapping("/nuevo")
     String crear(Contacto contacto, RedirectAttributes ra) {
         // se agrega valor a la fecha de registro ya que no puede ser null
         contacto.setFechaRegistro(LocalDateTime.now());
         contactoRepository.save(contacto);
         //se crea una alerta si el contacto se ha creado correctamente
         ra.addFlashAttribute("msgExito", "El contacto "+contacto.getNombre()+" se ha creado correctamente");

         return "redirect: ";
     }

}
