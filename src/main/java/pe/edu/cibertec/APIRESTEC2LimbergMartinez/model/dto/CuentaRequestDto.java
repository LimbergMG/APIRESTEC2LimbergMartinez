package pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CuentaRequestDto {
    private String NroCuenta;
    private Date FechaRegistro;

    private Date FechaVencimiento;

}
