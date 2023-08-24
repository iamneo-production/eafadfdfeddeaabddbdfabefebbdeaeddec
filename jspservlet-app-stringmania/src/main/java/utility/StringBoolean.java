package utility;

public class StringBoolean {
//	Enter the code here....
private String input1;
    private String input2;

    // Getters and setters for input1 and input2

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    // Method to check if string1 contains string2
    public boolean containsString() {
        return input1.contains(input2);
    }

    // Method to check if the string starts with the given letter
    public boolean startsWithLetter(String letter) {
        return input1.startsWith(letter);
    }

    // Method to check if the string ends with the given letter
    public boolean endsWithLetter(String letter) {
        return input1.endsWith(letter);
    }

    // Method to check if two strings are equal
    public boolean areStringsEqual() {
        return input1.equals(input2);
    }

    // Method to check if two strings are equal ignoring case
    public boolean areStringsEqualIgnoreCase() {
        return input1.equalsIgnoreCase(input2);
    }
}
