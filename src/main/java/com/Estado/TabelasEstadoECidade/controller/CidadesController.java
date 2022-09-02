package com.Estado.TabelasEstadoECidade.controller;

import com.Estado.TabelasEstadoECidade.model.Cidades;
import com.Estado.TabelasEstadoECidade.service.CidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadesController {

    @Autowired
    CidadesService cidadesService;

    @GetMapping(path = "/cidades")
    public List<Cidades> buscarTodasCidades(){return cidadesService.buscarTodos();}

    @GetMapping(path = "/cidades/{codigo}")
    public Optional<Cidades>BuscarPorId(@PathVariable Integer codigo){ return cidadesService.buscarId(codigo);}

    @PostMapping(path = "/cidades")
    @ResponseStatus(HttpStatus.CREATED)
    public Cidades cadastrarCidade(@RequestBody Cidades cidades){return cidadesService.cadastrar(cidades);}

    @PutMapping(path = "/cidades/{codigo}")
    public Cidades alterarCidade(@RequestBody Cidades cidades){ return cidadesService.alterar(cidades);}

    @DeleteMapping(path = "/cidades/{codigo}")
    public void deletarcidade(@PathVariable Integer codigo){cidadesService.deletar(codigo);}
}
