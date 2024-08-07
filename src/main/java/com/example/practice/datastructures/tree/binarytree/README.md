## 개요

Binary Tree는 부모 노드가 최대 2개의 자식 노드를 가지는 트리를 말합니다.

        1
       / \
      2   3
     / \ /
    4  5 6

## 종류

이진트리의 특성을 활용한 다양한 트리가 존재하는데요, 다음과 같은 친구들이 있습니다.

### Full Binary Tree

포화 이진트리는 모든 부모 노드가 0개 혹은 2개의 자식을 가지는 것을 말합니다.

        1
       / \
      2   3
         / \
        4   5

### Perfect Binary Tree

완벽 이진트리는 리프 노드를 제외한 모든 노드가 2개의 자식을 가지고, 리프 노드는 모두 같은 레벨에 있는 것을 말합니다.
        1
       / \
      2   3
     / \ / \
    4  5 6  7

### Complete Binary Tree

완전 이진트리는 트리의 높이에 해당하는 레벨을 제외하고는 모든 노드가 채워져 있고, 리프노드들의 왼쪽이 채워진 형태를 말합니다.

        1
       / \
      2   3
     / \ /
    4  5 6

### Degenerate or Pathological Tree

왼쪽이나 오른쪽에 단일 자식이 있는 트리입니다.


        1
       /
      2
       \
        3

### Skewed Binary Tree

한쪽 방향에 치우친 트리입니다.

        1
       /
      2
     /
    3

### Balanced Binary Tree

        1
       / \
      2   3
     / \ /
    4  5 6

모든 노드에 대해 왼쪽, 오른쪽 서브 트리의 높이 차이가 0, 1인 형태를 말합니다.

## Code
- [BinaryTree Traversal Order](BinaryTree.java)
