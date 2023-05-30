package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class IncidenteTest {
    FuncionarioN3 N3;
    FuncionarioN2 N2;
    FuncionarioN1 N1;

    @BeforeEach
    void setUp() {
        N3 = new FuncionarioN3(null);
        N2 = new FuncionarioN2(N3);
        N1 = new FuncionarioN1(N2);
    }

    @Test
    void retornarN1TratarCabo() {
        assertEquals("N1", N1.tratarErro(new Incidente(TipoIncidenteTrocaCabo.getTipoIncidenteTrocaCabo())));
    }

    @Test
    void deveRetornarCoordenadorParaAssinaturaMatricula() {
        assertEquals("N2", N1.tratarErro(new Incidente(TipoIncidenteParametrizacao.getTipoIncidenteParametrizacao())));
    }

    @Test
    void deveRetornarDiretorParaAssinaturaCertificado() {
        assertEquals("N3", N1.tratarErro(new Incidente(TipoIncidenteDesenvolvimentoCodigo.getTipoIncidenteDesenvolvimentoCodigo())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Correção externa!", N1.tratarErro(new Incidente(TipoIncidenteQuedaDeRede.getTipoIncidenteQuedaDeRede())));
    }

}