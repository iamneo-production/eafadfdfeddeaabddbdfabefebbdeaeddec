package utility;

public class StringMethod {
//	Enter the code here....
private String input;

    

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    
    public String toLowerCase() {
        return input.toLowerCase();
    }

    public String toUpperCase() {
        return input.toUpperCase();
    }

    
    public String findFirstCharacter() {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0));
        }
        return "";
    }

    
    public String getStringLength() {
        return String.valueOf(input.length());
    }

   
    public String trimString() {
        return input.trim();
    }
}
