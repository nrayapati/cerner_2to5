# cerner_2^5_2018
# Python3 Program to print BFS traversal 
# from a given source vertex. BFS(int s) 
# traverses vertices reachable from s. 
from collections import defaultdict 
class Graph: 
	def __init__(self): 
		self.graph = defaultdict(list) 
	def addEdge(self,u,v): 
		self.graph[u].append(v) 
	def BFS(self, s): 
		visited = [False] * (len(self.graph)) 
		queue = [] 
		queue.append(s) 
		visited[s] = True
		while queue: 
			s = queue.pop(0) 
			print (s, end = " ") 
			for i in self.graph[s]: 
				if visited[i] == False: 
					queue.append(i) 
					visited[i] = True
g = Graph() 
g.addEdge(0, 1) 
g.addEdge(0, 2) 
g.addEdge(1, 2) 
g.addEdge(2, 0) 
g.addEdge(2, 3) 
g.addEdge(3, 3) 

print ("Following is Breadth First Traversal"
				" (starting from vertex 2)") 
g.BFS(2)
# Following is Breadth First Traversal (starting from vertex 2)
# 2 0 3 1 