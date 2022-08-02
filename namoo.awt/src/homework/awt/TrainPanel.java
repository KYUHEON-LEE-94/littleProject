package homework.awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;





/*
 * 사용자 정의 윈도우
 */
public class TrainPanel extends Panel {
	Button btn1, btn2, btn3, btn4, btn5, btn6, regit;
	Label label1, label2, label3, label4, label5, regitL;
	Choice choice;
	TextField tf, tf2, tf3, tf4;
	TextArea ta;

	GridBagLayout gridbagLayout = new GridBagLayout();
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	Panel menupanel;

	int horizon = gridBagConstraints.HORIZONTAL;
	int west = gridBagConstraints.WEST;

	// Account 클래스 사용
	Accounts[] accounts;
	Inventory inven = new Inventory();

	public TrainPanel(Inventory inven) {
		this.inven = inven;

		menupanel = new Panel();
		menupanel.setSize(100, 100);
		menupanel.setVisible(false);

		btn1 = new Button("조회");
		btn2 = new Button("삭제");
		btn3 = new Button("검색");
		btn4 = new Button("신규 등록");
		btn5 = new Button("전체 조회");


		label1 = new Label("계좌종류");
		label2 = new Label("계좌번호");
		label3 = new Label("예금주명");
		label4 = new Label("비밀번호");
		label5 = new Label("대출금액");
		regitL = new Label("전체 계좌");

		choice = new Choice();

		accounts = Accounts.values();
		for (Accounts accounts : accounts) {
			choice.add(accounts.getName());
		}

		tf = new TextField(10);
		tf2 = new TextField(10);
		tf3 = new TextField(10);
		tf4 = new TextField(10);

		ta = new TextArea(10, 20);
	}

	// 화면 배치
	public void init() {
		setLayout(gridbagLayout);
		//전체 계좌
		add(menupanel, 0, 0, 2, 1, 0.1, 0.1, horizon);
		add(regitL, 1, 0, 1, 1, 0.1, 0.1, horizon);
		add(btn5, 2, 0, 1, 1, 0.1, 0.1, gridBagConstraints.NONE);

		// 계좌생성
		add(ta, 0, 7, 4, 1, 0.1, 0.1, horizon);

		// 계좌종류
		add(label1, 1, 1, 1, 0.1, 0.1, west);
		add(choice, 1, 1, 1, 1, 0.1, 0.1, gridBagConstraints.BOTH);

		// 계좌 번호
		add(label2, 2, 1, 1, 0.1, 0.1, west);
		add(tf, 1, 2, 1, 1, 0.2, 0.1, horizon);
		add(btn1, 2, 2, 1, 1, 0.1, 0.1, horizon);
		add(btn2, 3, 2, 1, 1, 0.1, 0.1, horizon);

		// 예금주명
		add(label3, 3, 1, 1, 0.1, 0.1, west);
		add(tf2, 1, 3, 1, 1, 0.2, 0.1, horizon);
		add(btn3, 2, 3, 1, 1, 0.1, 0.1, horizon);

		// 비밀번호
		add(label4, 4, 1, 1, 0.1, 0.1, west);
		add(tf3, 1, 4, 1, 1, 0.2, 0.1, horizon);
		
		// 대출금액
		add(label5, 5, 1, 1, 0.1, 0.1, west);
		add(tf4, 1, 5, 1, 1, 0.2, 0.1, horizon);
		add(btn4, 2, 5, 1, 1, 0.1, 0.1, horizon);


	}

	public void appendTextBase() {
		ta.append("\t 계좌번호 \t " + "\t 예금주명 \t" + "잔액 \t \t" + "부채 \t");
		ta.append("\n =============================================================================== \n");
	}

	public void appendText(String message) {
		ta.append(message + "\n");
	}

	public void appendText(Collection<Account> message) {
		ta.append(message + "\n");
	}

	public void appendText(Account message) {
		ta.append(message + "\n");
	}

	public void appendList(Collection<Account> list) {
		if (list.isEmpty()) {
			appendText("조회된 목록이 없습니다.");
		}
		Iterator<Account> it = list.iterator();
		while (it.hasNext()) {
			Account account = (Account) it.next();
			appendText(account.toString());
		}

	}
	
	public void appendUnable() {
		ta.setText("");
	}

	// gridbaglayout을 이용한 컴포넌트 배치 메서드
	private void add(Component component, int gridx, int gridy, int gridwidth, int gridheight, double weightx,
			double weighty, int fill) {

		gridBagConstraints.gridx = gridx;
		gridBagConstraints.gridy = gridy;
		gridBagConstraints.gridwidth = gridwidth;
		gridBagConstraints.gridheight = gridheight;

		gridBagConstraints.weightx = weightx;
		gridBagConstraints.weighty = weighty;
		gridBagConstraints.fill = fill;
		gridbagLayout.setConstraints(component, gridBagConstraints);
		gridBagConstraints.insets = new Insets(2, 5, 2, 5);

		add(component);

	}

	// Label을 위한 배치 메서드
	private void add(Component component, int gridy, int gridwidth, int gridheight, double weightx, double weighty,
			int fill) {

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = gridy;
		gridBagConstraints.gridwidth = gridwidth;
		gridBagConstraints.gridheight = gridheight;

		gridBagConstraints.weightx = weightx;
		gridBagConstraints.weighty = weighty;
		gridBagConstraints.fill = fill;
		gridbagLayout.setConstraints(component, gridBagConstraints);
		gridBagConstraints.insets = new Insets(2, 10, 2, 10);

		add(component);

	}

//	이벤트 소스에 이벤트리스너 등록
	public void eventRegist() {

		class actionEventListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				Object eventSource = e.getSource();

				// 계좌번호 조회
				if (eventSource == btn1) {
					Account findAccount = inven.find(tf.getText());
					if (findAccount != null) {
						ta.setText("");
						appendTextBase();
						appendText("\n" + findAccount);
					} else {
						appendUnable();
					}

				}

				//계좌번호 삭제
				if (eventSource == btn2) {
					Account removeAccount = inven.remove(tf.getText());
					if (removeAccount != null) {
						appendTextBase();
						appendText(removeAccount.getAccountNum() + "계좌가 삭제되었습니다.");
					}
				} else {
					appendUnable();
				}

				//예금주 명으로 검색
				if (eventSource == btn3) {			
					List<Account> findname = inven.search(tf2.getText());
					
					if (findname != null) {
						appendTextBase();
						appendText(findname);
						
					}
				} else {
					appendUnable();
				}
				
				if (eventSource == btn4) {
					int intTf3 = Integer.parseInt(tf3.getText());
					int intTf4 = Integer.parseInt(tf4.getText());
					
					if(tf.getText() != null && tf2.getText() != null && tf3.getText() != null) {
						inven.open(new Account(tf.getText(),tf2.getText(), intTf3));
						appendText("계좌 생성 완료");
					}else if (tf.getText() != null && tf2.getText() != null && tf3.getText() != null && tf4.getText()  != null) {
						inven.open(new MinusAccount(tf.getText(),tf2.getText(), intTf3, 0, intTf4));
						
					}else {
						appendUnable();
					}
					
				}
				
				
	
				//전체 계좌 조회
				if(eventSource == btn5) {
					appendTextBase();
					appendList(inven.getAccounts());
					
				}

				
				

			}

		}//

		actionEventListener actionEL = new actionEventListener();
		btn1.addActionListener(actionEL);
		btn2.addActionListener(actionEL);
		btn3.addActionListener(actionEL);
		btn4.addActionListener(actionEL);
		btn5.addActionListener(actionEL);

	}

}
