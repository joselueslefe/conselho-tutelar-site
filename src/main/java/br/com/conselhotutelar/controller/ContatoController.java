package br.com.conselhotutelar.controller;

import br.com.conselhotutelar.model.MensagemTest;
import br.com.conselhotutelar.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContatoController {

    @Autowired
    private MensagemRepository mensagemRepository;

    @PostMapping("/contato/enviar")
    public String enviarMensagem(@RequestParam String nome,
                                 @RequestParam String email,
                                 @RequestParam String mensagem,
                                 RedirectAttributes redirectAttributes) {

        MensagemTest novaMensagem = new MensagemTest();
        novaMensagem.setNome(nome);
        novaMensagem.setEmail(email);
        novaMensagem.setMensagem(mensagem);

        mensagemRepository.save(novaMensagem);

        // Redireciona com parâmetro de sucesso
        redirectAttributes.addAttribute("sucesso", "true");

        return "redirect:/contato";
    }
}
