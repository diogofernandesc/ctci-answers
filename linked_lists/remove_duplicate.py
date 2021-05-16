def remove_duplicates(node):
    seen = set()
    previous_node = None
    while (node is not None):
        if node.data in seen:
            previous_node.next = node.next
        else:
            seen.add(node.data)
            previous_node = node

        node = node.next


# No buffer solution
def remove_duplicates(head):
    current_node = head
    while (current_node is not None):
        runner_node = current_node.next
        while(runner_node is not None):
            if (current_node.data == runner_node.data):
                runner_node.next = runner_node.next.next
            else:
                runner_node = runner_node.next
        current_node = current_node.next