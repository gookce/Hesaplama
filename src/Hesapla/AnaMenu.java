package Hesapla;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnaMenu extends JPanel {

	private JButton krediEkranı,ortalamaEkranı;
	
	public AnaMenu(){
		
		setPreferredSize(new Dimension(300, 500));
		
		krediEkranı = new JButton("Kredi Hesapla");
	    krediEkranı.addActionListener(new ButtonListener());
	    
	    ortalamaEkranı = new JButton("Ortalama Hesapla");
	    ortalamaEkranı.addActionListener(new ButtonListener());
	    
	    add(krediEkranı);
	    add(ortalamaEkranı);
	}
	
	 public class ButtonListener implements ActionListener {
	        
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	String text=e.getActionCommand();
	        	
	        	if(text== "Kredi Hesapla") {
	             
		        	 JFrame jFrame = new JFrame("Kredi Hesapla");
		             
		             KrediHesapla krediEkranım = new KrediHesapla();
		             jFrame.getContentPane();
		             jFrame.add(krediEkranım);
		             jFrame.pack();
		             jFrame.setVisible(true);
	        	}
	            else {
	            	
	            	 JFrame jFrame = new JFrame("Ortalama Hesapla");
		             
		             OrtalamaHesapla ortalamaEkranım = new OrtalamaHesapla();
		             jFrame.getContentPane();
		             jFrame.add(ortalamaEkranım);
		             jFrame.pack();
		             jFrame.setVisible(true);
	            }
	            	 
	        }
	    }
}
