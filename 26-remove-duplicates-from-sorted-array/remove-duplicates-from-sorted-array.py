class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        unique = 0
        k=1

        for i in range (1, len(nums)):
            if(nums[i] == nums[unique]):
                i=i+1

            else:
                nums[unique+1]=nums[i]
                unique = unique+1
                k=k+1



        return (k)