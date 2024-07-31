/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result= new  ListNode();
        ListNode head = result;

        while(list1!=null && list2!=null){

           if(list1.val>list2.val){  
                head.next=list2; 
                list2=list2.next;           
            }
            else{    
                head.next=list1; 
                list1=list1.next;   
            }
            head = head.next;
        }
        
        head.next=(list2!=null)?list2:list1;
                

        return result.next;
    }
}