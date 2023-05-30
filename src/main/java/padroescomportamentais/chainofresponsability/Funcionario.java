package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaIncidentes = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }
    
    public abstract String getDescricaoAtendimento();
    
    public String tratarErro(Incidente incidente) {
        if (listaIncidentes.contains(incidente.getTipoIncidente())) {
            return getDescricaoAtendimento();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.tratarErro(incidente);
            }
            else 
            {
                return "Correção externa!";
            }
        }        
    }
}
