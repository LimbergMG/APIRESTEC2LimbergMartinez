package pe.edu.cibertec.APIRESTEC2LimbergMartinez.service;

import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Cuenta;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Persona;

import java.util.List;

public interface ICuentaService {
    Cuenta registrarCuenta(Cuenta cuenta);
    public List<Cuenta> ListarCuenta();
    public Cuenta obtenerCuenta(Integer id);

}
