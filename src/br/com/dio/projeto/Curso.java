package br.com.dio.projeto;

public class Curso {
    private String titulo;
    private String descricao;
    private int CargaHoraria;

    public Curso() {
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }
}
