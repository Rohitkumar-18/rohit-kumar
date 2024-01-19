sum=0,2
sum1=0,3
a=[1,2,3,6,9,8,12,15]
i=0
while i<len(a):
        if a[i]%2==0:
            sum+=a[i]
            i+=1
            continue
        if a[i]%3==0:
            sum1+=a[i]
            i+=1
            continue
        i+=1
        print(sum,sum1)    