package ar.edu.cepit.gempresa.services;

import org.springframework.stereotype.Service;

import ar.edu.cepit.gempresa.model.Empresa;

@Service
public class EmpresaService {

    public Empresa getDetalleEmpresa(String codigoEmpresa) {
        Empresa ret = new Empresa();
        ret.setCodigoEmpresa(codigoEmpresa);
        return ret;
    }

}
