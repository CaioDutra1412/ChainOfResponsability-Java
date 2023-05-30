package padroescomportamentais.chainofresponsability;

public class FuncionarioN3 extends Funcionario {
    
    public FuncionarioN3(Funcionario superior) {
        listaIncidentes.add(TipoIncidenteDesenvolvimentoCodigo.getTipoIncidenteDesenvolvimentoCodigo());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoAtendimento() {
        return "N3";
    }
}
