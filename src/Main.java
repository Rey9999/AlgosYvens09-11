public class Main {
    // Pour cet exo,  je voudrais 2 solutions différentes svp :
    // Exo: Sortir le premier caractère non répétées d'un string : "aaaabbbcdddefffghhdcccccc"
    // Ici la réponse: est c
                public static String okay(String str) {

                String result = "";
                for (int i = 0; i < str.length(); i++) {
                    if (i > 0 && i < str.length()-1 ) {
                        char firstLetter = str.charAt(i-1);
                        char secondLetter = str.charAt(i);
                        char thirdLetter = str.charAt(i+1);
                        if (firstLetter != secondLetter && secondLetter != thirdLetter) {
                            result = String.valueOf(secondLetter);
                            break;
                        }
                    }
                }
                return result;
            }
            public static void main(String[] args) {
                String test = "aaaabbbcdddefffghhdcccccchhhfdrsfgzgfz";
                System.out.println(okay(test));
            }
        }











