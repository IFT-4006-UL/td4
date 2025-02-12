package isp;

public class DocumentExporter {

    private final Imprimante imprimante;

    public DocumentExporter(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    public void imprimerDocument() {
        imprimante.imprimer();
    }
}
