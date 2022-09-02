package com.Estado.TabelasEstadoECidade.repository;

import com.Estado.TabelasEstadoECidade.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
