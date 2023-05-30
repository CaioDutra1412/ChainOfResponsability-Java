package padroescomportamentais.chainofresponsability;

public class Incidente {

    private TipoIncidente tipoIncidente;

    public Incidente(TipoIncidente tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }
    
    public TipoIncidente getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(TipoIncidente tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }
    
}
