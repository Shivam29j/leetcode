class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode temp= new ListNode(0);
       ListNode tail=temp;
       while(list1!=null && list2!=null){
           if(list1.val<=list2.val){
               ListNode node = new ListNode(list1.val);
               tail.next = node;
               list1=list1.next;
           }
           else{
               ListNode node = new ListNode(list2.val);
               tail.next = node;
               list2=list2.next;
           }
           tail=tail.next;
       }
       if(list1==null){
           tail.next=list2;
       }
       else{
           tail.next=list1;
       }
      return temp.next;
    }
}