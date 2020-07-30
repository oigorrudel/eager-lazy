package br.xksoberbado.eagerlazy.repository;

import br.xksoberbado.eagerlazy.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
