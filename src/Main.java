import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1=new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2=new Curso();
        curso2.setTitulo("curso Java Script");
        curso2.setDescricao("descrição curso Java Script");
        curso2.setCargaHoraria(4);


        Mentoria mentoria=new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());



       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJanifer = new Dev();
        devJanifer.setNome("Janifer");
        devJanifer.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Janifer"+devJanifer.getConteudosInscritos());

        devJanifer.progredir();
        devJanifer.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Janifer"+devJanifer.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Janifer"+devJanifer.getConteudosConcluidos());
        System.out.println("XP:"+devJanifer.calcularTotalXp());


        System.out.println("-------");

        Dev devManoel=new Dev();
        devManoel.setNome("Manoel");
        devManoel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Manoel"+devManoel.getConteudosInscritos());
        devManoel.progredir();
        devManoel.progredir();
        devManoel.progredir();

        System.out.println('-');

        System.out.println("Conteúdos Inscritos Manoel:"+devManoel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Manoel"+devManoel.getConteudosConcluidos());
        System.out.println("XP:"+devManoel.calcularTotalXp());




    }

}

