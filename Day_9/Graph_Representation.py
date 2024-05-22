class Graph:
    def __init__(self):
        self.adj = {}

    def addedge(self,u,v,direct):
        if u in self.adj:
            self.adj[u].append(v)
        else:
            self.adj[u]=[v]

        if direct == 0:

            if v in self.adj:
                self.adj[v].append(u)
            else:
                self.adj[v] = [u] 

    def printAdjList(self):
        for key, value in self.adj.items():
            print(key,"->",value)

x =Graph()
# x.printAdjList()

n = int(input("Enter the no. of node: "))
m = int(input("Enter the no. of edges: "))

for i in range(m):
    a, b = map(int, input().split())
    x.addedge(a,b,0)

x.printAdjList()