## SWEA

목차

[1.무한 사전](#1무한-사전) <br>
[2.몬스터 사냥](#2몬스터-사냥) <br>
[3.3차원 농부](#33차원-농부) <br>



### 1.무한 사전

---
- 사전순 정렬을 잘 이해하고 있는지에 대한 문제

**사전순 정렬의 우선순위**
1. 각 문자의 아스키 값을 비교한다.
2. 각 문자의 길이의 값을 비교한다.

<br>
   
### 2.몬스터 사냥

---
- 구현 

용사가 몬스터를 공격할 때는 기본적으로 D만큼의 데미지를 입힌다. 여기에, 용사가 익힌 공격의 레벨 L에 따라 추가적인 데미지가 있는데,

지금까지 몬스터를 때린 횟수가 n번이라고 하면, 다음 공격이 몬스터에게 입히는 데미지는 D(1+nㆍL%)가 된다. %는 1/100을 의미한다.
지금까지 용사가 몬스터를 때린 횟수가 0번이라고 할 때, 앞으로 총 N번의 공격을 하면 몬스터에게 가한 총 데미지가 몇이 되는지.

- 때리는 횟수는 누적되므로 Demage+=주어진 입력D *(1+i*percentage) 라는 식을 반복문을 돌린다.


<br>

### 3.3차원 농부

---

- x,y,z 좌표가 주어지지만 현실은 y는 0이고 x,z의 값으로 맨헤튼 거리를 구하는 것이다.
- 또한 각 x좌표는 소와 말은 주어진 입력대로 고정되어 있다.
- 소와 말에서 가장 짧은 거리 맨해튼 거리와 쌍의 개수를 출력한다.


> ※ 소와 말사이의 맨해튼 거리를 구할 때 n^2 이므로 시간초과가 난다.
  그러므로 탐색을 log n으로 줄이면서 탐색하여 가장 짧은 거리를 찾는다.
> 단, 짧은 거리를 찾는 과정에서 mid만큼 딱 떨어지지 않을 수 있기 때문에 mid-1이나 mid+1값을 비교해야 한다.

