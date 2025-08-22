# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        curr = head
        prev = None
        checker = set()
        while curr:
            if curr.val in checker:
                prev.next=curr.next
            else:
                checker.add(curr.val)
                prev=curr
            curr=curr.next
        return head