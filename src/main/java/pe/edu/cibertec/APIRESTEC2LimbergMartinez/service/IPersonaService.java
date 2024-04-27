package pe.edu.cibertec.APIRESTEC2LimbergMartinez.service;

import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Persona;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.dto.PersonaRequestDto;

import java.util.List;

public interface IPersonaService {
    Persona registrarPersona(PersonaRequestDto personaRequestDto);
    public List<Persona> listarPersonas();
    public Persona obtenerPersona(Integer id);
    public Persona registrarPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public String eliminarPersona(Integer id);
}
