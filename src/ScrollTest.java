import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ScrollTest extends JFrame {
	JTextArea txt =  new JTextArea();
	JScrollPane scroll = new JScrollPane(txt);
	JButton botaoDescer = new JButton("descer");
	private JButton botaoColocarDados = new JButton("encher");
	
	
	public ScrollTest() {
		setLayout(new BorderLayout());
		add(scroll, BorderLayout.CENTER);
		add(botaoDescer, BorderLayout.SOUTH);
		add(botaoColocarDados, BorderLayout.NORTH);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		txt.setEditable(false);
		
		botaoDescer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txt.setCaretPosition(txt.getDocument().getLength());;
				System.out.println("descendo");
				
			}
		});;
		botaoColocarDados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i < 2; i++){
					txt.append(""+i);
					txt.append("\n");
				}		
				System.out.println("colocando dados");
			}
		});;
	}
	
	public static void main(String[] args) {
		new ScrollTest();
	}
}
