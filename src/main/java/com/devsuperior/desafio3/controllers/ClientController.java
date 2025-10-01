package com.devsuperior.desafio3.controllers;

import com.devsuperior.desafio3.dto.ClientDTO;
import com.devsuperior.desafio3.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        ClientDTO dto = clientService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping()
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
        Page<ClientDTO> results = clientService.findAll(pageable);
        return ResponseEntity.ok(results);
    }

    @PostMapping()
    public ResponseEntity<ClientDTO> insert(@Valid @RequestBody ClientDTO clientDTO) {
        var dto = clientService.insert(clientDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> update(@PathVariable Long id,@Valid @RequestBody ClientDTO clientDTO) {
        var dto = clientService.update(id, clientDTO);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
