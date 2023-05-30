package padroescomportamentais.chainofresponsability;

public class TipoIncidenteDesenvolvimentoCodigo implements TipoIncidente {

    private static TipoIncidenteDesenvolvimentoCodigo tipoIncidenteDesenvolvimentoCodigo = new TipoIncidenteDesenvolvimentoCodigo();

    private TipoIncidenteDesenvolvimentoCodigo() {};
    
    public static TipoIncidenteDesenvolvimentoCodigo getTipoIncidenteDesenvolvimentoCodigo() {
        return tipoIncidenteDesenvolvimentoCodigo;
    }

}
