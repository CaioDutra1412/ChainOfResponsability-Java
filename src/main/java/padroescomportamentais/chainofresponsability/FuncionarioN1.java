package padroescomportamentais.chainofresponsability;

public class FuncionarioN1 extends Funcionario {
    
    public FuncionarioN1(Funcionario superior) {
        listaIncidentes.add(TipoIncidenteTrocaCabo.getTipoIncidenteTrocaCabo());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoAtendimento() {
        return "N1";
    }

}
