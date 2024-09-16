// ==============****FILL IN YOUR INFO HERE****======================
//Name:
//Eagle ID:
// ==============****FILL IN YOUR INFO HERE****======================
// ===============================================
// CSCI 3230A Data Structures
// Fall 2024
// Instructor: M Arif Rahman, Ph.D.
// THA-1; Closed-Resources, Individual Test.

// ====================== Requirements ========================
// Implement "delete" operation by “key” and “position” for a Singly Link List 
// which was illustrated in the lecture slides "Lecture4-LinearDS.pdf".
// That is, you need to translate the following two algorithms to Java code for the Deletion in Linked List.
	
/*
I.  Algorithm DeleteByKey ( LinkeList list , Key value )
	1.	Search the key for its first occurrence in the list
	2.	Now, any of the 3 conditions can be there: 
	•	Case 1: The key is found at the head 
			1.	In this case, change the head of the node to the next node of the current head.  
			2.	Free the memory of the replaced head node.
	•	Case 2: The key is found in the middle or last, except at the head 
			1.	In this case, find the previous node of the node to be deleted. 
			2.	Change the next the previous node to the next node of the current node.
			3.	Free the memory of the replaced node.
	•	Case 3: The key is not found in the list 
			1.	In this case, no operation needs to be done. 


II. Algorithm DeleteAtPosition ( LinkeList list , Position index )
	1.	Traverse the list by counting the index of the nodes
	2.	For each index, match the index to be same as position
	3.	Now, any of the 3 conditions can be there: 
	•	Case 1: The position is 0, the head is to be deleted 
			1.	In this case, change the head of the node to the next node of current head. 
			2.	Free the memory of replaced head node.
	•	Case 2: The position is in the middle or last, except at head 
			1.	In this case, find previous node of the node to be deleted. 
			2.	Change the next of previous node to the next node of current node.
			3.	Free the memory of replaced node.
	•	Case 3: The position is not found in the list 
			1.	In this case, no operation needs to be done. Just show a message stating that.
*/

// Please use appropriate data types and access modifiers
// to demonstrate the correctness of your code.
//
// Inputs are already provided in the driver Main() function. 
// Your output will look as follows if your implementation is correct:
// ------------------------------------
// LinkedList: 1 2 3 4 5 6 7 8 

// 1 found and deleted
// LinkedList: 2 3 4 5 6 7 8 

// 4 found and deleted
// LinkedList: 2 3 5 6 7 8 

// 10 is not within the list!!
// LinkedList: 2 3 5 6 7 8 

// 0 position element deleted
// LinkedList: 3 5 6 7 8 

// 2 position element deleted
// LinkedList: 3 5 7 8 

// 3 position element deleted
// LinkedList: 3 5 7 

// 7 position does not exist!!
// LinkedList: 3 5 7

// ======================= Note ======================== 
//  1. DO NOT DELETE ANY COMMENT OR ANY CODE!!!
//  2. You will only need to fill the blocks with comment "COMPLETE THIS BLOCK".
//  3. Modify the file name to "LinkedList.java" before compiling and submitting it.
//  4. DON’T FORGET TO INPUT YOUR NAME AND EAGLE ID AT THE TOP! OTHERWISE, YOU GET NO 
//      POINTS!!
// ===============================================



import java.io.*;

public class LinkedList {

    Node head; // head reference of the linked list
    // Need a Linked list Node.
    // Static so main() can access it
    static class Node {
        int data;
        Node next;
		
        // Constructor, only stores Integers
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node first with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // Make the new node as head if the list was empty
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else insert the new_node at last
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
        return list;
    }

    // Method to traverse/print the list
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList and print
        while (currNode != null) {

            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
		
        System.out.println();
        System.out.println();
    }


    // Method to delete a node in the LinkedList by KEY
    public static LinkedList deleteByKey(LinkedList list, int key)

    //COMPLETE THIS BLOCK
    //BY IMPLEMENTING THIS FUNCTION
    {

        // CASE 1:
        // If head node itself holds the key to be deleted


        // CASE 2:
        // If the key is somewhere other than at head
       

 
        // CASE 3: The key is not present
       


        // return the List
        return list;
    }


    // Method to delete a node by POSITION
    public static LinkedList deleteAtPosition(LinkedList list, int index)
    {

        //COMPLETE THIS BLOCK
        //BY IMPLEMENTING THIS FUNCTION


        // CASE 1:
        // If index is 0, then head node itself is to be deleted


        // CASE 2:
        // If the index is greater than 0 but less than the size of LinkedList
 
        // CASE 3: The index is greater than the size of the LinkedList
 
        // return the List
        return list;
    }


    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print
        printList(list);

        // Delete node
        deleteByKey(list, 1);
        printList(list); // Print to verify

        deleteByKey(list, 4);
        printList(list); // Print to verify

        deleteByKey(list, 10);
        printList(list); // Print to verify


        deleteAtPosition(list, 0);
        printList(list); // Print to verify

        deleteAtPosition(list, 2);
        printList(list); // Print to verify

        deleteAtPosition(list, 3);
        printList(list); // Print to verify

        deleteAtPosition(list, 7);
        printList(list); // Print to verify
    }

}
