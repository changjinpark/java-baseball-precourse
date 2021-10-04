# 숫자 야구 게임

## 구현할 기능 목록
* 게임을 시작한다.
* 1~9까지 서로 다른 임의의 세자리 컴퓨터 숫자 생성
* 사용자 수를 입력 받는다.
  * 사용자가 입력한 값 검증
    * 입력값의 길이는 3이 아닌 경우, [ERROR] 시작 메세지 출력하고 게임 계속 진행
    * 입력값이 숫자가 아닌 경우, [ERROR] 시작 메세지 출력하고 게임 계속 진행
    * 입력값에 0이 포함되어 있는 경우, [ERROR] 시작 메세지 출력하고 게임 계속 진행
    * 입력값에 중복값이 있으면, [ERROR] 시작 메세지 출력하고 게임 계속 진행
* 컴퓨터 수와 사용자 수로 정답 여부를 판단한다.
  * 스트라이크 개수와 볼 개수를 계산한다.
  * 스트라이크, 볼, 낫싱를 출력한다.
  * 정답일때, 게임 재시작: 1 혹은 종료: 2 여부를 입력받는다.
    * 정답일때, 입력값이 1 혹은 2가 아닌 경우, [ERROR] 시작 메세지 출력하고 게임 계속 진행
* 1를 입력하면 게임을 재시작하고, 2를 입력하면 게임을 끝낸다.