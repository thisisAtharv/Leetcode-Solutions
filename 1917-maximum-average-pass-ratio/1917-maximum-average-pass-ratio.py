import heapq
class Solution:
    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        def gain(p,t):
            return (p+1)/(t+1) - p/t
        
        maxheap=[(-gain(p,t),p,t)for p,t in classes]
        heapq.heapify(maxheap)

        for _ in range(extraStudents):
            g,p,t = heapq.heappop(maxheap)
            p,t = p+1,t+1
            heapq.heappush(maxheap,(-gain(p,t),p,t))
        
        total = sum(p/t for _,p,t in maxheap)
        return total/len(classes)