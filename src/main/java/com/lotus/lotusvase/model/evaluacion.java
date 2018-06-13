package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "evaluacion")
public class evaluacion implements Serializable {
	String id;
	String nombre;
	String detalle;
	String protocolo;
	tipoEvaluacion tipoEnsayo_id;
	Usuario solicitante;
	Usuario responsable;
	
}
