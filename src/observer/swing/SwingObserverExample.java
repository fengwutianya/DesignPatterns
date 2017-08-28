package observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xuan on 8/28/17.
 */
public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        jFrame = new JFrame();

        JButton button = new JButton("should I do it");
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.show();
    }

    private class AngleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("don't do it, you might regret it");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("come on, do it");
        }
    }
}
