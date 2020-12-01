package alone_java_CH09_EX;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect();
	}
	
	
}
