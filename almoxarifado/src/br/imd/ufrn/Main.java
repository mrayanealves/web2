package br.imd.ufrn;

import br.imd.ufrn.coq.MetodoEspecificoAnalise;
import br.imd.ufrn.coq.SolicitacaoAnalise;
import br.imd.ufrn.doc.Documento;
import br.imd.ufrn.models.*;
import br.imd.ufrn.producao.DenominacaoComumBrasileira;
import br.imd.ufrn.producao.OrigemProducao;
import br.imd.ufrn.rh.*;

/**
 * Classe main feita somente para instanciar os objetos
 * Como o diagrama era muito grande, a ordem de instanciação foi alfabética por pacotes
 * Se chegar na mensagem de Sucesso é porque todos foram instânciados com sucesso.
 *
 * @author mrayanealves
 */
public class Main {
    public static void main(String[] args) {
        MetodoEspecificoAnalise metodoEspecificoAnalise = new MetodoEspecificoAnalise();
        SolicitacaoAnalise solicitacaoAnalise = new SolicitacaoAnalise();

        Documento documento = new Documento();

        Almoxarifado almoxarifado = new Almoxarifado();
        ChecklistRecebimentoComum checklistRecebimentoComum = new ChecklistRecebimentoComum();
        ClassificacaoMaterial classificacaoMaterial = new ClassificacaoMaterial();
        ConferenciaPesagem conferenciaPesagem = new ConferenciaPesagem();
        DadosEntrega dadosEntrega = new DadosEntrega();
        DadosFrete dadosFrete = new DadosFrete();
        DadosPagamento dadosPagamento = new DadosPagamento();
        DimensaoUnidade dimensaoUnidade = new DimensaoUnidade();
        EntradaEstoque entradaEstoque = new EntradaEstoque();
        Estoque estoque = new Estoque();
        GrupoMaterial grupoMaterial = new GrupoMaterial();
        GuiaRemessa guiaRemessa = new GuiaRemessa();
        HistoricoRequisicao historicoRequisicao = new HistoricoRequisicao();
        ItemRequisicao itemRequisicao = new ItemRequisicao();
        LocalizacaoAlmoxarifado localizacaoAlmoxarifado = new LocalizacaoAlmoxarifado();
        LoteMaterial loteMaterial = new LoteMaterial();
        Material material = new Material();
        MaterialAnalisavel materialAnalisavel = new MaterialAnalisavel();
        MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
        NaturezaOperacao naturezaOperacao = new NaturezaOperacao();
        NotaFiscal notaFiscal = new NotaFiscal();
        PesagemVolume pesagemVolume = new PesagemVolume();
        SaidaEstoque saidaEstoque = new SaidaEstoque();
        SaidaRequisicaoInterna saidaRequisicaoInterna = new SaidaRequisicaoInterna();
        UnidadeMedida unidadeMedida = new UnidadeMedida();
        Usuario usuario = new Usuario();
        VolumeMaterial volumeMaterial = new VolumeMaterial();

        DenominacaoComumBrasileira denominacaoComumBrasileira = new DenominacaoComumBrasileira();
        OrigemProducao origemProducao = new OrigemProducao();

        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Funcionario funcionario = new Funcionario();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        Setor setor = new Setor();

        System.out.println("Sucesso!");
    }
}
