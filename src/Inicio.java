import java.awt.*;
import StarRater;
import java.awt.image.*;

import javax.swing.*;


public class Inicio {
	public static void main (String args[]) {
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(600,400);
		
		JTabbedPane abas = new JTabbedPane();
		
		//aba 1
		abas.add("Lista", new JLabel("Teste"));
		
		
		//begin:: Cadastro/Aba
		
		
		//Primeira Aba - Cadastro
		ImageIcon imageIcon = new ImageIcon("src/harry-potter.jpg"); // load the image toaimageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(120, 200,  Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  
		JLabel lIconeFilme = new JLabel(imageIcon);
		lIconeFilme.setHorizontalAlignment(JLabel.CENTER);
				
		//Segunda Aba - Cadastro
		JPanel aba22 = new JPanel();
		aba22.setLayout(new GridLayout(6,1));
				
		//Titulo
		JLabel lTitulo = new JLabel("Título:");
		lTitulo.setHorizontalAlignment(JLabel.LEFT);
		JTextField fieldTitulo = new JTextField();
		fieldTitulo.setPreferredSize(new Dimension(50,10));
		aba22.add(lTitulo);
		aba22.add(fieldTitulo);
				
		//Sinopse
		JLabel lSinopse = new JLabel("Sinopse:");
		lTitulo.setHorizontalAlignment(JLabel.LEFT);
		JTextField fieldSinopse = new JTextField();
		fieldSinopse.setPreferredSize(new Dimension(50,50));
		aba22.add(lSinopse);
		aba22.add(fieldSinopse);
			
		//Gênero
		JLabel lGenero = new JLabel("Gênero:");
		lTitulo.setHorizontalAlignment(JLabel.LEFT);
		JTextField fieldGenero = new JTextField();
		fieldGenero.setPreferredSize(new Dimension(50,25));
		aba22.add(lGenero);
		aba22.add(fieldGenero);
			
		//Terceira Aba - Cadastro
		JPanel aba23 = new JPanel();
		//aba23.setLayout(new FlowLayout());
				
		//Onde Assistir
		JLabel lOndeAssistir = new JLabel("Onde Assistir");
		aba23.add(lOndeAssistir);
		JRadioButton rdNetflix = new JRadioButton("Netflix");
		aba23.add(rdNetflix);
		JRadioButton rdPrime = new JRadioButton("Prime Video");
		aba23.add(rdPrime);
		JRadioButton rdBay = new JRadioButton("Pirate Bay");
		aba23.add(rdBay);
				
		//Assistido
		JCheckBox assistido = new JCheckBox("Assistido");
		aba23.add(assistido);
			
		//Avaliação
		JLabel lAvaliacao = new JLabel("Avaliação");
		aba23.add(lAvaliacao);
		aba23.add(new StarRater(5));

		
		JPanel cadastroCenter = new JPanel();
		GridLayout gl = new GridLayout(1, 3);
		cadastroCenter.setLayout(gl);
		cadastroCenter.add(lIconeFilme);
		cadastroCenter.add(aba22);
		cadastroCenter.add(aba23);
		
		
		JPanel panelCadastro = new JPanel();
		//panelCadastro.add(new JLabel("West"), BorderLayout.SOUTH);
		//panelCadastro.add(new JLabel("East"), BorderLayout.EAST);
		panelCadastro.add(cadastroCenter, BorderLayout.NORTH);
		
		abas.add("Cadastro", panelCadastro);
		
		//Melhores - Aba
		abas.add("Melhores", new JLabel("Teste"));
		
		//Pendentes - Aba
		abas.add("Pendentes", new JLabel("Teste"));
		
		
		janela.add(abas);	
		janela.setVisible(true);
		
		

		
		
		//janela.add(painel);
		//janela.setVisible(true);
	}
	
	//private Image getScaledImage(Image srcImg, int w, int h){
//	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
//	    Graphics2D g2 = resizedImg.createGraphics();
//
//	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//	    g2.drawImage(srcImg, 0, 0, w, h, null);
//	    g2.dispose();
//
//	    return resizedImg;
//	}
}
