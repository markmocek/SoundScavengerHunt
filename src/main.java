import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main {
	public static void main (String[]args){
		
		AudioPlayer aPlayer = new AudioPlayer();
    	
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(150, 25));

        JLabel label = new JLabel("How many days are there in four years?");

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	int digit = 0;
                String input = textField.getText();

                if(input.equals("")) {
                	digit = 0;
                }
                else {
                	digit = Integer.parseInt(input);
                }
                
                input = aPlayer.inputCode(digit);
                
                label.setText(input);
            }
        });
        
        JButton stopButton = new JButton("STOP");
        stopButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	 aPlayer.stopSong();
            }
        });

        container.add(textField);
        container.add(okButton);
        container.add(label);
        container.add(stopButton);

        frame.setVisible(true);
    }
}