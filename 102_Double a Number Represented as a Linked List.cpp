class Solution
{
public:
    ListNode *doubleIt(ListNode *head)
    {
        ListNode *curr = head;
        if ((head->val) >= 5)
        {
            ListNode *newnode = new ListNode(1);
            newnode->next = head;
            head = newnode;
        }
        while (curr != nullptr)
        {
            curr->val = (curr->val * 2) % 10 + (curr->next && curr->next->val >= 5);
            curr = curr->next;
        }
        return head;
    }
};
