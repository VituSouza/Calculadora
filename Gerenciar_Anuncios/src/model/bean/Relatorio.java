package model.bean;

public class Relatorio {

    /**
     * Criação dos atributos da classe Relatorio
     *
     * @return
     */
    private int maximaVisualizacaoRelatorio;
    private int maximaCliquesRelatorio;
    private int maximaCompartilhamentoRelatorio;
    private int valorTotalInvestidoRelatorio;
    private int anuncioIdAnuncio;

    public int getAnuncioIdAnuncio() {
        return anuncioIdAnuncio;
    }

    public void setAnuncioIdAnuncio(int anuncioIdAnuncio) {
        this.anuncioIdAnuncio = anuncioIdAnuncio;
    }

    public int getMaximaVisualizacaoRelatorio() {
        return maximaVisualizacaoRelatorio;
    }

    public void setMaximaVisualizacaoRelatorio(int maximaVisualizacaoRelatorio) {
        this.maximaVisualizacaoRelatorio = maximaVisualizacaoRelatorio;
    }

    public int getMaximaCliquesRelatorio() {
        return maximaCliquesRelatorio;
    }

    public void setMaximaCliquesRelatorio(int maximaCliquesRelatorio) {
        this.maximaCliquesRelatorio = maximaCliquesRelatorio;
    }

    public int getMaximaCompartilhamentoRelatorio() {
        return maximaCompartilhamentoRelatorio;
    }

    public void setMaximaCompartilhamentoRelatorio(int maximaCompartilhamentoRelatorio) {
        this.maximaCompartilhamentoRelatorio = maximaCompartilhamentoRelatorio;
    }

    public int getValorTotalInvestidoRelatorio() {
        return valorTotalInvestidoRelatorio;
    }

    public void setValorTotalInvestidoRelatorio(int valorTotalInvestidoRelatorio) {
        this.valorTotalInvestidoRelatorio = valorTotalInvestidoRelatorio;
    }

}
