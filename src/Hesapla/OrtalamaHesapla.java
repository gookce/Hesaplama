package Hesapla;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OrtalamaHesapla extends JPanel {

	 private JLabel dersAdı,dersNotu,dersSaati,bos1,bos2;
	 private JTextField ders1, not1,saat1;
	 private JTextField ders2, not2,saat2;
	 private JTextField ders3, not3,saat3;
	 private JTextField ders4, not4,saat4;
	 private JTextField ders5, not5,saat5;
	 private JTextField ders6, not6,saat6;
	 private JTextField ders7, not7,saat7;
	 private JTextField ders8, not8,saat8;
	 private JTextField ders9, not9,saat9;
	 private JButton hesapla;
	 private JLabel sonuc;
	
	 public OrtalamaHesapla() {
		 
		 setPreferredSize(new Dimension(300, 500));
	     setLayout(new GridLayout(11,3));
	     setBounds(100,100,400,300);
	        
		 dersAdı = new JLabel("Dersler");
		 dersNotu = new JLabel("Ders Notu");
		 dersSaati = new JLabel("Saatler");
		 bos1 = new JLabel("");

		 ders1 = new JTextField(10);
		 not1 = new JTextField(3);
		 saat1 = new JTextField(3);
		 ders2 = new JTextField(10); 
		 not2 = new JTextField(3);
		 saat2 = new JTextField(3);
		 
		 ders3 = new JTextField(10);
		 not3 = new JTextField(3);
		 saat3 = new JTextField(3);
		 
		 ders4 = new JTextField(10);
		 not4 = new JTextField(3);
		 saat4 = new JTextField(3); 
		 
		 ders5 = new JTextField(10);
		 not5 = new JTextField(3);
		 saat5 = new JTextField(3);
		 
		 ders6 = new JTextField(10);
		 not6 = new JTextField(3);
		 saat6 = new JTextField(3);
		 
		 ders7 = new JTextField(10);
		 not7 = new JTextField(3);
		 saat7 = new JTextField(3);
		 
		 ders8 = new JTextField(10);
		 not8 = new JTextField(3);
		 saat8 = new JTextField(3);
		 
		 ders9 = new JTextField(10);
		 not9 = new JTextField(3);
		 saat9 = new JTextField(3);
		 
		 bos2 = new JLabel("");
		 
		 hesapla = new JButton("Hesapla");
		 hesapla.addActionListener(new ButtonListener());
		 
		 sonuc = new JLabel("");
		 
		 add(dersAdı);
		 add(dersNotu);
		 add(dersSaati);
		 add(bos1);
		 add(ders1);
		 add(not1);
		 add(saat1);
		 add(ders2);
		 add(not2);
		 add(saat2);
		 add(ders3);
		 add(not3);
		 add(saat3);
		 add(ders4);
		 add(not4);
		 add(saat4);
		 add(ders5);
		 add(not5);
		 add(saat5);
		 add(ders6);
		 add(not6);
		 add(saat6);
		 add(ders7);
		 add(not7);
		 add(saat7);
		 add(ders8);
		 add(not8);
		 add(saat8);
		 add(ders9);
		 add(not9);
		 add(saat9);
		 add(bos2);
		 add(hesapla);
		 add(sonuc);
	 }	  
	 
     
	 private class ButtonListener implements ActionListener {
	        
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	double islem1 = (Double.valueOf(not1.getText())*Integer.valueOf(saat1.getText()));
	        	double islem2 = (Double.valueOf(not2.getText())*Integer.valueOf(saat2.getText()));
	        	double islem3 = (Double.valueOf(not3.getText())*Integer.valueOf(saat3.getText()));
	        	double islem4 = (Double.valueOf(not4.getText())*Integer.valueOf(saat4.getText()));
	        	double islem5 = (Double.valueOf(not5.getText())*Integer.valueOf(saat5.getText()));
	        	double islem6 = (Double.valueOf(not6.getText())*Integer.valueOf(saat6.getText()));
	        	double islem7 = (Double.valueOf(not7.getText())*Integer.valueOf(saat7.getText()));
	        	double islem8 = (Double.valueOf(not8.getText())*Integer.valueOf(saat8.getText()));
	        	double islem9 = (Double.valueOf(not9.getText())*Integer.valueOf(saat9.getText()));
	        	double bolen = Integer.valueOf(saat1.getText())+ Integer.valueOf(saat2.getText())+ Integer.valueOf(saat3.getText())+ Integer.valueOf(saat4.getText())+ Integer.valueOf(saat5.getText())+ Integer.valueOf(saat6.getText())+ Integer.valueOf(saat7.getText())+Integer.valueOf(saat8.getText())+Integer.valueOf(saat9.getText());
	            
	        	sonuc.setText(String.valueOf((islem1+islem2+islem3+islem4+islem5+islem6+islem7+islem8+islem9)/bolen));       	
	        }	        
	 }     
}