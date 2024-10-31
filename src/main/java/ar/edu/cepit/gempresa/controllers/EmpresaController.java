package ar.edu.cepit.gempresa.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("")
    public ResponseEntity<Map<String, Object>> getAllEmpresas() {
        List<Empresa> empresa = this.empresaService.getAllEmpresas();

        Map<String, Object> response = new HashMap<>();
        response.put("data", empresa);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    


    @GetMapping(value="/{codigoEmpresa}/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getDetalleEmpresa(
        @PathVariable(name = "codigoEmpresa") String codigoEmpresa
    ) {
        Empresa emp = this.empresaService.getDetalleEmpresa(codigoEmpresa);

        Map<String, Object> response = new HashMap<>();
        if(emp == null){
            response.put("error", "Recurso no encontrado");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        response.put("data", emp);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
