import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;


public class KasaSklepowa extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bComma,bNext,bEnd,bNew;
	private JPanel panelKlawiatura;
	private JPanel panelEkran;
	private JTextField textField;
	private JPanel panelLista;
	private JEditorPane lista;
	private JPanel panelNoweZakupy;
	boolean nextClear=true;
	boolean commaPresent=false;
	boolean end=false;
	int numbersAfterComma=0;
	double sum=0;
	
	public static void main(String[] args) {
		
		new KasaSklepowa();
		
	}

	
	public KasaSklepowa() {
		
		this.setSize(900,900);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Kasa Sklepowa");
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bComma = new JButton(",");
		bNext = new JButton("Nastêpny Towar");
        bEnd = new JButton("Koniec zaupów");
        bNew = new JButton("Nowe zakupy");
		
		panelKlawiatura = new JPanel();
		this.add(panelKlawiatura, BorderLayout.WEST);
		panelKlawiatura.setLayout(new GridLayout(3, 3, 10, 10));
		
		panelKlawiatura.add(b0);
		panelKlawiatura.add(b1);
		panelKlawiatura.add(b2);
		panelKlawiatura.add(b3);
		panelKlawiatura.add(b4);
		panelKlawiatura.add(b5);
		panelKlawiatura.add(b6);
		panelKlawiatura.add(b7);
		panelKlawiatura.add(b8);
		panelKlawiatura.add(b9);
		panelKlawiatura.add(bComma);
		panelKlawiatura.add(bNext);
		panelKlawiatura.add(bEnd);
		
		bNew.setVisible(true);
		
		panelEkran = new JPanel();
		getContentPane().add(panelEkran, BorderLayout.NORTH);
		
		textField = new JTextField();
		panelEkran.add(textField);
		textField.setColumns(10);
		textField.setPreferredSize(new Dimension(200, 50));
		textField.setEditable(false);
		
		panelLista = new JPanel();
		panelLista.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout = (FlowLayout) panelLista.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		this.add(panelLista, BorderLayout.EAST);
		
		lista = new JEditorPane();
		lista.setPreferredSize(new Dimension(100, 300));
		lista.setEditable(false);
		panelLista.add(lista);
		
		panelNoweZakupy = new JPanel();
		panelNoweZakupy.add(bNew);
		panelNoweZakupy.setVisible(false);
		this.add(panelNoweZakupy, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		ListenForButton lButton = new ListenForButton();
		
		b1.addActionListener(lButton);
	    b2.addActionListener(lButton);
	    b3.addActionListener(lButton);
	    b4.addActionListener(lButton);
	    b5.addActionListener(lButton);
	    b6.addActionListener(lButton);
	    b7.addActionListener(lButton);
	    b8.addActionListener(lButton);
	    b9.addActionListener(lButton);
	    b0.addActionListener(lButton);
	    bComma.addActionListener(lButton);
	    bNext.addActionListener(lButton);
	    bEnd.addActionListener(lButton);
		
	}
	
	public class ListenForButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == b1) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("1"));
				}
				else;
			}
			if(e.getSource() == b2) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("2"));
				}
				else;
			}
			if(e.getSource() == b3) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("3"));
				}
				else;
			}
			if(e.getSource() == b4) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("4"));
				}
				else;
			}
			if(e.getSource() == b5) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("5"));
				}
				else;
			}
			if(e.getSource() == b6) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("6"));
				}
				else;
			}
			if(e.getSource() == b7) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("7"));
				}
				else;
			}
			if(e.getSource() == b8) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("8"));
				}
				else;
			}
			if(e.getSource() == b9) {
				nextClear=false;
				if(commaPresent) numbersAfterComma++;
				if(numbersAfterComma<=2) {
					textField.setText(textField.getText().concat("9"));
				}
				else;
			}
			if(e.getSource() == b0) {
				if(nextClear==false) {
					if(commaPresent) numbersAfterComma++;
					if(numbersAfterComma<=2) {
						textField.setText(textField.getText().concat("0"));
					}
				}
				if (nextClear==true && commaPresent==false) {
					textField.setText(textField.getText().concat("0."));
					commaPresent=true;
					nextClear=false;
				}
				else;
			}
			if(e.getSource() == bComma) {
				if(nextClear==false && commaPresent==false) {
					textField.setText(textField.getText().concat("."));
					commaPresent=true;
				}		
				else if (nextClear==true && commaPresent==false) {
					textField.setText(textField.getText().concat("0."));
					commaPresent=true;
				};
			}
			if(e.getSource() == bNext) {
				if (textField.getText()!="") {
					lista.setText(lista.getText() + textField.getText().concat(" + (" + Math.round(sum*100.0)/100.0 +  ")\n"));
					sum = sum + Double.parseDouble(textField.getText());
					textField.setText(null);
					commaPresent=false;
					nextClear=true;
					numbersAfterComma=0;
				}
			}
			if(e.getSource() == bEnd) {
				if (textField.getText()!="") {
					lista.setText(lista.getText() + textField.getText());
					sum = sum + Double.parseDouble(textField.getText());
					textField.setText(null);
					commaPresent=false;
					nextClear=true;
					numbersAfterComma=0;
				}
				sum = Math.round(sum*100.0)/100.0;
				textField.setText("SUMA: " + (String.valueOf(sum)));
				panelNoweZakupy.setVisible(true);
				panelKlawiatura.setVisible(false);
			}
			if(e.getSource() == bNew) {
				panelNoweZakupy.setVisible(false);
				panelKlawiatura.setVisible(true);
				textField.setText("");
				lista.setText("");
			}
			
		}
		
	}
	
}
