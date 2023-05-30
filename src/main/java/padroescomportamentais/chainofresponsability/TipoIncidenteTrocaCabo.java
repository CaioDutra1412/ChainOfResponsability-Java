package padroescomportamentais.chainofresponsability;

public class TipoIncidenteTrocaCabo implements TipoIncidente {

    private static TipoIncidenteTrocaCabo tipoIncidenteTrocaCabo = new TipoIncidenteTrocaCabo();

    private TipoIncidenteTrocaCabo() {};
    
    public static TipoIncidenteTrocaCabo getTipoIncidenteTrocaCabo() {
        return tipoIncidenteTrocaCabo;
    }
}
