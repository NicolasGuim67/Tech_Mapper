package model.Dao;

import model.entities.Chamado;

import java.util.List;

public interface ChamadosDao {

    void insert(Chamado ch);
    void update(Chamado ch);
    void deleteById(Integer ch);

    Chamado findById(Integer id);
    List<Chamado> findAll();

}
