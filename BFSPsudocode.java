Data: color[V], prev[V], d[V]
BFS(G)
{
    for each vertex u ∈ V - {s}
    {
        color[u] = WHITE;
        prev[u] = NIL;
        d[u] = inf;
    }
    color[s] = GRAY;
    d[s] = 0; prev[s] = NIL;
    Q = empty;
    ENQUEUE(Q, s);
    while (Q is not empty)
    {
        u = DEQUEUE(Q);
        for each v ∈ adj[u]
        {
            if (color[v] == WHITE)
            {
                color[v] = GRAY;
                d[v] = d[u] + 1;
                prev[v] = u;
                ENQUEUE(Q, v);
            }
        }
        color[u] = BLACK;
    }
}
Print-Path(G, s, v)
{
    if (v = s)
        print(s);
    else if (prev[v] == NIL)
        print("No path");
    else
    {
        Print-Path(G, s, prev[v]);
        print(v);
    }
}
