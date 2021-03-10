def is_unique(word):
    if len(word) > 128:
        return False

    seenSet = set()
    for char in word:
        if char in seenSet:
            return False

        else:
            seenSet.add(char)

    return True
