 // import java.util.Scanner;
// public class InnerIn {
// public static void main(String[] args) {
//         System.out.println("----------->>> ATM <<-----------");
//         Scanner sc = new Scanner(System.in);
//         int balance = 0;
//         int pin = 0;
//         boolean isPinSet = false; 
//         while (true) {
//             System.out.print("1. Enter PIN  \n2. Add Money  \n3. Withdrawal  \n4. Check BankBalance \n5. Exit \n");
//             System.out.println("---------- CHOOSE ANY ONE ----------");
//             int choose = sc.nextInt();
//             switch (choose) {
//                 case 1: {
//                     System.out.print("Enter PIN: ");
//                     int newPin = sc.nextInt();
//                     System.out.print("Confirm PIN: ");
//                     int confirmPin = sc.nextInt();
//                     if (newPin == confirmPin) {
//                         pin = newPin;
//                         isPinSet = true; 
//                         System.out.println("PIN has been changed successfully.");
//                     } else {
//                         System.out.println("PINs don't match. Please try again.");
//                     }
//                     break;
//                 }
//                 case 2: {
//                     if (!isPinSet) {
//                         System.out.println("Please Enter a PIN before adding money.");
//                         break;
//                     }
//                     System.out.print("Enter Amount to Add: ");
//                     int amount = sc.nextInt();
//                     balance += amount;
//                     System.out.println("Amount added successfully. New balance: " + balance);
//                     break;
//                 }
//                 case 3: {
//                     if (!isPinSet) {
//                         System.out.println("Please Enter a PIN before withdrawing money.");
//                         break;
//                     }
//                     System.out.print("Enter Withdrawal Amount: ");
//                     int withdrawal = sc.nextInt();
//                     if (withdrawal <= balance) {
//                         balance -= withdrawal;
//                         System.out.println("Amount withdrawn successfully. New balance: " + balance);
//                     } else {
//                         System.out.println("Insufficient balance.");
//                     }
//                     break;
//                 }
//                 case 4: {
//                     if (!isPinSet) {
//                         System.out.println("Please Enter a PIN to check your balance.");
//                         break;
//                     }
//                     System.out.println("TOTAL Balance = " + balance);
//                     break;
//                 }
//                 case 5: {
//                     System.out.println("Thank you for using the ATM. Goodbye!");
//                     sc.close();
//                     return;
//                 }
//                 default: {
//                     System.out.println("Please enter a valid input.");
//                 }
//             }
//             System.out.println(); 
//         }
//     }
// }




















                








