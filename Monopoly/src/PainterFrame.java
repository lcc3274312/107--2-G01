
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
	private JPanel p1;//做一開始的開始選單
	private JPanel p2;//做遊戲頁面
	private JPanel shapeType;
	
	private CardLayout cards;//從選單跳到遊戲頁面


	public PainterFrame() {
		super();
		
		p1 = new JPanel();
		p2 = new JPanel();
		shapeType = new JPanel();
		
		cards = new CardLayout();
		
		shapeType.setLayout(cards);
		
		
		start = new JButton("start");
		start.addActionListener(this);
		p1.add(start);
		p1.setBackground(Color.GREEN);
		
		shapeType.add(p1,"cards1");
		
		p2.setBackground(Color.BLACK);
		shapeType.add(p2,"cards2");
		
		add(shapeType,BorderLayout.CENTER);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
		if(e.getSource()==start)
		{
			cards.show(shapeType, "cards2");;
		}
	}
}