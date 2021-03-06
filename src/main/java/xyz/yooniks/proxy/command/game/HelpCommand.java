package xyz.yooniks.proxy.command.game;

import java.util.List;
import java.util.stream.Collectors;
import xyz.yooniks.proxy.command.Command;
import xyz.yooniks.proxy.command.basic.CommandExecutor;
import xyz.yooniks.proxy.command.basic.CommandInfo;
import xyz.yooniks.proxy.command.basic.CommandManager;
import xyz.yooniks.proxy.user.ProxyUser;

@CommandInfo(
    name = "help",
    aliases = { "pomoc", "commands", "komendy" },
    description = "Wyswietla dostepne komendy i ich opisy"
)
public class HelpCommand implements CommandExecutor {

  private final CommandManager commandManager;

  public HelpCommand(CommandManager commandManager) {
    this.commandManager = commandManager;
  }

  @Override
  public void execute(ProxyUser executor, String[] args) {
    executor.sendMessage("&7Lista komend:");
    final List<Command> commands = this.commandManager.getGameCommands();
    executor.sendMessage("&7Suma: &6" + commands.size() + "\n" +
        commands.stream()
        .map(command -> "&6!" + command.getName() + " &7- " + command.getDescription())
        .collect(Collectors.joining("\n")));
  }

}
