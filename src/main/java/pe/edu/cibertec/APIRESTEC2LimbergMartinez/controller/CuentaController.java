package pe.edu.cibertec.APIRESTEC2LimbergMartinez.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Cuenta;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.service.ICuentaService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/cuenta")
public class CuentaController {
    @Autowired
    private ICuentaService iCuentaService;
    @GetMapping
    public ResponseEntity<?> listarCuenta() {
        List<Cuenta> personas = iCuentaService.ListarCuenta();
        return new ResponseEntity<>(personas, personas.size() > 0
                ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> obtenerCuenta(@PathVariable("id")
                                            Integer id) {
        return new
                ResponseEntity<>(iCuentaService.obtenerCuenta(id),
                HttpStatus.OK);
    }
}
