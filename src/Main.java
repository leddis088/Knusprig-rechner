import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Knusprig-Rechner! This is a little calculator that is able to prozess up to seven number inputs and can do the most basic mathematic operations like +/-/*///squarerute/power");
        String operator;
        String endTheLoop;
        String binaryYesNo;
        String binary;
        int numberCount;
        double exponent;
        double result = 0;
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        double number5 = 0;
        double number6 = 0;
        double number7 = 0;
        boolean end;
        do {
            operator = JOptionPane.showInputDialog(null, "Enter your mathematic operator (\"+\", \"-\", \"*\", \"/\", \"wurzel\", \"potenz\")");
            if (operator.equalsIgnoreCase("wurzel")) {
                number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number you want to calculate the squarerute of!"));
                result = Calculate.wurzel(number1);
            } else if (operator.equalsIgnoreCase("potenz")) {
                number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Plese enter the basis"));
                exponent = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the exponent"));
                result = Calculate.power(number1, exponent);
            } else if (operator.equalsIgnoreCase("+")) {
                do {
                    numberCount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you want to prozess?"));
                    if (numberCount < 2 || numberCount > 7) {
                        JOptionPane.showMessageDialog(null, "Please enter a number between 2 and 7!");
                    }
                }while (numberCount < 2 || numberCount > 7);
                 for (double counter = numberCount; counter > 0; counter --) {
                     if (counter == 1) {
                         number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     } else if (counter == 2) {
                         number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     } else if (counter == 3) {
                         number3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     } else if (counter == 4) {
                         number4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     } else if (counter == 5) {
                         number5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     } else if (counter == 6) {
                         number6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     } else if (counter == 7){
                         number7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                     }
                 }
                 result = Calculate.addition(number1, number2, number3, number4, number5, number6, number7);
            } else if (operator.equalsIgnoreCase("-")) {
                do {
                    numberCount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you want to prozess?"));
                    if (numberCount < 2 || numberCount > 7) {
                        JOptionPane.showMessageDialog(null, "Please enter a number between 2 and 7!");
                    }
                }while (numberCount < 2 || numberCount > 7);
                for (double counter = numberCount; counter > 0; counter--) {
                    if (counter == 1) {
                        number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 2) {
                        number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 3) {
                        number3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 4) {
                        number4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 5) {
                        number5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 6) {
                        number6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 7){
                        number7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    }
                }
                System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7);
                result = Calculate.subtraction(number1, number2, number3, number4, number5, number6, number7);
            } else if (operator.equalsIgnoreCase("/")) {
                do {
                    numberCount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you want to prozess?"));
                    if (numberCount < 2 || numberCount > 7) {
                        JOptionPane.showMessageDialog(null, "Please enter a number between 2 and 7!");
                    }
                }while (numberCount < 2 || numberCount > 7);
                for (double counter = numberCount; counter > 0; counter--) {
                    if (counter == 1) {
                        number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 2) {
                        number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 3) {
                        number3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 4) {
                        number4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 5) {
                        number5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 6) {
                        number6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 7){
                        number7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    }
                }
              result = Calculate.division(number1, number2, number3, number4, number5,number6, number7);
            } else if (operator.equalsIgnoreCase("*")) {
                do {
                    numberCount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you want to prozess?"));
                    if (numberCount < 2 || numberCount > 7) {
                        JOptionPane.showMessageDialog(null, "Please enter a number between 2 and 7!");
                    }
                }while (numberCount < 2 || numberCount > 7);
                for (double counter = numberCount; counter > 0; counter--) {
                    if (counter == 1) {
                        number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 2) {
                        number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 3) {
                        number3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 4) {
                        number4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 5) {
                        number5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 6) {
                        number6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    } else if (counter == 7) {
                        number7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter one number"));
                    }
                }
               result = Calculate.multiplication(number1, number2, number3, number4, number5, number6, number7);
            }
            binaryYesNo = JOptionPane.showInputDialog(null, "Do you want to transform the result of the Knusprig-Rechner in a binary number?");
            if (binaryYesNo.equalsIgnoreCase("ja")) {
                binary = Calculate.binary((int)result);
                JOptionPane.showMessageDialog(null, "The Knusprig-Rechner came to the result that the result of your equation is: " +result + "\n The binary form of this is :" + binary);
            } else if (binaryYesNo.equalsIgnoreCase("yes")) {
                binary = Calculate.binary((int)result);
                JOptionPane.showMessageDialog(null, "The Knusprig-Rechner came to the result that the result of your equation is: " +result + "\n The binary form of this is :" + binary);
            } else {
                JOptionPane.showMessageDialog(null, "The Knusprig-Rechner came to the result that the result of your equation is: " + result);
            }
            endTheLoop = JOptionPane.showInputDialog(null, "Do you want to calculate another number?");
            if (endTheLoop.equalsIgnoreCase("ja")) {
                end = false;
            } else if (endTheLoop.equalsIgnoreCase("yes")) {
                end = false;
            } else {
                end = true;
                JOptionPane.showMessageDialog(null, "I hope you had a nice experiance with the Knusprig-Rechner");
            }
        }while (!end);
    }
}