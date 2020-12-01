package alone_java_CH09_EX;


public class BackgroundChangeListener implements CheckBox.OnSelectListener{

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
		
	}
}
