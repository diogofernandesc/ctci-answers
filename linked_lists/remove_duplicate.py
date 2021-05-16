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
