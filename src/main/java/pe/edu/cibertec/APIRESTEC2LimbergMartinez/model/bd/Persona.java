package pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPersona;
    private String NomPersona;
    private String ApePersona;
    private Date FechNacPersona;

}
