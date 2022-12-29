import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToeGUI implements ActionListener {
  private TicTacToeClass game;
  private JButton[][] buttons;
  private JFrame frame;

  public TicTacToeGUI() {
    game = new TicTacToeClass();
    buttons = new JButton[3][3];
    frame = new JFrame("Tic-Tac-Toe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        JButton button = new JButton(" ");
        button.addActionListener(this);
        panel.add(button);
        buttons[i][j] = button;
      }
    }
    frame.add(panel, BorderLayout.CENTER);

    frame.pack();
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (button == buttons[i][j]) {
          game.playMove('X', i, j);
          button.setText("X");
          if (game.isWinner('X')) {
            System.out.println("X wins!");
            System.exit(0);
          } else if (game.isCat()) {
            System.out.println("It's a tie!");
            System.exit(0);
          }
          game.playMove('O', (int) (Math.random() * 3), (int) (Math.random() * 3));
          for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
              if (game.playerAt(m, n) == 'O') {
                buttons[m][n].setText("O");
              }
            }
          }
          if (game.isWinner('O')) {
            System.out.println("O wins!");
            System.exit(0);
          } else if (game.isCat()) {
            System.out.println("It's a tie!");
            System.exit(0);
          }
        }
      }
    }
  }
}
