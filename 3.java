import java.util.*;

public class 3 {
    public static void main(String[] args) {
        try {
			String testMail="first.last@mail.com";
            String[] parts = testMail.Split("@");
			String firstName = "",lastName = "",names="";
			if (parts[0].length > 0){
				names=parts[0];
				if(names.contains(".")){
					firstName = names.split(".")[0];
					lastName = names.split(".")[1];
				}else if(names.contains("_")){
					firstName = names.split("_")[0];
					lastName = names.split("_")[1];
				}else{
					firstName = names;
				}
			}
			System.out.println("First name: "+firstName);
			System.out.println("Last name: "+lastName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}