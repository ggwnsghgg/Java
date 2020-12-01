package sec01.exam06;

public class Button {
	
	OnClickListener listener;					// �������̽� Ÿ�� �ʵ�
		
	// �Ű������� ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	
	void touch() {
		listener.onClick();						// ���� ��ü�� onClick() �޼ҵ� ȣ��
	}

	// ��ø �������̽�
	static interface OnClickListener {
		void onClick();
	}
}
