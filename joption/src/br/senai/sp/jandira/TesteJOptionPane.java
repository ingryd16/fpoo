package br.senai.sp.jandira;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TesteJOptionPane {

	public static void main(String[] args) {
		// CAIXAS SOMENTE PARA MSG
//		JOptionPane.showMessageDialog(null, "Olá, isso é uma mensagem!");
//		JOptionPane.showMessageDialog(null, "msg de erro", "senai jandira",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "msg de informação", "senai jandira", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "msg de atenção", "senai jandira", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "msg sem icone", "senai jandira", JOptionPane.PLAIN_MESSAGE);
		
		ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/imagens/icon.png.");
		JOptionPane.showMessageDialog(null, "outra msg", "senai jandira",JOptionPane.PLAIN_MESSAGE, icone);
		
		ImageIcon wind = new ImageIcon("src/br/senai/sp/jandira/imagens/wind.png.");
		JOptionPane.showMessageDialog(null, "erro", "senai jandira",JOptionPane.PLAIN_MESSAGE, wind);
	}

}
