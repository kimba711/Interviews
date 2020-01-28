class Solution(object):
    def isBipartite(self, graph):
        """
        :type graph: List[List[int]]
        :rtype: bool
        """
        #visited = [False] * len(graph) 
        colors = [-1] * len(graph) 
        
        
        for i in xrange(0, len(graph)):
            if colors[i] == -1:
                queue = [i]
                colors[i] = 1
                #visited[startNode] = 1

                while queue:
                    node = queue.pop(0)
                    for j in graph[node]:
                        if colors[j] == -1: #not visited
                            queue.append(j)
                            #visited[i] = True
                            colors[j] = int( not colors[node])

                        else:
                            if colors[node] == colors[j]:
                                return False
                   
        return True
