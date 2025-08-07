DFS(G)
{
    for each vertex u in V
    {
        color[u] = WHITE;
        prev[u] = NIL;
        f[u] = inf;
        d[u] = inf;
    }
    time = 0;
    for each vertex u in V
    {
        if (color[u] == WHITE)
            DFS_Visit(u);
    }
}
DFS_Visit(u)
{
    color[u] = GREY;
    time = time + 1;
    d[u] = time;
    for each v in Adj[u]
    {
        if (color[v] == WHITE)
        {
            prev[v] = u;
            DFS_Visit(v);
        }
        else
        {
            // cycle exists
        }
    }
    
    color[u] = BLACK;
    time = time + 1;
    f[u] = time;
}
