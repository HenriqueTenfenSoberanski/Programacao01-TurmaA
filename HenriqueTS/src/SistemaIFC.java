/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    import java.util.Date;
/**
 *
 * @author aluno
 */
public class SistemaIFC {
    public static void main(String[] args) {
        Estudante henrique = new Estudante();
        henrique.getNome();
        henrique.obterIdade(new Date());
        henrique.genero='m';
        
        System.out.println("Hello World!");
    }
}
