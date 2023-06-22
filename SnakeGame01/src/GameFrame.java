import javax.swing.JFrame;

public class GameFrame extends JFrame{
//This frame works with the frame of game as the game is functioned inside respective to its game panel

    GameFrame(){
       GamePanel panel = new GamePanel();

       this.add(panel);
       this.setTitle("Snake");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);
    }
}