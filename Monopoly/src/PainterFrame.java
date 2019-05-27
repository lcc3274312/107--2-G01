
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
	private JPanel p1;//嚙踝蕭嚙瑾嚙罷嚙締嚙踝蕭嚙罷嚙締嚙踝蕭嚙�
	private JPanel p2;//嚙踝蕭嚙瘠嚙踝蕭嚙踝蕭嚙踝蕭
	private JPanel shapeType;
	
	private CardLayout cards;//嚙緬嚙踝蕭嚙踝蕭嚙踝蕭C嚙踝蕭嚙踝蕭嚙踝蕭


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
		
		p2.setBackground(Color.RED);
		shapeType.add(p2,"cards2");
		
		add(shapeType,BorderLayout.CENTER);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 嚙諛動莎蕭嚙談迎蕭嚙踝蕭k Stub
		if(e.getSource()==start)
		{
			cards.show(shapeType, "cards2");;
		}
	}
}