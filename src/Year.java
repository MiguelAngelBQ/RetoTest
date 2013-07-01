import java.util.ArrayList;
import java.util.Date;

public class Year {

	public static String getLowerDate(String date) {
		// TODO Auto-generated method stub

		String[] array = date.split("/");
		for (int i = 0; i < array.length - 1; i++) {
			if (Integer.parseInt(array[i]) < Integer.parseInt(array[i + 1])) {
				String aux = array[i];
				array[i] = array[i + 1];
				array[i + 1] = aux;
			}
		}

		if (Integer.parseInt(array[0]) < Integer.parseInt(array[1])) {
			String aux = array[0];
			array[0] = array[1];
			array[1] = aux;
		}

		if (!(Integer.parseInt(array[0]) <= 31)) {
			String aux = array[0];
			array[0] = array[1];
			array[1] = array[2];
			array[2] = aux;
		}

		date = "";
		if (!(array[array.length - 1].length() == 4)) {
			int aux = Integer.parseInt(array[array.length - 1]);
			aux += 2000;
			array[array.length - 1] = "" + aux;
		}

		if (Integer.parseInt(array[0]) > 31
				|| Integer.parseInt(array[1]) > 12
				|| (Integer.parseInt(array[2]) > 2099 || Integer
						.parseInt(array[2]) < 2000)) {
			return "Error";
		}

		int day = Integer.parseInt(array[0]);
		int month = Integer.parseInt(array[1]);

		if (month < 7) {
			if (month % 2 == 0 && day > 30)
				return "Error";
			else if (month == 2 && day == 29)
				return "Error";
		} else if (month % 2 != 0 && day > 30)
			return "Error";

		for (int i = 0; i < array.length; i++) {
			date += (array[i]);
			// if (i % 2 != 0)
			date += ("/");
		}

		date = date.substring(0, date.length() - 1);

		return date;
	}

	// Integer a, b, c;
	// String[] array = date.split("/");
	//
	// a = Integer.parseInt(array[0]);
	// b = Integer.parseInt(array[1]) - 1;
	// c = Integer.parseInt(array[2]);
	//
	// ArrayList<Date> validDates = new ArrayList<Date>();
	//
	// try {
	// validDates.add(new Date(a, b, c));
	// } catch (IllegalArgumentException e) {
	// }
	//
	// try {
	// validDates.add(new Date(a, c, b));
	// } catch (IllegalArgumentException e) {
	// }
	//
	// try {
	// validDates.add(new Date(b, a, c));
	// } catch (IllegalArgumentException e) {
	// }
	//
	// try {
	// validDates.add(new Date(b, c, a));
	// } catch (IllegalArgumentException e) {
	// }
	//
	// try {
	// validDates.add(new Date(c, a, b));
	// } catch (IllegalArgumentException e) {
	// }
	//
	// try {
	// validDates.add(new Date(c, b, a));
	// } catch (IllegalArgumentException e) {
	// }
	//
	// if(validDates.size() == 0)
	// return "Error";
	//
	// long[] datesInLongFormat = new long[validDates.size()];
	//
	// for (int i=0; i<validDates.size(); i++)
	// datesInLongFormat[i] = validDates.get(i).getTime();
	//
	// long minDate = Long.MAX_VALUE;
	// int minDateIndex = 0;
	//
	// for (int i=0; i<datesInLongFormat.length; i++)
	// if (datesInLongFormat[i] < minDate) {
	// minDate = datesInLongFormat[i];
	// minDateIndex = i;
	// }
	//
	// String resultDate;
	// resultDate = Integer.toString(validDates.get(minDateIndex).getDate());
	// resultDate = Integer.toString(validDates.get(minDateIndex).getMonth());
	// resultDate = Integer.toString(validDates.get(minDateIndex).getYear());
	//
	// return resultDate;

}
