//1.Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//	countYZ("fez day") → 2
//	countYZ("day fez") → 2
//	countYZ("day fyyyz") → 2

package Olci2;

public class Count {

static int countXZ(String res) {
        res = res.toLowerCase();
        int count = 0;

 for (int i = 0; i < res.length(); i++) {
            if(res.charAt(i) == 'y' || res.charAt(i) == 'z') {
                if(i < res.length() - 1 && ! Character.isLetter(res.charAt(i + 1))) {
                    count ++;
                }
                else if(i == res.length() - 1) {
                    count ++;
                }
            }
        }
        return count;
    } 

 

    public static void main(String[] args) {

    	System.out.println(countXZ("day fyyyz"));
}
    }
 

