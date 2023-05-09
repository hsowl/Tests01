package ex04;

import ex04.Button.ClickListener;

public class Example {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.SetClickListener(new ClickListener() {
			@Override
			public void onClick() {
		System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.SetClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});
		btnCancel.click();
		
		
	}

}
