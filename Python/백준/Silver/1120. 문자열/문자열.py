def same_length(a, b):
    result = 0
    for i in range(len(a)):
        if a[i] != b[i]:
            result += 1
    return result

def diff_length(a, b):
    min_diff = 50
    for i in range(len(b) - len(a) + 1):
        diff = 0
        for j in range(len(a)):
            if a[j] != b[i + j]:
                diff += 1

        if diff < min_diff:
            min_diff = diff

    return min_diff


if __name__ == '__main__':
    a, b = input().split()
    if len(a) == len(b):
        print(same_length(a, b))
    else:
        if a in b:
            print(0)
        else:
            result = diff_length(a, b)
            print(result)