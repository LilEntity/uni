package virtual_mindspace;

public class TimeConverter {

	static String s = "08:20:40PM";

	static String convert(String s) {
        if (s.charAt(8) == 'A')
        {
            if (s.charAt(0) == '1' && s.charAt(1) == '2')
            {
                return "00" + s.substring(2,8);
            }
            else
            {
                return s.substring(0,8);
            }
        }
        else
        {
            if (s.substring(0,2) == "12")
            {
                return s.substring(0,8);
            }
            else
            {
                int hour = Integer.parseInt(s.substring(0,2));
                return (12 + hour) + s.substring(2,8);
            }
        }
	}

	public static void main(String[] args) {

		System.out.println(convert(s));

	}

}
