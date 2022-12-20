package Salarios;

public class Pessoa {
    private String nome;
    private String telefone;
    private String dataAdmissao;

    public Pessoa(){
    }
    public Pessoa(String nome, String telefone, String dataAdmissao) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataAdmissao = dataAdmissao;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
