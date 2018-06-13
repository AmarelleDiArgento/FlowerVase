package com.lotus.lotusvase.control;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.lotus.lotusvase.model.Usuario;
import com.lotus.lotusvase.service.UsuarioService;
import com.lotus.lotusvase.util.CustomErrorType;

@Controller
@RequestMapping("/v1")

public class UsuarioCtrl {


	@Autowired
	UsuarioService uSer;

	// GET
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, 
			  headers="Accept=application/json") 
public ResponseEntity<List<Usuario>> getUsuarios() {
		List<Usuario> usuList = new ArrayList<>();
		usuList = uSer.findAll();
		if (usuList.isEmpty()) {
			return new ResponseEntity(new CustomErrorType("No hay usuarios que mostrar"),HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<Usuario>>(usuList, HttpStatus.OK);

	}

	// GET
	@RequestMapping(value = "/usuarios/{id}", method = RequestMethod.GET, headers = "Accept: application/json")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable("codigo") String idUsu) {
		if (idUsu == null) {
			return new ResponseEntity(new CustomErrorType("Codigo de usuario es requerido"),HttpStatus.CONFLICT);
		}
		Usuario usufind = uSer.findById(idUsu);
		if (usufind == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Usuario>(usufind, HttpStatus.OK);
	}

	// POST
	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, headers = "Accept: application/json")
	public ResponseEntity<?> createUsuario(@RequestBody Usuario usu, UriComponentsBuilder UriComponentsBuilder) {
		if (usu.getNombre().equals(null) || usu.getNombre().isEmpty()) {
			return new ResponseEntity(new CustomErrorType("Nombre del usuario es requerido"),HttpStatus.CONFLICT);
		}
		if (uSer.findByName(usu.getNombre()) == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		uSer.save(usu);

		Usuario uFind = uSer.findByName(usu.getNombre());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(UriComponentsBuilder.path("/v1/Usuarios/{id}").buildAndExpand(uFind.getCodigo()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
	//Update
	@RequestMapping(value = "/usuarios/{id}", method = RequestMethod.PATCH, headers = "Accept: application/json")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable("codigo") String idUsu, @RequestBody Usuario usu) {
		Usuario currentUsuario = uSer.findById(idUsu);
		
		if (idUsu == null || idUsu.isEmpty()) {
			return new ResponseEntity(new CustomErrorType("Codigo de usuario es requerido"),HttpStatus.CONFLICT);
		}
		if (currentUsuario == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		currentUsuario.setCodigo(usu.getCodigo());
		currentUsuario.setNombre(usu.getNombre());
		currentUsuario.setUsuario(usu.getUsuario());
		currentUsuario.setPassword(usu.getPassword());
		currentUsuario.setAvatar(usu.getAvatar());
		currentUsuario.setEstado(usu.getEstado());
		
		uSer.update(currentUsuario);
		return new ResponseEntity<Usuario>(currentUsuario, HttpStatus.OK);
	}
	
	//DELETE
	@RequestMapping(value = "/usuarios/{id}", method = RequestMethod.DELETE, headers = "Accept: application/json")
	public ResponseEntity<Usuario> deleteUsuario(@PathVariable("codigo") String idUsu) {
		Usuario currentUsuario = uSer.findById(idUsu);

		if (idUsu == null || idUsu.isEmpty()) {
			return new ResponseEntity(new CustomErrorType("Codigo de usuario es requerido"),HttpStatus.CONFLICT);
		}
		Usuario usufind = uSer.findById(idUsu);
		
		if (usufind == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		uSer.deleteById(idUsu);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	

	
}
