class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        unique = nums[0]
        k=1

        for i in range (1,len(nums)):
            if nums[i] == unique:
                nums[i]=9999999
            else:
                unique = nums[i]
                k = k+1

        nums.sort()

        return (k)