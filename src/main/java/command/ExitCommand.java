package command;

public class ExitCommand implements Command {

    private final ExitHandler exitHandler;

    // Конструктор з переданим ExitHandler
    public ExitCommand(ExitHandler exitHandler) {
        this.exitHandler = exitHandler;
    }

    // Конструктор за замовчуванням, використовує DefaultExitHandler
    public ExitCommand() {
        this.exitHandler = new DefaultExitHandler() {
            @Override
            public void exit(int i) {

            }
        }; // Використовуємо стандартний обробник виходу
    }

    @Override
    public void execute() {
        System.out.println("Вихід з програми...");
        exitHandler.exit(0); // Викликаємо exit через handler
    }
}
