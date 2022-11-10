public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int indx = 0; indx < searchString.length(); indx++) {
            if (character.equalsIgnoreCase(searchString.substring(indx, indx = 1))) {
                count++;
            }
        }
        return count;
        /* to be implemented */
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String newString = "";
        for (int indx = origString.length() - 1; indx >= 0; indx--) {
            newString += origString.substring(indx, indx + 1);
        }
        return newString;
        /* to be implemented */
    }
}
