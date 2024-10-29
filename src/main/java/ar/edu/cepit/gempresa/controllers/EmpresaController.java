package ar.edu.cepit.gempresa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import ar.edu.cepit.gempresa.model.Empresa;
import ar.edu.cepit.gempresa.services.EmpresaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/empresas")

public class EmpresaController {

    private EmpresaService empresaService;
    public EmpresaController(EmpresaService empresaService) {
        super();
        this.empresaService = empresaService;
    }


    @GetMapping(value="/{codigoEmpresa}/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empresa> getDetalleEmpresa(
        @PathVariable(name = "codigoEmpresa") String codigoEmpresa
    ) {
        Empresa emp = this.empresaService.getDetalleEmpresa(codigoEmpresa);
        return new ResponseEntity<Empresa>(emp, HttpStatus.OK);
    }

}
