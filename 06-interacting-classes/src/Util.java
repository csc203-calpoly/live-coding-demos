public class Util {

 	//example of a static method can be used anywhere
 	//to compare numbers
 	public static int whichBigger(int a, int b) {
 		if (a > b) {
 			return a;
 		}
 		return b;
 	}
 
	//another example of a static method can be used anywhere
	//to compare two Kaiju sizes
	public static int whichBigger(Kaiju a, Kaiju b) {
		if (a.getSize() > b.getSize()) {
 			return a.getSize();
 		}
 		return b.getSize();
 	}

}
