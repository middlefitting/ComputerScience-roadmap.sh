## 개요

A* 알고리즘은 주어진 출발점에서 목표까지 가는 최단 경로를 찾아내는 그래프 탐색 알고리즘입니다.

순위값이 높은 정점부터 방문한다는 점에서 다익스트라 알고리즘과 알고리즘과 유사한데요, 
이동거리와 더불어, 남은 거리를 계산하는 휴리스틱 추정값을 사용한다는 점에서 차이가 있습니다.

따라서 다익스트라 알고리즘의 확장된 형태라고 볼 수 있습니다.

비용을 판별하는 함수는 f(x) = g(x) + h(x)의 형태로 이루어지게 됩니다.


## Pseudo code

~~~

pq.enqueue(start_node, g(start_node) + h(start_node))       // 우선순위 큐에 시작 노드를 삽입한다.

while pq is not empty       // 우선순위 큐가 비어있지 않은 동안
    node = pq.dequeue       // 우선순위 큐에서 pop한다.

    if node == goal_node    // 만약 해당 노드가 목표 노드이면 반복문을 빠져나온다.
        break

    for next_node in (next_node_begin...next_node_end)       // 해당 노드에서 이동할 수 있는 다음 노드들을 보는 동안
        pq.enqueue(next_node, g(node) + cost + h(next_node)) // 우선순위 큐에 다음 노드를 삽입한다.

return goal_node_dist       // 시작 노드에서 목표 노드까지의 거리를 출력한다.

~~~

## 코드 구현

## 코드 예시

백준 온라인저지 B11112 Eight puzzle 문제를 해결한 A* 예제입니다.

- [Example](B11112.java)
