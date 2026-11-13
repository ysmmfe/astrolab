package destinos;

public abstract class CorpoCeleste {
    public String nome;
    public String descricao;
    public int dificuldade;
    public double fatorOperacional;

    public CorpoCeleste(String nome, String descricao, int dificuldade, double fatorOperacional){
        this.nome = nome;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
        this.fatorOperacional = fatorOperacional;
    }

    
}
