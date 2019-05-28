
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PainterFrame extends JFrame implements ActionListener{
	private JButton start;
	private JButton stop;
	private JPanel p1;//首頁
	private JPanel p2;//遊戲介面
	private JPanel shapeType;
	
	private CardLayout cards;//分隔兩個所用的指令


	public PainterFrame() {
		super();
		
		p1 = new JPanel(new BorderLayout());
		p2 = new JPanel();
		shapeType = new JPanel();
		
		cards = new CardLayout();
		
		shapeType.setLayout(cards);
		
		
		start = new JButton("start");
		start.addActionListener(this);
		p1.add(start,BorderLayout.SOUTH);
		p1.setBackground(Color.GREEN);
		
		shapeType.add(p1,"cards1");
		
		p2.setBackground(Color.red);
		shapeType.add(p2,"cards2");
		
		add(shapeType,BorderLayout.CENTER);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 
		if(e.getSource()==start)
		{
			cards.show(shapeType, "cards2");;
		}
	}
}
