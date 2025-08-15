package br.fiap.conexao;

import br.fiap.entidade.Categoria;
import br.fiap.entidade.CategoriaDAO;

public class Main {
    public static void main(String[] args){
        CategoriaDAO dao = new CategoriaDAO();
        Categoria cat = new Categoria(4L, "cigarro");
        dao.inserir(cat);
    }
}
