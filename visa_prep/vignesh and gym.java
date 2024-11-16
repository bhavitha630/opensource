x,y,z = map(int,input().split())

if z<x:
    print("B")
elif z<(x+y):
    print("1")
else:
    print("2")
