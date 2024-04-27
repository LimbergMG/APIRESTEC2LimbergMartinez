package pe.edu.cibertec.APIRESTEC2LimbergMartinez.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.model.bd.Cuenta;
import pe.edu.cibertec.APIRESTEC2LimbergMartinez.repository.CuentaRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CuentaService implements ICuentaService{
    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public Cuenta registrarCuenta(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    @Override
    public List<Cuenta> ListarCuenta() {
        return cuentaRepository.findAll();
    }

    @Override
    public Cuenta obtenerCuenta(Integer id) {
        return cuentaRepository.findById(id).get();
    }
}
