# 간단한 컨벤션 지침

## 클래스
* `UpperCamelCase`를 사용합니다.
* 익히 알려진 경우 (ex. DTO, URL 등) 를 제외하고는 합의되지 않은 약어를 사용하지 않도록 합니다.

### Good
```java
public class UserService {}

// 예: 서울 지하철 3호선 (Seoul Metro Line 3)
public class SeoulMetroLine3Service {}
```

### Bad
```java
public class user_service {}
public class userService {}
public class USER_SERVICE {}

// 예: 서울 지하철 3호선 (Seoul Metro Line 3)
public class SML3Service {}
```

## 인터페이스
* `UpperCamelCase`를 사용합니다.
* 인터페이스명에 직접적으로 인터페이스임을 명시하지 않습니다.

### Good
```java
public interface UserService {}

public class UserServiceImpl implements UserService {}
public class GeneralUserService implements UserService {}
```

### Bad
```java
public interface UserServiceInterface {}
public interface IUserService {}

public class UserService implements UserServiceInterface {}
```

## 메소드
* `lowerCamelCase`를 사용합니다.
* 메소드가 어떤 역할을 하는지 최대한 동사를 포함한 문장형으로 작명 부탁드립니다!
* 파라미터의 경우에도 `lowerCamelCase`를 사용합니다.

### Good
```java
public class User {
    public void doSomething() {}
    public SomeClass getSomeClass() {}
    public void setSomeClass(SomeClass someClass) {}
}
```

### 변수
* `lowerCamelCase`를 사용합니다.

### Good
```java
public class User {
    private int id;
    private String firstName;
    private String lastName;
}
```

### 상수
* `UPPER_SNAKE_CASE`를 사용합니다.
* 
### Good
```java
public class User {
    public static final long APP_VERSION = 1L;
}
```