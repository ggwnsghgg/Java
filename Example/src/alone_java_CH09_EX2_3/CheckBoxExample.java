package alone_java_CH09_EX2_3;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("����� �����մϴ�.");
			}
		});
				
			checkBox.select();
		}
	}