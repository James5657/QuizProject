import java.lang.Math;

public class Questions {

        private Questions() {} // No instantiation required.

                                        // Order:  Question   [x][0]
                                        //         A, B, C, D   [x][1-4]
                                        //         Correct Answer   [x][5]
        private static String[][] questions =
                    {
                        {
                            "Which of the following data types are NOT primitive?",
                            "Integer", "String", "Boolean", "Double",
                            "String"
                        },
                        {
                            "How much memory is allocated for booleans?",
                            "1 bit", "32 bits", "64 bits", "128 bits",
                            "1 bit"
                        },
                        {
                            "How much memory is allocated for integers?",
                            "1 bit", "32 bits", "64 bits", "128 bits",
                            "32 bits"
                        },
                        {
                            "How much memory is allocated for doubles?",
                            "1 bit", "32 bits", "64 bits", "128 bits",
                            "64 bits"
                        },
                        {
                            "What protection modifier is used for instance variables in Java?",
                            "Public", "Instance", "Protected", "Private",
                            "Private"
                        },
                        {
                            "What is a correct syntax to output \"Hello!\" in Java?",
                            "print(\"Hello!\");", "System.out.println(\"Hello!\");", "console.log(\"Hello!\");", "cout << \"Hello!\";",
                            "System.out.println(\"Hello!\");"
                        },
                        {
                            "What is a correct syntax for comments in Java?",
                            "// Comment", "System.comment(\"Comment\");", "# Comment", "/* Comment */",
                            "// Comment"
                        },
                        {
                            "Which data type is used to store text in Java",
                            "Char", "Integer", "String", "Boolean",
                            "String"
                        },
                        {
                            "Which string methods gets the length of the string in Java?", 
                            "len()", "size()", "getLength()", "length()",
                            "length()"
                        },
                        {
                            "Which of the following is NOT an arthmetic operator in Java?",
                            "+", "-", "*", "**",
                            "**"
                        },
                        {
                            "Which of the following is NOT a logical operator in Java?",
                            "!=", "&&", "||", "!",
                            "!="
                        },
                        {
                            "Which string method returns the string in all uppercase in Java?",
                            "Up()", "Uppercase()", "toUpperCase()", "toUppercase()",
                            "toUpperCase()"
                        },
                        {
                            "Which string method returns the string in all lowercase in Java?",
                            "Lower()", "Lowercase()", "toLowerCase()", "toLowercase()",
                            "toLowerCase()"
                        },
                        {
                            "Which syntax correctly casts an int to a double in Java?",
                            "(int) 12.5", "int(12.5)", "truncate(12.5, 1)", "removeDecimal(12.5)",
                            "(int) 12.5"
                        },
                        {
                            "How do you square a number in Java?",
                            "Math.exponent(3, 2)", "3 ** 2", "3 ^ 2", "Math.pow(3, 2)",
                            "Math.pow(3, 2)"
                        },
                        {
                            "What does this statement return: \"cat\".compareTo(\"cat\")",
                            "0", "true", "-1", "false",
                            "0"
                        },
                        {
                            "What does this statement return: \"dog\".compareTo(\"cat\")",
                            "0", "1", "true", "false",
                            "1"
                        }
                    };

        public static String[] chooseQuestion(int lastQuestion) {
            int index;

            do {
                index = (int) (Math.random() * questions.length);
            } while (index == lastQuestion); // Make sure we don't get the same question twice in a row.
            
            GamePanel.setQuestionNumber(index);
            return questions[index];
        }
        
        public static String getCorrectAnswerChoice(String[] answer) {
            for (int i = 1; i <= 4; i++) {
                if (answer[i] == answer[5]) {
                    if (i == 1) {
                        return "A";
                    } else if (i == 2) {
                        return "B";
                    } else if (i == 3) {
                        return "C";
                    } else if (i == 4) {
                        return "D";
                    }
                }
            }
            return "Unknown";
        }
        // public static void main(String[] args) {
        //     int index;
        //     do {
        //         System.out.println((int) (Math.random() * questions.length));
        //     } while (true);
        // }
}
