package br.xksoberbado.eagerlazy.controller;

import br.xksoberbado.eagerlazy.dto.CityDto;
import br.xksoberbado.eagerlazy.model.City;
import br.xksoberbado.eagerlazy.repository.CityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/city")
public class CityController {

    @Autowired
    private CityRepository repository;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(repository.findAll()
                .stream().map(this::toDto));
    }

    private CityDto toDto(City city){
        return mapper.map(city, CityDto.class);
    }

}
