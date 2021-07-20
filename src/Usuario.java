import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Command> commands = new ArrayList<>();

    public void executarComando(Command command){
        this.commands.add(command);
        command.executar();
    }

    public void statusComando(Command command){
        this.commands.add(command);
        command.status();
    }

    public void cancelLastCommand(){
        if(commands.size() != 0){
            Command command = this.commands.get(this.commands.size() -1);
            command.cancelar();
            this.commands.remove(this.commands.size() - 1);
        }
    }
}
