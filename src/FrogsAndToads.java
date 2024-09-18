public class FrogsAndToads {
    public static void main(String[] args) {
        getHint("18 05", "18 05");
        testCases();
    }

    public static String getHint(String hiddenStr, String guessStr){
        String frogsAndToadsCount = "0F0T";

        //insert logic here
        int fCount = 0;
        int tCount = 0;

        for(int i=0; i<hiddenStr.length(); i++){
            char charHidden = hiddenStr.charAt(i);
            for(int j=0; j<guessStr.length(); j++){
                char charGuess = guessStr.charAt(j);

                if(i==j && charHidden == charGuess){
                    fCount ++;
                    break;
                }

                else if (charHidden == charGuess) {
                    tCount++;
                }
            }

        }
        frogsAndToadsCount = Integer.toString(fCount) +"F" + Integer.toString(tCount) + "T";
        return frogsAndToadsCount;

    }

    public static boolean assertHint(int caseNumber, String results, String expected){
        boolean correct = results.equals(expected);
        System.out.println("Expected value =" + " Actual value =" + results);
        System.out.println("Case" + caseNumber + "=" + (correct? "passed" : "failed"));
        return results.equals(expected);
    }

    public static void testCases(){
        String case1 = getHint("1807", "7810");
        assertHint(1, case1, "1F3T");

        String case2 = getHint("1807", "2805");
        assertHint(2, case2, "2F0T");

        String case3 = getHint("1807", "9807");
        assertHint(3, case3, "3F0T");

        String case4 = getHint("1807", "1807");
        assertHint(4, case4, "4F0T");

        //insert additional test cases
        String case5 = getHint("1805", " ");
        assertHint(5, case5, "0F0T");

        String case51 = getHint("18 05", "18 05");
        assertHint(51, case51, "5F0T");

        String case6 = getHint("1805", "+-$&");
        assertHint(6, case6, "0F0T");

        String case7 = getHint("1234abc", "1234");
        assertHint(7, case7, "4F0T");

        String case8 = getHint("1234abc", "1234abc");
        assertHint(8, case8, "7F0T");

        String case9 = getHint("1234a bc", "1234 abc");
        assertHint(9, case9, "6F2T");

        String case10 = getHint("1234", "[1234]");
        assertHint(10, case10, "0F4T");

        String case11 = getHint("1234", "{1234}");
        assertHint(11, case11, "0F4T");

        String case12 = getHint("1234", "\1234");
        assertHint(12, case12, "0F1T");

        String case13 = getHint("1234", "\\1234");
        assertHint(13, case13, "0F4T");

        String case14 = getHint("1234", "\1\2&3/4");
        assertHint(14, case14, "0F2T");

        String case15 = getHint("1234", "/1234");
        assertHint(15, case15, "0F4T");

        String case16 = getHint("1234", "123null4");
        assertHint(16, case16, "4F0T");

        String case18 = getHint("1234", "[]");
        assertHint(18, case18, "0F0T");

        String case19 = getHint("1234", "1-2-3-4");
        assertHint(19, case19, "1F3T");

        String case20 = getHint("1234", "1.2.3.4");
        assertHint(20, case20, "1F3T");

        String case21 = getHint("1234", "@1234");
        assertHint(21, case21, "0F4T");

        String case22 = getHint("1234", "1:2:3:4");
        assertHint(22, case22, "1F3T");

        String case23 = getHint("1234", ";12;3;4");
        assertHint(23, case23, "0F4T");

        String case24 = getHint("1234", "1!2!34");
        assertHint(24, case24, "1F3T");

        String case25 = getHint("1234", "1+23+4");
        assertHint(25, case25, "1F3T");

        String case17 = getHint("1234", null);
        assertHint(17, case17, "4F0T");
//        // null here causes exception at run time. I could fix it by checking param hiddenStr and guessStr, not being null
//        //However, I m leave it here to demonstrate as Qa finding bug, then report it, talk to Dev etc.

    }


}

