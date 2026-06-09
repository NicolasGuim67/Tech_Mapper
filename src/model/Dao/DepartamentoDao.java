package model.Dao;

import model.entities.Departamento;

import java.util.List;

public interface DepartamentoDao {
    void insert(Departamento dp);
    void deleteById(Departamento dp);
    void update(Departamento dp);
    void findById(Integer dp);
    List<Departamento> findAll();

}
