
package com.sponteeducacional;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sponteeducacional package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SimpleType_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "simpleType");
    private final static QName _ComplexType_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "complexType");
    private final static QName _Group_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "group");
    private final static QName _AttributeGroup_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup");
    private final static QName _Element_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "element");
    private final static QName _Attribute_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "attribute");
    private final static QName _AnyAttribute_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "anyAttribute");
    private final static QName _All_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "all");
    private final static QName _Choice_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "choice");
    private final static QName _Sequence_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "sequence");
    private final static QName _Unique_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "unique");
    private final static QName _Key_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "key");
    private final static QName _MinExclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "minExclusive");
    private final static QName _MinInclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "minInclusive");
    private final static QName _MaxExclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "maxExclusive");
    private final static QName _MaxInclusive_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "maxInclusive");
    private final static QName _FractionDigits_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "fractionDigits");
    private final static QName _Length_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "length");
    private final static QName _MinLength_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "minLength");
    private final static QName _MaxLength_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "maxLength");
    private final static QName _Enumeration_QNAME = new QName("http://www.w3.org/2001/XMLSchema", "enumeration");
    private final static QName _WsRetNovaRespostaMensagem_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsRetNovaRespostaMensagem");
    private final static QName _ArrayOfWsMovimentacoesAlunos_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMovimentacoesAlunos");
    private final static QName _DataTable_QNAME = new QName("http://api.sponteeducacional.net.br/", "DataTable");
    private final static QName _ArrayOfWsCartoesCatraca_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCartoesCatraca");
    private final static QName _ArrayOfWsQuadroHorarios_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsQuadroHorarios");
    private final static QName _ArrayOfWsHorariosAula_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsHorariosAula");
    private final static QName _ArrayOfWsDiarioAulas_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDiarioAulas");
    private final static QName _ArrayOfWsDiarioAulasLivres_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDiarioAulasLivres");
    private final static QName _ArrayOfWsSalas_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSalas");
    private final static QName _ArrayOfWsAluno_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAluno");
    private final static QName _ArrayOfWsRetornoAlunosAlterados_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoAlunosAlterados");
    private final static QName _ArrayOfWsSituacoesAlunos_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSituacoesAlunos");
    private final static QName _ArrayOfWsOrigensAlunos_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOrigensAlunos");
    private final static QName _ArrayOfWsOcorrencias_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOcorrencias");
    private final static QName _ArrayOfWsCliente_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCliente");
    private final static QName _ArrayOfWsConta_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsConta");
    private final static QName _ArrayOfWsResponsavel_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsResponsavel");
    private final static QName _ArrayOfWsMatrizCurricular_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatrizCurricular");
    private final static QName _ArrayOfWsMatrizCurricular2_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatrizCurricular2");
    private final static QName _ArrayOfWsDisciplina_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplina");
    private final static QName _ArrayOfWsDisciplinaDetalhada_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplinaDetalhada");
    private final static QName _ArrayOfWsCurso_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCurso");
    private final static QName _ArrayOfWsTurma_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsTurma");
    private final static QName _ArrayOfWsCodigoTurma_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCodigoTurma");
    private final static QName _ArrayOfWsMatricula_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatricula");
    private final static QName _ArrayOfWsIntegrantesTurma_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsIntegrantesTurma");
    private final static QName _WsMudancaEntreTurmas_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsMudancaEntreTurmas");
    private final static QName _WsMudancaEntreTurmaRemoverAluno_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsMudancaEntreTurmaRemoverAluno");
    private final static QName _ArrayOfWsModalidadeTurma_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsModalidadeTurma");
    private final static QName _ArrayOfWsSituacoesAlunosTurma_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSituacoesAlunosTurma");
    private final static QName _ArrayOfWsContratoPDF_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsContratoPDF");
    private final static QName _ArrayOfWsBolsa_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsBolsa");
    private final static QName _ArrayOfWsFormasCobrancas_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFormasCobrancas");
    private final static QName _ArrayOfWsCategorias_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCategorias");
    private final static QName _ArrayOfWsItens_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsItens");
    private final static QName _ArrayOfWsLayouts_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsLayouts");
    private final static QName _ArrayOfWsRetornoParcelas_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelas");
    private final static QName _ArrayOfWsRetornoParcela_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcela");
    private final static QName _ArrayOfWsParcela_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcela");
    private final static QName _ArrayOfWsVendas_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsVendas");
    private final static QName _ArrayOfWsRetornoBoletos_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoBoletos");
    private final static QName _ArrayOfWsDadosFaturaVindi_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDadosFaturaVindi");
    private final static QName _ArrayOfWsFinanceiro_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFinanceiro");
    private final static QName _ArrayOfWsPlanoCurso_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsPlanoCurso");
    private final static QName _WsMediaFinal_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsMediaFinal");
    private final static QName _WsBoletim_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsBoletim");
    private final static QName _WsBoletim2_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsBoletim2");
    private final static QName _WsBoletimAulasLivres_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsBoletimAulasLivres");
    private final static QName _WsNotasHabilidades_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsNotasHabilidades");
    private final static QName _WSCertificado_QNAME = new QName("http://api.sponteeducacional.net.br/", "WSCertificado");
    private final static QName _ArrayOfWsFuncionario_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFuncionario");
    private final static QName _ArrayOfWsMidias_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMidias");
    private final static QName _ArrayOfWsGestaoComercial_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsGestaoComercial");
    private final static QName _ArrayOfWsAtendimentos_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAtendimentos");
    private final static QName _WsQuitacao_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsQuitacao");
    private final static QName _ArrayOfWsOperadoraCartao_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOperadoraCartao");
    private final static QName _ArrayOfWsAgendaAluno_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAgendaAluno");
    private final static QName _ArrayOfWsCalendario_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCalendario");
    private final static QName _ArrayOfWsRetornoParcelasPagar_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelasPagar");
    private final static QName _ArrayOfWsRetornoParcelaPagar_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelaPagar");
    private final static QName _ArrayOfWsParcelaPagar_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcelaPagar");
    private final static QName _ArrayOfWsSistemaAvaliacao_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSistemaAvaliacao");
    private final static QName _ArrayOfWsAvaliacoesParciais_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAvaliacoesParciais");
    private final static QName _ArrayOfWsFrequenciaTurma_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFrequenciaTurma");
    private final static QName _WsNotasParciais_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsNotasParciais");
    private final static QName _WsLoginPortal_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsLoginPortal");
    private final static QName _WsAccessValidationApp_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsAccessValidationApp");
    private final static QName _WsLoginApp_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsLoginApp");
    private final static QName _ArrayOfWsAppPortalNotas_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAppPortalNotas");
    private final static QName _ArrayOfWsAppPortalNotasNotificacao_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAppPortalNotasNotificacao");
    private final static QName _ArrayOfTokenMobile_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfTokenMobile");
    private final static QName _ArrayOfWsFotoApp_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFotoApp");
    private final static QName _ArrayOfWsAtualizaSenhaAlunoResponsavel_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAtualizaSenhaAlunoResponsavel");
    private final static QName _Boolean_QNAME = new QName("http://api.sponteeducacional.net.br/", "boolean");
    private final static QName _ArrayOfTimeline_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfTimeline");
    private final static QName _WsAtualizaSituacaoComunicado_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsAtualizaSituacaoComunicado");
    private final static QName _WsComunicadoAPP_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP");
    private final static QName _ArrayOfWsComunicadoAPP_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsComunicadoAPP");
    private final static QName _WsMensagemAPP_QNAME = new QName("http://api.sponteeducacional.net.br/", "wsMensagemAPP");
    private final static QName _ArrayOfWsMensagensAPP_QNAME = new QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMensagensAPP");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sponteeducacional
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertMovimentacaoResponse }
     * 
     */
    public InsertMovimentacaoResponse createInsertMovimentacaoResponse() {
        return new InsertMovimentacaoResponse();
    }

    /**
     * Create an instance of {@link InsertFrequenciaDiarioResponse }
     * 
     */
    public InsertFrequenciaDiarioResponse createInsertFrequenciaDiarioResponse() {
        return new InsertFrequenciaDiarioResponse();
    }

    /**
     * Create an instance of {@link InsertConteudoDiarioResponse }
     * 
     */
    public InsertConteudoDiarioResponse createInsertConteudoDiarioResponse() {
        return new InsertConteudoDiarioResponse();
    }

    /**
     * Create an instance of {@link InsertDiarioAulasLivresResponse }
     * 
     */
    public InsertDiarioAulasLivresResponse createInsertDiarioAulasLivresResponse() {
        return new InsertDiarioAulasLivresResponse();
    }

    /**
     * Create an instance of {@link UpdateDiarioAulasLivresResponse }
     * 
     */
    public UpdateDiarioAulasLivresResponse createUpdateDiarioAulasLivresResponse() {
        return new UpdateDiarioAulasLivresResponse();
    }

    /**
     * Create an instance of {@link InsertHistoricoEscolarResponse }
     * 
     */
    public InsertHistoricoEscolarResponse createInsertHistoricoEscolarResponse() {
        return new InsertHistoricoEscolarResponse();
    }

    /**
     * Create an instance of {@link InsertAlunosResponse }
     * 
     */
    public InsertAlunosResponse createInsertAlunosResponse() {
        return new InsertAlunosResponse();
    }

    /**
     * Create an instance of {@link InsertAlunos2Response }
     * 
     */
    public InsertAlunos2Response createInsertAlunos2Response() {
        return new InsertAlunos2Response();
    }

    /**
     * Create an instance of {@link ImportaAlunoResponse }
     * 
     */
    public ImportaAlunoResponse createImportaAlunoResponse() {
        return new ImportaAlunoResponse();
    }

    /**
     * Create an instance of {@link UpdateAlunosResponse }
     * 
     */
    public UpdateAlunosResponse createUpdateAlunosResponse() {
        return new UpdateAlunosResponse();
    }

    /**
     * Create an instance of {@link UpdateAlunos2Response }
     * 
     */
    public UpdateAlunos2Response createUpdateAlunos2Response() {
        return new UpdateAlunos2Response();
    }

    /**
     * Create an instance of {@link SetInadimplenteResponse }
     * 
     */
    public SetInadimplenteResponse createSetInadimplenteResponse() {
        return new SetInadimplenteResponse();
    }

    /**
     * Create an instance of {@link InsertClienteResponse }
     * 
     */
    public InsertClienteResponse createInsertClienteResponse() {
        return new InsertClienteResponse();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse }
     * 
     */
    public UpdateClienteResponse createUpdateClienteResponse() {
        return new UpdateClienteResponse();
    }

    /**
     * Create an instance of {@link InsertResponsaveisResponse }
     * 
     */
    public InsertResponsaveisResponse createInsertResponsaveisResponse() {
        return new InsertResponsaveisResponse();
    }

    /**
     * Create an instance of {@link UpdateResponsaveisResponse }
     * 
     */
    public UpdateResponsaveisResponse createUpdateResponsaveisResponse() {
        return new UpdateResponsaveisResponse();
    }

    /**
     * Create an instance of {@link UpdateCompartilhaResponsavelResponse }
     * 
     */
    public UpdateCompartilhaResponsavelResponse createUpdateCompartilhaResponsavelResponse() {
        return new UpdateCompartilhaResponsavelResponse();
    }

    /**
     * Create an instance of {@link InsertTurmaResponse }
     * 
     */
    public InsertTurmaResponse createInsertTurmaResponse() {
        return new InsertTurmaResponse();
    }

    /**
     * Create an instance of {@link InsertTurmasAtivasResponse }
     * 
     */
    public InsertTurmasAtivasResponse createInsertTurmasAtivasResponse() {
        return new InsertTurmasAtivasResponse();
    }

    /**
     * Create an instance of {@link UpdateTurmasResponse }
     * 
     */
    public UpdateTurmasResponse createUpdateTurmasResponse() {
        return new UpdateTurmasResponse();
    }

    /**
     * Create an instance of {@link InsertMatriculaResponse }
     * 
     */
    public InsertMatriculaResponse createInsertMatriculaResponse() {
        return new InsertMatriculaResponse();
    }

    /**
     * Create an instance of {@link UpdateMatriculaResponse }
     * 
     */
    public UpdateMatriculaResponse createUpdateMatriculaResponse() {
        return new UpdateMatriculaResponse();
    }

    /**
     * Create an instance of {@link InsertVendasResponse }
     * 
     */
    public InsertVendasResponse createInsertVendasResponse() {
        return new InsertVendasResponse();
    }

    /**
     * Create an instance of {@link GetLinhaDigitavelBoletosResponse }
     * 
     */
    public GetLinhaDigitavelBoletosResponse createGetLinhaDigitavelBoletosResponse() {
        return new GetLinhaDigitavelBoletosResponse();
    }

    /**
     * Create an instance of {@link SetNotaParcialResponse }
     * 
     */
    public SetNotaParcialResponse createSetNotaParcialResponse() {
        return new SetNotaParcialResponse();
    }

    /**
     * Create an instance of {@link SetNotaResponse }
     * 
     */
    public SetNotaResponse createSetNotaResponse() {
        return new SetNotaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNotasBoletim2 }
     * 
     */
    public ArrayOfNotasBoletim2 createArrayOfNotasBoletim2() {
        return new ArrayOfNotasBoletim2();
    }

    /**
     * Create an instance of {@link ArrayOfNotasBoletim }
     * 
     */
    public ArrayOfNotasBoletim createArrayOfNotasBoletim() {
        return new ArrayOfNotasBoletim();
    }

    /**
     * Create an instance of {@link DataTable }
     * 
     */
    public DataTable createDataTable() {
        return new DataTable();
    }

    /**
     * Create an instance of {@link SetNotaResponse.SetNotaResult }
     * 
     */
    public SetNotaResponse.SetNotaResult createSetNotaResponseSetNotaResult() {
        return new SetNotaResponse.SetNotaResult();
    }

    /**
     * Create an instance of {@link SetNotaParcialResponse.SetNotaParcialResult }
     * 
     */
    public SetNotaParcialResponse.SetNotaParcialResult createSetNotaParcialResponseSetNotaParcialResult() {
        return new SetNotaParcialResponse.SetNotaParcialResult();
    }

    /**
     * Create an instance of {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult }
     * 
     */
    public GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult createGetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult() {
        return new GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult();
    }

    /**
     * Create an instance of {@link InsertVendasResponse.InsertVendasResult }
     * 
     */
    public InsertVendasResponse.InsertVendasResult createInsertVendasResponseInsertVendasResult() {
        return new InsertVendasResponse.InsertVendasResult();
    }

    /**
     * Create an instance of {@link UpdateMatriculaResponse.UpdateMatriculaResult }
     * 
     */
    public UpdateMatriculaResponse.UpdateMatriculaResult createUpdateMatriculaResponseUpdateMatriculaResult() {
        return new UpdateMatriculaResponse.UpdateMatriculaResult();
    }

    /**
     * Create an instance of {@link InsertMatriculaResponse.InsertMatriculaResult }
     * 
     */
    public InsertMatriculaResponse.InsertMatriculaResult createInsertMatriculaResponseInsertMatriculaResult() {
        return new InsertMatriculaResponse.InsertMatriculaResult();
    }

    /**
     * Create an instance of {@link UpdateTurmasResponse.UpdateTurmasResult }
     * 
     */
    public UpdateTurmasResponse.UpdateTurmasResult createUpdateTurmasResponseUpdateTurmasResult() {
        return new UpdateTurmasResponse.UpdateTurmasResult();
    }

    /**
     * Create an instance of {@link InsertTurmasAtivasResponse.InsertTurmasAtivasResult }
     * 
     */
    public InsertTurmasAtivasResponse.InsertTurmasAtivasResult createInsertTurmasAtivasResponseInsertTurmasAtivasResult() {
        return new InsertTurmasAtivasResponse.InsertTurmasAtivasResult();
    }

    /**
     * Create an instance of {@link InsertTurmaResponse.InsertTurmaResult }
     * 
     */
    public InsertTurmaResponse.InsertTurmaResult createInsertTurmaResponseInsertTurmaResult() {
        return new InsertTurmaResponse.InsertTurmaResult();
    }

    /**
     * Create an instance of {@link UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult }
     * 
     */
    public UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult createUpdateCompartilhaResponsavelResponseUpdateCompartilhaResponsavelResult() {
        return new UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult();
    }

    /**
     * Create an instance of {@link UpdateResponsaveisResponse.UpdateResponsaveisResult }
     * 
     */
    public UpdateResponsaveisResponse.UpdateResponsaveisResult createUpdateResponsaveisResponseUpdateResponsaveisResult() {
        return new UpdateResponsaveisResponse.UpdateResponsaveisResult();
    }

    /**
     * Create an instance of {@link InsertResponsaveisResponse.InsertResponsaveisResult }
     * 
     */
    public InsertResponsaveisResponse.InsertResponsaveisResult createInsertResponsaveisResponseInsertResponsaveisResult() {
        return new InsertResponsaveisResponse.InsertResponsaveisResult();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse.UpdateClienteResult }
     * 
     */
    public UpdateClienteResponse.UpdateClienteResult createUpdateClienteResponseUpdateClienteResult() {
        return new UpdateClienteResponse.UpdateClienteResult();
    }

    /**
     * Create an instance of {@link InsertClienteResponse.InsertClienteResult }
     * 
     */
    public InsertClienteResponse.InsertClienteResult createInsertClienteResponseInsertClienteResult() {
        return new InsertClienteResponse.InsertClienteResult();
    }

    /**
     * Create an instance of {@link SetInadimplenteResponse.SetInadimplenteResult }
     * 
     */
    public SetInadimplenteResponse.SetInadimplenteResult createSetInadimplenteResponseSetInadimplenteResult() {
        return new SetInadimplenteResponse.SetInadimplenteResult();
    }

    /**
     * Create an instance of {@link UpdateAlunos2Response.UpdateAlunos2Result }
     * 
     */
    public UpdateAlunos2Response.UpdateAlunos2Result createUpdateAlunos2ResponseUpdateAlunos2Result() {
        return new UpdateAlunos2Response.UpdateAlunos2Result();
    }

    /**
     * Create an instance of {@link UpdateAlunosResponse.UpdateAlunosResult }
     * 
     */
    public UpdateAlunosResponse.UpdateAlunosResult createUpdateAlunosResponseUpdateAlunosResult() {
        return new UpdateAlunosResponse.UpdateAlunosResult();
    }

    /**
     * Create an instance of {@link ImportaAlunoResponse.ImportaAlunoResult }
     * 
     */
    public ImportaAlunoResponse.ImportaAlunoResult createImportaAlunoResponseImportaAlunoResult() {
        return new ImportaAlunoResponse.ImportaAlunoResult();
    }

    /**
     * Create an instance of {@link InsertAlunos2Response.InsertAlunos2Result }
     * 
     */
    public InsertAlunos2Response.InsertAlunos2Result createInsertAlunos2ResponseInsertAlunos2Result() {
        return new InsertAlunos2Response.InsertAlunos2Result();
    }

    /**
     * Create an instance of {@link InsertAlunosResponse.InsertAlunosResult }
     * 
     */
    public InsertAlunosResponse.InsertAlunosResult createInsertAlunosResponseInsertAlunosResult() {
        return new InsertAlunosResponse.InsertAlunosResult();
    }

    /**
     * Create an instance of {@link InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult }
     * 
     */
    public InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult createInsertHistoricoEscolarResponseInsertHistoricoEscolarResult() {
        return new InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult();
    }

    /**
     * Create an instance of {@link UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult }
     * 
     */
    public UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult createUpdateDiarioAulasLivresResponseUpdateDiarioAulasLivresResult() {
        return new UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult();
    }

    /**
     * Create an instance of {@link InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult }
     * 
     */
    public InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult createInsertDiarioAulasLivresResponseInsertDiarioAulasLivresResult() {
        return new InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult();
    }

    /**
     * Create an instance of {@link InsertConteudoDiarioResponse.InsertConteudoDiarioResult }
     * 
     */
    public InsertConteudoDiarioResponse.InsertConteudoDiarioResult createInsertConteudoDiarioResponseInsertConteudoDiarioResult() {
        return new InsertConteudoDiarioResponse.InsertConteudoDiarioResult();
    }

    /**
     * Create an instance of {@link InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult }
     * 
     */
    public InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult createInsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult() {
        return new InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult();
    }

    /**
     * Create an instance of {@link InsertMovimentacaoResponse.InsertMovimentacaoResult }
     * 
     */
    public InsertMovimentacaoResponse.InsertMovimentacaoResult createInsertMovimentacaoResponseInsertMovimentacaoResult() {
        return new InsertMovimentacaoResponse.InsertMovimentacaoResult();
    }

    /**
     * Create an instance of {@link Schema }
     * 
     */
    public Schema createSchema() {
        return new Schema();
    }

    /**
     * Create an instance of {@link OpenAttrs }
     * 
     */
    public OpenAttrs createOpenAttrs() {
        return new OpenAttrs();
    }

    /**
     * Create an instance of {@link Include }
     * 
     */
    public Include createInclude() {
        return new Include();
    }

    /**
     * Create an instance of {@link Annotated }
     * 
     */
    public Annotated createAnnotated() {
        return new Annotated();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link Appinfo }
     * 
     */
    public Appinfo createAppinfo() {
        return new Appinfo();
    }

    /**
     * Create an instance of {@link Documentation }
     * 
     */
    public Documentation createDocumentation() {
        return new Documentation();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link Redefine }
     * 
     */
    public Redefine createRedefine() {
        return new Redefine();
    }

    /**
     * Create an instance of {@link TopLevelSimpleType }
     * 
     */
    public TopLevelSimpleType createTopLevelSimpleType() {
        return new TopLevelSimpleType();
    }

    /**
     * Create an instance of {@link TopLevelComplexType }
     * 
     */
    public TopLevelComplexType createTopLevelComplexType() {
        return new TopLevelComplexType();
    }

    /**
     * Create an instance of {@link NamedGroup }
     * 
     */
    public NamedGroup createNamedGroup() {
        return new NamedGroup();
    }

    /**
     * Create an instance of {@link NamedAttributeGroup }
     * 
     */
    public NamedAttributeGroup createNamedAttributeGroup() {
        return new NamedAttributeGroup();
    }

    /**
     * Create an instance of {@link TopLevelElement }
     * 
     */
    public TopLevelElement createTopLevelElement() {
        return new TopLevelElement();
    }

    /**
     * Create an instance of {@link TopLevelAttribute }
     * 
     */
    public TopLevelAttribute createTopLevelAttribute() {
        return new TopLevelAttribute();
    }

    /**
     * Create an instance of {@link Notation }
     * 
     */
    public Notation createNotation() {
        return new Notation();
    }

    /**
     * Create an instance of {@link Wildcard }
     * 
     */
    public Wildcard createWildcard() {
        return new Wildcard();
    }

    /**
     * Create an instance of {@link ComplexContent }
     * 
     */
    public ComplexContent createComplexContent() {
        return new ComplexContent();
    }

    /**
     * Create an instance of {@link ComplexRestrictionType }
     * 
     */
    public ComplexRestrictionType createComplexRestrictionType() {
        return new ComplexRestrictionType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link SimpleContent }
     * 
     */
    public SimpleContent createSimpleContent() {
        return new SimpleContent();
    }

    /**
     * Create an instance of {@link SimpleRestrictionType }
     * 
     */
    public SimpleRestrictionType createSimpleRestrictionType() {
        return new SimpleRestrictionType();
    }

    /**
     * Create an instance of {@link SimpleExtensionType }
     * 
     */
    public SimpleExtensionType createSimpleExtensionType() {
        return new SimpleExtensionType();
    }

    /**
     * Create an instance of {@link All }
     * 
     */
    public All createAll() {
        return new All();
    }

    /**
     * Create an instance of {@link ExplicitGroup }
     * 
     */
    public ExplicitGroup createExplicitGroup() {
        return new ExplicitGroup();
    }

    /**
     * Create an instance of {@link Any }
     * 
     */
    public Any createAny() {
        return new Any();
    }

    /**
     * Create an instance of {@link Selector }
     * 
     */
    public Selector createSelector() {
        return new Selector();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Keybase }
     * 
     */
    public Keybase createKeybase() {
        return new Keybase();
    }

    /**
     * Create an instance of {@link Keyref }
     * 
     */
    public Keyref createKeyref() {
        return new Keyref();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link LocalSimpleType }
     * 
     */
    public LocalSimpleType createLocalSimpleType() {
        return new LocalSimpleType();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Create an instance of {@link TotalDigits }
     * 
     */
    public TotalDigits createTotalDigits() {
        return new TotalDigits();
    }

    /**
     * Create an instance of {@link NumFacet }
     * 
     */
    public NumFacet createNumFacet() {
        return new NumFacet();
    }

    /**
     * Create an instance of {@link NoFixedFacet }
     * 
     */
    public NoFixedFacet createNoFixedFacet() {
        return new NoFixedFacet();
    }

    /**
     * Create an instance of {@link WhiteSpace }
     * 
     */
    public WhiteSpace createWhiteSpace() {
        return new WhiteSpace();
    }

    /**
     * Create an instance of {@link Pattern }
     * 
     */
    public Pattern createPattern() {
        return new Pattern();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Union }
     * 
     */
    public Union createUnion() {
        return new Union();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link LocalComplexType }
     * 
     */
    public LocalComplexType createLocalComplexType() {
        return new LocalComplexType();
    }

    /**
     * Create an instance of {@link RestrictionType }
     * 
     */
    public RestrictionType createRestrictionType() {
        return new RestrictionType();
    }

    /**
     * Create an instance of {@link LocalElement }
     * 
     */
    public LocalElement createLocalElement() {
        return new LocalElement();
    }

    /**
     * Create an instance of {@link RealGroup }
     * 
     */
    public RealGroup createRealGroup() {
        return new RealGroup();
    }

    /**
     * Create an instance of {@link GroupRef }
     * 
     */
    public GroupRef createGroupRef() {
        return new GroupRef();
    }

    /**
     * Create an instance of {@link SimpleExplicitGroup }
     * 
     */
    public SimpleExplicitGroup createSimpleExplicitGroup() {
        return new SimpleExplicitGroup();
    }

    /**
     * Create an instance of {@link NarrowMaxMin }
     * 
     */
    public NarrowMaxMin createNarrowMaxMin() {
        return new NarrowMaxMin();
    }

    /**
     * Create an instance of {@link AttributeGroupRef }
     * 
     */
    public AttributeGroupRef createAttributeGroupRef() {
        return new AttributeGroupRef();
    }

    /**
     * Create an instance of {@link NovaRespostaMensagemApp }
     * 
     */
    public NovaRespostaMensagemApp createNovaRespostaMensagemApp() {
        return new NovaRespostaMensagemApp();
    }

    /**
     * Create an instance of {@link NovaRespostaMensagemAppResponse }
     * 
     */
    public NovaRespostaMensagemAppResponse createNovaRespostaMensagemAppResponse() {
        return new NovaRespostaMensagemAppResponse();
    }

    /**
     * Create an instance of {@link WsRetNovaRespostaMensagem }
     * 
     */
    public WsRetNovaRespostaMensagem createWsRetNovaRespostaMensagem() {
        return new WsRetNovaRespostaMensagem();
    }

    /**
     * Create an instance of {@link GetMovimentacaoAluno }
     * 
     */
    public GetMovimentacaoAluno createGetMovimentacaoAluno() {
        return new GetMovimentacaoAluno();
    }

    /**
     * Create an instance of {@link GetMovimentacaoAlunoResponse }
     * 
     */
    public GetMovimentacaoAlunoResponse createGetMovimentacaoAlunoResponse() {
        return new GetMovimentacaoAlunoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsMovimentacoesAlunos }
     * 
     */
    public ArrayOfWsMovimentacoesAlunos createArrayOfWsMovimentacoesAlunos() {
        return new ArrayOfWsMovimentacoesAlunos();
    }

    /**
     * Create an instance of {@link InsertMovimentacao }
     * 
     */
    public InsertMovimentacao createInsertMovimentacao() {
        return new InsertMovimentacao();
    }

    /**
     * Create an instance of {@link GetCartoesCatraca }
     * 
     */
    public GetCartoesCatraca createGetCartoesCatraca() {
        return new GetCartoesCatraca();
    }

    /**
     * Create an instance of {@link GetCartoesCatracaResponse }
     * 
     */
    public GetCartoesCatracaResponse createGetCartoesCatracaResponse() {
        return new GetCartoesCatracaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsCartoesCatraca }
     * 
     */
    public ArrayOfWsCartoesCatraca createArrayOfWsCartoesCatraca() {
        return new ArrayOfWsCartoesCatraca();
    }

    /**
     * Create an instance of {@link GetQuadroHorarios }
     * 
     */
    public GetQuadroHorarios createGetQuadroHorarios() {
        return new GetQuadroHorarios();
    }

    /**
     * Create an instance of {@link GetQuadroHorariosResponse }
     * 
     */
    public GetQuadroHorariosResponse createGetQuadroHorariosResponse() {
        return new GetQuadroHorariosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsQuadroHorarios }
     * 
     */
    public ArrayOfWsQuadroHorarios createArrayOfWsQuadroHorarios() {
        return new ArrayOfWsQuadroHorarios();
    }

    /**
     * Create an instance of {@link GetHorariosAulas }
     * 
     */
    public GetHorariosAulas createGetHorariosAulas() {
        return new GetHorariosAulas();
    }

    /**
     * Create an instance of {@link GetHorariosAulasResponse }
     * 
     */
    public GetHorariosAulasResponse createGetHorariosAulasResponse() {
        return new GetHorariosAulasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsHorariosAula }
     * 
     */
    public ArrayOfWsHorariosAula createArrayOfWsHorariosAula() {
        return new ArrayOfWsHorariosAula();
    }

    /**
     * Create an instance of {@link GetDiarioAulas }
     * 
     */
    public GetDiarioAulas createGetDiarioAulas() {
        return new GetDiarioAulas();
    }

    /**
     * Create an instance of {@link GetDiarioAulasResponse }
     * 
     */
    public GetDiarioAulasResponse createGetDiarioAulasResponse() {
        return new GetDiarioAulasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsDiarioAulas }
     * 
     */
    public ArrayOfWsDiarioAulas createArrayOfWsDiarioAulas() {
        return new ArrayOfWsDiarioAulas();
    }

    /**
     * Create an instance of {@link InsertFrequenciaDiario }
     * 
     */
    public InsertFrequenciaDiario createInsertFrequenciaDiario() {
        return new InsertFrequenciaDiario();
    }

    /**
     * Create an instance of {@link InsertConteudoDiario }
     * 
     */
    public InsertConteudoDiario createInsertConteudoDiario() {
        return new InsertConteudoDiario();
    }

    /**
     * Create an instance of {@link GetDiarioAulasLivres }
     * 
     */
    public GetDiarioAulasLivres createGetDiarioAulasLivres() {
        return new GetDiarioAulasLivres();
    }

    /**
     * Create an instance of {@link GetDiarioAulasLivresResponse }
     * 
     */
    public GetDiarioAulasLivresResponse createGetDiarioAulasLivresResponse() {
        return new GetDiarioAulasLivresResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsDiarioAulasLivres }
     * 
     */
    public ArrayOfWsDiarioAulasLivres createArrayOfWsDiarioAulasLivres() {
        return new ArrayOfWsDiarioAulasLivres();
    }

    /**
     * Create an instance of {@link InsertDiarioAulasLivres }
     * 
     */
    public InsertDiarioAulasLivres createInsertDiarioAulasLivres() {
        return new InsertDiarioAulasLivres();
    }

    /**
     * Create an instance of {@link UpdateDiarioAulasLivres }
     * 
     */
    public UpdateDiarioAulasLivres createUpdateDiarioAulasLivres() {
        return new UpdateDiarioAulasLivres();
    }

    /**
     * Create an instance of {@link GetSalas }
     * 
     */
    public GetSalas createGetSalas() {
        return new GetSalas();
    }

    /**
     * Create an instance of {@link GetSalasResponse }
     * 
     */
    public GetSalasResponse createGetSalasResponse() {
        return new GetSalasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsSalas }
     * 
     */
    public ArrayOfWsSalas createArrayOfWsSalas() {
        return new ArrayOfWsSalas();
    }

    /**
     * Create an instance of {@link InsertHistoricoEscolar }
     * 
     */
    public InsertHistoricoEscolar createInsertHistoricoEscolar() {
        return new InsertHistoricoEscolar();
    }

    /**
     * Create an instance of {@link GetAlunos }
     * 
     */
    public GetAlunos createGetAlunos() {
        return new GetAlunos();
    }

    /**
     * Create an instance of {@link GetAlunosResponse }
     * 
     */
    public GetAlunosResponse createGetAlunosResponse() {
        return new GetAlunosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAluno }
     * 
     */
    public ArrayOfWsAluno createArrayOfWsAluno() {
        return new ArrayOfWsAluno();
    }

    /**
     * Create an instance of {@link GetAlunos2 }
     * 
     */
    public GetAlunos2 createGetAlunos2() {
        return new GetAlunos2();
    }

    /**
     * Create an instance of {@link GetAlunos2Response }
     * 
     */
    public GetAlunos2Response createGetAlunos2Response() {
        return new GetAlunos2Response();
    }

    /**
     * Create an instance of {@link InsertAlunos }
     * 
     */
    public InsertAlunos createInsertAlunos() {
        return new InsertAlunos();
    }

    /**
     * Create an instance of {@link InsertAlunos2 }
     * 
     */
    public InsertAlunos2 createInsertAlunos2() {
        return new InsertAlunos2();
    }

    /**
     * Create an instance of {@link ImportaAluno }
     * 
     */
    public ImportaAluno createImportaAluno() {
        return new ImportaAluno();
    }

    /**
     * Create an instance of {@link UpdateAlunos }
     * 
     */
    public UpdateAlunos createUpdateAlunos() {
        return new UpdateAlunos();
    }

    /**
     * Create an instance of {@link UpdateAlunos2 }
     * 
     */
    public UpdateAlunos2 createUpdateAlunos2() {
        return new UpdateAlunos2();
    }

    /**
     * Create an instance of {@link SetInadimplente }
     * 
     */
    public SetInadimplente createSetInadimplente() {
        return new SetInadimplente();
    }

    /**
     * Create an instance of {@link GetAlunosAlterados }
     * 
     */
    public GetAlunosAlterados createGetAlunosAlterados() {
        return new GetAlunosAlterados();
    }

    /**
     * Create an instance of {@link GetAlunosAlteradosResponse }
     * 
     */
    public GetAlunosAlteradosResponse createGetAlunosAlteradosResponse() {
        return new GetAlunosAlteradosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsRetornoAlunosAlterados }
     * 
     */
    public ArrayOfWsRetornoAlunosAlterados createArrayOfWsRetornoAlunosAlterados() {
        return new ArrayOfWsRetornoAlunosAlterados();
    }

    /**
     * Create an instance of {@link GetSituacoesAlunos }
     * 
     */
    public GetSituacoesAlunos createGetSituacoesAlunos() {
        return new GetSituacoesAlunos();
    }

    /**
     * Create an instance of {@link GetSituacoesAlunosResponse }
     * 
     */
    public GetSituacoesAlunosResponse createGetSituacoesAlunosResponse() {
        return new GetSituacoesAlunosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsSituacoesAlunos }
     * 
     */
    public ArrayOfWsSituacoesAlunos createArrayOfWsSituacoesAlunos() {
        return new ArrayOfWsSituacoesAlunos();
    }

    /**
     * Create an instance of {@link GetOrigensAlunos }
     * 
     */
    public GetOrigensAlunos createGetOrigensAlunos() {
        return new GetOrigensAlunos();
    }

    /**
     * Create an instance of {@link GetOrigensAlunosResponse }
     * 
     */
    public GetOrigensAlunosResponse createGetOrigensAlunosResponse() {
        return new GetOrigensAlunosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsOrigensAlunos }
     * 
     */
    public ArrayOfWsOrigensAlunos createArrayOfWsOrigensAlunos() {
        return new ArrayOfWsOrigensAlunos();
    }

    /**
     * Create an instance of {@link GetOcorrenciasAluno }
     * 
     */
    public GetOcorrenciasAluno createGetOcorrenciasAluno() {
        return new GetOcorrenciasAluno();
    }

    /**
     * Create an instance of {@link GetOcorrenciasAlunoResponse }
     * 
     */
    public GetOcorrenciasAlunoResponse createGetOcorrenciasAlunoResponse() {
        return new GetOcorrenciasAlunoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsOcorrencias }
     * 
     */
    public ArrayOfWsOcorrencias createArrayOfWsOcorrencias() {
        return new ArrayOfWsOcorrencias();
    }

    /**
     * Create an instance of {@link GetClientes }
     * 
     */
    public GetClientes createGetClientes() {
        return new GetClientes();
    }

    /**
     * Create an instance of {@link GetClientesResponse }
     * 
     */
    public GetClientesResponse createGetClientesResponse() {
        return new GetClientesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsCliente }
     * 
     */
    public ArrayOfWsCliente createArrayOfWsCliente() {
        return new ArrayOfWsCliente();
    }

    /**
     * Create an instance of {@link InsertCliente }
     * 
     */
    public InsertCliente createInsertCliente() {
        return new InsertCliente();
    }

    /**
     * Create an instance of {@link UpdateCliente }
     * 
     */
    public UpdateCliente createUpdateCliente() {
        return new UpdateCliente();
    }

    /**
     * Create an instance of {@link GetContas }
     * 
     */
    public GetContas createGetContas() {
        return new GetContas();
    }

    /**
     * Create an instance of {@link GetContasResponse }
     * 
     */
    public GetContasResponse createGetContasResponse() {
        return new GetContasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsConta }
     * 
     */
    public ArrayOfWsConta createArrayOfWsConta() {
        return new ArrayOfWsConta();
    }

    /**
     * Create an instance of {@link GetResponsaveis }
     * 
     */
    public GetResponsaveis createGetResponsaveis() {
        return new GetResponsaveis();
    }

    /**
     * Create an instance of {@link GetResponsaveisResponse }
     * 
     */
    public GetResponsaveisResponse createGetResponsaveisResponse() {
        return new GetResponsaveisResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsResponsavel }
     * 
     */
    public ArrayOfWsResponsavel createArrayOfWsResponsavel() {
        return new ArrayOfWsResponsavel();
    }

    /**
     * Create an instance of {@link InsertResponsaveis }
     * 
     */
    public InsertResponsaveis createInsertResponsaveis() {
        return new InsertResponsaveis();
    }

    /**
     * Create an instance of {@link UpdateResponsaveis }
     * 
     */
    public UpdateResponsaveis createUpdateResponsaveis() {
        return new UpdateResponsaveis();
    }

    /**
     * Create an instance of {@link UpdateCompartilhaResponsavel }
     * 
     */
    public UpdateCompartilhaResponsavel createUpdateCompartilhaResponsavel() {
        return new UpdateCompartilhaResponsavel();
    }

    /**
     * Create an instance of {@link GetMatrizCurricular }
     * 
     */
    public GetMatrizCurricular createGetMatrizCurricular() {
        return new GetMatrizCurricular();
    }

    /**
     * Create an instance of {@link GetMatrizCurricularResponse }
     * 
     */
    public GetMatrizCurricularResponse createGetMatrizCurricularResponse() {
        return new GetMatrizCurricularResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsMatrizCurricular }
     * 
     */
    public ArrayOfWsMatrizCurricular createArrayOfWsMatrizCurricular() {
        return new ArrayOfWsMatrizCurricular();
    }

    /**
     * Create an instance of {@link GetMatrizCurricular2 }
     * 
     */
    public GetMatrizCurricular2 createGetMatrizCurricular2() {
        return new GetMatrizCurricular2();
    }

    /**
     * Create an instance of {@link GetMatrizCurricular2Response }
     * 
     */
    public GetMatrizCurricular2Response createGetMatrizCurricular2Response() {
        return new GetMatrizCurricular2Response();
    }

    /**
     * Create an instance of {@link ArrayOfWsMatrizCurricular2 }
     * 
     */
    public ArrayOfWsMatrizCurricular2 createArrayOfWsMatrizCurricular2() {
        return new ArrayOfWsMatrizCurricular2();
    }

    /**
     * Create an instance of {@link GetMatrizCurricularPai }
     * 
     */
    public GetMatrizCurricularPai createGetMatrizCurricularPai() {
        return new GetMatrizCurricularPai();
    }

    /**
     * Create an instance of {@link GetMatrizCurricularPaiResponse }
     * 
     */
    public GetMatrizCurricularPaiResponse createGetMatrizCurricularPaiResponse() {
        return new GetMatrizCurricularPaiResponse();
    }

    /**
     * Create an instance of {@link GetDisciplina }
     * 
     */
    public GetDisciplina createGetDisciplina() {
        return new GetDisciplina();
    }

    /**
     * Create an instance of {@link GetDisciplinaResponse }
     * 
     */
    public GetDisciplinaResponse createGetDisciplinaResponse() {
        return new GetDisciplinaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsDisciplina }
     * 
     */
    public ArrayOfWsDisciplina createArrayOfWsDisciplina() {
        return new ArrayOfWsDisciplina();
    }

    /**
     * Create an instance of {@link GetDisciplinaDetalhado }
     * 
     */
    public GetDisciplinaDetalhado createGetDisciplinaDetalhado() {
        return new GetDisciplinaDetalhado();
    }

    /**
     * Create an instance of {@link GetDisciplinaDetalhadoResponse }
     * 
     */
    public GetDisciplinaDetalhadoResponse createGetDisciplinaDetalhadoResponse() {
        return new GetDisciplinaDetalhadoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsDisciplinaDetalhada }
     * 
     */
    public ArrayOfWsDisciplinaDetalhada createArrayOfWsDisciplinaDetalhada() {
        return new ArrayOfWsDisciplinaDetalhada();
    }

    /**
     * Create an instance of {@link GetCursos }
     * 
     */
    public GetCursos createGetCursos() {
        return new GetCursos();
    }

    /**
     * Create an instance of {@link GetCursosResponse }
     * 
     */
    public GetCursosResponse createGetCursosResponse() {
        return new GetCursosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsCurso }
     * 
     */
    public ArrayOfWsCurso createArrayOfWsCurso() {
        return new ArrayOfWsCurso();
    }

    /**
     * Create an instance of {@link GetCursosFuncionarios }
     * 
     */
    public GetCursosFuncionarios createGetCursosFuncionarios() {
        return new GetCursosFuncionarios();
    }

    /**
     * Create an instance of {@link GetCursosFuncionariosResponse }
     * 
     */
    public GetCursosFuncionariosResponse createGetCursosFuncionariosResponse() {
        return new GetCursosFuncionariosResponse();
    }

    /**
     * Create an instance of {@link InsertTurma }
     * 
     */
    public InsertTurma createInsertTurma() {
        return new InsertTurma();
    }

    /**
     * Create an instance of {@link InsertTurmasAtivas }
     * 
     */
    public InsertTurmasAtivas createInsertTurmasAtivas() {
        return new InsertTurmasAtivas();
    }

    /**
     * Create an instance of {@link UpdateTurmas }
     * 
     */
    public UpdateTurmas createUpdateTurmas() {
        return new UpdateTurmas();
    }

    /**
     * Create an instance of {@link GetTurmas }
     * 
     */
    public GetTurmas createGetTurmas() {
        return new GetTurmas();
    }

    /**
     * Create an instance of {@link GetTurmasResponse }
     * 
     */
    public GetTurmasResponse createGetTurmasResponse() {
        return new GetTurmasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsTurma }
     * 
     */
    public ArrayOfWsTurma createArrayOfWsTurma() {
        return new ArrayOfWsTurma();
    }

    /**
     * Create an instance of {@link GetCodigoTurma }
     * 
     */
    public GetCodigoTurma createGetCodigoTurma() {
        return new GetCodigoTurma();
    }

    /**
     * Create an instance of {@link GetCodigoTurmaResponse }
     * 
     */
    public GetCodigoTurmaResponse createGetCodigoTurmaResponse() {
        return new GetCodigoTurmaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsCodigoTurma }
     * 
     */
    public ArrayOfWsCodigoTurma createArrayOfWsCodigoTurma() {
        return new ArrayOfWsCodigoTurma();
    }

    /**
     * Create an instance of {@link InsertMatricula }
     * 
     */
    public InsertMatricula createInsertMatricula() {
        return new InsertMatricula();
    }

    /**
     * Create an instance of {@link UpdateMatricula }
     * 
     */
    public UpdateMatricula createUpdateMatricula() {
        return new UpdateMatricula();
    }

    /**
     * Create an instance of {@link GetMatriculas }
     * 
     */
    public GetMatriculas createGetMatriculas() {
        return new GetMatriculas();
    }

    /**
     * Create an instance of {@link GetMatriculasResponse }
     * 
     */
    public GetMatriculasResponse createGetMatriculasResponse() {
        return new GetMatriculasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsMatricula }
     * 
     */
    public ArrayOfWsMatricula createArrayOfWsMatricula() {
        return new ArrayOfWsMatricula();
    }

    /**
     * Create an instance of {@link GetIntegrantesTurmas }
     * 
     */
    public GetIntegrantesTurmas createGetIntegrantesTurmas() {
        return new GetIntegrantesTurmas();
    }

    /**
     * Create an instance of {@link GetIntegrantesTurmasResponse }
     * 
     */
    public GetIntegrantesTurmasResponse createGetIntegrantesTurmasResponse() {
        return new GetIntegrantesTurmasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsIntegrantesTurma }
     * 
     */
    public ArrayOfWsIntegrantesTurma createArrayOfWsIntegrantesTurma() {
        return new ArrayOfWsIntegrantesTurma();
    }

    /**
     * Create an instance of {@link SetMudancaEntreTurmas }
     * 
     */
    public SetMudancaEntreTurmas createSetMudancaEntreTurmas() {
        return new SetMudancaEntreTurmas();
    }

    /**
     * Create an instance of {@link SetMudancaEntreTurmasResponse }
     * 
     */
    public SetMudancaEntreTurmasResponse createSetMudancaEntreTurmasResponse() {
        return new SetMudancaEntreTurmasResponse();
    }

    /**
     * Create an instance of {@link WsMudancaEntreTurmas }
     * 
     */
    public WsMudancaEntreTurmas createWsMudancaEntreTurmas() {
        return new WsMudancaEntreTurmas();
    }

    /**
     * Create an instance of {@link SetMudancaEntreTurmaRemoveAluno }
     * 
     */
    public SetMudancaEntreTurmaRemoveAluno createSetMudancaEntreTurmaRemoveAluno() {
        return new SetMudancaEntreTurmaRemoveAluno();
    }

    /**
     * Create an instance of {@link SetMudancaEntreTurmaRemoveAlunoResponse }
     * 
     */
    public SetMudancaEntreTurmaRemoveAlunoResponse createSetMudancaEntreTurmaRemoveAlunoResponse() {
        return new SetMudancaEntreTurmaRemoveAlunoResponse();
    }

    /**
     * Create an instance of {@link WsMudancaEntreTurmaRemoverAluno }
     * 
     */
    public WsMudancaEntreTurmaRemoverAluno createWsMudancaEntreTurmaRemoverAluno() {
        return new WsMudancaEntreTurmaRemoverAluno();
    }

    /**
     * Create an instance of {@link GetModalidadeDasTurmas }
     * 
     */
    public GetModalidadeDasTurmas createGetModalidadeDasTurmas() {
        return new GetModalidadeDasTurmas();
    }

    /**
     * Create an instance of {@link GetModalidadeDasTurmasResponse }
     * 
     */
    public GetModalidadeDasTurmasResponse createGetModalidadeDasTurmasResponse() {
        return new GetModalidadeDasTurmasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsModalidadeTurma }
     * 
     */
    public ArrayOfWsModalidadeTurma createArrayOfWsModalidadeTurma() {
        return new ArrayOfWsModalidadeTurma();
    }

    /**
     * Create an instance of {@link GetSituacoesAlunosTurma }
     * 
     */
    public GetSituacoesAlunosTurma createGetSituacoesAlunosTurma() {
        return new GetSituacoesAlunosTurma();
    }

    /**
     * Create an instance of {@link GetSituacoesAlunosTurmaResponse }
     * 
     */
    public GetSituacoesAlunosTurmaResponse createGetSituacoesAlunosTurmaResponse() {
        return new GetSituacoesAlunosTurmaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsSituacoesAlunosTurma }
     * 
     */
    public ArrayOfWsSituacoesAlunosTurma createArrayOfWsSituacoesAlunosTurma() {
        return new ArrayOfWsSituacoesAlunosTurma();
    }

    /**
     * Create an instance of {@link GetContratoPDFBase64 }
     * 
     */
    public GetContratoPDFBase64 createGetContratoPDFBase64() {
        return new GetContratoPDFBase64();
    }

    /**
     * Create an instance of {@link GetContratoPDFBase64Response }
     * 
     */
    public GetContratoPDFBase64Response createGetContratoPDFBase64Response() {
        return new GetContratoPDFBase64Response();
    }

    /**
     * Create an instance of {@link ArrayOfWsContratoPDF }
     * 
     */
    public ArrayOfWsContratoPDF createArrayOfWsContratoPDF() {
        return new ArrayOfWsContratoPDF();
    }

    /**
     * Create an instance of {@link GetBolsas }
     * 
     */
    public GetBolsas createGetBolsas() {
        return new GetBolsas();
    }

    /**
     * Create an instance of {@link GetBolsasResponse }
     * 
     */
    public GetBolsasResponse createGetBolsasResponse() {
        return new GetBolsasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsBolsa }
     * 
     */
    public ArrayOfWsBolsa createArrayOfWsBolsa() {
        return new ArrayOfWsBolsa();
    }

    /**
     * Create an instance of {@link GetFormasCobrancas }
     * 
     */
    public GetFormasCobrancas createGetFormasCobrancas() {
        return new GetFormasCobrancas();
    }

    /**
     * Create an instance of {@link GetFormasCobrancasResponse }
     * 
     */
    public GetFormasCobrancasResponse createGetFormasCobrancasResponse() {
        return new GetFormasCobrancasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsFormasCobrancas }
     * 
     */
    public ArrayOfWsFormasCobrancas createArrayOfWsFormasCobrancas() {
        return new ArrayOfWsFormasCobrancas();
    }

    /**
     * Create an instance of {@link GetCategorias }
     * 
     */
    public GetCategorias createGetCategorias() {
        return new GetCategorias();
    }

    /**
     * Create an instance of {@link GetCategoriasResponse }
     * 
     */
    public GetCategoriasResponse createGetCategoriasResponse() {
        return new GetCategoriasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsCategorias }
     * 
     */
    public ArrayOfWsCategorias createArrayOfWsCategorias() {
        return new ArrayOfWsCategorias();
    }

    /**
     * Create an instance of {@link GetCategoriasDespesas }
     * 
     */
    public GetCategoriasDespesas createGetCategoriasDespesas() {
        return new GetCategoriasDespesas();
    }

    /**
     * Create an instance of {@link GetCategoriasDespesasResponse }
     * 
     */
    public GetCategoriasDespesasResponse createGetCategoriasDespesasResponse() {
        return new GetCategoriasDespesasResponse();
    }

    /**
     * Create an instance of {@link GetItens }
     * 
     */
    public GetItens createGetItens() {
        return new GetItens();
    }

    /**
     * Create an instance of {@link GetItensResponse }
     * 
     */
    public GetItensResponse createGetItensResponse() {
        return new GetItensResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsItens }
     * 
     */
    public ArrayOfWsItens createArrayOfWsItens() {
        return new ArrayOfWsItens();
    }

    /**
     * Create an instance of {@link GetLayouts }
     * 
     */
    public GetLayouts createGetLayouts() {
        return new GetLayouts();
    }

    /**
     * Create an instance of {@link GetLayoutsResponse }
     * 
     */
    public GetLayoutsResponse createGetLayoutsResponse() {
        return new GetLayoutsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsLayouts }
     * 
     */
    public ArrayOfWsLayouts createArrayOfWsLayouts() {
        return new ArrayOfWsLayouts();
    }

    /**
     * Create an instance of {@link InsertPlano }
     * 
     */
    public InsertPlano createInsertPlano() {
        return new InsertPlano();
    }

    /**
     * Create an instance of {@link InsertPlanoResponse }
     * 
     */
    public InsertPlanoResponse createInsertPlanoResponse() {
        return new InsertPlanoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsRetornoParcelas }
     * 
     */
    public ArrayOfWsRetornoParcelas createArrayOfWsRetornoParcelas() {
        return new ArrayOfWsRetornoParcelas();
    }

    /**
     * Create an instance of {@link UpdatePlano }
     * 
     */
    public UpdatePlano createUpdatePlano() {
        return new UpdatePlano();
    }

    /**
     * Create an instance of {@link UpdatePlanoResponse }
     * 
     */
    public UpdatePlanoResponse createUpdatePlanoResponse() {
        return new UpdatePlanoResponse();
    }

    /**
     * Create an instance of {@link UpdateParcela }
     * 
     */
    public UpdateParcela createUpdateParcela() {
        return new UpdateParcela();
    }

    /**
     * Create an instance of {@link UpdateParcelaResponse }
     * 
     */
    public UpdateParcelaResponse createUpdateParcelaResponse() {
        return new UpdateParcelaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsRetornoParcela }
     * 
     */
    public ArrayOfWsRetornoParcela createArrayOfWsRetornoParcela() {
        return new ArrayOfWsRetornoParcela();
    }

    /**
     * Create an instance of {@link GetParcelas }
     * 
     */
    public GetParcelas createGetParcelas() {
        return new GetParcelas();
    }

    /**
     * Create an instance of {@link GetParcelasResponse }
     * 
     */
    public GetParcelasResponse createGetParcelasResponse() {
        return new GetParcelasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsParcela }
     * 
     */
    public ArrayOfWsParcela createArrayOfWsParcela() {
        return new ArrayOfWsParcela();
    }

    /**
     * Create an instance of {@link InsertVendas }
     * 
     */
    public InsertVendas createInsertVendas() {
        return new InsertVendas();
    }

    /**
     * Create an instance of {@link GetVendas }
     * 
     */
    public GetVendas createGetVendas() {
        return new GetVendas();
    }

    /**
     * Create an instance of {@link GetVendasResponse }
     * 
     */
    public GetVendasResponse createGetVendasResponse() {
        return new GetVendasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsVendas }
     * 
     */
    public ArrayOfWsVendas createArrayOfWsVendas() {
        return new ArrayOfWsVendas();
    }

    /**
     * Create an instance of {@link GetBoletos }
     * 
     */
    public GetBoletos createGetBoletos() {
        return new GetBoletos();
    }

    /**
     * Create an instance of {@link GetBoletosResponse }
     * 
     */
    public GetBoletosResponse createGetBoletosResponse() {
        return new GetBoletosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsRetornoBoletos }
     * 
     */
    public ArrayOfWsRetornoBoletos createArrayOfWsRetornoBoletos() {
        return new ArrayOfWsRetornoBoletos();
    }

    /**
     * Create an instance of {@link GetDadosFaturaVindi }
     * 
     */
    public GetDadosFaturaVindi createGetDadosFaturaVindi() {
        return new GetDadosFaturaVindi();
    }

    /**
     * Create an instance of {@link GetDadosFaturaVindiResponse }
     * 
     */
    public GetDadosFaturaVindiResponse createGetDadosFaturaVindiResponse() {
        return new GetDadosFaturaVindiResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsDadosFaturaVindi }
     * 
     */
    public ArrayOfWsDadosFaturaVindi createArrayOfWsDadosFaturaVindi() {
        return new ArrayOfWsDadosFaturaVindi();
    }

    /**
     * Create an instance of {@link GetFinanceiro2 }
     * 
     */
    public GetFinanceiro2 createGetFinanceiro2() {
        return new GetFinanceiro2();
    }

    /**
     * Create an instance of {@link GetFinanceiro2Response }
     * 
     */
    public GetFinanceiro2Response createGetFinanceiro2Response() {
        return new GetFinanceiro2Response();
    }

    /**
     * Create an instance of {@link ArrayOfWsFinanceiro }
     * 
     */
    public ArrayOfWsFinanceiro createArrayOfWsFinanceiro() {
        return new ArrayOfWsFinanceiro();
    }

    /**
     * Create an instance of {@link GetFinanceiro }
     * 
     */
    public GetFinanceiro createGetFinanceiro() {
        return new GetFinanceiro();
    }

    /**
     * Create an instance of {@link GetFinanceiroResponse }
     * 
     */
    public GetFinanceiroResponse createGetFinanceiroResponse() {
        return new GetFinanceiroResponse();
    }

    /**
     * Create an instance of {@link GetFinanceiroMaple }
     * 
     */
    public GetFinanceiroMaple createGetFinanceiroMaple() {
        return new GetFinanceiroMaple();
    }

    /**
     * Create an instance of {@link GetFinanceiroMapleResponse }
     * 
     */
    public GetFinanceiroMapleResponse createGetFinanceiroMapleResponse() {
        return new GetFinanceiroMapleResponse();
    }

    /**
     * Create an instance of {@link GetPlanosCursos }
     * 
     */
    public GetPlanosCursos createGetPlanosCursos() {
        return new GetPlanosCursos();
    }

    /**
     * Create an instance of {@link GetPlanosCursosResponse }
     * 
     */
    public GetPlanosCursosResponse createGetPlanosCursosResponse() {
        return new GetPlanosCursosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsPlanoCurso }
     * 
     */
    public ArrayOfWsPlanoCurso createArrayOfWsPlanoCurso() {
        return new ArrayOfWsPlanoCurso();
    }

    /**
     * Create an instance of {@link GetLinhaDigitavelBoletos }
     * 
     */
    public GetLinhaDigitavelBoletos createGetLinhaDigitavelBoletos() {
        return new GetLinhaDigitavelBoletos();
    }

    /**
     * Create an instance of {@link SetNotaParcial }
     * 
     */
    public SetNotaParcial createSetNotaParcial() {
        return new SetNotaParcial();
    }

    /**
     * Create an instance of {@link SetNota }
     * 
     */
    public SetNota createSetNota() {
        return new SetNota();
    }

    /**
     * Create an instance of {@link GetMediaFinal }
     * 
     */
    public GetMediaFinal createGetMediaFinal() {
        return new GetMediaFinal();
    }

    /**
     * Create an instance of {@link GetMediaFinalResponse }
     * 
     */
    public GetMediaFinalResponse createGetMediaFinalResponse() {
        return new GetMediaFinalResponse();
    }

    /**
     * Create an instance of {@link WsMediaFinal }
     * 
     */
    public WsMediaFinal createWsMediaFinal() {
        return new WsMediaFinal();
    }

    /**
     * Create an instance of {@link GetBoletim }
     * 
     */
    public GetBoletim createGetBoletim() {
        return new GetBoletim();
    }

    /**
     * Create an instance of {@link GetBoletimResponse }
     * 
     */
    public GetBoletimResponse createGetBoletimResponse() {
        return new GetBoletimResponse();
    }

    /**
     * Create an instance of {@link WsBoletim }
     * 
     */
    public WsBoletim createWsBoletim() {
        return new WsBoletim();
    }

    /**
     * Create an instance of {@link GetBoletim2 }
     * 
     */
    public GetBoletim2 createGetBoletim2() {
        return new GetBoletim2();
    }

    /**
     * Create an instance of {@link GetBoletim2Response }
     * 
     */
    public GetBoletim2Response createGetBoletim2Response() {
        return new GetBoletim2Response();
    }

    /**
     * Create an instance of {@link WsBoletim2 }
     * 
     */
    public WsBoletim2 createWsBoletim2() {
        return new WsBoletim2();
    }

    /**
     * Create an instance of {@link GetBoletimAulasLivres }
     * 
     */
    public GetBoletimAulasLivres createGetBoletimAulasLivres() {
        return new GetBoletimAulasLivres();
    }

    /**
     * Create an instance of {@link GetBoletimAulasLivresResponse }
     * 
     */
    public GetBoletimAulasLivresResponse createGetBoletimAulasLivresResponse() {
        return new GetBoletimAulasLivresResponse();
    }

    /**
     * Create an instance of {@link WsBoletimAulasLivres }
     * 
     */
    public WsBoletimAulasLivres createWsBoletimAulasLivres() {
        return new WsBoletimAulasLivres();
    }

    /**
     * Create an instance of {@link GetNotasHabilidades }
     * 
     */
    public GetNotasHabilidades createGetNotasHabilidades() {
        return new GetNotasHabilidades();
    }

    /**
     * Create an instance of {@link GetNotasHabilidadesResponse }
     * 
     */
    public GetNotasHabilidadesResponse createGetNotasHabilidadesResponse() {
        return new GetNotasHabilidadesResponse();
    }

    /**
     * Create an instance of {@link WsNotasHabilidades }
     * 
     */
    public WsNotasHabilidades createWsNotasHabilidades() {
        return new WsNotasHabilidades();
    }

    /**
     * Create an instance of {@link GetCertificadoValido }
     * 
     */
    public GetCertificadoValido createGetCertificadoValido() {
        return new GetCertificadoValido();
    }

    /**
     * Create an instance of {@link GetCertificadoValidoResponse }
     * 
     */
    public GetCertificadoValidoResponse createGetCertificadoValidoResponse() {
        return new GetCertificadoValidoResponse();
    }

    /**
     * Create an instance of {@link WSCertificado }
     * 
     */
    public WSCertificado createWSCertificado() {
        return new WSCertificado();
    }

    /**
     * Create an instance of {@link GetFuncionarios }
     * 
     */
    public GetFuncionarios createGetFuncionarios() {
        return new GetFuncionarios();
    }

    /**
     * Create an instance of {@link GetFuncionariosResponse }
     * 
     */
    public GetFuncionariosResponse createGetFuncionariosResponse() {
        return new GetFuncionariosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsFuncionario }
     * 
     */
    public ArrayOfWsFuncionario createArrayOfWsFuncionario() {
        return new ArrayOfWsFuncionario();
    }

    /**
     * Create an instance of {@link GetMidias }
     * 
     */
    public GetMidias createGetMidias() {
        return new GetMidias();
    }

    /**
     * Create an instance of {@link GetMidiasResponse }
     * 
     */
    public GetMidiasResponse createGetMidiasResponse() {
        return new GetMidiasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsMidias }
     * 
     */
    public ArrayOfWsMidias createArrayOfWsMidias() {
        return new ArrayOfWsMidias();
    }

    /**
     * Create an instance of {@link GetIndicesGestaoComercial }
     * 
     */
    public GetIndicesGestaoComercial createGetIndicesGestaoComercial() {
        return new GetIndicesGestaoComercial();
    }

    /**
     * Create an instance of {@link GetIndicesGestaoComercialResponse }
     * 
     */
    public GetIndicesGestaoComercialResponse createGetIndicesGestaoComercialResponse() {
        return new GetIndicesGestaoComercialResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsGestaoComercial }
     * 
     */
    public ArrayOfWsGestaoComercial createArrayOfWsGestaoComercial() {
        return new ArrayOfWsGestaoComercial();
    }

    /**
     * Create an instance of {@link GetAtendimentos }
     * 
     */
    public GetAtendimentos createGetAtendimentos() {
        return new GetAtendimentos();
    }

    /**
     * Create an instance of {@link GetAtendimentosResponse }
     * 
     */
    public GetAtendimentosResponse createGetAtendimentosResponse() {
        return new GetAtendimentosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAtendimentos }
     * 
     */
    public ArrayOfWsAtendimentos createArrayOfWsAtendimentos() {
        return new ArrayOfWsAtendimentos();
    }

    /**
     * Create an instance of {@link QuitarParcelas }
     * 
     */
    public QuitarParcelas createQuitarParcelas() {
        return new QuitarParcelas();
    }

    /**
     * Create an instance of {@link QuitarParcelasResponse }
     * 
     */
    public QuitarParcelasResponse createQuitarParcelasResponse() {
        return new QuitarParcelasResponse();
    }

    /**
     * Create an instance of {@link WsQuitacao }
     * 
     */
    public WsQuitacao createWsQuitacao() {
        return new WsQuitacao();
    }

    /**
     * Create an instance of {@link GetOperadorasCartao }
     * 
     */
    public GetOperadorasCartao createGetOperadorasCartao() {
        return new GetOperadorasCartao();
    }

    /**
     * Create an instance of {@link GetOperadorasCartaoResponse }
     * 
     */
    public GetOperadorasCartaoResponse createGetOperadorasCartaoResponse() {
        return new GetOperadorasCartaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsOperadoraCartao }
     * 
     */
    public ArrayOfWsOperadoraCartao createArrayOfWsOperadoraCartao() {
        return new ArrayOfWsOperadoraCartao();
    }

    /**
     * Create an instance of {@link GetAgendaAluno }
     * 
     */
    public GetAgendaAluno createGetAgendaAluno() {
        return new GetAgendaAluno();
    }

    /**
     * Create an instance of {@link GetAgendaAlunoResponse }
     * 
     */
    public GetAgendaAlunoResponse createGetAgendaAlunoResponse() {
        return new GetAgendaAlunoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAgendaAluno }
     * 
     */
    public ArrayOfWsAgendaAluno createArrayOfWsAgendaAluno() {
        return new ArrayOfWsAgendaAluno();
    }

    /**
     * Create an instance of {@link GetCalendarioDidatico }
     * 
     */
    public GetCalendarioDidatico createGetCalendarioDidatico() {
        return new GetCalendarioDidatico();
    }

    /**
     * Create an instance of {@link GetCalendarioDidaticoResponse }
     * 
     */
    public GetCalendarioDidaticoResponse createGetCalendarioDidaticoResponse() {
        return new GetCalendarioDidaticoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsCalendario }
     * 
     */
    public ArrayOfWsCalendario createArrayOfWsCalendario() {
        return new ArrayOfWsCalendario();
    }

    /**
     * Create an instance of {@link InsertPlanoContaPagar }
     * 
     */
    public InsertPlanoContaPagar createInsertPlanoContaPagar() {
        return new InsertPlanoContaPagar();
    }

    /**
     * Create an instance of {@link InsertPlanoContaPagarResponse }
     * 
     */
    public InsertPlanoContaPagarResponse createInsertPlanoContaPagarResponse() {
        return new InsertPlanoContaPagarResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsRetornoParcelasPagar }
     * 
     */
    public ArrayOfWsRetornoParcelasPagar createArrayOfWsRetornoParcelasPagar() {
        return new ArrayOfWsRetornoParcelasPagar();
    }

    /**
     * Create an instance of {@link UpdatePlanoPagar }
     * 
     */
    public UpdatePlanoPagar createUpdatePlanoPagar() {
        return new UpdatePlanoPagar();
    }

    /**
     * Create an instance of {@link UpdatePlanoPagarResponse }
     * 
     */
    public UpdatePlanoPagarResponse createUpdatePlanoPagarResponse() {
        return new UpdatePlanoPagarResponse();
    }

    /**
     * Create an instance of {@link UpdateParcelaPagar }
     * 
     */
    public UpdateParcelaPagar createUpdateParcelaPagar() {
        return new UpdateParcelaPagar();
    }

    /**
     * Create an instance of {@link UpdateParcelaPagarResponse }
     * 
     */
    public UpdateParcelaPagarResponse createUpdateParcelaPagarResponse() {
        return new UpdateParcelaPagarResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsRetornoParcelaPagar }
     * 
     */
    public ArrayOfWsRetornoParcelaPagar createArrayOfWsRetornoParcelaPagar() {
        return new ArrayOfWsRetornoParcelaPagar();
    }

    /**
     * Create an instance of {@link GetParcelasPagar }
     * 
     */
    public GetParcelasPagar createGetParcelasPagar() {
        return new GetParcelasPagar();
    }

    /**
     * Create an instance of {@link GetParcelasPagarResponse }
     * 
     */
    public GetParcelasPagarResponse createGetParcelasPagarResponse() {
        return new GetParcelasPagarResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsParcelaPagar }
     * 
     */
    public ArrayOfWsParcelaPagar createArrayOfWsParcelaPagar() {
        return new ArrayOfWsParcelaPagar();
    }

    /**
     * Create an instance of {@link GetSistemaAvaliacao }
     * 
     */
    public GetSistemaAvaliacao createGetSistemaAvaliacao() {
        return new GetSistemaAvaliacao();
    }

    /**
     * Create an instance of {@link GetSistemaAvaliacaoResponse }
     * 
     */
    public GetSistemaAvaliacaoResponse createGetSistemaAvaliacaoResponse() {
        return new GetSistemaAvaliacaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsSistemaAvaliacao }
     * 
     */
    public ArrayOfWsSistemaAvaliacao createArrayOfWsSistemaAvaliacao() {
        return new ArrayOfWsSistemaAvaliacao();
    }

    /**
     * Create an instance of {@link GetAvaliacaoParcial }
     * 
     */
    public GetAvaliacaoParcial createGetAvaliacaoParcial() {
        return new GetAvaliacaoParcial();
    }

    /**
     * Create an instance of {@link GetAvaliacaoParcialResponse }
     * 
     */
    public GetAvaliacaoParcialResponse createGetAvaliacaoParcialResponse() {
        return new GetAvaliacaoParcialResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAvaliacoesParciais }
     * 
     */
    public ArrayOfWsAvaliacoesParciais createArrayOfWsAvaliacoesParciais() {
        return new ArrayOfWsAvaliacoesParciais();
    }

    /**
     * Create an instance of {@link GetFrequenciaTurma }
     * 
     */
    public GetFrequenciaTurma createGetFrequenciaTurma() {
        return new GetFrequenciaTurma();
    }

    /**
     * Create an instance of {@link GetFrequenciaTurmaResponse }
     * 
     */
    public GetFrequenciaTurmaResponse createGetFrequenciaTurmaResponse() {
        return new GetFrequenciaTurmaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsFrequenciaTurma }
     * 
     */
    public ArrayOfWsFrequenciaTurma createArrayOfWsFrequenciaTurma() {
        return new ArrayOfWsFrequenciaTurma();
    }

    /**
     * Create an instance of {@link GetNotaParcial }
     * 
     */
    public GetNotaParcial createGetNotaParcial() {
        return new GetNotaParcial();
    }

    /**
     * Create an instance of {@link GetNotaParcialResponse }
     * 
     */
    public GetNotaParcialResponse createGetNotaParcialResponse() {
        return new GetNotaParcialResponse();
    }

    /**
     * Create an instance of {@link WsNotasParciais }
     * 
     */
    public WsNotasParciais createWsNotasParciais() {
        return new WsNotasParciais();
    }

    /**
     * Create an instance of {@link ValidaLoginPortal }
     * 
     */
    public ValidaLoginPortal createValidaLoginPortal() {
        return new ValidaLoginPortal();
    }

    /**
     * Create an instance of {@link ValidaLoginPortalResponse }
     * 
     */
    public ValidaLoginPortalResponse createValidaLoginPortalResponse() {
        return new ValidaLoginPortalResponse();
    }

    /**
     * Create an instance of {@link WsLoginPortal }
     * 
     */
    public WsLoginPortal createWsLoginPortal() {
        return new WsLoginPortal();
    }

    /**
     * Create an instance of {@link GetFinanceiroApp }
     * 
     */
    public GetFinanceiroApp createGetFinanceiroApp() {
        return new GetFinanceiroApp();
    }

    /**
     * Create an instance of {@link GetFinanceiroAppResponse }
     * 
     */
    public GetFinanceiroAppResponse createGetFinanceiroAppResponse() {
        return new GetFinanceiroAppResponse();
    }

    /**
     * Create an instance of {@link AccessValidationApp }
     * 
     */
    public AccessValidationApp createAccessValidationApp() {
        return new AccessValidationApp();
    }

    /**
     * Create an instance of {@link AccessValidationAppResponse }
     * 
     */
    public AccessValidationAppResponse createAccessValidationAppResponse() {
        return new AccessValidationAppResponse();
    }

    /**
     * Create an instance of {@link WsAccessValidationApp }
     * 
     */
    public WsAccessValidationApp createWsAccessValidationApp() {
        return new WsAccessValidationApp();
    }

    /**
     * Create an instance of {@link ValidaLoginApp }
     * 
     */
    public ValidaLoginApp createValidaLoginApp() {
        return new ValidaLoginApp();
    }

    /**
     * Create an instance of {@link ValidaLoginAppResponse }
     * 
     */
    public ValidaLoginAppResponse createValidaLoginAppResponse() {
        return new ValidaLoginAppResponse();
    }

    /**
     * Create an instance of {@link WsLoginApp }
     * 
     */
    public WsLoginApp createWsLoginApp() {
        return new WsLoginApp();
    }

    /**
     * Create an instance of {@link GetConfiguracaoApp }
     * 
     */
    public GetConfiguracaoApp createGetConfiguracaoApp() {
        return new GetConfiguracaoApp();
    }

    /**
     * Create an instance of {@link GetConfiguracaoAppResponse }
     * 
     */
    public GetConfiguracaoAppResponse createGetConfiguracaoAppResponse() {
        return new GetConfiguracaoAppResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAppPortalNotas }
     * 
     */
    public ArrayOfWsAppPortalNotas createArrayOfWsAppPortalNotas() {
        return new ArrayOfWsAppPortalNotas();
    }

    /**
     * Create an instance of {@link GetOpcoesNotificacao }
     * 
     */
    public GetOpcoesNotificacao createGetOpcoesNotificacao() {
        return new GetOpcoesNotificacao();
    }

    /**
     * Create an instance of {@link GetOpcoesNotificacaoResponse }
     * 
     */
    public GetOpcoesNotificacaoResponse createGetOpcoesNotificacaoResponse() {
        return new GetOpcoesNotificacaoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAppPortalNotasNotificacao }
     * 
     */
    public ArrayOfWsAppPortalNotasNotificacao createArrayOfWsAppPortalNotasNotificacao() {
        return new ArrayOfWsAppPortalNotasNotificacao();
    }

    /**
     * Create an instance of {@link UpdateOpcoesNotificacaoApp }
     * 
     */
    public UpdateOpcoesNotificacaoApp createUpdateOpcoesNotificacaoApp() {
        return new UpdateOpcoesNotificacaoApp();
    }

    /**
     * Create an instance of {@link UpdateOpcoesNotificacaoAppResponse }
     * 
     */
    public UpdateOpcoesNotificacaoAppResponse createUpdateOpcoesNotificacaoAppResponse() {
        return new UpdateOpcoesNotificacaoAppResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTokenMobile }
     * 
     */
    public ArrayOfTokenMobile createArrayOfTokenMobile() {
        return new ArrayOfTokenMobile();
    }

    /**
     * Create an instance of {@link InsertOrDeleteTokenApp }
     * 
     */
    public InsertOrDeleteTokenApp createInsertOrDeleteTokenApp() {
        return new InsertOrDeleteTokenApp();
    }

    /**
     * Create an instance of {@link InsertOrDeleteTokenAppResponse }
     * 
     */
    public InsertOrDeleteTokenAppResponse createInsertOrDeleteTokenAppResponse() {
        return new InsertOrDeleteTokenAppResponse();
    }

    /**
     * Create an instance of {@link UpdateImageApp }
     * 
     */
    public UpdateImageApp createUpdateImageApp() {
        return new UpdateImageApp();
    }

    /**
     * Create an instance of {@link UpdateImageAppResponse }
     * 
     */
    public UpdateImageAppResponse createUpdateImageAppResponse() {
        return new UpdateImageAppResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsFotoApp }
     * 
     */
    public ArrayOfWsFotoApp createArrayOfWsFotoApp() {
        return new ArrayOfWsFotoApp();
    }

    /**
     * Create an instance of {@link UpdateSenhaPortal }
     * 
     */
    public UpdateSenhaPortal createUpdateSenhaPortal() {
        return new UpdateSenhaPortal();
    }

    /**
     * Create an instance of {@link UpdateSenhaPortalResponse }
     * 
     */
    public UpdateSenhaPortalResponse createUpdateSenhaPortalResponse() {
        return new UpdateSenhaPortalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsAtualizaSenhaAlunoResponsavel }
     * 
     */
    public ArrayOfWsAtualizaSenhaAlunoResponsavel createArrayOfWsAtualizaSenhaAlunoResponsavel() {
        return new ArrayOfWsAtualizaSenhaAlunoResponsavel();
    }

    /**
     * Create an instance of {@link GetImageApp }
     * 
     */
    public GetImageApp createGetImageApp() {
        return new GetImageApp();
    }

    /**
     * Create an instance of {@link GetImageAppResponse }
     * 
     */
    public GetImageAppResponse createGetImageAppResponse() {
        return new GetImageAppResponse();
    }

    /**
     * Create an instance of {@link GetResponsaveisApp }
     * 
     */
    public GetResponsaveisApp createGetResponsaveisApp() {
        return new GetResponsaveisApp();
    }

    /**
     * Create an instance of {@link GetResponsaveisAppResponse }
     * 
     */
    public GetResponsaveisAppResponse createGetResponsaveisAppResponse() {
        return new GetResponsaveisAppResponse();
    }

    /**
     * Create an instance of {@link InsertTimeline }
     * 
     */
    public InsertTimeline createInsertTimeline() {
        return new InsertTimeline();
    }

    /**
     * Create an instance of {@link InsertTimelineResponse }
     * 
     */
    public InsertTimelineResponse createInsertTimelineResponse() {
        return new InsertTimelineResponse();
    }

    /**
     * Create an instance of {@link GetTimeline }
     * 
     */
    public GetTimeline createGetTimeline() {
        return new GetTimeline();
    }

    /**
     * Create an instance of {@link GetTimelineResponse }
     * 
     */
    public GetTimelineResponse createGetTimelineResponse() {
        return new GetTimelineResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTimeline }
     * 
     */
    public ArrayOfTimeline createArrayOfTimeline() {
        return new ArrayOfTimeline();
    }

    /**
     * Create an instance of {@link UpdateReadTimeline }
     * 
     */
    public UpdateReadTimeline createUpdateReadTimeline() {
        return new UpdateReadTimeline();
    }

    /**
     * Create an instance of {@link UpdateReadTimelineResponse }
     * 
     */
    public UpdateReadTimelineResponse createUpdateReadTimelineResponse() {
        return new UpdateReadTimelineResponse();
    }

    /**
     * Create an instance of {@link UpdateSituacaoComunicadoApp }
     * 
     */
    public UpdateSituacaoComunicadoApp createUpdateSituacaoComunicadoApp() {
        return new UpdateSituacaoComunicadoApp();
    }

    /**
     * Create an instance of {@link UpdateSituacaoComunicadoAppResponse }
     * 
     */
    public UpdateSituacaoComunicadoAppResponse createUpdateSituacaoComunicadoAppResponse() {
        return new UpdateSituacaoComunicadoAppResponse();
    }

    /**
     * Create an instance of {@link WsAtualizaSituacaoComunicado }
     * 
     */
    public WsAtualizaSituacaoComunicado createWsAtualizaSituacaoComunicado() {
        return new WsAtualizaSituacaoComunicado();
    }

    /**
     * Create an instance of {@link GetComunicadoAPP }
     * 
     */
    public GetComunicadoAPP createGetComunicadoAPP() {
        return new GetComunicadoAPP();
    }

    /**
     * Create an instance of {@link GetComunicadoAPPResponse }
     * 
     */
    public GetComunicadoAPPResponse createGetComunicadoAPPResponse() {
        return new GetComunicadoAPPResponse();
    }

    /**
     * Create an instance of {@link WsComunicadoAPP }
     * 
     */
    public WsComunicadoAPP createWsComunicadoAPP() {
        return new WsComunicadoAPP();
    }

    /**
     * Create an instance of {@link GetComunicadosAPP }
     * 
     */
    public GetComunicadosAPP createGetComunicadosAPP() {
        return new GetComunicadosAPP();
    }

    /**
     * Create an instance of {@link GetComunicadosAPPResponse }
     * 
     */
    public GetComunicadosAPPResponse createGetComunicadosAPPResponse() {
        return new GetComunicadosAPPResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsComunicadoAPP }
     * 
     */
    public ArrayOfWsComunicadoAPP createArrayOfWsComunicadoAPP() {
        return new ArrayOfWsComunicadoAPP();
    }

    /**
     * Create an instance of {@link GetMensagemRespostasAPP }
     * 
     */
    public GetMensagemRespostasAPP createGetMensagemRespostasAPP() {
        return new GetMensagemRespostasAPP();
    }

    /**
     * Create an instance of {@link GetMensagemRespostasAPPResponse }
     * 
     */
    public GetMensagemRespostasAPPResponse createGetMensagemRespostasAPPResponse() {
        return new GetMensagemRespostasAPPResponse();
    }

    /**
     * Create an instance of {@link WsMensagemAPP }
     * 
     */
    public WsMensagemAPP createWsMensagemAPP() {
        return new WsMensagemAPP();
    }

    /**
     * Create an instance of {@link GetMensagensAPP }
     * 
     */
    public GetMensagensAPP createGetMensagensAPP() {
        return new GetMensagensAPP();
    }

    /**
     * Create an instance of {@link GetMensagensAPPResponse }
     * 
     */
    public GetMensagensAPPResponse createGetMensagensAPPResponse() {
        return new GetMensagensAPPResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWsMensagensAPP }
     * 
     */
    public ArrayOfWsMensagensAPP createArrayOfWsMensagensAPP() {
        return new ArrayOfWsMensagensAPP();
    }

    /**
     * Create an instance of {@link WsMensagemResposta }
     * 
     */
    public WsMensagemResposta createWsMensagemResposta() {
        return new WsMensagemResposta();
    }

    /**
     * Create an instance of {@link WsMovimentacoesAlunos }
     * 
     */
    public WsMovimentacoesAlunos createWsMovimentacoesAlunos() {
        return new WsMovimentacoesAlunos();
    }

    /**
     * Create an instance of {@link ArrayOfWsMovimentacaoAluno }
     * 
     */
    public ArrayOfWsMovimentacaoAluno createArrayOfWsMovimentacaoAluno() {
        return new ArrayOfWsMovimentacaoAluno();
    }

    /**
     * Create an instance of {@link WsMovimentacaoAluno }
     * 
     */
    public WsMovimentacaoAluno createWsMovimentacaoAluno() {
        return new WsMovimentacaoAluno();
    }

    /**
     * Create an instance of {@link WsCartoesCatraca }
     * 
     */
    public WsCartoesCatraca createWsCartoesCatraca() {
        return new WsCartoesCatraca();
    }

    /**
     * Create an instance of {@link ArrayOfWsCartoes }
     * 
     */
    public ArrayOfWsCartoes createArrayOfWsCartoes() {
        return new ArrayOfWsCartoes();
    }

    /**
     * Create an instance of {@link WsCartoes }
     * 
     */
    public WsCartoes createWsCartoes() {
        return new WsCartoes();
    }

    /**
     * Create an instance of {@link WsQuadroHorarios }
     * 
     */
    public WsQuadroHorarios createWsQuadroHorarios() {
        return new WsQuadroHorarios();
    }

    /**
     * Create an instance of {@link WsHorariosAula }
     * 
     */
    public WsHorariosAula createWsHorariosAula() {
        return new WsHorariosAula();
    }

    /**
     * Create an instance of {@link ArrayOfWsHorarios }
     * 
     */
    public ArrayOfWsHorarios createArrayOfWsHorarios() {
        return new ArrayOfWsHorarios();
    }

    /**
     * Create an instance of {@link WsHorarios }
     * 
     */
    public WsHorarios createWsHorarios() {
        return new WsHorarios();
    }

    /**
     * Create an instance of {@link ArrayOfWsHorarioDetalhes }
     * 
     */
    public ArrayOfWsHorarioDetalhes createArrayOfWsHorarioDetalhes() {
        return new ArrayOfWsHorarioDetalhes();
    }

    /**
     * Create an instance of {@link WsHorarioDetalhes }
     * 
     */
    public WsHorarioDetalhes createWsHorarioDetalhes() {
        return new WsHorarioDetalhes();
    }

    /**
     * Create an instance of {@link WsDiarioAulas }
     * 
     */
    public WsDiarioAulas createWsDiarioAulas() {
        return new WsDiarioAulas();
    }

    /**
     * Create an instance of {@link ArrayOfWsAulasDiario }
     * 
     */
    public ArrayOfWsAulasDiario createArrayOfWsAulasDiario() {
        return new ArrayOfWsAulasDiario();
    }

    /**
     * Create an instance of {@link WsAulasDiario }
     * 
     */
    public WsAulasDiario createWsAulasDiario() {
        return new WsAulasDiario();
    }

    /**
     * Create an instance of {@link WsDiarioAulasLivres }
     * 
     */
    public WsDiarioAulasLivres createWsDiarioAulasLivres() {
        return new WsDiarioAulasLivres();
    }

    /**
     * Create an instance of {@link ArrayOfWsAulasLivreDiario }
     * 
     */
    public ArrayOfWsAulasLivreDiario createArrayOfWsAulasLivreDiario() {
        return new ArrayOfWsAulasLivreDiario();
    }

    /**
     * Create an instance of {@link WsAulasLivreDiario }
     * 
     */
    public WsAulasLivreDiario createWsAulasLivreDiario() {
        return new WsAulasLivreDiario();
    }

    /**
     * Create an instance of {@link WsSalas }
     * 
     */
    public WsSalas createWsSalas() {
        return new WsSalas();
    }

    /**
     * Create an instance of {@link WsLocacaoAmbientesHorarios }
     * 
     */
    public WsLocacaoAmbientesHorarios createWsLocacaoAmbientesHorarios() {
        return new WsLocacaoAmbientesHorarios();
    }

    /**
     * Create an instance of {@link ArrayOfWsLocacaoAmbientesHorariosDetalhes }
     * 
     */
    public ArrayOfWsLocacaoAmbientesHorariosDetalhes createArrayOfWsLocacaoAmbientesHorariosDetalhes() {
        return new ArrayOfWsLocacaoAmbientesHorariosDetalhes();
    }

    /**
     * Create an instance of {@link WsLocacaoAmbientesHorariosDetalhes }
     * 
     */
    public WsLocacaoAmbientesHorariosDetalhes createWsLocacaoAmbientesHorariosDetalhes() {
        return new WsLocacaoAmbientesHorariosDetalhes();
    }

    /**
     * Create an instance of {@link WsAluno }
     * 
     */
    public WsAluno createWsAluno() {
        return new WsAluno();
    }

    /**
     * Create an instance of {@link RetornoApiBase }
     * 
     */
    public RetornoApiBase createRetornoApiBase() {
        return new RetornoApiBase();
    }

    /**
     * Create an instance of {@link ArrayOfWsResponsaveis }
     * 
     */
    public ArrayOfWsResponsaveis createArrayOfWsResponsaveis() {
        return new ArrayOfWsResponsaveis();
    }

    /**
     * Create an instance of {@link WsResponsaveis }
     * 
     */
    public WsResponsaveis createWsResponsaveis() {
        return new WsResponsaveis();
    }

    /**
     * Create an instance of {@link WsRetornoAlunosAlterados }
     * 
     */
    public WsRetornoAlunosAlterados createWsRetornoAlunosAlterados() {
        return new WsRetornoAlunosAlterados();
    }

    /**
     * Create an instance of {@link WsSituacoesAlunos }
     * 
     */
    public WsSituacoesAlunos createWsSituacoesAlunos() {
        return new WsSituacoesAlunos();
    }

    /**
     * Create an instance of {@link ArrayOfSituacoesAlunos }
     * 
     */
    public ArrayOfSituacoesAlunos createArrayOfSituacoesAlunos() {
        return new ArrayOfSituacoesAlunos();
    }

    /**
     * Create an instance of {@link SituacoesAlunos }
     * 
     */
    public SituacoesAlunos createSituacoesAlunos() {
        return new SituacoesAlunos();
    }

    /**
     * Create an instance of {@link WsOrigensAlunos }
     * 
     */
    public WsOrigensAlunos createWsOrigensAlunos() {
        return new WsOrigensAlunos();
    }

    /**
     * Create an instance of {@link ArrayOfOrigensAlunos }
     * 
     */
    public ArrayOfOrigensAlunos createArrayOfOrigensAlunos() {
        return new ArrayOfOrigensAlunos();
    }

    /**
     * Create an instance of {@link OrigensAlunos }
     * 
     */
    public OrigensAlunos createOrigensAlunos() {
        return new OrigensAlunos();
    }

    /**
     * Create an instance of {@link WsOcorrencias }
     * 
     */
    public WsOcorrencias createWsOcorrencias() {
        return new WsOcorrencias();
    }

    /**
     * Create an instance of {@link WsCliente }
     * 
     */
    public WsCliente createWsCliente() {
        return new WsCliente();
    }

    /**
     * Create an instance of {@link WsConta }
     * 
     */
    public WsConta createWsConta() {
        return new WsConta();
    }

    /**
     * Create an instance of {@link ArrayOfContas }
     * 
     */
    public ArrayOfContas createArrayOfContas() {
        return new ArrayOfContas();
    }

    /**
     * Create an instance of {@link Contas }
     * 
     */
    public Contas createContas() {
        return new Contas();
    }

    /**
     * Create an instance of {@link WsResponsavel }
     * 
     */
    public WsResponsavel createWsResponsavel() {
        return new WsResponsavel();
    }

    /**
     * Create an instance of {@link ArrayOfWsAlunos }
     * 
     */
    public ArrayOfWsAlunos createArrayOfWsAlunos() {
        return new ArrayOfWsAlunos();
    }

    /**
     * Create an instance of {@link WsAlunos }
     * 
     */
    public WsAlunos createWsAlunos() {
        return new WsAlunos();
    }

    /**
     * Create an instance of {@link WsMatrizCurricular }
     * 
     */
    public WsMatrizCurricular createWsMatrizCurricular() {
        return new WsMatrizCurricular();
    }

    /**
     * Create an instance of {@link ArrayOfDisciplinas }
     * 
     */
    public ArrayOfDisciplinas createArrayOfDisciplinas() {
        return new ArrayOfDisciplinas();
    }

    /**
     * Create an instance of {@link Disciplinas }
     * 
     */
    public Disciplinas createDisciplinas() {
        return new Disciplinas();
    }

    /**
     * Create an instance of {@link WsMatrizCurricular2 }
     * 
     */
    public WsMatrizCurricular2 createWsMatrizCurricular2() {
        return new WsMatrizCurricular2();
    }

    /**
     * Create an instance of {@link WsDisciplina }
     * 
     */
    public WsDisciplina createWsDisciplina() {
        return new WsDisciplina();
    }

    /**
     * Create an instance of {@link WsDisciplinaDetalhada }
     * 
     */
    public WsDisciplinaDetalhada createWsDisciplinaDetalhada() {
        return new WsDisciplinaDetalhada();
    }

    /**
     * Create an instance of {@link ArrayOfWsProfessores }
     * 
     */
    public ArrayOfWsProfessores createArrayOfWsProfessores() {
        return new ArrayOfWsProfessores();
    }

    /**
     * Create an instance of {@link WsProfessores }
     * 
     */
    public WsProfessores createWsProfessores() {
        return new WsProfessores();
    }

    /**
     * Create an instance of {@link WsCurso }
     * 
     */
    public WsCurso createWsCurso() {
        return new WsCurso();
    }

    /**
     * Create an instance of {@link ArrayOfWsDisciplinas }
     * 
     */
    public ArrayOfWsDisciplinas createArrayOfWsDisciplinas() {
        return new ArrayOfWsDisciplinas();
    }

    /**
     * Create an instance of {@link WsDisciplinas }
     * 
     */
    public WsDisciplinas createWsDisciplinas() {
        return new WsDisciplinas();
    }

    /**
     * Create an instance of {@link ArrayOfWsCoordenadores }
     * 
     */
    public ArrayOfWsCoordenadores createArrayOfWsCoordenadores() {
        return new ArrayOfWsCoordenadores();
    }

    /**
     * Create an instance of {@link WsCoordenadores }
     * 
     */
    public WsCoordenadores createWsCoordenadores() {
        return new WsCoordenadores();
    }

    /**
     * Create an instance of {@link ArrayOfWsDiretores }
     * 
     */
    public ArrayOfWsDiretores createArrayOfWsDiretores() {
        return new ArrayOfWsDiretores();
    }

    /**
     * Create an instance of {@link WsDiretores }
     * 
     */
    public WsDiretores createWsDiretores() {
        return new WsDiretores();
    }

    /**
     * Create an instance of {@link WsTurma }
     * 
     */
    public WsTurma createWsTurma() {
        return new WsTurma();
    }

    /**
     * Create an instance of {@link WsCodigoTurma }
     * 
     */
    public WsCodigoTurma createWsCodigoTurma() {
        return new WsCodigoTurma();
    }

    /**
     * Create an instance of {@link WsMatricula }
     * 
     */
    public WsMatricula createWsMatricula() {
        return new WsMatricula();
    }

    /**
     * Create an instance of {@link ArrayOfWsDisciplinasComTurma }
     * 
     */
    public ArrayOfWsDisciplinasComTurma createArrayOfWsDisciplinasComTurma() {
        return new ArrayOfWsDisciplinasComTurma();
    }

    /**
     * Create an instance of {@link WsDisciplinasComTurma }
     * 
     */
    public WsDisciplinasComTurma createWsDisciplinasComTurma() {
        return new WsDisciplinasComTurma();
    }

    /**
     * Create an instance of {@link WsIntegrantesTurma }
     * 
     */
    public WsIntegrantesTurma createWsIntegrantesTurma() {
        return new WsIntegrantesTurma();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrantes }
     * 
     */
    public ArrayOfIntegrantes createArrayOfIntegrantes() {
        return new ArrayOfIntegrantes();
    }

    /**
     * Create an instance of {@link Integrantes }
     * 
     */
    public Integrantes createIntegrantes() {
        return new Integrantes();
    }

    /**
     * Create an instance of {@link ArrayOfWsInfoTurma }
     * 
     */
    public ArrayOfWsInfoTurma createArrayOfWsInfoTurma() {
        return new ArrayOfWsInfoTurma();
    }

    /**
     * Create an instance of {@link WsInfoTurma }
     * 
     */
    public WsInfoTurma createWsInfoTurma() {
        return new WsInfoTurma();
    }

    /**
     * Create an instance of {@link WsModalidadeTurma }
     * 
     */
    public WsModalidadeTurma createWsModalidadeTurma() {
        return new WsModalidadeTurma();
    }

    /**
     * Create an instance of {@link ArrayOfModalidadeTurma }
     * 
     */
    public ArrayOfModalidadeTurma createArrayOfModalidadeTurma() {
        return new ArrayOfModalidadeTurma();
    }

    /**
     * Create an instance of {@link ModalidadeTurma }
     * 
     */
    public ModalidadeTurma createModalidadeTurma() {
        return new ModalidadeTurma();
    }

    /**
     * Create an instance of {@link WsSituacoesAlunosTurma }
     * 
     */
    public WsSituacoesAlunosTurma createWsSituacoesAlunosTurma() {
        return new WsSituacoesAlunosTurma();
    }

    /**
     * Create an instance of {@link ArrayOfSituacoesAlunosTurma }
     * 
     */
    public ArrayOfSituacoesAlunosTurma createArrayOfSituacoesAlunosTurma() {
        return new ArrayOfSituacoesAlunosTurma();
    }

    /**
     * Create an instance of {@link SituacoesAlunosTurma }
     * 
     */
    public SituacoesAlunosTurma createSituacoesAlunosTurma() {
        return new SituacoesAlunosTurma();
    }

    /**
     * Create an instance of {@link WsContratoPDF }
     * 
     */
    public WsContratoPDF createWsContratoPDF() {
        return new WsContratoPDF();
    }

    /**
     * Create an instance of {@link WsBolsa }
     * 
     */
    public WsBolsa createWsBolsa() {
        return new WsBolsa();
    }

    /**
     * Create an instance of {@link ArrayOfWsDescontos }
     * 
     */
    public ArrayOfWsDescontos createArrayOfWsDescontos() {
        return new ArrayOfWsDescontos();
    }

    /**
     * Create an instance of {@link WsDescontos }
     * 
     */
    public WsDescontos createWsDescontos() {
        return new WsDescontos();
    }

    /**
     * Create an instance of {@link WsFormasCobrancas }
     * 
     */
    public WsFormasCobrancas createWsFormasCobrancas() {
        return new WsFormasCobrancas();
    }

    /**
     * Create an instance of {@link ArrayOfFormasCobrancas }
     * 
     */
    public ArrayOfFormasCobrancas createArrayOfFormasCobrancas() {
        return new ArrayOfFormasCobrancas();
    }

    /**
     * Create an instance of {@link FormasCobrancas }
     * 
     */
    public FormasCobrancas createFormasCobrancas() {
        return new FormasCobrancas();
    }

    /**
     * Create an instance of {@link WsCategorias }
     * 
     */
    public WsCategorias createWsCategorias() {
        return new WsCategorias();
    }

    /**
     * Create an instance of {@link ArrayOfCategorias }
     * 
     */
    public ArrayOfCategorias createArrayOfCategorias() {
        return new ArrayOfCategorias();
    }

    /**
     * Create an instance of {@link Categorias }
     * 
     */
    public Categorias createCategorias() {
        return new Categorias();
    }

    /**
     * Create an instance of {@link WsItens }
     * 
     */
    public WsItens createWsItens() {
        return new WsItens();
    }

    /**
     * Create an instance of {@link ArrayOfItens }
     * 
     */
    public ArrayOfItens createArrayOfItens() {
        return new ArrayOfItens();
    }

    /**
     * Create an instance of {@link Itens }
     * 
     */
    public Itens createItens() {
        return new Itens();
    }

    /**
     * Create an instance of {@link WsLayouts }
     * 
     */
    public WsLayouts createWsLayouts() {
        return new WsLayouts();
    }

    /**
     * Create an instance of {@link ArrayOfCobrancasBancarias }
     * 
     */
    public ArrayOfCobrancasBancarias createArrayOfCobrancasBancarias() {
        return new ArrayOfCobrancasBancarias();
    }

    /**
     * Create an instance of {@link CobrancasBancarias }
     * 
     */
    public CobrancasBancarias createCobrancasBancarias() {
        return new CobrancasBancarias();
    }

    /**
     * Create an instance of {@link WsRetornoParcelas }
     * 
     */
    public WsRetornoParcelas createWsRetornoParcelas() {
        return new WsRetornoParcelas();
    }

    /**
     * Create an instance of {@link ArrayOfWsParcelas }
     * 
     */
    public ArrayOfWsParcelas createArrayOfWsParcelas() {
        return new ArrayOfWsParcelas();
    }

    /**
     * Create an instance of {@link WsParcelas }
     * 
     */
    public WsParcelas createWsParcelas() {
        return new WsParcelas();
    }

    /**
     * Create an instance of {@link WsRetornoParcela }
     * 
     */
    public WsRetornoParcela createWsRetornoParcela() {
        return new WsRetornoParcela();
    }

    /**
     * Create an instance of {@link WsParcela }
     * 
     */
    public WsParcela createWsParcela() {
        return new WsParcela();
    }

    /**
     * Create an instance of {@link WsVendas }
     * 
     */
    public WsVendas createWsVendas() {
        return new WsVendas();
    }

    /**
     * Create an instance of {@link ArrayOfWsItensVenda }
     * 
     */
    public ArrayOfWsItensVenda createArrayOfWsItensVenda() {
        return new ArrayOfWsItensVenda();
    }

    /**
     * Create an instance of {@link WsItensVenda }
     * 
     */
    public WsItensVenda createWsItensVenda() {
        return new WsItensVenda();
    }

    /**
     * Create an instance of {@link WsRetornoBoletos }
     * 
     */
    public WsRetornoBoletos createWsRetornoBoletos() {
        return new WsRetornoBoletos();
    }

    /**
     * Create an instance of {@link ArrayOfWsBoletos }
     * 
     */
    public ArrayOfWsBoletos createArrayOfWsBoletos() {
        return new ArrayOfWsBoletos();
    }

    /**
     * Create an instance of {@link WsBoletos }
     * 
     */
    public WsBoletos createWsBoletos() {
        return new WsBoletos();
    }

    /**
     * Create an instance of {@link WsDadosFaturaVindi }
     * 
     */
    public WsDadosFaturaVindi createWsDadosFaturaVindi() {
        return new WsDadosFaturaVindi();
    }

    /**
     * Create an instance of {@link WsFinanceiro }
     * 
     */
    public WsFinanceiro createWsFinanceiro() {
        return new WsFinanceiro();
    }

    /**
     * Create an instance of {@link ArrayOfWsInfoAluno }
     * 
     */
    public ArrayOfWsInfoAluno createArrayOfWsInfoAluno() {
        return new ArrayOfWsInfoAluno();
    }

    /**
     * Create an instance of {@link WsInfoAluno }
     * 
     */
    public WsInfoAluno createWsInfoAluno() {
        return new WsInfoAluno();
    }

    /**
     * Create an instance of {@link WsPlanoCurso }
     * 
     */
    public WsPlanoCurso createWsPlanoCurso() {
        return new WsPlanoCurso();
    }

    /**
     * Create an instance of {@link ArrayOfPlanoCurso }
     * 
     */
    public ArrayOfPlanoCurso createArrayOfPlanoCurso() {
        return new ArrayOfPlanoCurso();
    }

    /**
     * Create an instance of {@link PlanoCurso }
     * 
     */
    public PlanoCurso createPlanoCurso() {
        return new PlanoCurso();
    }

    /**
     * Create an instance of {@link ArrayOfNotas }
     * 
     */
    public ArrayOfNotas createArrayOfNotas() {
        return new ArrayOfNotas();
    }

    /**
     * Create an instance of {@link Notas }
     * 
     */
    public Notas createNotas() {
        return new Notas();
    }

    /**
     * Create an instance of {@link ArrayOfNotasBoletimAulasLivres }
     * 
     */
    public ArrayOfNotasBoletimAulasLivres createArrayOfNotasBoletimAulasLivres() {
        return new ArrayOfNotasBoletimAulasLivres();
    }

    /**
     * Create an instance of {@link NotasBoletimAulasLivres }
     * 
     */
    public NotasBoletimAulasLivres createNotasBoletimAulasLivres() {
        return new NotasBoletimAulasLivres();
    }

    /**
     * Create an instance of {@link ArrayOfCompetenciasAPI }
     * 
     */
    public ArrayOfCompetenciasAPI createArrayOfCompetenciasAPI() {
        return new ArrayOfCompetenciasAPI();
    }

    /**
     * Create an instance of {@link CompetenciasAPI }
     * 
     */
    public CompetenciasAPI createCompetenciasAPI() {
        return new CompetenciasAPI();
    }

    /**
     * Create an instance of {@link ArrayOfGrupoCompetencias }
     * 
     */
    public ArrayOfGrupoCompetencias createArrayOfGrupoCompetencias() {
        return new ArrayOfGrupoCompetencias();
    }

    /**
     * Create an instance of {@link GrupoCompetencias }
     * 
     */
    public GrupoCompetencias createGrupoCompetencias() {
        return new GrupoCompetencias();
    }

    /**
     * Create an instance of {@link ArrayOfHabilidadesAPI }
     * 
     */
    public ArrayOfHabilidadesAPI createArrayOfHabilidadesAPI() {
        return new ArrayOfHabilidadesAPI();
    }

    /**
     * Create an instance of {@link HabilidadesAPI }
     * 
     */
    public HabilidadesAPI createHabilidadesAPI() {
        return new HabilidadesAPI();
    }

    /**
     * Create an instance of {@link WsFuncionario }
     * 
     */
    public WsFuncionario createWsFuncionario() {
        return new WsFuncionario();
    }

    /**
     * Create an instance of {@link WsMidias }
     * 
     */
    public WsMidias createWsMidias() {
        return new WsMidias();
    }

    /**
     * Create an instance of {@link ArrayOfMidias }
     * 
     */
    public ArrayOfMidias createArrayOfMidias() {
        return new ArrayOfMidias();
    }

    /**
     * Create an instance of {@link Midias }
     * 
     */
    public Midias createMidias() {
        return new Midias();
    }

    /**
     * Create an instance of {@link WsGestaoComercial }
     * 
     */
    public WsGestaoComercial createWsGestaoComercial() {
        return new WsGestaoComercial();
    }

    /**
     * Create an instance of {@link ArrayOfIndicesGestaoComercial }
     * 
     */
    public ArrayOfIndicesGestaoComercial createArrayOfIndicesGestaoComercial() {
        return new ArrayOfIndicesGestaoComercial();
    }

    /**
     * Create an instance of {@link IndicesGestaoComercial }
     * 
     */
    public IndicesGestaoComercial createIndicesGestaoComercial() {
        return new IndicesGestaoComercial();
    }

    /**
     * Create an instance of {@link ArrayOfIndicador }
     * 
     */
    public ArrayOfIndicador createArrayOfIndicador() {
        return new ArrayOfIndicador();
    }

    /**
     * Create an instance of {@link Indicador }
     * 
     */
    public Indicador createIndicador() {
        return new Indicador();
    }

    /**
     * Create an instance of {@link WsAtendimentos }
     * 
     */
    public WsAtendimentos createWsAtendimentos() {
        return new WsAtendimentos();
    }

    /**
     * Create an instance of {@link WsParcelaQuitacao }
     * 
     */
    public WsParcelaQuitacao createWsParcelaQuitacao() {
        return new WsParcelaQuitacao();
    }

    /**
     * Create an instance of {@link WsOperadoraCartao }
     * 
     */
    public WsOperadoraCartao createWsOperadoraCartao() {
        return new WsOperadoraCartao();
    }

    /**
     * Create an instance of {@link ArrayOfWsOperadoraCartaoPlanos }
     * 
     */
    public ArrayOfWsOperadoraCartaoPlanos createArrayOfWsOperadoraCartaoPlanos() {
        return new ArrayOfWsOperadoraCartaoPlanos();
    }

    /**
     * Create an instance of {@link WsOperadoraCartaoPlanos }
     * 
     */
    public WsOperadoraCartaoPlanos createWsOperadoraCartaoPlanos() {
        return new WsOperadoraCartaoPlanos();
    }

    /**
     * Create an instance of {@link WsAgendaAluno }
     * 
     */
    public WsAgendaAluno createWsAgendaAluno() {
        return new WsAgendaAluno();
    }

    /**
     * Create an instance of {@link ArrayOfWsAulasDiarioClasseAluno }
     * 
     */
    public ArrayOfWsAulasDiarioClasseAluno createArrayOfWsAulasDiarioClasseAluno() {
        return new ArrayOfWsAulasDiarioClasseAluno();
    }

    /**
     * Create an instance of {@link WsAulasDiarioClasseAluno }
     * 
     */
    public WsAulasDiarioClasseAluno createWsAulasDiarioClasseAluno() {
        return new WsAulasDiarioClasseAluno();
    }

    /**
     * Create an instance of {@link ArrayOfWsAvaliacoesPortalAluno }
     * 
     */
    public ArrayOfWsAvaliacoesPortalAluno createArrayOfWsAvaliacoesPortalAluno() {
        return new ArrayOfWsAvaliacoesPortalAluno();
    }

    /**
     * Create an instance of {@link WsAvaliacoesPortalAluno }
     * 
     */
    public WsAvaliacoesPortalAluno createWsAvaliacoesPortalAluno() {
        return new WsAvaliacoesPortalAluno();
    }

    /**
     * Create an instance of {@link ArrayOfWsAulasLivresAluno }
     * 
     */
    public ArrayOfWsAulasLivresAluno createArrayOfWsAulasLivresAluno() {
        return new ArrayOfWsAulasLivresAluno();
    }

    /**
     * Create an instance of {@link WsAulasLivresAluno }
     * 
     */
    public WsAulasLivresAluno createWsAulasLivresAluno() {
        return new WsAulasLivresAluno();
    }

    /**
     * Create an instance of {@link WsCalendario }
     * 
     */
    public WsCalendario createWsCalendario() {
        return new WsCalendario();
    }

    /**
     * Create an instance of {@link ArrayOfWsCalendarioDetalhes }
     * 
     */
    public ArrayOfWsCalendarioDetalhes createArrayOfWsCalendarioDetalhes() {
        return new ArrayOfWsCalendarioDetalhes();
    }

    /**
     * Create an instance of {@link WsCalendarioDetalhes }
     * 
     */
    public WsCalendarioDetalhes createWsCalendarioDetalhes() {
        return new WsCalendarioDetalhes();
    }

    /**
     * Create an instance of {@link WsRetornoParcelasPagar }
     * 
     */
    public WsRetornoParcelasPagar createWsRetornoParcelasPagar() {
        return new WsRetornoParcelasPagar();
    }

    /**
     * Create an instance of {@link ArrayOfWsParcelasPagar }
     * 
     */
    public ArrayOfWsParcelasPagar createArrayOfWsParcelasPagar() {
        return new ArrayOfWsParcelasPagar();
    }

    /**
     * Create an instance of {@link WsParcelasPagar }
     * 
     */
    public WsParcelasPagar createWsParcelasPagar() {
        return new WsParcelasPagar();
    }

    /**
     * Create an instance of {@link WsRetornoParcelaPagar }
     * 
     */
    public WsRetornoParcelaPagar createWsRetornoParcelaPagar() {
        return new WsRetornoParcelaPagar();
    }

    /**
     * Create an instance of {@link WsParcelaPagar }
     * 
     */
    public WsParcelaPagar createWsParcelaPagar() {
        return new WsParcelaPagar();
    }

    /**
     * Create an instance of {@link WsSistemaAvaliacao }
     * 
     */
    public WsSistemaAvaliacao createWsSistemaAvaliacao() {
        return new WsSistemaAvaliacao();
    }

    /**
     * Create an instance of {@link ArrayOfWsConceito }
     * 
     */
    public ArrayOfWsConceito createArrayOfWsConceito() {
        return new ArrayOfWsConceito();
    }

    /**
     * Create an instance of {@link WsConceito }
     * 
     */
    public WsConceito createWsConceito() {
        return new WsConceito();
    }

    /**
     * Create an instance of {@link WsAvaliacoesParciais }
     * 
     */
    public WsAvaliacoesParciais createWsAvaliacoesParciais() {
        return new WsAvaliacoesParciais();
    }

    /**
     * Create an instance of {@link WsGrupoAvaliacao }
     * 
     */
    public WsGrupoAvaliacao createWsGrupoAvaliacao() {
        return new WsGrupoAvaliacao();
    }

    /**
     * Create an instance of {@link WsFrequenciaTurma }
     * 
     */
    public WsFrequenciaTurma createWsFrequenciaTurma() {
        return new WsFrequenciaTurma();
    }

    /**
     * Create an instance of {@link ArrayOfWsFrequenciaDisciplinas }
     * 
     */
    public ArrayOfWsFrequenciaDisciplinas createArrayOfWsFrequenciaDisciplinas() {
        return new ArrayOfWsFrequenciaDisciplinas();
    }

    /**
     * Create an instance of {@link WsFrequenciaDisciplinas }
     * 
     */
    public WsFrequenciaDisciplinas createWsFrequenciaDisciplinas() {
        return new WsFrequenciaDisciplinas();
    }

    /**
     * Create an instance of {@link ArrayOfWsFrequenciaAluno }
     * 
     */
    public ArrayOfWsFrequenciaAluno createArrayOfWsFrequenciaAluno() {
        return new ArrayOfWsFrequenciaAluno();
    }

    /**
     * Create an instance of {@link WsFrequenciaAluno }
     * 
     */
    public WsFrequenciaAluno createWsFrequenciaAluno() {
        return new WsFrequenciaAluno();
    }

    /**
     * Create an instance of {@link ArrayOfWsFaltasAluno }
     * 
     */
    public ArrayOfWsFaltasAluno createArrayOfWsFaltasAluno() {
        return new ArrayOfWsFaltasAluno();
    }

    /**
     * Create an instance of {@link WsFaltasAluno }
     * 
     */
    public WsFaltasAluno createWsFaltasAluno() {
        return new WsFaltasAluno();
    }

    /**
     * Create an instance of {@link ArrayOfWsDisciplinasNotasParciais }
     * 
     */
    public ArrayOfWsDisciplinasNotasParciais createArrayOfWsDisciplinasNotasParciais() {
        return new ArrayOfWsDisciplinasNotasParciais();
    }

    /**
     * Create an instance of {@link WsDisciplinasNotasParciais }
     * 
     */
    public WsDisciplinasNotasParciais createWsDisciplinasNotasParciais() {
        return new WsDisciplinasNotasParciais();
    }

    /**
     * Create an instance of {@link ArrayOfWsNotasPeriodos }
     * 
     */
    public ArrayOfWsNotasPeriodos createArrayOfWsNotasPeriodos() {
        return new ArrayOfWsNotasPeriodos();
    }

    /**
     * Create an instance of {@link WsNotasPeriodos }
     * 
     */
    public WsNotasPeriodos createWsNotasPeriodos() {
        return new WsNotasPeriodos();
    }

    /**
     * Create an instance of {@link ArrayOfWsNotaParcial }
     * 
     */
    public ArrayOfWsNotaParcial createArrayOfWsNotaParcial() {
        return new ArrayOfWsNotaParcial();
    }

    /**
     * Create an instance of {@link WsNotaParcial }
     * 
     */
    public WsNotaParcial createWsNotaParcial() {
        return new WsNotaParcial();
    }

    /**
     * Create an instance of {@link WsAppPortalNotas }
     * 
     */
    public WsAppPortalNotas createWsAppPortalNotas() {
        return new WsAppPortalNotas();
    }

    /**
     * Create an instance of {@link WsAppPortalNotasNotificacao }
     * 
     */
    public WsAppPortalNotasNotificacao createWsAppPortalNotasNotificacao() {
        return new WsAppPortalNotasNotificacao();
    }

    /**
     * Create an instance of {@link TokenMobile }
     * 
     */
    public TokenMobile createTokenMobile() {
        return new TokenMobile();
    }

    /**
     * Create an instance of {@link WsFotoApp }
     * 
     */
    public WsFotoApp createWsFotoApp() {
        return new WsFotoApp();
    }

    /**
     * Create an instance of {@link WsAtualizaSenhaAlunoResponsavel }
     * 
     */
    public WsAtualizaSenhaAlunoResponsavel createWsAtualizaSenhaAlunoResponsavel() {
        return new WsAtualizaSenhaAlunoResponsavel();
    }

    /**
     * Create an instance of {@link Timeline }
     * 
     */
    public Timeline createTimeline() {
        return new Timeline();
    }

    /**
     * Create an instance of {@link ArrayOfWsAnexosComunicados }
     * 
     */
    public ArrayOfWsAnexosComunicados createArrayOfWsAnexosComunicados() {
        return new ArrayOfWsAnexosComunicados();
    }

    /**
     * Create an instance of {@link WsAnexosComunicados }
     * 
     */
    public WsAnexosComunicados createWsAnexosComunicados() {
        return new WsAnexosComunicados();
    }

    /**
     * Create an instance of {@link ArrayOfWsMensagemResposta }
     * 
     */
    public ArrayOfWsMensagemResposta createArrayOfWsMensagemResposta() {
        return new ArrayOfWsMensagemResposta();
    }

    /**
     * Create an instance of {@link WsMensagensAPP }
     * 
     */
    public WsMensagensAPP createWsMensagensAPP() {
        return new WsMensagensAPP();
    }

    /**
     * Create an instance of {@link ArrayOfNotasBoletim2 .NotasBoletim2 }
     * 
     */
    public ArrayOfNotasBoletim2 .NotasBoletim2 createArrayOfNotasBoletim2NotasBoletim2() {
        return new ArrayOfNotasBoletim2 .NotasBoletim2();
    }

    /**
     * Create an instance of {@link ArrayOfNotasBoletim.NotasBoletim }
     * 
     */
    public ArrayOfNotasBoletim.NotasBoletim createArrayOfNotasBoletimNotasBoletim() {
        return new ArrayOfNotasBoletim.NotasBoletim();
    }

    /**
     * Create an instance of {@link DataTable.XmlSchemaElements }
     * 
     */
    public DataTable.XmlSchemaElements createDataTableXmlSchemaElements() {
        return new DataTable.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link DataTable.XmlDiffgramElements }
     * 
     */
    public DataTable.XmlDiffgramElements createDataTableXmlDiffgramElements() {
        return new DataTable.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link SetNotaResponse.SetNotaResult.XmlSchemaElements }
     * 
     */
    public SetNotaResponse.SetNotaResult.XmlSchemaElements createSetNotaResponseSetNotaResultXmlSchemaElements() {
        return new SetNotaResponse.SetNotaResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link SetNotaResponse.SetNotaResult.XmlDiffgramElements }
     * 
     */
    public SetNotaResponse.SetNotaResult.XmlDiffgramElements createSetNotaResponseSetNotaResultXmlDiffgramElements() {
        return new SetNotaResponse.SetNotaResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link SetNotaParcialResponse.SetNotaParcialResult.XmlSchemaElements }
     * 
     */
    public SetNotaParcialResponse.SetNotaParcialResult.XmlSchemaElements createSetNotaParcialResponseSetNotaParcialResultXmlSchemaElements() {
        return new SetNotaParcialResponse.SetNotaParcialResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link SetNotaParcialResponse.SetNotaParcialResult.XmlDiffgramElements }
     * 
     */
    public SetNotaParcialResponse.SetNotaParcialResult.XmlDiffgramElements createSetNotaParcialResponseSetNotaParcialResultXmlDiffgramElements() {
        return new SetNotaParcialResponse.SetNotaParcialResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements }
     * 
     */
    public GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements createGetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResultXmlSchemaElements() {
        return new GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements }
     * 
     */
    public GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements createGetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResultXmlDiffgramElements() {
        return new GetLinhaDigitavelBoletosResponse.GetLinhaDigitavelBoletosResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertVendasResponse.InsertVendasResult.XmlSchemaElements }
     * 
     */
    public InsertVendasResponse.InsertVendasResult.XmlSchemaElements createInsertVendasResponseInsertVendasResultXmlSchemaElements() {
        return new InsertVendasResponse.InsertVendasResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertVendasResponse.InsertVendasResult.XmlDiffgramElements }
     * 
     */
    public InsertVendasResponse.InsertVendasResult.XmlDiffgramElements createInsertVendasResponseInsertVendasResultXmlDiffgramElements() {
        return new InsertVendasResponse.InsertVendasResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateMatriculaResponse.UpdateMatriculaResult.XmlSchemaElements }
     * 
     */
    public UpdateMatriculaResponse.UpdateMatriculaResult.XmlSchemaElements createUpdateMatriculaResponseUpdateMatriculaResultXmlSchemaElements() {
        return new UpdateMatriculaResponse.UpdateMatriculaResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateMatriculaResponse.UpdateMatriculaResult.XmlDiffgramElements }
     * 
     */
    public UpdateMatriculaResponse.UpdateMatriculaResult.XmlDiffgramElements createUpdateMatriculaResponseUpdateMatriculaResultXmlDiffgramElements() {
        return new UpdateMatriculaResponse.UpdateMatriculaResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertMatriculaResponse.InsertMatriculaResult.XmlSchemaElements }
     * 
     */
    public InsertMatriculaResponse.InsertMatriculaResult.XmlSchemaElements createInsertMatriculaResponseInsertMatriculaResultXmlSchemaElements() {
        return new InsertMatriculaResponse.InsertMatriculaResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertMatriculaResponse.InsertMatriculaResult.XmlDiffgramElements }
     * 
     */
    public InsertMatriculaResponse.InsertMatriculaResult.XmlDiffgramElements createInsertMatriculaResponseInsertMatriculaResultXmlDiffgramElements() {
        return new InsertMatriculaResponse.InsertMatriculaResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateTurmasResponse.UpdateTurmasResult.XmlSchemaElements }
     * 
     */
    public UpdateTurmasResponse.UpdateTurmasResult.XmlSchemaElements createUpdateTurmasResponseUpdateTurmasResultXmlSchemaElements() {
        return new UpdateTurmasResponse.UpdateTurmasResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateTurmasResponse.UpdateTurmasResult.XmlDiffgramElements }
     * 
     */
    public UpdateTurmasResponse.UpdateTurmasResult.XmlDiffgramElements createUpdateTurmasResponseUpdateTurmasResultXmlDiffgramElements() {
        return new UpdateTurmasResponse.UpdateTurmasResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertTurmasAtivasResponse.InsertTurmasAtivasResult.XmlSchemaElements }
     * 
     */
    public InsertTurmasAtivasResponse.InsertTurmasAtivasResult.XmlSchemaElements createInsertTurmasAtivasResponseInsertTurmasAtivasResultXmlSchemaElements() {
        return new InsertTurmasAtivasResponse.InsertTurmasAtivasResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertTurmasAtivasResponse.InsertTurmasAtivasResult.XmlDiffgramElements }
     * 
     */
    public InsertTurmasAtivasResponse.InsertTurmasAtivasResult.XmlDiffgramElements createInsertTurmasAtivasResponseInsertTurmasAtivasResultXmlDiffgramElements() {
        return new InsertTurmasAtivasResponse.InsertTurmasAtivasResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements }
     * 
     */
    public InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements createInsertTurmaResponseInsertTurmaResultXmlSchemaElements() {
        return new InsertTurmaResponse.InsertTurmaResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements }
     * 
     */
    public InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements createInsertTurmaResponseInsertTurmaResultXmlDiffgramElements() {
        return new InsertTurmaResponse.InsertTurmaResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult.XmlSchemaElements }
     * 
     */
    public UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult.XmlSchemaElements createUpdateCompartilhaResponsavelResponseUpdateCompartilhaResponsavelResultXmlSchemaElements() {
        return new UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult.XmlDiffgramElements }
     * 
     */
    public UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult.XmlDiffgramElements createUpdateCompartilhaResponsavelResponseUpdateCompartilhaResponsavelResultXmlDiffgramElements() {
        return new UpdateCompartilhaResponsavelResponse.UpdateCompartilhaResponsavelResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateResponsaveisResponse.UpdateResponsaveisResult.XmlSchemaElements }
     * 
     */
    public UpdateResponsaveisResponse.UpdateResponsaveisResult.XmlSchemaElements createUpdateResponsaveisResponseUpdateResponsaveisResultXmlSchemaElements() {
        return new UpdateResponsaveisResponse.UpdateResponsaveisResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateResponsaveisResponse.UpdateResponsaveisResult.XmlDiffgramElements }
     * 
     */
    public UpdateResponsaveisResponse.UpdateResponsaveisResult.XmlDiffgramElements createUpdateResponsaveisResponseUpdateResponsaveisResultXmlDiffgramElements() {
        return new UpdateResponsaveisResponse.UpdateResponsaveisResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertResponsaveisResponse.InsertResponsaveisResult.XmlSchemaElements }
     * 
     */
    public InsertResponsaveisResponse.InsertResponsaveisResult.XmlSchemaElements createInsertResponsaveisResponseInsertResponsaveisResultXmlSchemaElements() {
        return new InsertResponsaveisResponse.InsertResponsaveisResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertResponsaveisResponse.InsertResponsaveisResult.XmlDiffgramElements }
     * 
     */
    public InsertResponsaveisResponse.InsertResponsaveisResult.XmlDiffgramElements createInsertResponsaveisResponseInsertResponsaveisResultXmlDiffgramElements() {
        return new InsertResponsaveisResponse.InsertResponsaveisResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse.UpdateClienteResult.XmlSchemaElements }
     * 
     */
    public UpdateClienteResponse.UpdateClienteResult.XmlSchemaElements createUpdateClienteResponseUpdateClienteResultXmlSchemaElements() {
        return new UpdateClienteResponse.UpdateClienteResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse.UpdateClienteResult.XmlDiffgramElements }
     * 
     */
    public UpdateClienteResponse.UpdateClienteResult.XmlDiffgramElements createUpdateClienteResponseUpdateClienteResultXmlDiffgramElements() {
        return new UpdateClienteResponse.UpdateClienteResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertClienteResponse.InsertClienteResult.XmlSchemaElements }
     * 
     */
    public InsertClienteResponse.InsertClienteResult.XmlSchemaElements createInsertClienteResponseInsertClienteResultXmlSchemaElements() {
        return new InsertClienteResponse.InsertClienteResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertClienteResponse.InsertClienteResult.XmlDiffgramElements }
     * 
     */
    public InsertClienteResponse.InsertClienteResult.XmlDiffgramElements createInsertClienteResponseInsertClienteResultXmlDiffgramElements() {
        return new InsertClienteResponse.InsertClienteResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link SetInadimplenteResponse.SetInadimplenteResult.XmlSchemaElements }
     * 
     */
    public SetInadimplenteResponse.SetInadimplenteResult.XmlSchemaElements createSetInadimplenteResponseSetInadimplenteResultXmlSchemaElements() {
        return new SetInadimplenteResponse.SetInadimplenteResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link SetInadimplenteResponse.SetInadimplenteResult.XmlDiffgramElements }
     * 
     */
    public SetInadimplenteResponse.SetInadimplenteResult.XmlDiffgramElements createSetInadimplenteResponseSetInadimplenteResultXmlDiffgramElements() {
        return new SetInadimplenteResponse.SetInadimplenteResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateAlunos2Response.UpdateAlunos2Result.XmlSchemaElements }
     * 
     */
    public UpdateAlunos2Response.UpdateAlunos2Result.XmlSchemaElements createUpdateAlunos2ResponseUpdateAlunos2ResultXmlSchemaElements() {
        return new UpdateAlunos2Response.UpdateAlunos2Result.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateAlunos2Response.UpdateAlunos2Result.XmlDiffgramElements }
     * 
     */
    public UpdateAlunos2Response.UpdateAlunos2Result.XmlDiffgramElements createUpdateAlunos2ResponseUpdateAlunos2ResultXmlDiffgramElements() {
        return new UpdateAlunos2Response.UpdateAlunos2Result.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateAlunosResponse.UpdateAlunosResult.XmlSchemaElements }
     * 
     */
    public UpdateAlunosResponse.UpdateAlunosResult.XmlSchemaElements createUpdateAlunosResponseUpdateAlunosResultXmlSchemaElements() {
        return new UpdateAlunosResponse.UpdateAlunosResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateAlunosResponse.UpdateAlunosResult.XmlDiffgramElements }
     * 
     */
    public UpdateAlunosResponse.UpdateAlunosResult.XmlDiffgramElements createUpdateAlunosResponseUpdateAlunosResultXmlDiffgramElements() {
        return new UpdateAlunosResponse.UpdateAlunosResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link ImportaAlunoResponse.ImportaAlunoResult.XmlSchemaElements }
     * 
     */
    public ImportaAlunoResponse.ImportaAlunoResult.XmlSchemaElements createImportaAlunoResponseImportaAlunoResultXmlSchemaElements() {
        return new ImportaAlunoResponse.ImportaAlunoResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link ImportaAlunoResponse.ImportaAlunoResult.XmlDiffgramElements }
     * 
     */
    public ImportaAlunoResponse.ImportaAlunoResult.XmlDiffgramElements createImportaAlunoResponseImportaAlunoResultXmlDiffgramElements() {
        return new ImportaAlunoResponse.ImportaAlunoResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertAlunos2Response.InsertAlunos2Result.XmlSchemaElements }
     * 
     */
    public InsertAlunos2Response.InsertAlunos2Result.XmlSchemaElements createInsertAlunos2ResponseInsertAlunos2ResultXmlSchemaElements() {
        return new InsertAlunos2Response.InsertAlunos2Result.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertAlunos2Response.InsertAlunos2Result.XmlDiffgramElements }
     * 
     */
    public InsertAlunos2Response.InsertAlunos2Result.XmlDiffgramElements createInsertAlunos2ResponseInsertAlunos2ResultXmlDiffgramElements() {
        return new InsertAlunos2Response.InsertAlunos2Result.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertAlunosResponse.InsertAlunosResult.XmlSchemaElements }
     * 
     */
    public InsertAlunosResponse.InsertAlunosResult.XmlSchemaElements createInsertAlunosResponseInsertAlunosResultXmlSchemaElements() {
        return new InsertAlunosResponse.InsertAlunosResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertAlunosResponse.InsertAlunosResult.XmlDiffgramElements }
     * 
     */
    public InsertAlunosResponse.InsertAlunosResult.XmlDiffgramElements createInsertAlunosResponseInsertAlunosResultXmlDiffgramElements() {
        return new InsertAlunosResponse.InsertAlunosResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult.XmlSchemaElements }
     * 
     */
    public InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult.XmlSchemaElements createInsertHistoricoEscolarResponseInsertHistoricoEscolarResultXmlSchemaElements() {
        return new InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult.XmlDiffgramElements }
     * 
     */
    public InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult.XmlDiffgramElements createInsertHistoricoEscolarResponseInsertHistoricoEscolarResultXmlDiffgramElements() {
        return new InsertHistoricoEscolarResponse.InsertHistoricoEscolarResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult.XmlSchemaElements }
     * 
     */
    public UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult.XmlSchemaElements createUpdateDiarioAulasLivresResponseUpdateDiarioAulasLivresResultXmlSchemaElements() {
        return new UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult.XmlDiffgramElements }
     * 
     */
    public UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult.XmlDiffgramElements createUpdateDiarioAulasLivresResponseUpdateDiarioAulasLivresResultXmlDiffgramElements() {
        return new UpdateDiarioAulasLivresResponse.UpdateDiarioAulasLivresResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult.XmlSchemaElements }
     * 
     */
    public InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult.XmlSchemaElements createInsertDiarioAulasLivresResponseInsertDiarioAulasLivresResultXmlSchemaElements() {
        return new InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult.XmlDiffgramElements }
     * 
     */
    public InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult.XmlDiffgramElements createInsertDiarioAulasLivresResponseInsertDiarioAulasLivresResultXmlDiffgramElements() {
        return new InsertDiarioAulasLivresResponse.InsertDiarioAulasLivresResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertConteudoDiarioResponse.InsertConteudoDiarioResult.XmlSchemaElements }
     * 
     */
    public InsertConteudoDiarioResponse.InsertConteudoDiarioResult.XmlSchemaElements createInsertConteudoDiarioResponseInsertConteudoDiarioResultXmlSchemaElements() {
        return new InsertConteudoDiarioResponse.InsertConteudoDiarioResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertConteudoDiarioResponse.InsertConteudoDiarioResult.XmlDiffgramElements }
     * 
     */
    public InsertConteudoDiarioResponse.InsertConteudoDiarioResult.XmlDiffgramElements createInsertConteudoDiarioResponseInsertConteudoDiarioResultXmlDiffgramElements() {
        return new InsertConteudoDiarioResponse.InsertConteudoDiarioResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult.XmlSchemaElements }
     * 
     */
    public InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult.XmlSchemaElements createInsertFrequenciaDiarioResponseInsertFrequenciaDiarioResultXmlSchemaElements() {
        return new InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult.XmlDiffgramElements }
     * 
     */
    public InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult.XmlDiffgramElements createInsertFrequenciaDiarioResponseInsertFrequenciaDiarioResultXmlDiffgramElements() {
        return new InsertFrequenciaDiarioResponse.InsertFrequenciaDiarioResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link InsertMovimentacaoResponse.InsertMovimentacaoResult.XmlSchemaElements }
     * 
     */
    public InsertMovimentacaoResponse.InsertMovimentacaoResult.XmlSchemaElements createInsertMovimentacaoResponseInsertMovimentacaoResultXmlSchemaElements() {
        return new InsertMovimentacaoResponse.InsertMovimentacaoResult.XmlSchemaElements();
    }

    /**
     * Create an instance of {@link InsertMovimentacaoResponse.InsertMovimentacaoResult.XmlDiffgramElements }
     * 
     */
    public InsertMovimentacaoResponse.InsertMovimentacaoResult.XmlDiffgramElements createInsertMovimentacaoResponseInsertMovimentacaoResultXmlDiffgramElements() {
        return new InsertMovimentacaoResponse.InsertMovimentacaoResult.XmlDiffgramElements();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelSimpleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelSimpleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "simpleType")
    public JAXBElement<TopLevelSimpleType> createSimpleType(TopLevelSimpleType value) {
        return new JAXBElement<TopLevelSimpleType>(_SimpleType_QNAME, TopLevelSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelComplexType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelComplexType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "complexType")
    public JAXBElement<TopLevelComplexType> createComplexType(TopLevelComplexType value) {
        return new JAXBElement<TopLevelComplexType>(_ComplexType_QNAME, TopLevelComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NamedGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "group")
    public JAXBElement<NamedGroup> createGroup(NamedGroup value) {
        return new JAXBElement<NamedGroup>(_Group_QNAME, NamedGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedAttributeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NamedAttributeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "attributeGroup")
    public JAXBElement<NamedAttributeGroup> createAttributeGroup(NamedAttributeGroup value) {
        return new JAXBElement<NamedAttributeGroup>(_AttributeGroup_QNAME, NamedAttributeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "element")
    public JAXBElement<TopLevelElement> createElement(TopLevelElement value) {
        return new JAXBElement<TopLevelElement>(_Element_QNAME, TopLevelElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLevelAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopLevelAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "attribute")
    public JAXBElement<TopLevelAttribute> createAttribute(TopLevelAttribute value) {
        return new JAXBElement<TopLevelAttribute>(_Attribute_QNAME, TopLevelAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wildcard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wildcard }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "anyAttribute")
    public JAXBElement<Wildcard> createAnyAttribute(Wildcard value) {
        return new JAXBElement<Wildcard>(_AnyAttribute_QNAME, Wildcard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link All }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link All }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "all")
    public JAXBElement<All> createAll(All value) {
        return new JAXBElement<All>(_All_QNAME, All.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "choice")
    public JAXBElement<ExplicitGroup> createChoice(ExplicitGroup value) {
        return new JAXBElement<ExplicitGroup>(_Choice_QNAME, ExplicitGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "sequence")
    public JAXBElement<ExplicitGroup> createSequence(ExplicitGroup value) {
        return new JAXBElement<ExplicitGroup>(_Sequence_QNAME, ExplicitGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "unique")
    public JAXBElement<Keybase> createUnique(Keybase value) {
        return new JAXBElement<Keybase>(_Unique_QNAME, Keybase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "key")
    public JAXBElement<Keybase> createKey(Keybase value) {
        return new JAXBElement<Keybase>(_Key_QNAME, Keybase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "minExclusive")
    public JAXBElement<Facet> createMinExclusive(Facet value) {
        return new JAXBElement<Facet>(_MinExclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "minInclusive")
    public JAXBElement<Facet> createMinInclusive(Facet value) {
        return new JAXBElement<Facet>(_MinInclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "maxExclusive")
    public JAXBElement<Facet> createMaxExclusive(Facet value) {
        return new JAXBElement<Facet>(_MaxExclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "maxInclusive")
    public JAXBElement<Facet> createMaxInclusive(Facet value) {
        return new JAXBElement<Facet>(_MaxInclusive_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "fractionDigits")
    public JAXBElement<NumFacet> createFractionDigits(NumFacet value) {
        return new JAXBElement<NumFacet>(_FractionDigits_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "length")
    public JAXBElement<NumFacet> createLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_Length_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "minLength")
    public JAXBElement<NumFacet> createMinLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_MinLength_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "maxLength")
    public JAXBElement<NumFacet> createMaxLength(NumFacet value) {
        return new JAXBElement<NumFacet>(_MaxLength_QNAME, NumFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "enumeration")
    public JAXBElement<NoFixedFacet> createEnumeration(NoFixedFacet value) {
        return new JAXBElement<NoFixedFacet>(_Enumeration_QNAME, NoFixedFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsRetNovaRespostaMensagem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsRetNovaRespostaMensagem }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsRetNovaRespostaMensagem")
    public JAXBElement<WsRetNovaRespostaMensagem> createWsRetNovaRespostaMensagem(WsRetNovaRespostaMensagem value) {
        return new JAXBElement<WsRetNovaRespostaMensagem>(_WsRetNovaRespostaMensagem_QNAME, WsRetNovaRespostaMensagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMovimentacoesAlunos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMovimentacoesAlunos }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsMovimentacoesAlunos")
    public JAXBElement<ArrayOfWsMovimentacoesAlunos> createArrayOfWsMovimentacoesAlunos(ArrayOfWsMovimentacoesAlunos value) {
        return new JAXBElement<ArrayOfWsMovimentacoesAlunos>(_ArrayOfWsMovimentacoesAlunos_QNAME, ArrayOfWsMovimentacoesAlunos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTable }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "DataTable")
    public JAXBElement<DataTable> createDataTable(DataTable value) {
        return new JAXBElement<DataTable>(_DataTable_QNAME, DataTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCartoesCatraca }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCartoesCatraca }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsCartoesCatraca")
    public JAXBElement<ArrayOfWsCartoesCatraca> createArrayOfWsCartoesCatraca(ArrayOfWsCartoesCatraca value) {
        return new JAXBElement<ArrayOfWsCartoesCatraca>(_ArrayOfWsCartoesCatraca_QNAME, ArrayOfWsCartoesCatraca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsQuadroHorarios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsQuadroHorarios }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsQuadroHorarios")
    public JAXBElement<ArrayOfWsQuadroHorarios> createArrayOfWsQuadroHorarios(ArrayOfWsQuadroHorarios value) {
        return new JAXBElement<ArrayOfWsQuadroHorarios>(_ArrayOfWsQuadroHorarios_QNAME, ArrayOfWsQuadroHorarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsHorariosAula }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsHorariosAula }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsHorariosAula")
    public JAXBElement<ArrayOfWsHorariosAula> createArrayOfWsHorariosAula(ArrayOfWsHorariosAula value) {
        return new JAXBElement<ArrayOfWsHorariosAula>(_ArrayOfWsHorariosAula_QNAME, ArrayOfWsHorariosAula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDiarioAulas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDiarioAulas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsDiarioAulas")
    public JAXBElement<ArrayOfWsDiarioAulas> createArrayOfWsDiarioAulas(ArrayOfWsDiarioAulas value) {
        return new JAXBElement<ArrayOfWsDiarioAulas>(_ArrayOfWsDiarioAulas_QNAME, ArrayOfWsDiarioAulas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDiarioAulasLivres }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDiarioAulasLivres }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsDiarioAulasLivres")
    public JAXBElement<ArrayOfWsDiarioAulasLivres> createArrayOfWsDiarioAulasLivres(ArrayOfWsDiarioAulasLivres value) {
        return new JAXBElement<ArrayOfWsDiarioAulasLivres>(_ArrayOfWsDiarioAulasLivres_QNAME, ArrayOfWsDiarioAulasLivres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSalas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSalas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsSalas")
    public JAXBElement<ArrayOfWsSalas> createArrayOfWsSalas(ArrayOfWsSalas value) {
        return new JAXBElement<ArrayOfWsSalas>(_ArrayOfWsSalas_QNAME, ArrayOfWsSalas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAluno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAluno }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAluno")
    public JAXBElement<ArrayOfWsAluno> createArrayOfWsAluno(ArrayOfWsAluno value) {
        return new JAXBElement<ArrayOfWsAluno>(_ArrayOfWsAluno_QNAME, ArrayOfWsAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoAlunosAlterados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoAlunosAlterados }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsRetornoAlunosAlterados")
    public JAXBElement<ArrayOfWsRetornoAlunosAlterados> createArrayOfWsRetornoAlunosAlterados(ArrayOfWsRetornoAlunosAlterados value) {
        return new JAXBElement<ArrayOfWsRetornoAlunosAlterados>(_ArrayOfWsRetornoAlunosAlterados_QNAME, ArrayOfWsRetornoAlunosAlterados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSituacoesAlunos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSituacoesAlunos }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsSituacoesAlunos")
    public JAXBElement<ArrayOfWsSituacoesAlunos> createArrayOfWsSituacoesAlunos(ArrayOfWsSituacoesAlunos value) {
        return new JAXBElement<ArrayOfWsSituacoesAlunos>(_ArrayOfWsSituacoesAlunos_QNAME, ArrayOfWsSituacoesAlunos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsOrigensAlunos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsOrigensAlunos }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsOrigensAlunos")
    public JAXBElement<ArrayOfWsOrigensAlunos> createArrayOfWsOrigensAlunos(ArrayOfWsOrigensAlunos value) {
        return new JAXBElement<ArrayOfWsOrigensAlunos>(_ArrayOfWsOrigensAlunos_QNAME, ArrayOfWsOrigensAlunos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsOcorrencias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsOcorrencias }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsOcorrencias")
    public JAXBElement<ArrayOfWsOcorrencias> createArrayOfWsOcorrencias(ArrayOfWsOcorrencias value) {
        return new JAXBElement<ArrayOfWsOcorrencias>(_ArrayOfWsOcorrencias_QNAME, ArrayOfWsOcorrencias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsCliente")
    public JAXBElement<ArrayOfWsCliente> createArrayOfWsCliente(ArrayOfWsCliente value) {
        return new JAXBElement<ArrayOfWsCliente>(_ArrayOfWsCliente_QNAME, ArrayOfWsCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsConta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsConta }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsConta")
    public JAXBElement<ArrayOfWsConta> createArrayOfWsConta(ArrayOfWsConta value) {
        return new JAXBElement<ArrayOfWsConta>(_ArrayOfWsConta_QNAME, ArrayOfWsConta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsResponsavel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsResponsavel }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsResponsavel")
    public JAXBElement<ArrayOfWsResponsavel> createArrayOfWsResponsavel(ArrayOfWsResponsavel value) {
        return new JAXBElement<ArrayOfWsResponsavel>(_ArrayOfWsResponsavel_QNAME, ArrayOfWsResponsavel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMatrizCurricular }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMatrizCurricular }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsMatrizCurricular")
    public JAXBElement<ArrayOfWsMatrizCurricular> createArrayOfWsMatrizCurricular(ArrayOfWsMatrizCurricular value) {
        return new JAXBElement<ArrayOfWsMatrizCurricular>(_ArrayOfWsMatrizCurricular_QNAME, ArrayOfWsMatrizCurricular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMatrizCurricular2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMatrizCurricular2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsMatrizCurricular2")
    public JAXBElement<ArrayOfWsMatrizCurricular2> createArrayOfWsMatrizCurricular2(ArrayOfWsMatrizCurricular2 value) {
        return new JAXBElement<ArrayOfWsMatrizCurricular2>(_ArrayOfWsMatrizCurricular2_QNAME, ArrayOfWsMatrizCurricular2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDisciplina }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDisciplina }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsDisciplina")
    public JAXBElement<ArrayOfWsDisciplina> createArrayOfWsDisciplina(ArrayOfWsDisciplina value) {
        return new JAXBElement<ArrayOfWsDisciplina>(_ArrayOfWsDisciplina_QNAME, ArrayOfWsDisciplina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDisciplinaDetalhada }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDisciplinaDetalhada }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsDisciplinaDetalhada")
    public JAXBElement<ArrayOfWsDisciplinaDetalhada> createArrayOfWsDisciplinaDetalhada(ArrayOfWsDisciplinaDetalhada value) {
        return new JAXBElement<ArrayOfWsDisciplinaDetalhada>(_ArrayOfWsDisciplinaDetalhada_QNAME, ArrayOfWsDisciplinaDetalhada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCurso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCurso }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsCurso")
    public JAXBElement<ArrayOfWsCurso> createArrayOfWsCurso(ArrayOfWsCurso value) {
        return new JAXBElement<ArrayOfWsCurso>(_ArrayOfWsCurso_QNAME, ArrayOfWsCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsTurma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsTurma }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsTurma")
    public JAXBElement<ArrayOfWsTurma> createArrayOfWsTurma(ArrayOfWsTurma value) {
        return new JAXBElement<ArrayOfWsTurma>(_ArrayOfWsTurma_QNAME, ArrayOfWsTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCodigoTurma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCodigoTurma }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsCodigoTurma")
    public JAXBElement<ArrayOfWsCodigoTurma> createArrayOfWsCodigoTurma(ArrayOfWsCodigoTurma value) {
        return new JAXBElement<ArrayOfWsCodigoTurma>(_ArrayOfWsCodigoTurma_QNAME, ArrayOfWsCodigoTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMatricula }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMatricula }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsMatricula")
    public JAXBElement<ArrayOfWsMatricula> createArrayOfWsMatricula(ArrayOfWsMatricula value) {
        return new JAXBElement<ArrayOfWsMatricula>(_ArrayOfWsMatricula_QNAME, ArrayOfWsMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsIntegrantesTurma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsIntegrantesTurma }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsIntegrantesTurma")
    public JAXBElement<ArrayOfWsIntegrantesTurma> createArrayOfWsIntegrantesTurma(ArrayOfWsIntegrantesTurma value) {
        return new JAXBElement<ArrayOfWsIntegrantesTurma>(_ArrayOfWsIntegrantesTurma_QNAME, ArrayOfWsIntegrantesTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsMudancaEntreTurmas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsMudancaEntreTurmas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsMudancaEntreTurmas")
    public JAXBElement<WsMudancaEntreTurmas> createWsMudancaEntreTurmas(WsMudancaEntreTurmas value) {
        return new JAXBElement<WsMudancaEntreTurmas>(_WsMudancaEntreTurmas_QNAME, WsMudancaEntreTurmas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsMudancaEntreTurmaRemoverAluno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsMudancaEntreTurmaRemoverAluno }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsMudancaEntreTurmaRemoverAluno")
    public JAXBElement<WsMudancaEntreTurmaRemoverAluno> createWsMudancaEntreTurmaRemoverAluno(WsMudancaEntreTurmaRemoverAluno value) {
        return new JAXBElement<WsMudancaEntreTurmaRemoverAluno>(_WsMudancaEntreTurmaRemoverAluno_QNAME, WsMudancaEntreTurmaRemoverAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsModalidadeTurma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsModalidadeTurma }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsModalidadeTurma")
    public JAXBElement<ArrayOfWsModalidadeTurma> createArrayOfWsModalidadeTurma(ArrayOfWsModalidadeTurma value) {
        return new JAXBElement<ArrayOfWsModalidadeTurma>(_ArrayOfWsModalidadeTurma_QNAME, ArrayOfWsModalidadeTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSituacoesAlunosTurma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSituacoesAlunosTurma }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsSituacoesAlunosTurma")
    public JAXBElement<ArrayOfWsSituacoesAlunosTurma> createArrayOfWsSituacoesAlunosTurma(ArrayOfWsSituacoesAlunosTurma value) {
        return new JAXBElement<ArrayOfWsSituacoesAlunosTurma>(_ArrayOfWsSituacoesAlunosTurma_QNAME, ArrayOfWsSituacoesAlunosTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsContratoPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsContratoPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsContratoPDF")
    public JAXBElement<ArrayOfWsContratoPDF> createArrayOfWsContratoPDF(ArrayOfWsContratoPDF value) {
        return new JAXBElement<ArrayOfWsContratoPDF>(_ArrayOfWsContratoPDF_QNAME, ArrayOfWsContratoPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsBolsa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsBolsa }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsBolsa")
    public JAXBElement<ArrayOfWsBolsa> createArrayOfWsBolsa(ArrayOfWsBolsa value) {
        return new JAXBElement<ArrayOfWsBolsa>(_ArrayOfWsBolsa_QNAME, ArrayOfWsBolsa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFormasCobrancas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFormasCobrancas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsFormasCobrancas")
    public JAXBElement<ArrayOfWsFormasCobrancas> createArrayOfWsFormasCobrancas(ArrayOfWsFormasCobrancas value) {
        return new JAXBElement<ArrayOfWsFormasCobrancas>(_ArrayOfWsFormasCobrancas_QNAME, ArrayOfWsFormasCobrancas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCategorias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCategorias }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsCategorias")
    public JAXBElement<ArrayOfWsCategorias> createArrayOfWsCategorias(ArrayOfWsCategorias value) {
        return new JAXBElement<ArrayOfWsCategorias>(_ArrayOfWsCategorias_QNAME, ArrayOfWsCategorias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsItens }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsItens }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsItens")
    public JAXBElement<ArrayOfWsItens> createArrayOfWsItens(ArrayOfWsItens value) {
        return new JAXBElement<ArrayOfWsItens>(_ArrayOfWsItens_QNAME, ArrayOfWsItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsLayouts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsLayouts }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsLayouts")
    public JAXBElement<ArrayOfWsLayouts> createArrayOfWsLayouts(ArrayOfWsLayouts value) {
        return new JAXBElement<ArrayOfWsLayouts>(_ArrayOfWsLayouts_QNAME, ArrayOfWsLayouts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcelas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcelas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsRetornoParcelas")
    public JAXBElement<ArrayOfWsRetornoParcelas> createArrayOfWsRetornoParcelas(ArrayOfWsRetornoParcelas value) {
        return new JAXBElement<ArrayOfWsRetornoParcelas>(_ArrayOfWsRetornoParcelas_QNAME, ArrayOfWsRetornoParcelas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcela }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcela }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsRetornoParcela")
    public JAXBElement<ArrayOfWsRetornoParcela> createArrayOfWsRetornoParcela(ArrayOfWsRetornoParcela value) {
        return new JAXBElement<ArrayOfWsRetornoParcela>(_ArrayOfWsRetornoParcela_QNAME, ArrayOfWsRetornoParcela.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsParcela }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsParcela }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsParcela")
    public JAXBElement<ArrayOfWsParcela> createArrayOfWsParcela(ArrayOfWsParcela value) {
        return new JAXBElement<ArrayOfWsParcela>(_ArrayOfWsParcela_QNAME, ArrayOfWsParcela.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsVendas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsVendas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsVendas")
    public JAXBElement<ArrayOfWsVendas> createArrayOfWsVendas(ArrayOfWsVendas value) {
        return new JAXBElement<ArrayOfWsVendas>(_ArrayOfWsVendas_QNAME, ArrayOfWsVendas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoBoletos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoBoletos }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsRetornoBoletos")
    public JAXBElement<ArrayOfWsRetornoBoletos> createArrayOfWsRetornoBoletos(ArrayOfWsRetornoBoletos value) {
        return new JAXBElement<ArrayOfWsRetornoBoletos>(_ArrayOfWsRetornoBoletos_QNAME, ArrayOfWsRetornoBoletos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDadosFaturaVindi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsDadosFaturaVindi }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsDadosFaturaVindi")
    public JAXBElement<ArrayOfWsDadosFaturaVindi> createArrayOfWsDadosFaturaVindi(ArrayOfWsDadosFaturaVindi value) {
        return new JAXBElement<ArrayOfWsDadosFaturaVindi>(_ArrayOfWsDadosFaturaVindi_QNAME, ArrayOfWsDadosFaturaVindi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFinanceiro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFinanceiro }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsFinanceiro")
    public JAXBElement<ArrayOfWsFinanceiro> createArrayOfWsFinanceiro(ArrayOfWsFinanceiro value) {
        return new JAXBElement<ArrayOfWsFinanceiro>(_ArrayOfWsFinanceiro_QNAME, ArrayOfWsFinanceiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsPlanoCurso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsPlanoCurso }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsPlanoCurso")
    public JAXBElement<ArrayOfWsPlanoCurso> createArrayOfWsPlanoCurso(ArrayOfWsPlanoCurso value) {
        return new JAXBElement<ArrayOfWsPlanoCurso>(_ArrayOfWsPlanoCurso_QNAME, ArrayOfWsPlanoCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsMediaFinal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsMediaFinal }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsMediaFinal")
    public JAXBElement<WsMediaFinal> createWsMediaFinal(WsMediaFinal value) {
        return new JAXBElement<WsMediaFinal>(_WsMediaFinal_QNAME, WsMediaFinal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBoletim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsBoletim }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsBoletim")
    public JAXBElement<WsBoletim> createWsBoletim(WsBoletim value) {
        return new JAXBElement<WsBoletim>(_WsBoletim_QNAME, WsBoletim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBoletim2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsBoletim2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsBoletim2")
    public JAXBElement<WsBoletim2> createWsBoletim2(WsBoletim2 value) {
        return new JAXBElement<WsBoletim2>(_WsBoletim2_QNAME, WsBoletim2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBoletimAulasLivres }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsBoletimAulasLivres }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsBoletimAulasLivres")
    public JAXBElement<WsBoletimAulasLivres> createWsBoletimAulasLivres(WsBoletimAulasLivres value) {
        return new JAXBElement<WsBoletimAulasLivres>(_WsBoletimAulasLivres_QNAME, WsBoletimAulasLivres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsNotasHabilidades }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsNotasHabilidades }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsNotasHabilidades")
    public JAXBElement<WsNotasHabilidades> createWsNotasHabilidades(WsNotasHabilidades value) {
        return new JAXBElement<WsNotasHabilidades>(_WsNotasHabilidades_QNAME, WsNotasHabilidades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCertificado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSCertificado }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "WSCertificado")
    public JAXBElement<WSCertificado> createWSCertificado(WSCertificado value) {
        return new JAXBElement<WSCertificado>(_WSCertificado_QNAME, WSCertificado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFuncionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFuncionario }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsFuncionario")
    public JAXBElement<ArrayOfWsFuncionario> createArrayOfWsFuncionario(ArrayOfWsFuncionario value) {
        return new JAXBElement<ArrayOfWsFuncionario>(_ArrayOfWsFuncionario_QNAME, ArrayOfWsFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMidias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMidias }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsMidias")
    public JAXBElement<ArrayOfWsMidias> createArrayOfWsMidias(ArrayOfWsMidias value) {
        return new JAXBElement<ArrayOfWsMidias>(_ArrayOfWsMidias_QNAME, ArrayOfWsMidias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsGestaoComercial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsGestaoComercial }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsGestaoComercial")
    public JAXBElement<ArrayOfWsGestaoComercial> createArrayOfWsGestaoComercial(ArrayOfWsGestaoComercial value) {
        return new JAXBElement<ArrayOfWsGestaoComercial>(_ArrayOfWsGestaoComercial_QNAME, ArrayOfWsGestaoComercial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAtendimentos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAtendimentos }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAtendimentos")
    public JAXBElement<ArrayOfWsAtendimentos> createArrayOfWsAtendimentos(ArrayOfWsAtendimentos value) {
        return new JAXBElement<ArrayOfWsAtendimentos>(_ArrayOfWsAtendimentos_QNAME, ArrayOfWsAtendimentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsQuitacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsQuitacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsQuitacao")
    public JAXBElement<WsQuitacao> createWsQuitacao(WsQuitacao value) {
        return new JAXBElement<WsQuitacao>(_WsQuitacao_QNAME, WsQuitacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsOperadoraCartao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsOperadoraCartao }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsOperadoraCartao")
    public JAXBElement<ArrayOfWsOperadoraCartao> createArrayOfWsOperadoraCartao(ArrayOfWsOperadoraCartao value) {
        return new JAXBElement<ArrayOfWsOperadoraCartao>(_ArrayOfWsOperadoraCartao_QNAME, ArrayOfWsOperadoraCartao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAgendaAluno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAgendaAluno }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAgendaAluno")
    public JAXBElement<ArrayOfWsAgendaAluno> createArrayOfWsAgendaAluno(ArrayOfWsAgendaAluno value) {
        return new JAXBElement<ArrayOfWsAgendaAluno>(_ArrayOfWsAgendaAluno_QNAME, ArrayOfWsAgendaAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCalendario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsCalendario }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsCalendario")
    public JAXBElement<ArrayOfWsCalendario> createArrayOfWsCalendario(ArrayOfWsCalendario value) {
        return new JAXBElement<ArrayOfWsCalendario>(_ArrayOfWsCalendario_QNAME, ArrayOfWsCalendario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcelasPagar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcelasPagar }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsRetornoParcelasPagar")
    public JAXBElement<ArrayOfWsRetornoParcelasPagar> createArrayOfWsRetornoParcelasPagar(ArrayOfWsRetornoParcelasPagar value) {
        return new JAXBElement<ArrayOfWsRetornoParcelasPagar>(_ArrayOfWsRetornoParcelasPagar_QNAME, ArrayOfWsRetornoParcelasPagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcelaPagar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsRetornoParcelaPagar }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsRetornoParcelaPagar")
    public JAXBElement<ArrayOfWsRetornoParcelaPagar> createArrayOfWsRetornoParcelaPagar(ArrayOfWsRetornoParcelaPagar value) {
        return new JAXBElement<ArrayOfWsRetornoParcelaPagar>(_ArrayOfWsRetornoParcelaPagar_QNAME, ArrayOfWsRetornoParcelaPagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsParcelaPagar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsParcelaPagar }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsParcelaPagar")
    public JAXBElement<ArrayOfWsParcelaPagar> createArrayOfWsParcelaPagar(ArrayOfWsParcelaPagar value) {
        return new JAXBElement<ArrayOfWsParcelaPagar>(_ArrayOfWsParcelaPagar_QNAME, ArrayOfWsParcelaPagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSistemaAvaliacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsSistemaAvaliacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsSistemaAvaliacao")
    public JAXBElement<ArrayOfWsSistemaAvaliacao> createArrayOfWsSistemaAvaliacao(ArrayOfWsSistemaAvaliacao value) {
        return new JAXBElement<ArrayOfWsSistemaAvaliacao>(_ArrayOfWsSistemaAvaliacao_QNAME, ArrayOfWsSistemaAvaliacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAvaliacoesParciais }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAvaliacoesParciais }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAvaliacoesParciais")
    public JAXBElement<ArrayOfWsAvaliacoesParciais> createArrayOfWsAvaliacoesParciais(ArrayOfWsAvaliacoesParciais value) {
        return new JAXBElement<ArrayOfWsAvaliacoesParciais>(_ArrayOfWsAvaliacoesParciais_QNAME, ArrayOfWsAvaliacoesParciais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFrequenciaTurma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFrequenciaTurma }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsFrequenciaTurma")
    public JAXBElement<ArrayOfWsFrequenciaTurma> createArrayOfWsFrequenciaTurma(ArrayOfWsFrequenciaTurma value) {
        return new JAXBElement<ArrayOfWsFrequenciaTurma>(_ArrayOfWsFrequenciaTurma_QNAME, ArrayOfWsFrequenciaTurma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsNotasParciais }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsNotasParciais }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsNotasParciais")
    public JAXBElement<WsNotasParciais> createWsNotasParciais(WsNotasParciais value) {
        return new JAXBElement<WsNotasParciais>(_WsNotasParciais_QNAME, WsNotasParciais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLoginPortal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsLoginPortal }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsLoginPortal")
    public JAXBElement<WsLoginPortal> createWsLoginPortal(WsLoginPortal value) {
        return new JAXBElement<WsLoginPortal>(_WsLoginPortal_QNAME, WsLoginPortal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAccessValidationApp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsAccessValidationApp }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsAccessValidationApp")
    public JAXBElement<WsAccessValidationApp> createWsAccessValidationApp(WsAccessValidationApp value) {
        return new JAXBElement<WsAccessValidationApp>(_WsAccessValidationApp_QNAME, WsAccessValidationApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLoginApp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsLoginApp }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsLoginApp")
    public JAXBElement<WsLoginApp> createWsLoginApp(WsLoginApp value) {
        return new JAXBElement<WsLoginApp>(_WsLoginApp_QNAME, WsLoginApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAppPortalNotas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAppPortalNotas }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAppPortalNotas")
    public JAXBElement<ArrayOfWsAppPortalNotas> createArrayOfWsAppPortalNotas(ArrayOfWsAppPortalNotas value) {
        return new JAXBElement<ArrayOfWsAppPortalNotas>(_ArrayOfWsAppPortalNotas_QNAME, ArrayOfWsAppPortalNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAppPortalNotasNotificacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAppPortalNotasNotificacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAppPortalNotasNotificacao")
    public JAXBElement<ArrayOfWsAppPortalNotasNotificacao> createArrayOfWsAppPortalNotasNotificacao(ArrayOfWsAppPortalNotasNotificacao value) {
        return new JAXBElement<ArrayOfWsAppPortalNotasNotificacao>(_ArrayOfWsAppPortalNotasNotificacao_QNAME, ArrayOfWsAppPortalNotasNotificacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTokenMobile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTokenMobile }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfTokenMobile")
    public JAXBElement<ArrayOfTokenMobile> createArrayOfTokenMobile(ArrayOfTokenMobile value) {
        return new JAXBElement<ArrayOfTokenMobile>(_ArrayOfTokenMobile_QNAME, ArrayOfTokenMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFotoApp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsFotoApp }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsFotoApp")
    public JAXBElement<ArrayOfWsFotoApp> createArrayOfWsFotoApp(ArrayOfWsFotoApp value) {
        return new JAXBElement<ArrayOfWsFotoApp>(_ArrayOfWsFotoApp_QNAME, ArrayOfWsFotoApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAtualizaSenhaAlunoResponsavel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsAtualizaSenhaAlunoResponsavel }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsAtualizaSenhaAlunoResponsavel")
    public JAXBElement<ArrayOfWsAtualizaSenhaAlunoResponsavel> createArrayOfWsAtualizaSenhaAlunoResponsavel(ArrayOfWsAtualizaSenhaAlunoResponsavel value) {
        return new JAXBElement<ArrayOfWsAtualizaSenhaAlunoResponsavel>(_ArrayOfWsAtualizaSenhaAlunoResponsavel_QNAME, ArrayOfWsAtualizaSenhaAlunoResponsavel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeline }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTimeline }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfTimeline")
    public JAXBElement<ArrayOfTimeline> createArrayOfTimeline(ArrayOfTimeline value) {
        return new JAXBElement<ArrayOfTimeline>(_ArrayOfTimeline_QNAME, ArrayOfTimeline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAtualizaSituacaoComunicado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsAtualizaSituacaoComunicado }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsAtualizaSituacaoComunicado")
    public JAXBElement<WsAtualizaSituacaoComunicado> createWsAtualizaSituacaoComunicado(WsAtualizaSituacaoComunicado value) {
        return new JAXBElement<WsAtualizaSituacaoComunicado>(_WsAtualizaSituacaoComunicado_QNAME, WsAtualizaSituacaoComunicado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsComunicadoAPP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsComunicadoAPP }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsComunicadoAPP")
    public JAXBElement<WsComunicadoAPP> createWsComunicadoAPP(WsComunicadoAPP value) {
        return new JAXBElement<WsComunicadoAPP>(_WsComunicadoAPP_QNAME, WsComunicadoAPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsComunicadoAPP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsComunicadoAPP }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsComunicadoAPP")
    public JAXBElement<ArrayOfWsComunicadoAPP> createArrayOfWsComunicadoAPP(ArrayOfWsComunicadoAPP value) {
        return new JAXBElement<ArrayOfWsComunicadoAPP>(_ArrayOfWsComunicadoAPP_QNAME, ArrayOfWsComunicadoAPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsMensagemAPP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsMensagemAPP }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "wsMensagemAPP")
    public JAXBElement<WsMensagemAPP> createWsMensagemAPP(WsMensagemAPP value) {
        return new JAXBElement<WsMensagemAPP>(_WsMensagemAPP_QNAME, WsMensagemAPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMensagensAPP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWsMensagensAPP }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.sponteeducacional.net.br/", name = "ArrayOfWsMensagensAPP")
    public JAXBElement<ArrayOfWsMensagensAPP> createArrayOfWsMensagensAPP(ArrayOfWsMensagensAPP value) {
        return new JAXBElement<ArrayOfWsMensagensAPP>(_ArrayOfWsMensagensAPP_QNAME, ArrayOfWsMensagensAPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "element", scope = Group.class)
    public JAXBElement<LocalElement> createGroupElement(LocalElement value) {
        return new JAXBElement<LocalElement>(_Element_QNAME, LocalElement.class, Group.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupRef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupRef }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XMLSchema", name = "group", scope = Group.class)
    public JAXBElement<GroupRef> createGroupGroup(GroupRef value) {
        return new JAXBElement<GroupRef>(_Group_QNAME, GroupRef.class, Group.class, value);
    }

}
