package control;

import model.*;
import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {

        //Locais
        Sala salaB201 = new Sala("Sala B-201", 30, "Bloco B", 201, true);
        Sala salaA105 = new Sala("Sala A-105", 25, "Bloco A", 105, false); // Segunda Sala
        Auditorio audPrincipal = new Auditorio("Auditório Principal", 150, "Bloco A", true, true);
        Laboratorio labQuimica = new Laboratorio("Lab de Química I", 25, "Bloco C", 15, "química");
        System.out.println(salaB201.getNomeIdentificador() +  salaA105.getNomeIdentificador() +  audPrincipal.getNomeIdentificador() +  labQuimica.getNomeIdentificador());


        //PessoasResponsaveis
        Organizador orgMaria = new Organizador("Maria ", "maria.o@univ.edu", "Coordenadora de Eventos");
        Organizador orgPedro = new Organizador("Pedro ", "pedro.c@univ.edu", "Assistente de Eventos"); // Segundo Organizador
        Instrutor profCarlos = new Instrutor("Carlos", "carlos.s@univ.edu", "PhD em Redes", "Redes de Computadores");
        Instrutor profAna = new Instrutor(" Ana ", "ana.b@univ.edu", "PHD em IA", "Inteligência Artificial"); // Segundo Instrutor
        System.out.println(orgMaria.getNome() + orgPedro.getNome());
        System.out.println( profCarlos.getNome() +  profAna.getNome());



        //eventos
        Palestra palestraRedes = new Palestra("O Futuro da Redes", LocalDate.of(2025, 8, 10), 2.0, 1500.00, audPrincipal, "Dra. Alice Pereira", "alice.p@tech.com", "Tech Solutions");
        Palestra palestraIA = new Palestra("IA Generativa", LocalDate.of(2025, 9, 5), 1.5, 1200.00, audPrincipal, "Dr. Ricardo Alves", "ricardo.a@tech.com", "Future AI"); // Segunda Palestra
        MiniCurso cursoJava = new MiniCurso("Java para Iniciantes", LocalDate.of(2025, 8, 11), 8.0, 2500.00, salaB201, 8);
        cursoJava.adicionarInstrutor(profCarlos);
        cursoJava.adicionarMaterial("Apostila de Java Básico");
        Seminario seminarioTCC = new Seminario("Apresentação de TCCs", LocalDate.of(2025, 11, 20), 4.0, 500.00, salaA105, "Engenharia de Software", "Grupo Alpha", "Dr. Carlos Santana"); // Instância de Seminario
        System.out.println( palestraRedes.getTitulo() + palestraIA.getTitulo() + cursoJava.getTitulo() + seminarioTCC.getTitulo());



        //Participantes

        Participante alunoJoao = new Participante("João ", "111.222.333-44", "joao.v@aluno.edu", "Engenharia da Computação");
        Participante alunaFernanda = new Participante("Fernanda ", "555.666.777-88", "fernanda.l@aluno.edu", "Sistemas de Informação");
        Participante alunoLucas = new Participante("Lucas ", "999.888.777-66", "lucas.m@aluno.edu", "Ciência da Computação");

        //Inscrevendo participantes
        System.out.println(alunoJoao.getNome());
        boolean insc1 = palestraRedes.adicionarParticipante(alunoJoao);
        System.out.println(insc1);

        System.out.println( alunaFernanda.getNome());
        boolean insc2 = palestraRedes.adicionarParticipante(alunaFernanda);
        System.out.println( insc2);

        System.out.println(alunoJoao.getNome() );
        boolean insc3 = cursoJava.adicionarParticipante(alunoJoao);
        System.out.println(insc3);

        System.out.println(alunoLucas.getNome() );
        boolean insc4 = seminarioTCC.adicionarParticipante(alunoLucas);
        System.out.println(insc4);


        // resultados
        System.out.println(palestraRedes.getTitulo());
        System.out.println(palestraRedes.getLocal().getNomeIdentificador());
        System.out.println(palestraRedes.getParticipantes().size());

        for (Participante participante : palestraRedes.getParticipantes()) {
            System.out.print(participante.getNome());
        }

        System.out.println( cursoJava.getTitulo());
        System.out.println(cursoJava.getParticipantes().size());

        for (Participante participante : cursoJava.getParticipantes()) {
            System.out.print(participante.getNome());
        }
    }
}
