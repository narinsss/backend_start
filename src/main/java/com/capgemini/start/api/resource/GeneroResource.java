package com.capgemini.start.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.capgemini.start.api.dto.input.GeneroInputDTO;
import com.capgemini.start.api.dto.output.GeneroDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Genero", description = "Tipo de gênero de título")
public interface GeneroResource {
	@Operation(summary = "Consultar um gênero por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<GeneroDTO> findById(@PathVariable Integer id);
	
	@Operation(summary = "Insere um gênero")
	@PostMapping()
	ResponseEntity<GeneroDTO> insert(@RequestBody @Valid GeneroInputDTO genero);
	
	@Operation(summary = "Lista todos os gêneros")
	@GetMapping()
	ResponseEntity<List<GeneroDTO>> findAll();
	
	@Operation(summary = "Atualiza um gênero")
	@PutMapping(value = "/{id}")
	ResponseEntity<GeneroDTO> update(@PathVariable Integer id, @RequestBody @Valid GeneroDTO genero);
	
	@Operation(summary = "Exclui um gênero")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Integer id);

}
