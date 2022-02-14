package string;

public class GenerateAllSubString {

	public static void main(String[] args) {
		/*
		String  str = "abcd";
		int n = str.length();
		System.out.println(n);
		
		for(int si = 0; si<n;si++) {
			for(int ei = si+1; ei<=n;ei++) {
				System.out.println(str.substring(si,ei));
			}
		}
*/
		
String str = "kartik";
int n = str.length();
for(int si = 0 ; si< n; si++) {
	for(int ei = si+1; ei<=n ; ei++) {
		System.out.println(str.substring(si,ei));
	}
}


	}

}
