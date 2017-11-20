import javax.management.InvalidAttributeValueException;

//Thinking of a clock, and calculate the angel between hour hand and the min hand



public class ClockAngel {
	
	public int calculateAng(int hour, int min) throws InvalidAttributeValueException{
		if ((hour < 0 || hour > 12) || (min <0 || min > 60)){
			throw new InvalidAttributeValueException("invalid value");
		}
		
		int minAng = min/60 * 60/360;
		int hourAng = (hour + min/60) * 360/12;
		
		int diff = Math.abs(minAng - hourAng );
				
		
		return diff;
	}

	public static void main(String[] args) throws InvalidAttributeValueException {
		ClockAngel ca = new ClockAngel();
		System.out.println(ca.calculateAng(3, 0));
		
		// TODO Auto-generated method stub

	}

}
