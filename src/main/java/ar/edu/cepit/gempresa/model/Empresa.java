package ar.edu.cepit.gempresa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    @Column(name = "empresaNombre", length = 100, nullable = false )
    private String empresaNombre;

    @Column(name = "codEmpresa", length = 100, nullable = false)
    private String codigoEmpresa;

    @Column(name = "cotizationInicial", precision = 7)
    private Double cotizacionInicial; 

    @Column(name = "cantidadAcciones")
    private Long cantidadAcciones;

    public Empresa() { }
    public Empresa(String codigoEmpresa, String nombreEmpresa){
        this.codigoEmpresa = codigoEmpresa;
        this.empresaNombre = nombreEmpresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresaNombre() {
        return empresaNombre;
    }

    public void setEmpresaNombre(String empresaNombre) {
        this.empresaNombre = empresaNombre;
    }

    public Double getCotizacionInicial() {
        return cotizacionInicial;
    }

    public void setCotizacionInicial(Double cotizacionInicial) {
        this.cotizacionInicial = cotizacionInicial;
    }

    public Long getCantidadAcciones() {
        return cantidadAcciones;
    }

    public void setCantidadAcciones(Long cantidadAcciones) {
        this.cantidadAcciones = cantidadAcciones;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

}
