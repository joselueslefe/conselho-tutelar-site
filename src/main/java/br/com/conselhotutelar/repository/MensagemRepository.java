package br.com.conselhotutelar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.conselhotutelar.model.MensagemTest;

public interface MensagemRepository extends JpaRepository<MensagemTest, Long> {
}
