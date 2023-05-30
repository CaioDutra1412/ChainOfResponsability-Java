package padroescomportamentais.chainofresponsability;

public class TipoIncidenteQuedaDeRede implements TipoIncidente {

    private static TipoIncidenteQuedaDeRede tipoIncidenteQuedaDeRede = new TipoIncidenteQuedaDeRede();

    private TipoIncidenteQuedaDeRede() {};

    public static TipoIncidenteQuedaDeRede getTipoIncidenteQuedaDeRede() {
        return tipoIncidenteQuedaDeRede;
    }

}
