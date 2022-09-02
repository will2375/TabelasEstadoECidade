package com.Estado.TabelasEstadoECidade.repository;

import com.Estado.TabelasEstadoECidade.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadesRepository extends JpaRepository<Cidades, Integer> {
}
