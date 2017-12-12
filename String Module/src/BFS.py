from collections import defaultdict
class Graph:
 
    # Constructor
    def __init__(self):
        self.graph = defaultdict(list)
 
    def addEdge(self,u,v):
        self.graph[u].append(v)
 
    def BFS(self, s):
        visited = [False]*(len(self.graph))
        queue = []
        queue.append(s)
        visited[s] = True
        while queue:
            s = queue.pop(0)
            print s,
            for i in self.graph[s]:
                if visited[i] == False:
                    queue.append(i)
                    visited[i] = True

g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 3)
g.addEdge(1, 4)
g.addEdge(1, 5)
g.addEdge(2, 4)
g.addEdge(2, 5)
g.addEdge(4, 2)
g.addEdge(5, 1)
g.BFS(0)