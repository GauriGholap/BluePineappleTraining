#Write a program for Permutation of input Array and return all possible permutations.
from itertools import permutations
lis = []
n = int(input('Enter number of elements : '))

for x in range(0, n):
    ele = int(input())
    lis.append(ele)
    
print(lis)

perm = permutations(lis)

print('permutations are : ')

for i in list(perm):
    print(i)

    

#Enter number of elements : 3
# 2
# 4
# 1
# [2, 4, 1]
# permutations are : 
# (2, 4, 1)
# (2, 1, 4)
# (4, 2, 1)
# (4, 1, 2)
# (1, 2, 4)
# (1, 4, 2)