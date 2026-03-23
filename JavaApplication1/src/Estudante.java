




import java.util.Date;

public class Estudante {
    public String nome;
    public Date dataNascimento;
    public String cpf;
    public char genero;
    public int matricula;
    public String email;
    public int anoIngresso;
    public int telefone;
    public int sIngresso;
    public String sAcademica;

    
    public Estudante(){
        this.nome = "Nobody";
    }
       
    public int obterIdade(Date hoje) {
    int idade = 0;
    return idade;
    }
    public String getNome (){
        return this.nome;
    }
           
    public void setNome (String _nome){
        this.nome = _nome;
    }
           
    public Date getDate (){
        return this.dataNascimento;
    }
           
    public void setDate (Date _dataNascimento){
        this.dataNascimento = _dataNascimento;
    }
   
    public String getCpf (){
        return this.cpf;
    }
           
    public void setCpf (String _cpf){
        this.cpf = _cpf;
    }
   
    public char getGenero (){
        return this.genero;
    }
           
    public void setGenero (char _genero){
        this.genero = _genero;
    }
   
    public int getMatricula (){
        return this.matricula;
    }
           
    public void setMatricula (int _matricula){
        this.matricula = _matricula;
    }
    
    public String getEmail (){
        return this.email;
    }
    
    public void setEmail (String _email){
        this.email = _email;
    }
    
    public int getTelefone (){
        return this.telefone;
    }
    
    public void setTelefone(int _telefone){
        this.telefone = _telefone;
    }
    
    public int getAnoIngresso (){
        return this.anoIngresso;
    }
    
    public void setAnoIngresso (int _anoIngresso){
        this.anoIngresso = _anoIngresso;
    }
    
    public int getSemestreIngresso (){
        return this.sIngresso;
    }
    
    public void setSemestreIngresso (int _sIngresso){
        this.sIngresso = _sIngresso;
    }
    
    public String getSituacaoAcademica (){
        return this.sAcademica;
    }
    
    public void setSituacaoAcademica (String _sAcademica){
        this.sAcademica = _sAcademica;
    }
    }