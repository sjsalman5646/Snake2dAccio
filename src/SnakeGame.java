import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;
    SnakeGame(){
        board=new Board();
        setVisible(true);
        add(board);
        pack();
        setResizable(false);
    }

    public static void main(String[] args) {
        SnakeGame snakeGame=new SnakeGame();
    }
}