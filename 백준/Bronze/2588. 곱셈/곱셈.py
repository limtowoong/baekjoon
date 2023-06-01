a = int(input())
b = int(input())
num = list(map(int,str(a)))
num2 = list(map(int,str(b)))

num[0] *= 100
num[1] *= 10

num2[0] *= 100
num2[1] *= 10

sum=0

add = 0
for i in num :
    add += (num2[2] * i)
print(add)
sum += add
add = 0
for i in num :
    add += (num2[1] * i)
print(int(add/10))
sum += add
add = 0
for i in num :
    add += (num2[0] * i)
print(int(add/100))
sum += add
add = 0
print(sum)