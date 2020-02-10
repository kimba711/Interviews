class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        return self.util(nums, 0, len(nums)-1, target, 0)
        
    def util(self, nums, lBound, rBound, target, pivotIdx):
        if rBound == lBound:
            n = lBound
        else:
            n = int((rBound - lBound) / 2)

        if nums[n] == target:
            return n+pivotIdx

        if rBound > lBound:
            if n> 0 and nums[n-1] > nums[n]:
                nums = nums[n:] + nums[0:n]
                pivotIdx = n
            elif nums[n+1] < nums[n]: #found pivot
                nums = nums[n+1:] + nums[0:n+1]
                pivotIdx = n+1
            
            if target < nums[n]: #go left
                return self.util(nums, lBound, n-1, target, pivotIdx)
            else:
                return self.util(nums, n+1, rBound, target, pivotIdx)

        else: 
            return -1
