package pe.edu.cibertec.APIRESTEC2LimbergMartinez.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Persona;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.dto.PersonaRequestDto;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.repository.PersonaRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    private ICuentaService iCuentaService;



    public Persona registrarPersona(PersonaRequestDto personaRequestDto) {
        return null;
    }


    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
    public Persona obtenerPersona(Integer id) {
        return personaRepository.findById(id).get();
    }
    public Persona registrarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
    public Persona modificarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
    public String eliminarPersona(Integer id) {
        personaRepository.deleteById(id);
        return "Persona eliminada";
    }
}
