import br.com.dio.projeto.*;

import java.time.LocalDate;
         public class Main {
        public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Descrição curso java");
            curso2.setCargaHoraria(4);


            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());

            System.out.println(curso1);
            System.out.println(curso2);
             System.out.println(mentoria);

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devAmanda = new Dev();
            devAmanda.setNome("Amanda");
            devAmanda.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Amanda" + devAmanda.getConteudosInscritos());
            devAmanda.progredir();
            System.out.println("---");
            System.out.println("Conteúdos Concluídos Amanda" + devAmanda.getConteudosConcluidos());
            System.out.println("XP:" + devAmanda.calcularTotalxp());
            System.out.println("-------");

            Dev devBruno = new Dev();
            devBruno.setNome("Bruno");
            devBruno.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos inscritos Bruno" + devBruno.getConteudosInscritos());
            devBruno.progredir();
            devBruno.progredir();
            System.out.println("---");
            System.out.println("Conteúdos Concluídos Bruno" + devBruno.getConteudosConcluidos());

        }
    }