class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        return self.util(nums, 0, len(nums)-1, target)
        
    def util(self, nums, lBound, rBound, target):
        n = (rBound - lBound) / 2
        if nums[n] == target:
            return n
        
        if n> 0 and nums[n-1] > nums[n]: #found pivot
            nums = nums[n:] + nums[0:n]
            
        if target < nums[n]: #go left
            return self.util(nums, lBound, n-1, target)
        else:
            return self.util(nums, n+1, rBound, target)
