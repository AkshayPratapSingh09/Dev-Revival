def find_divisible_pair(T, queries):
    results = []
    for l, r in queries:
        if 2 * l <= r:
            results.append((l, 2 * l))
        else:
            results.append(-1)
    return results

if __name__ == '__main__':

    T = int(input())
    queries = [tuple(map(int, input().split())) for _ in range(T)]
    results = find_divisible_pair(T, queries)

    for result in results:
        if result == -1:
            print(-1)
        else:
            print(result[0], result[1])