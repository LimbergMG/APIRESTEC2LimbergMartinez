package pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PersonaRequestDto {
    private String NomPersona;
    private String ApePersona;
    private Date FechNacPersona;
    private List<CuentaRequestDto> cuentas = new ArrayList<>();
}
