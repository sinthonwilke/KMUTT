n = int(input())
numbers_list = [int(input()) for i in range(n)]
numbers_list.sort()
print(", ".join(str(i) for i in numbers_list))