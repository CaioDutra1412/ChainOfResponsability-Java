package padroescomportamentais.chainofresponsability;

public class TipoIncidenteDesenvolvimentoCódigo implements TipoIncidente {

    private static TipoIncidenteDesenvolvimentoCódigo tipoIncidenteDesenvolvimentoCódigo = new TipoIncidenteDesenvolvimentoCódigo();

    private TipoIncidenteDesenvolvimentoCódigo() {};
    
    public static TipoIncidenteDesenvolvimentoCódigo getTipoIncidenteDesenvolvimentoCódigo() {
        return tipoIncidenteDesenvolvimentoCódigo;
    }

}
