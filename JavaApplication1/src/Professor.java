/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

/**
 *
 * @author suporte
 */
public class Professor {

    public String nome;
    public int niInstitucional;
    public String email;
    public int telefone;
    public String titAcademica;
    public String areAtuação;
    public int rTrabalho;
    public String dataIngresso;
    public String formação;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public int getniInstitucional() {
        return this.niInstitucional;
    }

    public void setniInstitucional(int _niInstitucional) {
        this.niInstitucional = _niInstitucional;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int _telefone) {
        this.telefone = _telefone;
    }

    public String gettitAcademica() {
        return this.titAcademica;
    }

    public void settitAcademica(String _titAcademica) {
        this.titAcademica = _titAcademica;
    }

    public String getareAtuação() {
        return this.titAcademica;
    }

    public void setareAtuação(String _areAtuação) {
        this.areAtuação = _areAtuação;
    }

    public int getrTrabalho() {
        return this.rTrabalho;
    }

    public void setrTrabalho(int _rTrabalho) {
        this.rTrabalho = _rTrabalho;
    }

    public String getdadaIngresso() {
        return this.dataIngresso;
    }

    public void setdadaIngresso(String _dataIngresso) {
        this.dataIngresso = _dataIngresso;
    }

    public String getformação() {
        return this.formação;
    }

    public void setformação(String _formação) {
        this.formação = _formação;
    }
}