## 개요

빅 오메가 표기법은 가장 최고의 시간복잡도를 기준으로 하는 점근적 표기법입니다.

빅오랑 비교하자면 다음과 같은 예제에서 구분할 수 있습니다.

~~~
if x > 0:
    // O(1)
else if x < 0:
    // O(logn)
else:
    // O(n**2)
~~~

다음의 경우 빅 오 표기법으로는 O(n**2) 이지만

빅 오메가 표기법으로는 Ω(1)이 결과가 될 것입니다.
