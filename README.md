# 구현할 기능 목록

## InputHandler

- [x] 로또 구입 금액을 입력받는다.
    - 출력 메세지: `구입금액을 입력해 주세요.`
- [x] 쉼표로 구분된 당첨 번호를 입력받는다.
    - 출력 메세지: `당첨 번호를 입력해 주세요.`
- [x] 보너스 번호를 입력받는다.
    - 출력 메세지: `보너스 번호를 입력해 주세요.`
- [ ] 사용자가 잘못된 값을 입력하는 경우, 해당 부분부터 다시 입력을 받아야 한다.

## InputParser

- [ ] 쉼표로 구분된 당첨 번호를 쉼표 기준으로 파싱하고, 공백을 제거한다.

## OutputHandler

- [ ] 발행한 로또 수량과 번호 목록을 출력한다.
    - 로또 수량은 `8개를 구매했습니다.`와 같이 출력한다.
    - 번호 목록은 `[8, 21, 23, 41, 42, 43]`와 같이 출력한다.
- [ ] 당첨 통계를 출력한다.
- [ ] 수익률을 출력한다.
    - 수익률은 `총 수익률은 62.5%입니다.`와 같이 출력한다.
- [ ] 에러 문구를 출력한다.
    - 에러 문구는 `[ERROR]`로 시작한다.

## LottoMachine

- [ ] 주어진 금액으로 발행 가능한 로또의 개수를 구한다.
- [ ] 정해진 수량만큼 로또를 발행한다.
    - 번호는 오름차순 정렬한다.

## WinningLotto

- [ ] 넘겨받은 로또 번호 목록과 자신의 번호 목록을 비교하여 일치하는 번호 개수와 보너스 번호 일치 여부를 구한다.

## Lotto

- [x] 숫자가 6개가 아니면 예외를 발생시킨다.
- [ ] 번호 목록을 반환한다.

## Player

- [ ] 수익금을 바탕으로 수익률을 계산한다.
    - 수익률은 소수점 둘째 자리에서 반올림한다.

## Rank

- [ ] 일치하는 번호 개수와 보너스 번호 일치 여부를 바탕으로 등수를 계산한다.

## RandomNumberGenerator

- [ ] 1 ~ 45 사이의 중복되지 않는 숫자 6개를 뽑는다.
- [ ] 1 ~ 45 사이의 중복되지 않는 숫자 7개를 뽑는다.
    - 7번째 수는 보너스 번호가 된다.

## PurchaseAmountValidator

- [x] 로또 구입 금액이 null이거나 빈 값이면 예외를 발생시킨다.
- [x] 로또 구입 금액이 정수가 아니면 예외를 발생시킨다.
- [x] 로또 구입 금액이 1000으로 나누어 떨어지지 않으면 예외를 발생시킨다.
- [x] 로또 구입 금액이 0 미만이거나 10만원 초과이면 예외를 발생시킨다.
- [x] 로또 구입 금액을 정수로 변환한다.

## WinningLottoValidator

- [x] 번호 목록 중 null이거나 빈 값이 있으면 예외를 발생시킨다.
- [x] 번호 목록 중 정수 타입 이외의 값이 있으면 예외를 발생시킨다.
- [x] 번호 목록 중 1 미만 45 이상의 값이 있으면 예외를 발생시킨다.
- [ ] 번호 목록 중 중복된 값이 있으면 예외를 발생시킨다.
- [x] 번호 목록을 정수형 리스트로 파싱하여 변환한다.
- [ ] 보너스 번호도 번호 목록의 번호와 동일하게 검증한다.

---

# 프로그래밍 요구 사항

- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- 3항 연산자를 쓰지 않는다.
- JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.
- else 예약어를 쓰지 않는다. switch/case도 사용하지 않는다.
- 구현한 기능에 대한 단위 테스트를 작성한다. 단, UI(System.out, System.in, Scanner) 로직은 제외한다.