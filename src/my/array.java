package my;

public class array {
	public static void display (int [][] cal) {
		//row
	for (int i = 0; i < cal.length; i++) {
			//col
		for (int j = 0; j < cal[0].length; j++) {
			System.out.printf("\t",cal[i][j]);
			}
		System.out.println();
		}
	}
	
    public static int findIndexEIC(String arr[], String t) 
    { 
        if (arr == null) return -1; 
        for (int i = 0; i < arr.length;i++) {
            if (t.equalsIgnoreCase(arr[i]))  return i; 
        }
        return -1; 
    } 
}
