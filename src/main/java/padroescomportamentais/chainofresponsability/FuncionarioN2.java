package padroescomportamentais.chainofresponsability;

public class FuncionarioN2 extends Funcionario {

    public FuncionarioN2(Funcionario superior) {
        listaIncidentes.add(TipoIncidenteParametrizacao.getTipoIncidenteParametrizacao());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoAtendimento() {
        return "N2";
    }

}
