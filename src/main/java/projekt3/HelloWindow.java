package projekt3;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class HelloWindow {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Teraz jest data i godzina:\n" + LocalDateTime.now());
	}

}
