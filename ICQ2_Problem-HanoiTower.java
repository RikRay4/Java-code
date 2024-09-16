                       // ==============****FILL IN YOUR INFO HERE****======================
//Name:
//Eagle ID:
// ==============****FILL IN YOUR INFO HERE****======================
// ===============================================
// CSCI 3230A Data Structures
// Fall 2024
// Instructor: M Arif Rahman, Ph.D.
//
// ICQ-2; Closed-Resources, Individual Test.
//
// ====================== Requirements ========================
//
// Implement "Tower of Hanoi" as illustrated in the lecture slides "Lecture3-Recursion.pdf".
// That is, you need to translate the following pseudo-code to Java code.
// Additionally, you need to print the move count as well.


	/*
	MoveTower (disk, source, dest, spare):
	if disk == 1 :
		move disk from source to dest
	else
		MoveTower (disk - 1, source, spare, dest)
		move disk from source to dest
		MoveTower (disk - 1, spare, dest, source)
	*/


// Please use appropriate data types and
// also design appropriate output and total number of moves required
// to demonstrate the correctness of your code.
//
// Assume we use characters S, D, T to denote the source, destination, spare (or temporary) towers respectively.
// Your output may look as follows:
// ------------------------------------
// Please enter the number of disks: 3
//move disk from S to D
//move disk from S to T
//move disk from D to T
//move disk from S to D
//move disk from T to S
//move disk from T to D
//move disk from S to D
//Move count: 7
//
// ======================= Note ======================== 
//
//  1. DO NOT DELETE ANY COMMENT!!!
//  2. You will only need to INTRODUCE A COUNTER ‘count’ FOR NUMBER OF MOVES,
//  and fill the blocks with comment "COMPLETE THIS BLOCK".
//  3. Modify the file name to "HanoiTower.java" before compiling and submitting it.
//  4. DON’T FORGET TO INPUT YOUR NAME AND EAGLE ID AT THE TOP! OTHERWISE YOU GET NO 
//      POINTS!!
// ===============================================


import java.util.Scanner;

public class HanoiTower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of disks: ");
        int disk = input.nextInt();

        // call hanoiTower method by passing appropriate inputs
        hanoiTower(disk, 'S', 'D', 'T');

        // print the total number of moves needed by your implementation
		// INTRODUCE the counter 'count' for moves before the following line.
        System.out.println("Move count: "+count);
    }

    public static void hanoiTower(int disk, char source, char dest, char temp) {
        // choose appropriate data type and update "datatype"
        if (disk == 1) {
            // COMPLETE THIS BLOCK

        } else {
            // COMPLETE THIS BLOCK

        }
    }
}
