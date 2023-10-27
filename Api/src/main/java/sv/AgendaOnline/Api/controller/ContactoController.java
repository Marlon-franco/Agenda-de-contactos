package sv.AgendaOnline.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
     String crear(@Validated Contacto contacto, BindingResult bindingResult, RedirectAttributes ra,Model model) {
        if (bindingResult.hasErrors()){ // el contacto no debe ser el que se recibe para que se muestre la validacion
            model.addAttribute("contacto", contacto);
            return "nuevo";
        }

         // se agrega valor a la fecha de registro ya que no puede ser null
         contacto.setFechaRegistro(LocalDateTime.now());
         contactoRepository.save(contacto);
         //se crea una alerta si el contacto se ha creado correctamente
         ra.addFlashAttribute("msgExito", "El contacto se ha creado correctamente");

         return "redirect:";
     }

//muestra el formulario
    @GetMapping("/{id}/editar")
    String editar(@PathVariable Integer id, Model model){
       Contacto contacto = contactoRepository.getReferenceById(id);
        model.addAttribute("contacto", contacto);
        return "editar";
    }
//edita el formulario

    @PostMapping("/{id}/editar")
    String actualizar(
            @PathVariable Integer id,
            @Validated Contacto contacto,
            BindingResult bindingResult,
            RedirectAttributes ra,Model model
    ) {
        if (bindingResult.hasErrors()){ // el contacto no debe ser el que se recibe para que se muestre la validacion
            model.addAttribute("contacto", contacto);
            return "editar";
        }
        Contacto contactoFromDB = contactoRepository.getReferenceById(id);
        contactoFromDB.setNombre(contacto.getNombre());
        contactoFromDB.setCelular(contacto.getCelular());
        contactoFromDB.setEmail(contacto.getEmail());
        contactoFromDB.setFechaNacimiento(contacto.getFechaNacimiento());

        contactoRepository.save(contactoFromDB);
        ra.addFlashAttribute("msgExito", "El contacto se ha creado correctamente");

        return "redirect:";
    }

}
