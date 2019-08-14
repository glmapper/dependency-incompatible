# Getting Started

## 1.0 版本

```java
public class IncompatibleUtil {

    public static String test1(){
        return "test1";
    }


    public static String test2(){
        return "test2";
    }
}
```

## 2.0 版本

```java
public class IncompatibleUtil {

    public static String test1(){
        return "test1";
    }

    public static String test3(){
        return Incompatible.test();
    }

    public static class Incompatible {
        public static String test() {
            return "test";
        }
    }
}
```

## 使用

将代码 git clone 到本地，先修改 pom.xml 中的版本为 1.0 ,然后将 IncompatibleUtil 类的内容修改成 1.0 版本所示，执行 mvn clean install  安装到本地仓库。

接着将  pom.xml 中的版本为 2.0，然后将 IncompatibleUtil 类的内容修改成 2.0 版本所示，执行 mvn clean install  安装到本地仓库。

