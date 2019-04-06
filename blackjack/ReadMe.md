
# 블랙잭 
___

[관련 링크](https://namu.wiki/w/%EB%B8%94%EB%9E%99%EC%9E%AD(%EC%B9%B4%EB%93%9C%EA%B2%8C%EC%9E%84))

### 규칙
딜러와 카드를 한장씩 받아 21에 가까운 수를 만드는 사람이 이기며 21을 초과하면 지는 게임.
사용하는 카드 : 52장 (조커 제외)
인원 수 : 2~8명

### 게임 방법
- 배팅하기
- 딜러는 플레이어에게 카드 2장씩 준다
- 플레이어는 추가 카드를 한장씩 받을 수 있다. (선택 가능, 무제한)

추가 조건
- 처음 2장의 카드가 21일 경우 '블랙잭' : 배팅액 * 1.5
- 딜러가 "블랙잭" 이라고 외치면 게임 끝 ( 점수계산 )

___

1. 딜러
- if ) 점수 < 17 일 경우, 카드 + 1
- if ) 점수 >= 17 일 경우, stop

1. 배팅  
- 승 : 배팅건 금액 * 2 
- 패 : 배팅건 금액 잃음 

2.점수 계산 방법
- 숫자는 그대로 
- J, Q, K  = 10
- A = 1 or 11

3. 결과       
`
blackjack : 플레이어(1) 승
push : 무승부  
`
- 딜러 > 플레이어 : 딜러 승
- 딜러 < 플레이어 : 플레이어 승
- 딜러 = 플레이어 : 무승부
단! 21초과일 경우 0점 처리 ( 둘다 넘겼을 경우, 딜러 승 )


