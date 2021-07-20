public class CommandPrinterPrint implements Command{
    private Impressora impressora;

    public CommandPrinterPrint(Impressora impressora) {
        this.impressora = impressora;
    }

    @Override
    public void executar() {
        this.impressora.imprimir();
    }

    @Override
    public void cancelar() {
        this.impressora.cancelarImpressao();
    }

    @Override
    public void status() {

    }
}
