N = int(input())
while N>0:
  a,b  = map(int , input().split())
  Remainder = a % b
  print(Remainder)
  N = N -1
  
