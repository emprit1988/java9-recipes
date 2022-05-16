package chapter3.stringProblems;

public class SimpleStringCases {
    public static void main(String[] args) {
        String someSpacedString =" This is some spaced string ";
        System.out.println(someSpacedString);
        System.out.println(someSpacedString.trim());

        String one = "Hello";
        String two = "Teams";

        System.out.println(one.concat(" ").concat(two));
        StringBuffer sb = new StringBuffer();
        sb.append(one).append(" ").append(two);
        System.out.printf(sb.toString());
        System.out.println();

        String fileName = "teamMembers.xlsx";
        System.out.println(fileName.endsWith("xlsx"));
    }
}
