## 개요
LinkedList는 키와 다음 노드를 가리키는 포인터로 구성된 노드로 구성됩니다. 

## LinkedList의 강점
포인터를 통해 순차적인 자료구조의 특성을 가질 수 있습니다. 

## 배열과의 비교
포인터를 통해 순차적인 자료구조의 특성을 가지지만 메모리 주소가 연속되어 있을 필요가 없다는 점에서 배열과 차이를 가집니다.

단점으로는 리스트는 요소의 접근이 O(n) 복잡도로 이루어진다는 것이고

장점으로는 메모리 주소가 연속되어 있을 필요가 없기 때문에 요소의 추가 / 삭제 과정은 O(1) 복잡도로 이루어집니다. 하지만 추가를 위해 접근하는 시간은 평균 O(N) 복잡도로 수행됩니다.

## API
- PushFont: O(1)
- Key TopFront: O(1)
- PopFront: O(1)
- PushBack: O(1), Tail 포인터가 없으면 O(N)
- Key TopBack: O(1), Tail 포인터가 없으면 O(N)
- PopBack: O(1), Tail 포인터가 없거나 이전 노드의 포인터가 없다면(SinglyLinkedList) O(N)
- Empty(): O(1)
- Find(Key): O(N)
- Erase(Key): O(N)
- AddBefore(Node, Key): O(N)
- AddAfter(Node, Key): O(1)
