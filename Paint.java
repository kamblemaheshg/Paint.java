import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paint implements ActionListener {
    JFrame f;

    Paint() {
        f = new JFrame("Paint");
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPopupMenu p = new JPopupMenu();
        JMenuItem draw = new JMenuItem("DRAW");
        JMenuItem erase = new JMenuItem("Erase");
        p.add(draw);
        p.add(erase);

        f.add(p);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent y) {
                p.show(f, y.getX(), y.getY());

            }
        });
        draw.addActionListener(this);
        erase.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                f.setBackground(Color.WHITE);
            }
        });

    }

    public static void main(String[] args) {
        new Paint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        {

            f.addMouseMotionListener(new MouseAdapter() {
                public void mouseDragged(MouseEvent z) {
                    Graphics g = f.getGraphics();
                    g.setColor(Color.orange);
                    g.fillOval(z.getX(), z.getY(), 8, 8);

                }
            });
        }

    }

}
