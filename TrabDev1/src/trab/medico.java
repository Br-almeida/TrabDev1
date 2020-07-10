/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author brcar
 */
public class medico {
 
     String nomem;
     String especialidade;
     Double nascimento;
     int i; 
    
     String vetor1[] = new String [2];
     double vetor2 [] = new double [1];
       
    
/**
     * @return 
     * @Obtém nomem 
     */
    
    public String getNomem() {
        return nomem;
       
    }

    /**
     * @param nomem the nomem to set
     */
    public void setNomem(String nomem) {
        this.nomem = nomem;
        vetor1[0] = this.nomem;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
        
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        vetor1[1] = this.especialidade;
    }

    /**
     * @return the nascimento
     */
    public Double getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Double nascimento) {
        this.nascimento = nascimento;
        vetor2[0] = 2020 - this.nascimento;
    }
    
    
    

}

