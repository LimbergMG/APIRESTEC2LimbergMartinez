package pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCuenta;
    private String NroCuenta;
    private Date FechaRegistro;

    private Date FechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "IdPersona")
    private Persona persona;
}
