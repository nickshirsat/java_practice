package exceptions;

public class CustomException {
	void validateAge(int age) throws NotEligibleToVote{
		if( age<18 ) {
			throw new NotEligibleToVote("Invalid Age for Voting");
		} else {
			System.out.println("Valid age for voting!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException c = new CustomException();
		try {			
			c.validateAge(17);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
