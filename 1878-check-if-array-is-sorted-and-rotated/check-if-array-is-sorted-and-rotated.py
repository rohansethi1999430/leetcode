class Solution:
    def check(self, nums: List[int]) -> bool:
        drop = 0

        if(nums[0]<nums[len(nums)-1]):
            drop += 1

        for i in range (len(nums)-1):
            if (nums[i] > nums[i+1]):
                drop += 1
            if (drop>1):
                return False
        return True
        