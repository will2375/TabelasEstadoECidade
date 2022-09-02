package com.Estado.TabelasEstadoECidade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cidades")
public class Cidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private String cidade;

    @ManyToOne
    @JoinColumn(name= "cidade_id", referencedColumnName = "codigo")
    private Estado estado;

}
