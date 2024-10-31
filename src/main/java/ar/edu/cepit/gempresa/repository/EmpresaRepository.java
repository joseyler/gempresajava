package ar.edu.cepit.gempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.cepit.gempresa.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{
    
    Empresa findByCodigoEmpresa(String codigoEmpresa);
}
