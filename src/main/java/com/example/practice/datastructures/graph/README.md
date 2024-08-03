## 개요

그래프는 꼭지점과 모서리로 구성된 비선형 자료구조를 말합니다.

## 종류

### Finite Graph

정점의 수와 간선의 수가 제한되어 있는 그래프를 말합니다.

### Infinite Graph 

정점과 간선이 무한한 그래프를 말합니다.

### Trivial Graph

한개의 정점과 간선이 존재하지 않는 것을 말합니다.

### Simple Graph

각 노드 또는 꼭지점 쌍에 간선이 하나만 존재하는 것을 말합니다. 두 요소간의 일대일 상호작용이 이루어지게 됩니다.

### Null Graph

여러개의 정점이 존재하지만 간선이 존재하지 않는 것을 말합니다.

### Complete Graph

Simple Graph 의 일종으로 모든 정점의 조합이 간선으로 연결된 것을 의미합니다.

### Pseudo Graph

자체 루프가 포함된 그래프를 의미합니다.

### Regular Graph

각 꼭지점의 차수가 동일한 것을 의미합니다.

### Weighted Graph

간선에 가중치가 존재하는 것을 의미합니다.

### Directed Graph

간선에 방향이 존재하는 것을 의미합니다.

### Undirected Graph

간선에 방향이 존재하지 않는 것을 의미합니다.

### Connected Graph

모든 정점이 결국 연결되어 있는 것을 말합니다.

### Disconnected Graph

모든 정점이 하나로 연결되어 있지 않은 그래프를 말합니다.

### Cyclic Graph

하나 이상의 사이클이 존재하면 순환 그래프입니다.

### Acyclic Graph

사이클이 존재하지 않는 그래프를 의미합니다.

### Directed Acyclic Graph

방향이 존재하지만 사이클이 없는 경우를 의미합니다.

### Subgraph

부모 그래프의 부분적인 그래프 세트입니다.

## Terminologies of Graphs in Data Structures

- Edge : 정점을 연결하는 선을 의미합니다.
- Adjacent: 두 정점이 Edge로 연결되면 인접하다고 말합니다.
- Vertex's outgoing edges: 정점에서 나가는 간선입니다.
- Vertex's incoming edges: 정점으로 들어오는 간선입니다.
- Degree: 특정 정점에서 발생하는 간선의 수입니다.
- The out-degree of a vertex: 나가는 간선의 수입니다. 
- A vertex with an in-degree: 들어오는 간선의 수입니다.
- A vertex with an in-degree of zero: 나가는 간선의 수가 0인 것을 의미합니다.
- An isolated vertex is a zero-degree: 연결된 간선이 없는 정점을 의미합니다.
- Path: 간선을 통해 갈 수 있는 연결된 경로입니다.
- simple path: Path가 유일한 경우를 의미합니다.
- strongly connected : 양방향으로 연결되었을 경우를 의미합니다.
- Weakly connected: 양방향으로 연결되지 않은 방향 그래프입니다.
- Tree: connected forest입니다. 트리를 대표하는 것은 root입니다.
- Spanning subgraph: spanning Tree로 알려져 있습니다.
- Connected component: 비연결 그래프의 가장 많이 연결된 하위 그래프입니다.
- Bridge: 그래프를 끊게 되는 간선입니다.
- Forest: 사이클이 없는 그래프입니다.

## Representation of Graphs in Data Structures

그래프는 개체 간의 관계를 나타내는 것에 사용됩니다. 가장 많이 사용되는 그래프 표현은 Adjacency matrix, Adjacency list 입니다.

### Adjacency Matrix

순차적인 표현을 의미합니다. 연결되었으면 1, 연결되지 않았으면 0으로 표현합니다. 가중치가 존재한다면 1대신 다른 숫자를 사용합니다.

~~~

ex1) 비방향 그래프
    A  B  C
A [[0, 1, 0],
B  [1, 0, 1],
C  [0, 1, 0]]

ex2) 방향 그래프
    A  B  C
A [[0, 0, 0],
B  [1, 0, 1],
C  [1, 0, 0]]

ex2) 가중치 방향 그래프
    A  B  C
A [[0, 0, 0],
B  [2, 0, 4],
C  [1, 0, 0]]

~~~

### Adjacency List

링크드 리스트를 사용해 그래프를 표현하는 것을 의미합니다.

## Operations on Graphs in Data Structures
- Creating graphs
- Insert vertex
- Delete vertex
- Insert edge
- Delete edge

## Graph Traversal Algorithm 
- BFS
- DFS
