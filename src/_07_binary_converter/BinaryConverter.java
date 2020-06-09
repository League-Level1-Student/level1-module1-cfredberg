package _07_binary_converter;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	JFrame frame = new JFrame("Converter");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField input = new JTextField(20);
	
	public static void main(String[] args) {
		new BinaryConverter().code();
	}
	
	void code() {
		frame.setPreferredSize(new Dimension(100, 500));
	}
}
