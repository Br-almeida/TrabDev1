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
public class paciente {

     String nomep;
     String doenca;
     double nascimento;

    //VETOR string
    String vetor1[] = new String[2];

    //Vetor Ano
    double vetor2[] = new double[1];

    /**
     * @return the nomep
     */
    public String getNomep() {
        return nomep;
    }

    /**
     * @param nomep the nomep to set
     */
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    /**
     * @return the doenca
     */
    public String getDoenca() {
        return doenca;
    }

    /**
     * @param doenca the doenca to set
     */
    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    /**
     * @return the ano
     */
    public double getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the ano to set
     */
    public void setNascimento(double nascimento) {
        this.nascimento = 2020 - nascimento;
    }

}
