import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    private int x = 10;
    private int y = 10;
    private Screen screen;
    public void main(String[] args) {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            this.screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need a cursor
            screen.startScreen(); // screens must be started
            screen.doResizeIfNecessary(); // resize screen if necessary
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void draw() throws IOException{
        getScreen().clear();
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
        getScreen().refresh();
    }
    public void run() throws IOException{
        draw();
        KeyStroke key = screen.readInput();
    }

    public Screen getScreen(){
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    private void processKey(KeyStroke key) {
        System.out.println(key);
    }
}

