const API_URL = "http://localhost:8080/api/v1/jogadores";

async function carregarJogadores() {
    const container = document.getElementById("jogadores-container");
    container.innerHTML = "<p>Carregando jogadores...</p>";

    try {
        const response = await fetch(API_URL);
        const jogadores = await response.json();

        container.innerHTML = "";

        jogadores.forEach(j => {
            container.innerHTML += `
                <div class="col-md-4">
                    <div class="jogador-card">
                        <div class="jogador-nome">${j.nome}</div>
                        <div class="jogador-info"><strong>ID:</strong> ${j.id}</div>
                        <div class="jogador-info"><strong>Posição:</strong> ${j.posicao}</div>
                        <div class="jogador-info"><strong>Idade:</strong> ${j.idade} anos</div>
                        <div class="jogador-info"><strong>Clube:</strong> ${j.clube}</div>
                        <div class="jogador-info"><strong>Gols:</strong> ${j.golsMarcados}</div>
                    </div>
                </div>
            `;
        });

    } catch (err) {
        container.innerHTML = "<p class='text-danger'>Erro ao carregar jogadores.</p>";
    }
}

async function buscarPorId() {
    const id = document.getElementById("idInput").value;
    const container = document.getElementById("jogadores-container");

    if (!id) return alert("Digite um ID!");

    try {
        const response = await fetch(`${API_URL}/${id}`);

        if (!response.ok) {
            container.innerHTML = `<p class="text-danger">Jogador não encontrado.</p>`;
            return;
        }

        const j = await response.json();

        container.innerHTML = `
            <div class="col-md-4">
                <div class="jogador-card">
                    <div class="jogador-nome">${j.nome}</div>
                    <div class="jogador-info"><strong>ID:</strong> ${j.id}</div>
                    <div class="jogador-info"><strong>Posição:</strong> ${j.posicao}</div>
                    <div class="jogador-info"><strong>Idade:</strong> ${j.idade} anos</div>
                    <div class="jogador-info"><strong>Clube:</strong> ${j.clube}</div>
                    <div class="jogador-info"><strong>Gols:</strong> ${j.golsMarcados}</div>
                </div>
            </div>
        `;

    } catch (err) {
        container.innerHTML = "<p class='text-danger'>Erro na busca.</p>";
    }
}

// Carrega automaticamente
carregarJogadores();
