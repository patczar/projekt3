package projekt3;

import java.time.LocalTime;

import javax.swing.JOptionPane;

public class HelloWindow {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Teraz jest godzina:\n" + LocalTime.now());
	}

}
