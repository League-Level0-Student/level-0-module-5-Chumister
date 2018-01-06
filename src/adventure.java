import java.util.Scanner;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	System.out.println("Hey what's ur name?");
String input = key.nextLine();
System.out.println("Hi "+input);
input= key.nextLine();
System.out.println("You were dropped in a room with 5 doors. Which door do you choose?");
input= key.nextLine();

if (input.equals("1st door")) {
	System.out.println("You open the first door where you are dropped in the Underwhere. A place where all people have their games over. A ghost tells you to give up. Do you give up?"); input = key.nextLine();
	if (input.equals("no")) {
		System.out.println("You walk forward and then you reach a purple river. Do you dive in?"); input = key.nextLine();{
		if (input.equals("no")) {
		System.out.println("Game Over YEAHHHh!");
		}
		if (input.equals("yes"));
		System.out.println("You jump into the river. As you swim you start to hear distorted voices of people wanting you to save them. You look down and see hands floating in the bottom of the surface. Do you want to turn back?"); input = key.nextLine();
	if (input.equals("no")) {
		System.out.println("GAME OVER YEAAH!");}
	if (input.equals("yes")) {
		System.out.println("You reach the other side and see a door. Do you want to open it?"); input=key.nextLine();
		if (input.equals("no")) {
	System.out.println("GAME OVER YEAHH!");}
	if (input.equals("yes"));
	System.out.println("You wake up in a hospital, where you are recovering from a coma");
if (input.equals("no")); {
	System.out.println("Game Over");}
{
	
}	
}}}}
if(input.equals("2nd door")) {
	System.out.println("You were dropped in a white room with no way out. GAME OVER YEAAAH!");}
if(input.equals("3rd door")) {
	System.out.println("You fall endlessly through the void of time and space. GAME OVER YEAHH!");
	
}
if(input.equals("4th door")) {
System.out.println("You were dropped into a black void of nothingness. GAME OVER YEAAAH!");

}
if(input.equals("5th door")) {
	System.out.println("You were dropped into a giant venus flytrap where you live for the rest of your life.");

}}}


