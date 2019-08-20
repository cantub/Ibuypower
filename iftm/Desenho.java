package iftm;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class Desenho  extends JPanel{

	@Override
	protected void paintComponent(Graphics graph) {
		super.paintComponent(graph);
		
		//Desenho manual
		Graphics2D g = (Graphics2D) graph;
		
		// Eliminar serrilhados em curvas (Anti-aliasing)
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHints(rh);
		
		//cores
		Color vermelho = new Color(84, 18, 18); //R,G,B
		Color amarelo = new Color(252,252,3);
		Color branco = new Color(255, 255, 255);
		Color laranja = new Color(255,149,0);
		Color preto = new Color(43, 1, 0);
		Color cinza = new Color(173, 166, 166);
		
		//preencher a Tela toda
		g.setColor(branco);
		g.fillRect(0, 0, 1000, 900);
		
		//fazer as linhas
		BasicStroke fina = new BasicStroke(1);
		BasicStroke grossa = new BasicStroke(10);
	

		//degrade/gradient
		float[] faixa = {0.2f, 0.5f, 0.7f,0.8f};
		Color[] cores = { preto, vermelho,vermelho, preto};
				
		LinearGradientPaint linear = new LinearGradientPaint(54,353,944,415,faixa,cores);
		
		
		
		//preza 01
		double preza1[][] = {
			{73,317}, {70,341}, {68,354}, {69,365},
			{69,378}, {71,391}, {75,404}, {77,412},
			{81,422}, {86,431}, {99,457}, {107,469},
			{116,484}, {108,468}, {105,457}, {102,444},
			{100,434}, {98,420}, {97,404}, {97,386},
			{97,366}, {99,361}, {98,353}, {99,335},
			{100,320}, {99,318}, {73,317}
					
		};
		GeneralPath p1 = new GeneralPath(); //criando shape
				
				
		p1.moveTo(preza1[0][0], preza1[0][1]); //Posicao Inical
				
		for(int i = 1; i < preza1.length; i++) {
			p1.lineTo(preza1[i][0], preza1[i][1]); // Desenhando as linhas
		}
		p1.closePath();//Fechar o Shape

		g.setPaint(linear);
		g.fill(p1);
		
		
		/*
		//contorno do desenho
		g.setStroke(grossa);
		g.setColor(branco);
		g.draw(p1);		
		*/
		
				
		//preza 02
		double preza2[][] = {
						
			{165,309},{159,345}, {158,301}, {159,344}, {158,362},
			{161,410}, {166,430}, {171,446}, {174,457},
			{181,473}, {185,480}, {190,488}, {196,498},
			{200,503}, {204,507}, {201,495}, {198,487},
			{197,478}, {195,465}, {193,446}, {192,439},
			{192,408}, {193,381}, {194,366}, {196,341},
			{198,318}, {200,298}, {205,291}, {165,309}

						
					
		};
		GeneralPath p2 = new GeneralPath(); //criando shape
				
				
		p2.moveTo(preza2[0][0], preza2[0][1]); //Posicao Inical
				
		for(int i = 1; i < preza2.length; i++) {
			p2.lineTo(preza2[i][0], preza2[i][1]); // Desenhando as linhas
		}
		p2.closePath();//Fechar o Shape
		g.setPaint(linear);	
		g.fill(p2);
		
		/*
		g.setStroke(grossa);
		g.setColor(branco);
		g.draw(p2);
		*/
		
		
		//Path/Shapes
		double pontos[][] = {
				{176,510}, {190,545}, {209,586}, {226,617},
				{247,647}, {258,658}, {272,666}, {285,670},
				{302,673}, {318,671}, {331,667},
				{357,649}, {392,620}, {427,592}, {455,569},
				{486,549}, {510,532}, {532,521}, {573,501},
				{613,484}, {642,470}, {673,459},
				{705,449}, {739,439}, {769,430}, {801,421},
				{827,412}, {819,415}, {856,405}, {884,400},
				{917,392}, {937,388}, {909,372},{892,362},
				{869,347}, {847,331}, {831,319}, {817,310},
				{793,298}, {776,291}, {757,285}, {745,281},
				{734,279},
				{774,265}, {806,252}, {837,242}, {861,233},
				{813,228}, {778,226}, {740,224}, {708,222},
				{653,214}, {601,205}, {566,197},{601,172},
				{625,157}, {612,161}, {586,166}, {551,170},
				{525,173}, {471,174}, {435,175}, {299,178},
				{290,183}, {209,225}, {167,240},{132,243},
				{112,246}, {88,252}, {82,256}, {80,263},
				{76,279}, {74,287}, {59,303}, {53,311},
				{52,321}, {52,327}, {54,330},{57,330},
				{63,333}, {91,321}, {99,322}, {112,323},
				{129,320}, {181,311}, {197,314}, {217,317},
				{237,320},
				{253,323}, {265,327}, {280,331}, {295,336},
				{315,346}, {330,354}, {342,363}, {357,375},
				{370,392}, {376,411}, {377,426},{377,441},
				{377,459}, {373,484}, {363,515}, {347,543},
				{333,557}, {324,563}, {314,569}, {294,577},
				{276,580}, {261,580}, {251,579},{245,577},
				{238,574}, {216,555}, {201,538}, {188,523},
				{176,510}	
		};
		
		GeneralPath star = new GeneralPath(); //criando shape
		
		
		star.moveTo(pontos[0][0], pontos[0][1]); //Posicao Inical
		
		for(int i = 1; i < pontos.length; i++) {
		star.lineTo(pontos[i][0], pontos[i][1]); // Desenhando as linhas
		}
		star.closePath();//Fechar o Shape
		g.setPaint(linear);
		g.fill( star );
		
		/*
		g.setStroke(grossa);
		g.setColor(branco);
		g.draw(star);	
		*/
		
		
		double losango[][] = {
				{325,240}, {387,214}, {470,222}, {400,256},
				{325,240}
				
		};
		GeneralPath s = new GeneralPath(); //criando shape
		
		
		s.moveTo(losango[0][0], losango[0][1]); //Posicao Inical
		
		for(int i = 1; i < losango.length; i++) {
		s.lineTo(losango[i][0], losango[i][1]); // Desenhando as linhas
		}
		s.closePath();//Fechar o Shape
		
		g.setColor( branco );
		g.fill( s);
		
		double baixo[][] = {
				{393,657}, {455,597}, {509,560}, {558,532},
				{601,510}, {653,487}, {712,465}, {767,447},
				{811,434}, {862,420}, {935,405}, {936,406},
				{867,444}, {828,470}, {795,495}, {767,518},
				{751,535}, {748,538}, {802,528}, {846,521},
				{898,516}, {920,516}, {874,533}, {848,549},
				{810,571}, {781,593}, {762,609}, {803,605},
				{853,602}, {902,602}, {842,620}, {816,632},
				{791,648}, {788,651}, {786,654}, {732,651},
				{691,653}, {645,658}, {616,663}, {694,626},
				{641,630}, {604,634}, {566,643}, {528,652},
				{497,661}, {565,607}, {511,618}, {484,625},
				{453,634}, {430,644}, {391,657}, {393,657},
				
		};
		GeneralPath b = new GeneralPath(); //criando shape
		
		
		b.moveTo(baixo[0][0], baixo[0][1]); //Posicao Inical
		
		for(int i = 1; i < baixo.length; i++) {
		b.lineTo(baixo[i][0], baixo[i][1]); // Desenhando as linhas
		}

		
		b.closePath();//Fechar o Shape

		g.setPaint(linear);
		g.fill(b);
		/*
		g.setStroke(grossa);
		g.setColor(branco);
		g.draw(b);
		-------------
		*/
	}
}