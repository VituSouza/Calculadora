package model.bean;

public class Calculadora {

    private static final int NUMEROPESSOAS = 30;

    /**
     * Multiplica o numero de pessoas pelo valor informado no método
     *
     * @param valor
     * @return pessoasVisualizacao
     */
    public int calcularVisualizacao(double valor) {
        int pessoasVisualizacao = (int) Math.floor(valor * NUMEROPESSOAS);
        return pessoasVisualizacao;
    }

    /**
     * Calcula a quantidade de cliques através do número de pessoas
     *
     * @param pessoasVisualizacao
     * @return qtdCliques
     */
    public int calcularClique(int pessoasVisualizacao) {
        int qtdCliques = (int) Math.floor((pessoasVisualizacao * 12) / 100);
        return qtdCliques;
    }

    /**
     * Calcula a quantidade compartilhada através do número de cliques
     *
     * @param qtdCliques
     * @return qtdCompartilhado
     */
    public int calcularCompartilhado(int qtdCliques) {
        int qtdCompartilhado = (int) Math.floor((qtdCliques * 3) / 20);
        return qtdCompartilhado;
    }

    /**
     * Adiciona a quantidade de pessoas que visualizaram a partir de
     * compartilhamento
     *
     * @param qtdCompartilhado
     * @param pessoasVisualizacao
     * @return pessoasVisualizacao
     */
    public int calcularVisualizado(int qtdCompartilhado, int pessoasVisualizacao) {
        pessoasVisualizacao += (int) Math.floor(qtdCompartilhado * 40);
        return pessoasVisualizacao;
    }

    /**
     * Calcula o total de visualizações máxima
     *
     * @param pessoasVisualizacao
     * @return totalVisualizacao
     */
    public int calcularTotalVizualizado(int pessoasVisualizacao) {
        int totalVisualizacao = (int) Math.pow(pessoasVisualizacao, 4);
        return totalVisualizacao;
    }
}
