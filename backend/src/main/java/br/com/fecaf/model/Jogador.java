package br.com.fecaf.model;

public class Jogador {
    private Long id;
    private String nome;
    private String posicao;
    private int idade;
    private double altura;
    private double peso;
    private String nacionalidade;
    private String clube;
    private double salario;
    private int numeroCamisa;
    private int golsMarcados;
    private String status;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public String getClube() { return clube; }
    public void setClube(String clube) { this.clube = clube; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public int getNumeroCamisa() { return numeroCamisa; }
    public void setNumeroCamisa(int numeroCamisa) { this.numeroCamisa = numeroCamisa; }

    public int getGolsMarcados() { return golsMarcados; }
    public void setGolsMarcados(int golsMarcados) { this.golsMarcados = golsMarcados; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", clube='" + clube + '\'' +
                '}';
    }
}
