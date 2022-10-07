import java.io.IOException;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
public class Main {
    public static void main(String[] args) {
       try {
          Game game = new Game();
          game.run();
       } catch (IOException e) {
          throw new RuntimeException(e);
       }
    }
}