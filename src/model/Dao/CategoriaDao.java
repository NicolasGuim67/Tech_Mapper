package model.Dao;

import model.entities.Categoria;
import model.entities.Chamado;

import java.util.List;

public interface CategoriaDao {
    void insert(Categoria ct);
    void update(Categoria ct);
    void deleteById(Integer ct);

    Categoria findById(Integer id);
    List<Categoria> findAll();

}
