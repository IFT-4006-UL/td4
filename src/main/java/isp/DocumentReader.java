package isp;

public class DocumentReader {

    private final Imprimante imprimante;

    public DocumentReader(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    public void scanDocument() {
        imprimante.scanner();
    }
}
