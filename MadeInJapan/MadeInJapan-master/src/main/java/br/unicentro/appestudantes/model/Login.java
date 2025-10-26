package br.unicentro.appestudantes.model;

public class Login {
    private int usuarioID;
    private String nome;

    public Login() {}

    public Login(int usuarioID, String nome) {
        this.usuarioID = usuarioID;
        this.nome = nome;
    }

    public int getUsuarioID() { return usuarioID; }
    public void setUsuarioID(int usuarioID) { this.usuarioID = usuarioID; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioID=" + usuarioID +
                ", nome='" + nome + '\'' +
            '}';
}
}