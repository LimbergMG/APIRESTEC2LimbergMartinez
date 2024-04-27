package pe.edu.cibertec.APIRESTEC2LimbergMartinez.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Persona;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.service.ICuentaService;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.service.IPersonaService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/persona")
public class PersonaController {
    @Autowired
    private IPersonaService iPersonaService;
    @GetMapping
    public ResponseEntity<?> listarPersonas() {
        List<Persona> personas = iPersonaService.listarPersonas();
        return new ResponseEntity<>(personas, personas.size() > 0
                ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> obtenerPersona(@PathVariable("id")
                                            Integer id) {
        return new
                ResponseEntity<>(iPersonaService.obtenerPersona(id),
                HttpStatus.OK);
    }



    

}
