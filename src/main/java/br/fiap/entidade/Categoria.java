package br.fiap.entidade;

public class Categoria {
    private Long id_categoria;
    private String categoria;

    public Categoria(Long id_categoria, String categoria) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
