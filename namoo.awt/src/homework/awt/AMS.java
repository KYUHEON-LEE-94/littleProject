package homework.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AMS {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		//신규계좌 등록
		inventory.open(new Account("1111-2222","이규헌",1234,10000000));
		inventory.open(new MinusAccount("1111-3333","김규헌",134,2321, 12340));
		inventory.open(new Account("2222-5678","이규헌",124,2340000));
		inventory.open(new MinusAccount("1111-234","김규헌",123, 231,345000));
		inventory.open(new MinusAccount("1111-234","조규헌",123, 231,345000));
		inventory.open(new MinusAccount("1111-234","박규헌",123, 231,345000));
		
		Frame frame = new Frame("연습용 프레임");
		TrainPanel panel = new TrainPanel(inventory);
		
		panel.init();
		frame.add(panel);
		frame.setSize(600,500);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0); // 0이 정상 종료	
			}
			
			
		});
		
		
		
		panel.eventRegist();
		
	}

}
