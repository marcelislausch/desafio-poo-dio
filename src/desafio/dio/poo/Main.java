/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.dio.poo;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author programador2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp(); 
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descricao Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devMarceli = new Dev();
        devMarceli.setNome("Marceli");
        devMarceli.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marceli -> "+devMarceli.getConteudosIncritos());
        devMarceli.progredir();
        devMarceli.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos Inscritos Marceli -> "+devMarceli.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Marceli -> "+devMarceli.getConteudosConcluidos());
        System.out.println("XP: "+devMarceli.calcularTotalXp());
        
        System.out.println("=============================");
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila -> "+devCamila.getConteudosIncritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("----------------------------");
        System.out.println("Conteudos Inscritos Camila -> "+devCamila.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Camila -> "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());
        
    }

}
