package view;

import javax.swing.JOptionPane;
import model.bean.Calculadora;
import model.bean.Relatorio;
import model.dao.RelatorioDAO;

public class Principal {

    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o vale a ser investido."));

        /**
         * Calculadno dados do relatório
         *
         * @return
         */
        Calculadora calc = new Calculadora();
        int resultado = calc.calcularVisualizacao(valor);
        int resultado2 = calc.calcularClique(resultado);
        int resultado3 = calc.calcularCompartilhado(resultado2);
        int resultado4 = calc.calcularVisualizado(resultado3, resultado);
        int resultado5 = calc.calcularTotalVizualizado(resultado4);

        /**
         * Cadastrando as informações dentro do banco de dados
         *
         * @return
         */
        Relatorio novoRelatorio = new Relatorio();
        RelatorioDAO relatorioDao = new RelatorioDAO();
        novoRelatorio.setMaximaVisualizacaoRelatorio(resultado4);
        novoRelatorio.setMaximaCliquesRelatorio(resultado2);
        novoRelatorio.setMaximaCompartilhamentoRelatorio(resultado3);
        novoRelatorio.setValorTotalInvestidoRelatorio(resultado);
        relatorioDao.create(novoRelatorio);

    }
}
