def urlify(phrase, true_length):
    phrase = list(phrase)
    print(phrase)
    spaces = 0
    for i in range(0, true_length):
        if phrase[i] == " ":
            spaces += 1

    diff = spaces * 2
    for j in range(true_length-1, 0, -1):
        if diff == 0:
            break

        if phrase[j] == " ":
            phrase[j+diff] = '0'
            j -= 1
            phrase[j+diff] = '2'
            j -= 1
            phrase[j+diff] = '%'
            diff -= 2

        else:
            phrase[j + diff] = phrase[j]

    print(phrase)


urlify("Mr John Smith    ", 13)