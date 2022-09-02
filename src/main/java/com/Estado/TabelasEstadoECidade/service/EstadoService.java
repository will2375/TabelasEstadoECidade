package com.Estado.TabelasEstadoECidade.service;

import com.Estado.TabelasEstadoECidade.model.Estado;
import com.Estado.TabelasEstadoECidade.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado>buscarTodos(){return estadoRepository.findAll();}

    public Optional<Estado>buscarId(Integer codigo){return estadoRepository.findById(codigo);}

    public Estado cadastrar(Estado estado){
        estado.getCodigo();
        estado.getNomeEstado();
        return estadoRepository.save(estado);
    }

    public Estado alterar(Estado estado){
        estado.getCodigo();
        estado.getNomeEstado();
        return estadoRepository.save(estado);
    }

    public void deletar(Integer codigo){ estadoRepository.deleteById(codigo);}
}
