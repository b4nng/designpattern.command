import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCommand {
    Usuario user1;
    Impressora impressora;

    @BeforeEach
    void setUp(){
        Usuario user1 = new Usuario();
        Impressora impressora = new Impressora("Hp-2900", "Convencional Laser");
    }

    @Test
    void deveImprimir(){
        Command imprimir = new CommandPrinterPrint(impressora);
        user1.executarComando(imprimir);

        Assertions.assertEquals("Imprimindo", impressora.getStatus());
    }
}
