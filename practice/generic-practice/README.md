
## 🌱 실습 1단계 – 기본 제네릭 클래스 만들기

### ✅ 요구사항

* 이름은 `Storage<T>`인 제네릭 클래스를 만들어라.
* 내부에 `T` 타입의 아이템을 하나 저장할 수 있다.
* `setItem(T item)`과 `getItem()` 메서드를 제공한다.
* `Storage<String>`으로 인스턴스를 만들고 "Hello Generic"을 저장한 뒤 출력하라.

```
// 예시 실행 결과:
Hello Generic
```

---

## 🌿 실습 2단계 – 제네릭 메서드 만들기

### ✅ 요구사항

* `GenericPrinter` 클래스를 만든다.
* 클래스 내부에 제네릭 메서드 `printTwice()`를 만든다.
* `printTwice(T item)`은 전달된 값을 두 번 출력한다.
* 문자열, 정수형 등 다양한 타입으로 테스트해본다.

```
// 예시 실행 결과:
Java
Java
100
100
```

---

## 🌳 실습 3단계 – 상한 제한과 리스트 응용

### ✅ 요구사항

* `NumberBox<T extends Number>` 클래스를 만든다.
* 내부에 `List<T>`를 저장하고, 값을 추가할 수 있는 `addItem(T item)` 메서드를 제공한다.
* 리스트에 있는 모든 값을 합산하여 반환하는 `getSum()` 메서드를 만든다.
* `NumberBox<Integer>` 또는 `NumberBox<Double>`로 테스트한다.

```
// 예시 실행 결과:
합계: 37
```

---

### 🎁 추가 미션 (선택)

* `printList(List<?> list)`라는 메서드를 만들어 모든 리스트 요소를 출력해보자.
* 와일드카드를 직접 써보는 연습