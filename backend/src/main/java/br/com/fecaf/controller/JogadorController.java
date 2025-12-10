package br.com.fecaf.controller;

import br.com.fecaf.model.Jogador;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/jogadores")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<>();

    @PostConstruct
    public void carregarJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/jogadores.json");
            jogadores = mapper.readValue(inputStream, new TypeReference<List<Jogador>>() {});
            System.out.println("✅ JSON de jogadores carregado: " + jogadores.size() + " registros.");
        } catch (Exception e) {
            System.err.println("❌ Erro ao carregar JSON: " + e.getMessage());
        }
    }

    // 🔹 Listar todos
    @GetMapping
    public List<Jogador> listar() {
        return jogadores;
    }

    // 🔹 Buscar por ID
    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable Long id) {
        return jogadores.stream()
                .filter(j -> j.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // 🔹 Criar novo jogador
    @PostMapping
    public Jogador criar(@RequestBody Jogador jogador) {
        jogador.setId((long) (jogadores.size() + 1));
        jogadores.add(jogador);
        return jogador;
    }

    // 🔹 Atualizar jogador
    @PutMapping("/{id}")
    public Jogador atualizar(@PathVariable Long id, @RequestBody Jogador jogadorAtualizado) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getId().equals(id)) {
                jogadorAtualizado.setId(id);
                jogadores.set(i, jogadorAtualizado);
                return jogadorAtualizado;
            }
        }
        return null;
    }

    // 🔹 Excluir jogador
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        boolean removido = jogadores.removeIf(j -> j.getId().equals(id));
        return removido ? "Jogador removido com sucesso." : "Jogador não encontrado.";
    }
}
