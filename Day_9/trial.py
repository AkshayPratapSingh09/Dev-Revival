
def isCyclicBFS(src,visited, adj):
    parent = {}

    parent[src] = -1
    visited[src] = 1
    q = []
    q.append(src)

    while len(q)>0:
        front = q[-1]
        q.pop()

        for neighbour in adj[front]:
            if visited[neighbour] == 1 and neighbour != parent[front]:
                return True
            
            elif visited[neighbour] != 1:
                q.append(neighbour)
                visited[neighbour] = 1
                parent[neighbour] = front
    return False

def cycleDetection(edges, n, m):
    adj = {}
    for i in range(m):
        u = edges[i][0]
        v = edges[i][1]

        if u in adj:
            adj[u].append(v)
        else:
            adj[u]=[v]

        if v in adj:
            adj[v].append(v)
        else:
            adj[v]=[u]
    
    visited = {}
    for i in range(n):
        if i not in visited:
            ans = isCyclicBFS(i,visited,adj)

            if ans == 1:
                return "YES"

    return "No"
    
    pass