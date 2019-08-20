package iftm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Janela extends JFrame implements MouseListener {
		
	// Construtor
	public Janela (){	
		//Colocando o Quadro/Panel
		Desenho des = new Desenho();
		add(des);
		
		//Configurações do JFrame
		setTitle("Computação Gráfica");
		setSize(1000,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		Janela jan = new Janela();
		jan.addMouseListener(jan);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println( e.getX() + "," + e.getY() );
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}