package ar.edu.cepit.gempresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.cepit.gempresa.model.Empresa;
import ar.edu.cepit.gempresa.repository.EmpresaRepository;

@Service
public class EmpresaService {

    // @Autowired
    EmpresaRepository empresaRepository;
    public EmpresaService (EmpresaRepository empresaRepository) {
        super();
        this.empresaRepository = empresaRepository;
    }

    public Empresa getDetalleEmpresa(String codigoEmpresa) {
        Empresa empresa = empresaRepository.findByCodigoEmpresa(codigoEmpresa);

        return empresa;
    }


    public List<Empresa> getAllEmpresas() {
        return this.empresaRepository.findAll();
    }
}
