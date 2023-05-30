package padroescomportamentais.chainofresponsability;

public class TipoIncidenteParametrizacao implements TipoIncidente{

    private static TipoIncidenteParametrizacao tipoIncidenteParametrizacao = new TipoIncidenteParametrizacao();

    private TipoIncidenteParametrizacao (){}

    public static TipoIncidenteParametrizacao getTipoIncidenteParametrizacao() {
        return tipoIncidenteParametrizacao;
    }
}
