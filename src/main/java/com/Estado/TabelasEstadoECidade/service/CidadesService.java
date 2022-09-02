package com.Estado.TabelasEstadoECidade.service;

import com.Estado.TabelasEstadoECidade.model.Cidades;
import com.Estado.TabelasEstadoECidade.repository.CidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadesService {

    @Autowired
    CidadesRepository cidadesRepository;

    public List<Cidades> buscarTodos(){return cidadesRepository.findAll();}

    public Optional<Cidades>buscarId(Integer codigo){ return cidadesRepository.findById(codigo);}

    public Cidades cadastrar(Cidades cidades){
        cidades.getCodigo();
        cidades.getCidade();
        return cidadesRepository.save(cidades);
    }
    public Cidades alterar(Cidades cidades){
        cidades.getCodigo();
        cidades.getCidade();
        return cidadesRepository.save(cidades);
    }

    public void deletar(Integer codigo){cidadesRepository.deleteById(codigo);}
}
