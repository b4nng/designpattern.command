public interface Command {
    void executar();
    void cancelar();
    void status();
}
