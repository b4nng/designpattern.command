public class CommandPrinterCancel implements Command{
    private Impressora impressora;

    public CommandPrinterCancel(Impressora impressora){
        this.impressora = impressora;
    }

    @Override
    public void executar() {
        this.impressora.cancelarImpressao();
    }

    @Override
    public void cancelar() {
        this.impressora.setStatus("Cancelamento interrompido");
    }

    @Override
    public void status() {
        this.impressora.status();
    }
}
