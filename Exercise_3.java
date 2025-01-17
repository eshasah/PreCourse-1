import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data = d;
            this.next = null; 
        } 
    } 
    

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        if(list == null){
            list = new LinkedList();
            list.head = new Node(data);
            return list;
        }

        Node curr = list.head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = new Node(data);
        return list;        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        if(list != null){
            Node curr = list.head;
            while(curr.next != null){
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}