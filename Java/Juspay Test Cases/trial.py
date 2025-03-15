def dfs(node, edge, visited, parent, max_cycle_sum):
    """
    Perform DFS to detect cycles and calculate the largest sum of nodes in a cycle.
    """
    stack = []  # Stack for DFS traversal
    path = []   # Keeps track of the current path
    current_node = node

    while True:
        if current_node != -1:
            if visited[current_node] == 2:  # Node already fully processed
                if not stack:  # No more nodes to process
                    break
                current_node = stack.pop()
                continue

            if visited[current_node] == 1:  # Cycle detected
                cycle_sum = 0
                while path and path[-1] != current_node:
                    cycle_sum += path.pop()
                cycle_sum += sum(path)  # Add remaining cycle nodes
                max_cycle_sum[0] = max(max_cycle_sum[0], cycle_sum)
                if not stack:
                    break
                current_node = stack.pop()
                continue

            # Mark node as visited (part of current path)
            visited[current_node] = 1
            stack.append(current_node)
            path.append(current_node)

            # Move to the next node
            parent[edge[current_node]] = current_node
            current_node = edge[current_node]

        else:  # Backtrack
            if not stack:
                break
            node = stack.pop()
            path.pop()
            visited[node] = 2  # Fully processed node


def largest_sum_cycle(N, edge):
    """
    Find the largest sum cycle in the graph defined by `edge`.
    """
    visited = [0] * N  # Visited status for each node
    parent = [-1] * N  # Tracks parent nodes for cycle detection
    max_cycle_sum = [-1]  # To keep track of the maximum cycle sum

    for i in range(N):
        if visited[i] == 0:  # Unvisited node
            dfs(i, edge, visited, parent, max_cycle_sum)

    return max_cycle_sum[0]


# Input handling
N = int(input())
edge = list(map(int, input().split()))

# Output the result
print(largest_sum_cycle(N, edge))
