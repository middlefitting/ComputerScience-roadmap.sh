## 무엇인가

트리는 연결된 비순환 그래프를 의미합니다.

스패닝 트리는 그래프의 모든 꼭지점에 도달할 수 있는 트리를 말합니다.

스패닝 트리의 정의는 트리의 부분 집합이라고 생각할 수 있습니다. 그래프의 모든 정점에 도달하지 않아도 트리이지만, 스패닝 트리는 아니기 때문입니다.

## General Properties of Spanning Tree

스패닝 트리의 일반적인 속성들은 다음과 같습니다.

- 연결 그래프는 하나 이상의 스패닝 트리를 가집니다.
- 연결 그래프의 모든 스패닝 트리들의 간선과 노드의 개수는 동일합니다.
- 스패닝 그래프의 간선을 제거하면 비연결 그래프가 됩니다.
- 스패닝 트리에 간선을 추가하는 순간 사이클을 가지게 됩니다.

## Mathematical Properties of Spanning Tree

스패닝 트리의 수학적인 속성들은 다음과 같습니다.

- 완전 그래프의 노드의 개수가 N일때 스패닝 트리를 최대 N ** (N - 2) 개 보유할 수 있습니다.
- 스패닝 트리는 N - 1개의 간선을 가집니다.
- 완전 그래프의 간선 수가 E일때 최대 E - N + 1개의 간선을 제거하면 스패닝 트리를 구축할 수 있습니다.

## Minimum spanning Tree

최소 스패닝 트리는 가중치가 가장 작은 스패닝 트리를 의미합니다. 가중치가 존재하는 무향 그래프에서 탐색을 할 수 있습니다.

## Minimum spanning Tree Algorithm

대표적인 알고리즘들은 다음과 같습니다.

- Kruskal's Algorithm
- Prim's Algorithm

## Application of Spanning Tree

스패닝 트리는 다음과 같은 애플리케이션에서 사용될 수 있습니다.

- Civil Network Planning
- Computer Network Routing Protocol
- Cluster Analysis
