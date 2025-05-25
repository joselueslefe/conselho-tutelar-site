package br.com.conselhotutelar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import br.com.conselhotutelar.model.MensagemTest;
import br.com.conselhotutelar.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TesteDB implements CommandLineRunner {

    @Autowired
    private MensagemRepository mensagemRepository;

    @Override
    public void run(String... args) {
        // Verifica se já existe mensagem para evitar duplicação a cada execução
        if (mensagemRepository.count() == 0) {
            MensagemTest mensagem = new MensagemTest();
            mensagem.setNome("Maria");
            mensagem.setEmail("maria@email.com");
            mensagem.setMensagem("Olá, isso é um teste de banco de dados!");

            mensagemRepository.save(mensagem);
            System.out.println("✅ Mensagem de teste salva com sucesso!");
        } else {
            System.out.println("⚠️ Mensagem de teste já existe. Nada foi inserido.");
        }
    }
}
