<!--Heading-->
# Calculator 과제
## 프로젝트 구성
Lv1 과 Lv2로 나누어서 각 조건에 맞는 기능을 추가하여 2가지의 계산기를 구현해 보았습니다.
## 개발 기간
- 2025.02.25 ~ 2025.03.06

### Lv 1 Calculator
<!--Quote-->
> 1. 클래스 없이 기본적인 연산을 수행 할 수 있는 계산기
> 2. 양의 정수(0 포함) 입력 받기
> 3. 사칙연산 기호(+,-,X,/)를 입력 받기
> 4. 위에서 입력 받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
> 5. 반복문 사용하되, 반복의 종료를 알려주는 "exit" 문자열을 입력하기 전까지 무한으로 계산할 수 있게 하기

양의 정수를 입력 받기 위해 코드를 만들었습니다.
```java
 System.out.print(" 양의 정수를 입력하세요: ");
            int number = scanner.nextInt();     // nextInt : 숫자 입력 + 엔터
            scanner.nextLine();
            System.out.print(" 양의 정수를 입력하세요: ");
            int number2 = scanner.nextInt();
            scanner.nextLine();
```
그리고 사칙연산을 하기 위해 코드를 만들었습니다.
```java
System.out.print("사칙 연산을 입력하세요(+, -, *, /): ");
            String operation = scanner.nextLine();

            switch (operation) {
                case "+":
                    int sum = number + number2;
                    System.out.println("result = " + sum);
                    break;

                case "-":
                    int sub = number - number2;
                    System.out.println("result = " + sub);
                    break;
                case "*":
                    int mul = number * number2;
                    System.out.println("result = " + mul);
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("0으로는 나누기를 할 수 없습니다!");
                    }
                    int div = number / number2;
                    System.out.println("result = " + div);
                    break;
```
각 조건에 맞지 않는 값을 넣었을 경우를 대비해 `default` 값을 넣었습니다.
```java
default:
                    System.out.println("올바른 연산자를 입력하세요!! ");
```
이러한 계산을 반복해서 진행하기 위해 반복문 do-while 문을 사용해서 반복해주었습니다.
do-while문은 조건식이 참인 경우 반복을 지속하는 반복문입니다. 이것을 이용하면 "exit"를 작성했을 때, 계산을 종료할 수 있습니다.
```java
boolean flag = true;
 do {
 System.out.println(" 계산을 계속 진행하시겠습니까? (exit 를 입력하면 종료됩니다.)");
            String answer = scanner.nextLine();
 flag = !answer.equals("exit");
 } while (flag);
        System.out.println("계산 종료");
        scanner.close();
```
`boolean`을 사용해 `flag`값을 true로 정의한 후 , "exit" 값을 입력했을때, false 값으로 된다 설정해 두면 "exit" 값을 작성 했을 때, 연산을 종료 할 수 있었습니다.

### Lv 2 Calculator
<!--Quote-->
> 1. 사칙연산을 수행한 후, 결과 값을 반환하는 메서드 구현
> 2. 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
> 3. 연산 수행 및 저장은 Calculator 클래스에서 담당하기
> 4. 이전과 동일하게 작동하기
> 5. Getter 와 Setter 메서드 활용하기
> 6. 연산 결과 중 가장 먼저 저장된 데이터를 삭제 하는 기능을 가진 메서드를 구현한 후 main 메서드에서 활용

사칙 연산을 진행한 후 결과 값을 반환하기 위해 `return`을 사용했습니다.
```java
return result;
```
결과 값을 저장하기 위해서 결과 값을 저장하는 `List<>`를 생성하고 저장했습니다.
```java
private ArrayList<Integer> arrayList = new ArrayList<>();
private List<Integer> results;

results.add(result);
```
연산 수행 및 저장을 Calculator 클래스에서 진행 하기위해 Calculator 클래스에 연산 기능을 하는 메서드와 저장 및 반환하는 메서드를 만들었습니다.
```java
public int sum (int number, int number2) {
    int result = number + number2;
    results.add(result);
    System.out.println("result = " + result);
    return result;

}

public int sub (int number, int number2) {
    int result = number - number2;
    results.add(result);
    System.out.println("result = " + result);
    return number - number2;

}

public int mul (int number, int number2) {
    int result= number * number2;
    results.add(result);
    System.out.println("result = " + result);
    return number * number2;

}

public int div (int number, int number2) {
    int result= number / number2;
    if (number2 == 0) {
        System.out.println("0으로는 나누기를 할 수 없습니다!");
    }
    results.add(result);
    System.out.println("result = " + result);
    return number / number2;
}
```
다음으로 App2 클래스 main 메서드에 있던 연산 수행 메서드를 지워 Calculator 클래스의 기능을 가져오게하였습니다.
```java
int result = 0;
switch (operation) {
    case "+":
        result = calculator.sum(number,number2);
        break;
    case "-":
        result = calculator.sub(number, number2);
        break;
    case "*":
        result = calculator.mul(number,number2);
        break;
    case "/":
        result = calculator.div(number,number2);
        break;
    default:
        System.out.println("올바른 연산자를 입력하세요!! ");
}
```
그리고 Getter,Setter를 Calculator 클래스에 설정해주었습니다.
```java
public Calculator() {
    this.results = new ArrayList<>();
}
public List<Integer> getResults(){
    return this.results;
}
```


## 마무리
- 코드를 작성하기 전 전체적인 틀을 잡고 시작하는 것이 작업을 하는데 많은 도움이 된다는 것을 알게 되었습니다.
- `nextInt`은 버퍼 중  숫자 입력 + 엔터의 구조로 되어있다는 것을 새롭게 알게 되었습니다.
- Lv2 계산기를 완벽하게 완성하지 못한 것이 아쉬웠습니다. 피드백을 받아서 내용을 완벽하게 학습한 후 코드를 재작성할 예정입니다.
- 도전기능 또한 필요한 내용을 학습 한 후 코드를 작성해 볼 예정입니다.
