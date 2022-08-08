package br.com.dio.projeto;

    public class Curso extends Conteudos{

    private int CargaHoraria;
        @Override
        public double calcularXp(){
            return XP_PADRAO * CargaHoraria;
        }

    public Curso() {
    }

       public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }
}
