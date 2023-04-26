package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("OK버튼을 클릭했습니다.");
			}
			
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
//		---------------------------------------------------------------------
		
		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
			
		}
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
		
//		---------------------------------------------------------------------
		
		Button btnDouble = new Button();
		class DoubleListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("버튼을 더블클릭했습니다.");
			}
			
		}
		
		btnDouble.setClickListener(new DoubleListener());
		btnDouble.click();
		
		
	}

}
