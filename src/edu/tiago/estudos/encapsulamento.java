public class Pessoa {
    private String nome; // Atributo privado

    // Getter - Método para obter o valor do atributo
    public String getNome() {
        return nome;
    }

    // Setter - Método para definir o valor do atributo
    public void setNome(String nome) {
        this.nome = nome; // Atribui o valor recebido ao atributo
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // Usando o setter para definir o nome
        pessoa.setNome("Tiago");
        
        // Usando o getter para obter o nome
        System.out.println("Nome: " + pessoa.getNome());
    }
}