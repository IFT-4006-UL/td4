package isp;

public class VieilleImprimante implements Imprimante{

    @Override
    public void imprimer() {
        System.out.print("Impression par PDFPrinter");
    }

    @Override
    public void annulerOperation() {
    }

    @Override
    public void scanner() {
    }
}
