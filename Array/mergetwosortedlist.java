class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        return mergeTwoLists(list1, list2, null);
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2, ListNode newList) {
        if(list1.val <= list2.val){
            newList = list1;
            newList.next = mergeTwoLists(list1.next, list2);
        }
        else{
            newList = list2;
            newList.next = mergeTwoLists(list1, list2.next);
        } 
        return newList;
    
    }
}