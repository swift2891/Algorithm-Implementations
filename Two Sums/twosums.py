
def twoSum(nums, target):
    res=[]
    i=0
    j=0
    print("Len"+str(len(nums)))
    for  i in range(0,len(nums)-1):
        for j in range(i+1,len(nums)):
            if nums[i]+nums[j]==target:
                res.append(i)
                res.append(j)
                print(str(i)+" "+str(j))
                return res

twoSum([2,  7, 11, 15], 9)