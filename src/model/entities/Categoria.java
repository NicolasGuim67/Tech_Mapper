package model.entities;

import java.util.Objects;

public class Categoria {

        private Integer id;
        private String equipetamentos;
        private String perifericos;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipetamentos() {
        return equipetamentos;
    }

    public void setEquipetamentos(String equipetamentos) {
        this.equipetamentos = equipetamentos;
    }

    public String getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(String perifericos) {
        this.perifericos = perifericos;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id) && Objects.equals(equipetamentos, categoria.equipetamentos) && Objects.equals(perifericos, categoria.perifericos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, equipetamentos, perifericos);
    }
}


