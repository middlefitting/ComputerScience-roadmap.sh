## 개요
Hash Table은 CRUD 연산에서 평균 O(1) 시간복잡도를 기대하는 비선형 자료구조입니다.
자료의 인덱스로 활용되는 키와 키에 해당하는 값을 통해 마치 배열에서 인덱스 접근하듯 자료를 접근하는 것입니다.
해시 자료구조는 기본적으로 배열로 구성되며 인덱스는 키를 전달하였을때 해시함수를 통해 반환받게 됩니다.

## 해시 충돌
해시 자료구조는 필연적으로 해시 충돌이라는 상황이 발생하게 됩니다. 해시 충돌이란 키에 대한 해시함수의 결과가 동일한 상황을 말합니다.
이를 해결하는 방법은 대표적으로 Chaining과 Open Addressing 방식으로 해결할 수 있습니다

### Chainging
Chaining은 배열의 각 요소를 연결리스트로 구현하는 방식을 말합니다.
반환된 인덱스에 대해 해당하는 연결리스트를 순회하며 일치하는 키를 찾아 해당하는 값을 반환하는 것입니다.

### Open Addressing
Open Addressing이란 해당하는 인덱스에 이미 다른 요소가 들어있을 경우 특정한 알고리즘을 활용하여 일정 규칙 떨어져 있는 인덱스에 요소를 추가하는 방식을 말합니다.
대표적으로 Linear Probing 방식은 오른쪽으로 1칸씩 값을 이동시키며, 인접한 배열칸을 확인해서 캐시 적중률이 높고 구현이 쉽다는 장점이 있습니다. 단점으로는 클러스터링(군집)이 생겨 성능에 부정적인 영향을 줄 수 있습니다.
다음으로는 Double Hashing 방식이 있습니다. 충돌이 발생했을때 이동할 칸의 수를 새로운 해시 함수로 계산하는 방식을 말하며, 클러스터링을 회피할 수 있다는 장점이 있지만 캐시 적중률은 낮다는 단점이 있습니다.

## 해시 테이블 크기
Load factor라고 말하며 원소의 개수 / 테이블의 크기, 보통 Chainging에서는 1 이하로, Open Addressing 0.75 이하로 설정합니다.

## 해시 함수
해시 함수의 계산은 기본적으로 내부적으로 서로수의 소수로 구현되었을떄 성능을 보장할 수 있습니다. 그렇지 않으면 해시 충돌이 빈번하게 발생하기 때문입니다.
이는 Load Factor도 소수로 제공하는 것이 좋다는 것을 의미합니다.

~~~java
int hash(int key, int prime, int LoadFactor) {
    return (key * prime) % tableSize;
}

간단한 예시로는 이렇게 해시함수가 구현되어 있을때 LoadFactor와 내부적으로 사용하는 prime이 서로수인 소수여야 모든 키에 대해서 최소한의 해시 충돌이 발생하는 것입니다.
