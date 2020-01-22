class Solution(object):
    def isBipartite(self, graph):
        """
        :type graph: List[List[int]]
        :rtype: bool
        """
        visited = [False] * len(graph) 
        colors = [-1] * len(graph)
        queue = [0] #start node
        colors[0] = 1 
        visited[0] = 1
        
        while queue:

            node = queue.pop(0)
            if not graph[node]: #floating node
                return False
            for i in graph[node]:
                if not visited[i]:
                    queue.append(i)
                    visited[i] = True
                    colors[i] = int( not colors[node])
                    
                else:
                    if colors[node] == colors[i]:
                        return False
                   
        return True
