package ex02;

public class FriendsInfo extends Friend {
   String address;
   String emailAddress;
   String phoneNum;
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
      while(true) {
         if(address.matches("^[ㄱ-ㅎ가-힣0-9]*$")) {
            break;
         }
         else {
            System.out.println("주소는 한국어와 숫자만 가능합니다.");
            System.out.println("주소를 다시입력하여주세요");
            System.out.print("주소 :");
            address = sc.next();
         }
      }
         this.address = address;
   }
   public String getEmailAddress() {
      return emailAddress;
   }
   public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
      while(true) {
         if(emailAddress.matches("([a-zA-Z_0-9.+-]+)@[a-zA-Z_0-9.+-]+|.[a-zA-Z_0-9.+-]")) {
            break;
         }
         else {
            System.out.println("이메일주소 형식이 잘못되었습니다");
            System.out.println("이메일주소를 다시입력하여주세요");
            System.out.print("이메일주소 :");
            emailAddress = sc.next();
         }
      }
   }
   public String getPhoneNum() {
      return phoneNum;
   }
   public void setPhoneNum(String phoneNum) {
      this.phoneNum = phoneNum;
      while(true) {
         if(phoneNum.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$")) {
            break;
         }
         else {
            System.out.println("핸드폰번호 형식이 잘못되었습니다.");
            System.out.println("핸드폰번호를 다시 입력하여주세요");
            System.out.print("번호 :");
            phoneNum = sc.next();
         }
      }
   }
   
}
