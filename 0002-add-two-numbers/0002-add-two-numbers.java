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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode finalNode = null;
        Integer remainder = 0;
        Integer division = 0;
        Integer total = 0;
       
        List<Integer> firstArray = new ArrayList();
        while(l1 != null || l2  != null || division > 0 )
        {
            
            int firstValue = 0;
            int secondValue = 0;
           
            if(l1 != null){
                firstValue = l1.val;
            }

            if(l2 != null){
               secondValue = l2.val;
            }

            total = firstValue + secondValue + division;

            if(total < 10) {
        
            if(finalNode == null)
            {
               finalNode = new ListNode(total);
            } else {
                ListNode temp = finalNode;
                while(temp != null && temp.next != null)
               {
                   temp = temp.next;
               }
        
                temp.next = new ListNode(total);
            }
             division = 0;
            } 
            else
            {
            remainder = total % 10;
            division  = total / 10;
            if(finalNode == null)
            {
               finalNode = new ListNode(remainder);
            } else {
                ListNode temp = finalNode;
                while(temp != null && temp.next != null)
               {
                   temp = temp.next;
               }
        
                temp.next = new ListNode(remainder);
            }
            }
             if(l1 != null){
                 l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        return finalNode;
    }
}

    
        
        
