price = int(input())
a = int(input())
num = 0
for i in range(a):
    b, c = map(int, input().split())
    num += (b*c)

if(num == price):
    print("Yes")
else :
    print("No")