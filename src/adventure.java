import java.util.Scanner;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	System.out.println("Hey what's ur name?");
String input = key.nextLine();
System.out.println("Hi "+input);
input= key.nextLine();
System.out.println("You were dropped in a room with 5 keys and 5 doors. Every door within has a child that is about to be dropped to a furnace. You can only choose one key. Which key can you choose?"); input = key.nextLine();
input= key.nextLine();

if (input.equals("1st key")) {
	System.out.println("Congratulations you have rescued one kid!(the rest are dead)");
}
if(input.equals("2nd key")) {
	System.out.println("Congratulations you have rescued one kid!(the rest are dead)");}
if(input.equals("3rd key")) {
	System.out.println("Congratulations you have rescued one kid!(the rest are dead)");
	
}
if(input.equals("4th key")) {
System.out.println("Congratulations you have rescued one kid!(the rest are dead)");

}
if(input.equals("5th key")) {
	System.out.println("Congratulations you have rescued one kid!(the rest are dead)");

}
if(input.equals("melt all keys to save all children")){
System.out.println("You melt all the keys to rescue the children but since that is not how it works, you killed all five children instead of saving one.");
}}}
