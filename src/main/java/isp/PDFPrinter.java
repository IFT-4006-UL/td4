package isp;

public class PDFPrinter implements Imprimante{

    @Override
    public void imprimer() {
        System.out.print("Impression par PDFPrinter");
    }

    @Override
    public void annulerOperation() {
        System.out.print("Impression annulée par PDFPrinter");
    }

    @Override
    public void scanner() {
    }
}
