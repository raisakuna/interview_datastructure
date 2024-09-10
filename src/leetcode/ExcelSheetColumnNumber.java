package leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            char currentChar = columnTitle.charAt(i);
            int digitValue = currentChar - 'A' + 1;
            
            result = result * 26 + digitValue;
        }
        
        return result;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        
        // Example usage:
        String columnTitle = "zy";
        int columnNumber = solution.titleToNumber(columnTitle);
        
        System.out.println("Column Number for " + columnTitle + ": " + columnNumber);
    }
}
