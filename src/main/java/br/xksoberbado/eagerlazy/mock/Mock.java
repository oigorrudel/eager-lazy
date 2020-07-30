package br.xksoberbado.eagerlazy.mock;

import br.xksoberbado.eagerlazy.model.City;
import br.xksoberbado.eagerlazy.model.State;
import br.xksoberbado.eagerlazy.repository.CityRepository;
import br.xksoberbado.eagerlazy.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Mock implements ApplicationRunner {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        State state = new State("Rio Grande do Sul");
        stateRepository.save(state);

        cityRepository.save(new City("Porto Alegre", state));
        cityRepository.save(new City("Alegrete", state));
        cityRepository.save(new City("Uruguaiana", state));
    }
}
